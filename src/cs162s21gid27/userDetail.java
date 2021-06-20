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
public class userDetail extends Details{
    protected String CNIC;
    public void setCNIC(String cnic)
    {
        this.CNIC = cnic;
    }
    public String getCNIC()
    {
        return this.CNIC;
    }
}
