package com.ckd.designpattern.creation.simplefactory;

import java.util.HashMap;

/**
 * @author diaochengkun
 * @create 2018-12-23
 **/
public class MapTest {

    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>(2);
        for(int i=0;i<100;i++){
            map.put("testKey"+i,"testValue");
        }
    }
}
