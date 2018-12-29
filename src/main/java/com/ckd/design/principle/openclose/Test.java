package com.ckd.design.principle.openclose;

/**
 * @author diaochengkun
 * @create 2018-12-18
 **/
public class Test {

    public static void main(String[] args) {
//        IBook book = new NovelBook("神雕侠侣","金庸",42.5);
//        System.out.println(String.format("书名:%s,作者:%s,价格:%s",book.getName(),book.getAuthor(),book.getPrice()));

        IBook book = new DisCountNovelBook("神雕侠侣","金庸",42.5);
        System.out.println(String.format("书名:%s,作者:%s,原价:%s,折后价格:%s",book.getName(),book.getAuthor(),
                ((DisCountNovelBook) book).getOrignPrice(),book.getPrice()));
    }
}
