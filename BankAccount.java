package com.amdocs.project.bankaccount;
public class BankAccount {
       private double balance;
       public BankAccount(double bal) {
    	   this.balance=bal;
    	   System.out.println("ACCOUNT CREATED!.. with initial balance Rs."+bal);
       }
       public void deposit(double amount) {
    	   this.balance=this.balance+amount;
    	   System.out.println("Your total account balance after deposit amount "+amount+" is:"+balance);
       }
       public void withdraw(double amount) {
    	   if(this.balance>=amount) {
    		   this.balance-=amount;
    		   System.out.println("Total account balance after withdrawal "+amount+" is:"+balance);
    	   }
    	   else {
    		   System.out.println("Transcation failed!....Your account balance is less than "+amount);
    	   }
       }
       public void chkBalance() {
    	   System.out.println("Your Account Balance is:"+balance);
       }
       public double getBalance() {
    	   return this.balance;
       }
       public void transfer(double amt,BankAccount b2) {
    	   if(amt<=this.balance) {
    		   this.withdraw(amt);
    		   b2.deposit(amt);
    		   System.out.println("Amount successfully transferred.");
    	   }
    	   else {
    		   System.out.println("Insuffient Balance...");
    	   }
       }
}
