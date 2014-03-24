/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Domain;

/**
 *
 * @author Anders Kjær
 */
public class GuestDetail {
    
    String firstName;
    String lastName;
    String address;
    int phoneNumber;
    String email;

    public GuestDetail(String firstName, String lastName, String address, int phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    
    
    
}
