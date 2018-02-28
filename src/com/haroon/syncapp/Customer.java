package com.haroon.syncapp;

public class Customer implements Runnable{

	@Override
	public void run() {
		Bank bank = Bank.getInstance();
		BankAccount account = bank.getAccount(123456);
		
		/**
		 * synchronized method enables the BankAccount object to be used and operated
		 * by one user and when the operation ends then the object will release the 
		 * BankAccount object for another client to use and operate.
		 * 
		 * It enables a synchronized way of accessing the object by one client and completes the object operation.
		 * The best possible solution for using one Thread a time while using the same object.
		 */
		
		synchronized(account){
			account.deposit(100);
			account.withdraw(200);
		}
		
	}

}
