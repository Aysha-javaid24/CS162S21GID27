/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs162s21gid27;

/**
 *
 * @author aysha
 */
public class Details {
    protected String Name;
    protected String Email;
    /////////////////////
    public void setName(String name)
    {
        this.Name = name;
    }
    public void setEmail(String email)
    {
        this.Email = email;
    }
    ////////////////////
    public String getName()
    {
        return this.Name;
    }
    public String getEmail()
    {
        return this.Email;
    }
    
}
