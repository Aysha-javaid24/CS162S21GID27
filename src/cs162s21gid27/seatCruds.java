/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs162s21gid27;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author aysha
 */
public class seatCruds {
    private ArrayList<reserveCred> credList = new ArrayList<reserveCred>();
    private static seatCruds seatCruds = null;
    ///////////////
    public void setCredList(ArrayList<reserveCred> credsList) {
        this.credList = credsList;
    }
    ///////////////
    public ArrayList<reserveCred> getCredList() {
        return this.credList;
    }
    //////////////
    public int searchCred(reserveCred creds) {
        for (int i = 0; i < this.credList.size(); i++) {
            if (this.credList.get(i).Email.equals(creds.getEmail())) {
                return i;
            }
        }
        return -1;
    }
    /////////////
    public boolean reserveSeat(reserveCred creds) {
        if (searchCred(creds) == -1) {
            this.credList.add(creds);
            return true;
        }
        return false;
    }
    ////////////
    public boolean cancelReservation(reserveCred creds) {
        if (searchCred(creds) != -1) {
            this.credList.remove(creds);
            return true;
        }
        return false;
    }
    ////////////
    private static ArrayList<reserveCred> loadReservations() {
        try {
            int count = 0;
            File reader = new File("Reservations.txt");
            Scanner Reader = new Scanner(reader);
            ArrayList<reserveCred> credList = new ArrayList<reserveCred>();
            while (Reader.hasNextLine()) {
                if (count > 0) {
                    String[] string = Reader.nextLine().split(":");

                    reserveCred creds = new reserveCred();
                    creds.setEmail(string[0]);
                    creds.setDepCity(string[1]);
                    creds.setArrCity(string[2]);
                    creds.setDate(string[3]);
                    credList.add(creds);
                } else {
                    Reader.nextLine();
                }
                count++;
            }
            return credList;
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Reservation data is not loaded, File not Found");
        }
        return null;
    }
    //////////////
    public static seatCruds getInstance() {
        if (seatCruds == null) {
            seatCruds = new seatCruds();
            seatCruds.setCredList(loadReservations());

            return seatCruds;
        }
        return seatCruds;
    }
}
