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
        //creating gui objects
        HomeScreenGUI hsGui=new HomeScreenGUI();
        AccountsGUI accGui= new AccountsGUI();
        hsGui.setVisible(true);
       // accGui.setVisible(false);
        //creating variables
        String uName, password;
        String Account[][];
        int function=0;
        boolean logIn, logOut;
        //getting uName and password
        
        //creating the account object
        //letting user select which option to choose
        
        /*function=Integer.parseInt(JOptionPane.showInputDialog(null,"What function would you like to use?\n1:section 1\n2: section 2\n3:Account"));
        switch(function){
            case 1:
                Accounts A= new Accounts(uName, password);
                JOptionPane.showMessageDialog(null,"You selected section 1");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"you selected section 2");
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"you selected the account section");
                //start to call the accounts functions here. Need to check whether or not they are logged in all ready or if they need to log in. Then allow them to choose to set up an account or log in or see their details.
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid entry, option are 1, 2 or 3. Please try again");
                      
        }*/
       
    }
}
