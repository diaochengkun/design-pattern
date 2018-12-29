package com.ckd.design.principle.openclose;

/**
 * @author diaochengkun
 * @create 2018-12-18
 **/
public class DisCountNovelBook extends NovelBook {
    public DisCountNovelBook(String name, String author, double price) {
        super(name, author, price);
    }

    public double getOrignPrice(){
        return super.getPrice();
    }

    @Override
    public double getPrice() {
        return super.getPrice()*0.8;
    }
}
