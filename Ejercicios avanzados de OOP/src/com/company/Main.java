package com.company;

public class Main {
    static Author[] authors;
    static Book book;
    public static void main(String[] args) {

        authors = new Author[2];
        authors[0] = new Author("facu","fas_facu@hotmail.com", 'm');
        authors[1] = new Author("gogo","rfs_rami@hotmail.com", 'm');

        book = new Book("el chico que hacia cosas", authors, 3.25 );

        System.out.print(book.toString());
    }
}
