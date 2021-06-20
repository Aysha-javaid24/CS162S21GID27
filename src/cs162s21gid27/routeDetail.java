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
public class routeDetail extends BusDetails{
    protected String BusRouteNo;
    ///////////
    public void setBusNo(String no)
    {
        this.BusRouteNo = no;
    }
     public String getBusNo()
    {
        return this.BusRouteNo;
    }
}
