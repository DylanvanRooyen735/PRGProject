package BusinessLogicLayer;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
/**
 *
 * @author User
 */
public class Client implements Serializable {
 private String Clientname;
 private String ClientSurname;
 private String ClientNumber;
 private String ClientAdress;
 private String ClientBookingNumber;
 private String ClientBookingTheme;

 
 public Client(String Clientname, String ClientSurname, String ClientNumber, String ClientAdress, String ClientBookingNumber, String ClientBookingTheme) {
  
  this.Clientname = Clientname;
  this.ClientSurname = ClientSurname;
  this.ClientNumber = ClientNumber;
  this.ClientAdress = ClientAdress;
  this.ClientBookingNumber = ClientBookingNumber;
  this.ClientBookingTheme = ClientBookingTheme;

 }
 

}

