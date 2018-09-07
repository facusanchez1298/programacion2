package com.company;

import java.util.Date;

public class Main {
public Customer customer;
public Visit visit;
public DiscountRate discountRate;



    public static void main(String[] args) {
    Date date = new Date();
    DiscountRate discountRate = new DiscountRate();

    Customer customer = new Customer("facu");
    customer.setMemberType("Premium");


    Visit visit = new Visit(customer, date);

    visit.setProductExpense(100);

    visit.setProductExpense(visit.getProductExpense() - (visit.getProductExpense() * discountRate.getProductDiscountRate(customer.getMemberType())));

    System.out.print(visit.getProductExpense());
    }
}
