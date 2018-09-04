package com.company;

public class Book {
    private String name;
    private Author[] author;
    private double price;
    private int qty = 0;



    Book(String name, Author[] author, double price )
    {
        this.name = name;
        this.author = author;

        if(price < 0)
        {
            throw new RuntimeException("el valor tiene que ser positivo");
        }
        else this.price = price;
    }

    Book(String name, Author[] author, double price, int qty)
    {
        this.name = name;
        this.author = author;

        if(price < 0)
        {
            throw new RuntimeException("el valor tiene que ser positivo");
        }
        else this.price = price;
        this.qty = qty;
    }

    public String getAuthorName() {
        String a = "los autores del libro son: ";
        for (int i = 0; i < author.length; i++){
            a += author[i].getName() +  " ";
        }
        return a;
    }

    public String getAuthorName(int i)
    {
        if(getAuthor().length < i)
        {
            return "ese indice de autor no existe";
        }
        else return getAuthor()[i].getName();
    }

    public String toString(){

        String autores = "";
        for(int i = 0; i < author.length; i++)
        {
            autores = autores + " " + author[i].verAuthor();
        }

        return "Book[name = " + this.name +
                ", authors = {" + autores +
                "}, price = " + this.price + ", qty = " + this.qty + "]";
    }

    public String getName()
    {
        return name;
    }

    public Author[] getAuthor()
    {
        return author;
    }

    public double getPrice()
    {
        return price;
    }

    public int getQty()
    {
        return qty;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public void setQty(int qty)
    {
        this.qty = qty;
    }
}
