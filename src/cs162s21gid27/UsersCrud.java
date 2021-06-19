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
    private static UsersCrud usersCrud = null;
    /////////////////////
    public void setUserList(ArrayList<userDetail> usersList) {
        this.userList = usersList;
    }
    ////////////////////
    public ArrayList<userDetail> getUserList() {
        return this.userList;
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
public boolean editStudent(int index, userDetail users) {

        this.userList.set(index, users);
        return true;
    }

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

public static UsersCrud getInstance() {
        if (usersCrud == null) {
            usersCrud = new UsersCrud();
            usersCrud.setUserList(loadUser());
            return usersCrud;
        }
        return usersCrud;
    }
/*public static void main(String[] args)
{
    UsersCrud usersCrud = UsersCrud.getInstance();
}*/
}
