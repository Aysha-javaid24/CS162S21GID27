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
public class UsersCrud {
    private ArrayList<userDetail> userList = new ArrayList<userDetail>();
    private ArrayList<routeDetail> routeList = new ArrayList<routeDetail>();
    private static UsersCrud usersCrud = null;
    /////////////////////
    public void setUserList(ArrayList<userDetail> usersList) {
        this.userList = usersList;
    }
    public void setrouteList(ArrayList<routeDetail> routesList) {
        this.routeList = routesList;
    }
    ////////////////////
    public ArrayList<userDetail> getUserList() {
        return this.userList;
    }
    public ArrayList<routeDetail> getrouteList() {
        return this.routeList;
    }
    ////////////////////
    public int searchUser(userDetail users) {
        for (int i = 0; i < this.userList.size(); i++) {
            if (this.userList.get(i).CNIC.equals(users.getCNIC()) || this.userList.get(i).getEmail().equals(users.getEmail())) {
                return i;
            }
        }
        return -1;
    }
///////////////////////
public boolean addUser(userDetail users) {
        if (searchUser(users) == -1) {
            this.userList.add(users);
            return true;
        }
        return false;
    }
/////////////////////
public boolean deleteUser(userDetail users) {
        if (searchUser(users) != -1) {
            this.userList.remove(users);
            return true;
        }
        return false;
    }
////////////////////
public boolean editUser(int index, userDetail users) {

        this.userList.set(index, users);
        return true;
    }
//////////////////
public int searchRoute(routeDetail routes) {
        for (int i = 0; i < this.routeList.size(); i++) {
            if (this.routeList.get(i).BusRouteNo.equals(routes.getBusNo())) {
                return i;
            }
        }
        return -1;
    }
////////////////
public boolean addRoute(routeDetail routes) {
        if (searchRoute(routes) == -1) {
            this.routeList.add(routes);
            return true;
        }
        return false;
    }
///////////////
public boolean deleteRoute(routeDetail routes) {
        if (searchRoute(routes) != -1) {
            this.userList.remove(routes);
            return true;
        }
        return false;
    }
////////////
public boolean editRoute(int index,routeDetail routes ) {

        this.routeList.set(index, routes);
        return true;
    }
////////////
private static ArrayList<userDetail> loadUser() {
        try {
            int count = 0;
            File reader = new File("Users.txt");
            Scanner userReader = new Scanner(reader);
            ArrayList<userDetail> userList = new ArrayList<userDetail>();
            while (userReader.hasNextLine()) {
                if (count > 0) {
                    String[] string = userReader.nextLine().split(":");

                    userDetail users = new userDetail();
                    users.setName(string[0]);
                    users.setCNIC(string[1]);
                    users.setEmail(string[2]);
                    
                    userList.add(users);
                } else {
                    userReader.nextLine();
                }
                count++;
            }
            return userList;
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "User data is not loaded, File not Found");
        }
        return null;
    }
//////////////
private static ArrayList<routeDetail> loadRoute() {
        try {
            int count = 0;
            File reader = new File("Routes.txt");
            Scanner Reader = new Scanner(reader);
            ArrayList<routeDetail> routeList = new ArrayList<routeDetail>();
            while (Reader.hasNextLine()) {
                if (count > 0) {
                    String[] string = Reader.nextLine().split(":");

                    routeDetail routes = new routeDetail();
                    routes.setBusNo(string[0]);
                    routes.setArrCity(string[1]);
                    routes.setDepCity(string[2]);
                    
                    routeList.add(routes);
                } else {
                    Reader.nextLine();
                }
                count++;
            }
            return routeList;
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Route data is not loaded, File not Found");
        }
        return null;
    }
//////////////
public static UsersCrud getInstance() {
        if (usersCrud == null) {
            usersCrud = new UsersCrud();
            usersCrud.setUserList(loadUser());
            usersCrud.setrouteList(loadRoute());

            return usersCrud;
        }
        return usersCrud;
    }
}
