package com.ckd.design.principle.dependenceinversion;

/**
 * @author diaochengkun
 * @create 2018-12-18
 **/
public class JavaCourse implements ICourse{


    @Override
    public void study() {
        System.out.println("学习java课程");
    }
}
