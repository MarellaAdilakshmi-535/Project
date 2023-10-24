package com.amdocs.project;

import com.amdocs.project.bankaccount.BankAccount;
import com.amdocs.project.currentaccount.CurrentAccount;
import com.amdocs.project.savings.SavingsAcc;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount b1=new BankAccount(2000);
		b1.deposit(1000);
		b1.chkBalance();
		b1.withdraw(500);
		b1.withdraw(3000);
		BankAccount b2=new BankAccount(3000);
		b2.deposit(5000);
		b2.withdraw(3000);
		b2.transfer(1000, b1);
		b2.chkBalance();
		b1.chkBalance();
        CurrentAccount c1=new CurrentAccount(2000);
        c1.deposit(1000);
        c1.withdraw(500);
        SavingsAcc s1=new SavingsAcc(1000);
        s1.deposit(1000);
        c1.transfer(3000,s1);
        c1.chkBalance();
        s1.chkBalance();
	}

}
