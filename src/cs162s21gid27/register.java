/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs162s21gid27;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Ayesha Shabbir
 */
public class register implements Serializable{

       private String emp_id;
    private String name;
 List<register> list;
    public register()
    {
        list=new ArrayList<register>();
    }
    public register(String emp_id, String name) {
        this.emp_id = emp_id;
        this.name = name;
    }

    

    public String getEmp_id() {
        return emp_id;
    }

    ///setter for name
    public boolean setName(String name)
    {
        boolean flag=false;
        int size=name.length();
        for(int i=0;i<size;i++)
        {
            if((name.charAt(i)>='a' && name.charAt(i)<='z')||(name.charAt(i)>='A' && name.charAt(i)<='Z')||(name.charAt(i)==' '))
            {
                flag=true;
            }
        }
        if(flag==true)
        {
            this.name=name;
        }
        return flag;
    }
    public String getName() {
        return name;
    }

    public void setEmp_id(String emp_id) {
        this.emp_id = emp_id;
    }

   
    
    
}
