/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop_ca;

/**
 *
 * @author jessi
 */
public class LogIn extends Accounts{
    //creating variables
    private String accounts[][];
    private boolean passwordT,uNameExist;
    public LogIn(String uName, String password){//checked previouse exercises to see how to invoke a super clas correctly
        super(uName, password);//checked previouse exercises to see how to do this part right
       //adding temporary accounts for testing
        accounts[0][0]="test1"; //https://www.geeksforgeeks.org/java/multidimensional-arrays-in-java/ (checked here for correct syntax for adding values to list)
        accounts[0][1]="password1";
        accounts[1][0]="test2";
        accounts[1][1]= "password2";
        passwordT=false;
        uNameExist=false;
    }
    //adding methods
    public void checkName(){
        for (int i=0; i<accounts.length;i++){
            if(accounts[i][0].equals(uName)){
                uNameExist=true;
            }
        }
    }
    public void checkPassword(){
        for (int i=0;i<accounts.length;i++){
            if (accounts[i][1].equals(password)){
                passwordT= true;
            }
        }
    }
    
}
