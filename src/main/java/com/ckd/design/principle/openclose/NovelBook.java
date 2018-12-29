package com.ckd.design.principle.openclose;

/**
 * @author diaochengkun
 * @create 2018-12-18
 **/
public class NovelBook implements IBook {

    private String name;

    private String author;

    private double price;

    public NovelBook(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    @Override
    public String getAuthor() {
        return this.author;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}
