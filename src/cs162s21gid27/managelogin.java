/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs162s21gid27;

import java.util.List;

/**
 *
 * @author Ayesha Shabbir
 */
public class managelogin {
      private List<register>   registerlist;
       public void addacc(register r){
        registerlist.add(r);
    }
          private int searchContact(String email)
    {
        int index = -1;
         for(int i = 0 ; i  < registerlist.size(); i++)
         {
             if(registerlist.get(i).getEmail().equals(email))
             {
                 index = i;
                 break;
             }
         }
         
        return index;
    }
    
}
