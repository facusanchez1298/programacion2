package com.company;

public class Customer {
    String name;
    boolean member;
    String memberType;

    ///constructores
    Customer(String name){
        this.name = name;
    }

    ///funciones
    public String toString(){
        return "el nombre del cliente es " + this.name;
    }

    ///getter y setter
    public String getName() {
        return name;
    }

    public boolean isMember() {
        return member;
    }

    public void setMember(boolean member) {
        this.member = member;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }



}
