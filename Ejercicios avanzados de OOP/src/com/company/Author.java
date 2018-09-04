package com.company;

public class Author {

    private String email;
    private char gender;
    private String name;

    Author(String name, String email, char gender){
        this.name  = name;
        this.email = email;
        if((gender == 'f')||(gender == 'm')||(gender == 'F')||(gender == 'M')){
        this.gender = gender;
        }
        else throw new RuntimeException("solo se aceptan los caracteres" +
                " m (para masculino) y f(para femenino)");
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String verAuthor(){
        return "aunthor[name = " + this.name + ", email = " + this.email +
                ", gender = " + this.gender + "]";
    }
}
