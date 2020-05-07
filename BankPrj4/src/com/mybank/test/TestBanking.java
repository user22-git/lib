package com.mybank.test;

import com.mybank.domain.*;

/*
 * This class creates the program to test the banking classes.
 * It creates a new Customer and Account (with an initial balance),
 * and performs a series of transactions with the Account object.
 */
public class TestBanking {

  public static void main(String[] args) {
    Customer customer;
    Account  account;
    boolean operationResult;
    System.out.println("Creating the customer Jane Smith.");
    customer = new Customer("Jane", "Smith");
    System.out.println("Creating her account with a 500.00 balance.");
    Account acc =new Account(500.00);
    System.out.println("Customer "+customer.getName()+ " has a balance "+acc.getBalance());
    customer.setAccount(acc);
    account = customer.getAccount();
//    System.out.println(" getAccount() has a balance "+acc.getBalance());
    operationResult = account.withdraw(150.00);
    System.out.println("Withdraw 150.00: " + operationResult);

    operationResult = account.deposit(22.50);
    System.out.println("Deposit 22.50: " + operationResult);

    operationResult = account.withdraw(47.62);
    System.out.println("Withdraw 47.62: " + operationResult);

    operationResult = account.withdraw(400.00);
    System.out.println("Withdraw 400.00: " + operationResult);

    // Print out the final account balance
    System.out.println("Customer [" + customer.getName ()
		       + "] has a balance of " + account.getBalance());
  }
}
