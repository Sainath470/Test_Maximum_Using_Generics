package com.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaximumGeneric<T> {

    //for finding maximum String value based on length
    public <T extends Comparable<T>> T findStringMaximumValue(T t1, T t2, T t3) {
        List<T> stringObj = new ArrayList<>();
        T firstString = t1;
        T secondString = t2;
        T thirdString = t3;

        int length1 = t1.toString().length();
        int length2 = t2.toString().length();
        int length3 = t3.toString().length();
        if(length1 > length2 && length1 > length3)
        {
            return firstString;
        }
        if(length2 > length1 && length2 > length3)
        {
            return secondString;
        }
        else
        return thirdString;
    }
 }

