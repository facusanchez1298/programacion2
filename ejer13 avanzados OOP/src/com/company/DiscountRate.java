package com.company;

public class DiscountRate {
    double serviceDiscountPremium = 0.2;
    double serviceDiscountGold = 0.15;
    double serviceDiscountSilver = 0.1;
    double productDiscountPremium = 0.1;
    double productDiscountgold = 0.1;
    double productDiscountSilver = 0.1;

    public double getServiceDiscountRate(String type){
        if(type == "Premium"){
            return this.serviceDiscountPremium;
        }
        if(type == "Gold"){
            return this.serviceDiscountGold;
        }
        if(type == "Silver"){
            return this.serviceDiscountSilver;
        }
        else return 0;
    }

    public double getProductDiscountRate(String type){
        if(type == "Premium"){
            return this.productDiscountPremium;
        }
        if(type == "Gold"){
            return this.productDiscountgold;
        }
        if(type == "Silver"){
            return this.productDiscountSilver;
        }
        else return 0.1;
    }
}
