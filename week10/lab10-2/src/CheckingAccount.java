/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class CheckingAccount extends Account{
    private double credit;
    public CheckingAccount(){
        super(0, "");
        this.credit = 0;
    }
    public CheckingAccount(double balance, String name, double credit){
        super(balance, name);
        this.credit = credit;
    }
    public void setCredit(double credit){
        if(credit > 0){
            this.credit = credit;
        }else{
            System.out.println("Input number must be a positive interger.");
        }
    }
    public double getCredit(){
        return credit;
    }
    @Override
    public void withdraw(double a) throws WithdrawException{
        if(a > 0){
            if(this.balance - a >= 0){
                this.balance = this.balance - a;
                System.out.println(a+" baht is withdrawn from "+this.name+" and your credit balance is "+this.credit+".");
            }else if(this.balance - a < 0 && this.balance - a + this.credit >= 0){
                this.balance = 0;
                this.credit = this.balance - a + this.credit;
                System.out.println(a+" baht is withdrawn from "+this.name+" and your credit balance is "+this.credit+".");
            }else if(this.balance - a < 0 && this.balance - a + this.credit < 0){
                throw new WithdrawException("Account "+name+" has not enough money.");
            }
        }else{
            super.withdraw(a);
        }
    }
    public void withdraw(String a) throws WithdrawException{
        this.withdraw(Double.parseDouble(a));
    }
    @Override
    public String toString(){
        return "The " + name + " account has " + balance + " baht and " + credit + " credits.";
    }
}
