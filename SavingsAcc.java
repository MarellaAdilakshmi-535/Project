package com.amdocs.project.savings;

import com.amdocs.project.bankaccount.BankAccount;

public class SavingsAcc extends BankAccount{
	private double interest;
	static{
		System.out.println("------------SAVINGS ACCOUNT CREATED--------------");
	}
     public SavingsAcc(double amt) {
    	 super(amt);
     }
     public void deposit(double amt) {
    	 interest=amt*0.03;
    	 System.out.println("Hey!...you got 3% interest on this deposit transaction i.e is: "+interest);
    	 super.deposit(amt+interest);
     }
     
}
