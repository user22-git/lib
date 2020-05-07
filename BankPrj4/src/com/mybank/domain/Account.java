package com.mybank.domain;

public class Account{

  private double balance;
   public Account(double initBalance){

       balance = initBalance;
   }
   public double getBalance(){

       return balance;
   }
    public boolean deposit (double d){
       balance=balance+d;
       if (balance>0){
           System.out.println ("Current balance is "+balance);
       }
       return true;
    }
    public boolean  withdraw (double w){
       boolean result;
        if (w>balance) {
            result=false;
            System.out.println ( "Insufficient funds. Withdraw " + w +" not  available");
        }else
        {balance=balance-w;
            result=true;
            System.out.println ( "Withdraw has passed - "+w);
        };
        return result;
    }
   }

