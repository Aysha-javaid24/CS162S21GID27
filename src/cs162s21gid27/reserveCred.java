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
public class reserveCred {
    protected String Email;
    protected String ArrivalCity;
    protected String DepartureCity;
    protected String Date;
    /////////// 
    public void setArrCity(String arr)
    {
        this.ArrivalCity = arr;
    }
    public void setDepCity(String dep)
    {
        this.DepartureCity = dep;
    }
    public void setEmail(String email)
    {
        this.Email=email;
    }
    public void setDate(String date)
    {
        this.Date=date;
    }
    /////////
    public String getArrCity()
    {
        return this.ArrivalCity;
    }
    public String getDepCity()
    {
        return this.DepartureCity;
    }
    public String getEmail()
    {
        return this.Email;
    }
    public String getDate()
    {
        return this.Date;
    }
}
