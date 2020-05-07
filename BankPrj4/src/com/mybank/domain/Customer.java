package com.mybank.domain;

import java.security.PublicKey;

public class Customer {
    private String firstName;
    private  String lastName;
    private  String name;
    private Account account;
    public Customer(String  f,String l){
    firstName=f;
    lastName=l;
    name=firstName+" "+lastName;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getName(){
        return name;
    }
     public Account getAccount(){

        return account;
    }
    public void setAccount(Account account) {
        this.account = account;
    }
}
