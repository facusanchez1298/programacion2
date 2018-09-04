package com.company;

public class Employee {
    int id;
    String firstName;
    String lastName;
    int salari;

    Employee(int id, String firstName, String lastName, int salari){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        if(salari < 0){
            throw new RuntimeException("ingrese un salario positivo");
        }
        else this.salari = salari;
    }


    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalari() {
        return salari;
    }

    public String getName(){
        return firstName + " " + lastName;
    }

    public void setSalari(int salari){
        this.salari = salari;
    }

    public int anualSalari(){
        return salari * 12;
    }

    public int raiserSalary(int percent){
        this.salari += percent;
        return this.salari;
    }

    public String verEmleado(){
        return "empleoyee[id = " + this.id + ", name = " + this.firstName +
                " " + this.lastName + ", salary = " + this.salari + "]";
    }








}
