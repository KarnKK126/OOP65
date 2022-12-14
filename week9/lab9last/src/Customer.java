/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.*;
public class Customer {
    private String firstName;
    private String lastName;
    ArrayList acct;
    private int numOfAccount;
    public Customer(){
        acct = new ArrayList();
    }
    public Customer(String firstName, String lastName){
        acct = new ArrayList();
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }
//    public Account[] getAcct(){
//        return acct;
//    }
    public String toString(){
        return "Customer's name "+firstName + " " + lastName + " " + numOfAccount;
    }
    public boolean equals(Customer c){
        return firstName.equals(c.firstName) && lastName.equals(c.lastName);
    }
    
    public Account getAccount(int index) {
        return (Account)acct.get(index);
    }
    
    public void addAccount(Account acct) {
        this.acct.add(acct);
    }
    
    public int getNumOfAccount(){
        return this.acct.size();
    }
}
