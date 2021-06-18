/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs162s21gid27;

import java.io.Serializable;

/**
 *
 * @author Ayesha Shabbir
 */
class addacount implements Serializable {
        private String email;
        private String name;
         public addacount(String email, String name) {
        this.email = email;
        this.name = name;
    }
          public String getemail() {
        return email;
          }

    public String getname() {
        return name;
    }
    public void setEmp_id(String emp_id) {
        this.email = email;
    }

    public void setName(String name) {
   
         this.name = name;
    }
    
}
