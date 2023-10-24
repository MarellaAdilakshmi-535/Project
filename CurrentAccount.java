package com.amdocs.project.currentaccount;

import com.amdocs.project.bankaccount.BankAccount;
import com.amdocs.project.savings.SavingsAcc;

public class CurrentAccount extends BankAccount {
	static{
		System.out.println("-------------CURRENT ACCOUNT CREATED-------------");
	}
      public CurrentAccount(double amt) {
	      super(amt);
      }
    public void withdraw(double amt) {
    	if(amt<=getBalance()) {
	    System.out.println("you get charged by Rs.200 for witdrawl transaction in current account ");
	    super.withdraw(amt+200);
    	}
    	else {
    		System.out.println("Amount cannot be withdrawn..Insuffficient balanace");
    	}
}
   
}
