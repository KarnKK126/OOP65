/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Customer {
    private String firstName;
    private String lastName;
    private Account acct[];
    private int numOfAccount;
    private int []x[];
    public Customer(){
        firstName = "";
        lastName = "";
        acct = new Account[5];
    }
    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        acct = new Account[5];
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
    public Account[] getAcct(){
        return acct;
    }
    public String toString(){
        return "Customer's name "+firstName + " " + lastName + " " + numOfAccount;
    }
    public boolean equals(Customer c){
        return firstName.equals(c.firstName) && lastName.equals(c.lastName);
    }
    
    public Account getAccount(int index) {
        return acct[index];
    }
    
    public void addAccount(Account acct) {
        this.acct[getNumOfAccount()] = acct;
        numOfAccount += 1;
    }
    
    public int getNumOfAccount(){
        return numOfAccount;
    }
}
