/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class main {

//    Account
//    case 1
//    
//    public static void main(String[] args) {
//        Account a1 = new Account();
//        a1.showAccount();
//    }
//    output : 
//    error: constructor Account in class Account cannot be applied to given types;
//    Account a1 = new Account();
//    required: double,String


//    case 2  
//    public static void main(String[] args) {
//        Account a1 = new Account(50000, "61070033");
//        a1.showAccount();
//        a1.deposit(500);
//        a1.showAccount();
//        a1.withdraw(40000);
//        a1.showAccount();
//    }
//    output :
//    61070033 account has 50000.0 baht.
//    500.0 baht is deposited to 61070033
//    61070033 account has 50500.0 baht.
//    40000.0 baht is withdrawn from 61070033
//    61070033 account has 10500.0 baht.
//    



//CheckingAccount

//    case 1
//    
//    public static void main(String[] args) {
//        CheckingAccount a1 = new CheckingAccount(50000, "61070033", 5000);
//        a1.showAccount();
//        a1.deposit(500);
//        System.out.println(a1);
//        a1.withdraw("40000.0");
//        System.out.println(a1.toString());
//    }
//    output : 
//    61070033 account has 50000.0 baht.
//    500.0 baht is deposited to 61070033.
//    The 61070033 account has 50500.0 baht and 5000.0 credits.
//    40000.0 baht is withdrawn from 61070033 and your credit balance is 5000.0.
//    The 61070033 account has 10500.0 baht and 5000.0 credits.


//    case 2
//    public static void main(String[] args) {
//        CheckingAccount a1 = new CheckingAccount();
//        a1.deposit(500);
//        System.out.println(a1);
//        a1.withdraw(40000.0);
//        System.out.println(a1.toString());
//    }
//    output :
//    500.0 baht is deposited to .
//    The account has 500.0 baht and 0.0 credits.
//    Not enough money!
//    The account has 500.0 baht and 0.0 credits.


//    case 3
//    public static void main(String[] args) {
//        Account a1 = new CheckingAccount();
//        a1.setCredit(1000);
//        System.out.println(a1);
//    }
//    output :
//    Exception in thread "main" java.lang.RuntimeException: Uncompilable code - cannot find symbol
//    symbol:   method setCredit(int)
//    location: variable a1 of type Account


//    case 4
//    public static void main(String[] args) {
//        Account a1 = new CheckingAccount();
//        a1.setName("Nook");
//        System.out.println(a1);
//        ((CheckingAccount)a1).setCredit(1000);
//        System.out.println(a1); 
//    }
//    output :
//    The Nook account has 0.0 baht and 0.0 credits.
//    The Nook account has 0.0 baht and 1000.0 credits.



//    customer    
    
//    case 1
//    public static void main(String[] args) {
//        CheckingAccount a1 = new CheckingAccount(1000, "62070033", 500);
//        Customer c1 = new Customer();
//        Customer c2 = new Customer("Harry", "Potter");
//        Customer c3 = new Customer("Harry", "Potter", a1);
//
//        System.out.println(c2);
//        System.out.println(c3);
//    }
//    output :
//    Harry Potter doesn’t have account.
//    The Harry account has 1000.0 baht and 500.0 credits.
//    

//    case 2
    public static void main(String[] args) {
        CheckingAccount a1 = new CheckingAccount(1000, "62070033", 500);
        Customer c1 = new Customer();
        Customer c2 = new Customer("Harry", "Potter");
        Customer c3 = new Customer("Harry", "Potter", a1);
        System.out.println(c1.equals(c2));
        System.out.println(c3.equals(c2));
    }
//    output :
//    true
//    false
}
