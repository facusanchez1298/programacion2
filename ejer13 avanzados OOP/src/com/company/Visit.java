package com.company;

import java.util.Date;

public class Visit {
    Customer customer;
    Date date;
    double serviceExpense;
    double productExpense;

    Visit(String name, Date date){
        Customer customer = new Customer(name);
        this.date = date;
    }
    Visit(Customer customer,Date date){
        this.customer = customer;
        this.date = date;
    }

    public String toString(){
        return "el visitante " + customer.getName() +
                " vino el dia " + this.date;
    }


    // getter y setter
    public Customer getCustomer() {
        return customer;
    }

    public Date getDate() {
        return date;
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }



    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }




}
