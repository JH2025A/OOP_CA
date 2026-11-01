/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.oop_ca;

/**
 *
 * @author jessi
 */
import javax.swing.JOptionPane;//importing JOptionPane for basic inputs and outputs
public class SDGApp {

    public static void main(String[] args) {
        //creating variables
        String uName, password;
        String Account[][];
        boolean logIn, logOut;
        //getting uName and password
        uName=JOptionPane.showInputDialog(null,"Please Enter your username");
        password=JOptionPane.showInputDialog(null,"Please Enter your password");
        //creating the account object
        Accounts A= new Accounts(uName, password);
        
    }
}
