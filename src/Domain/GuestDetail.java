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
    String country;
    int phoneNumber;
    String email;
    int passportNumber;

    public GuestDetail(String firstName, String lastName, String address, String country, int phoneNumber, String email, int passportNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.country = country;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.passportNumber = passportNumber;
    }

    
    
    
}
