package com.ckd.design.principle.dependenceinversion;

/**
 * @author diaochengkun
 * @create 2018-12-18
 **/
public class Test {
    public static void main(String[] args) {
        Tom tom = new Tom();
        tom.study(new JavaCourse());
    }
}
