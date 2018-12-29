package com.ckd.design.principle.dependenceinversion;

/**
 * @author diaochengkun
 * @create 2018-12-18
 **/
public class Tom {

    public void study(ICourse course){
        course.study();
    }

}
