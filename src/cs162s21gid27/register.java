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
public class register implements Serializable{

       private String emp_id;
    private String name;

    public register(String emp_id, String name) {
        this.emp_id = emp_id;
        this.name = name;
    }

    public String getEmp_id() {
        return emp_id;
    }

    public String getName() {
        return name;
    }

    public void setEmp_id(String emp_id) {
        this.emp_id = emp_id;
    }

    public void setName(String name) {
   
         this.name = name;
    }
    
    
}
