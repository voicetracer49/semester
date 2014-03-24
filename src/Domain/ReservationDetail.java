/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Domain;

import java.util.ArrayList;
import oracle.sql.DATE;

/**
 *
 * @author Anders Kjær
 */
public class ReservationDetail {
    
    ArrayList<GuestDetail> gd;
    String roomType;
    boolean deposit;
    DATE date;

    public ReservationDetail(ArrayList<GuestDetail> gd, String roomType, boolean deposit, DATE date) {
        this.gd = gd;
        this.roomType = roomType;
        this.deposit = deposit;
        this.date = date;
    }

    
    
    
    
    
    
    
    
    
    
}
