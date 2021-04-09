package com.generics;
public class MaximumValue<T>{

    public  <T extends Comparable<T>> T findMaximumValue(T t1, T t2, T t3) {
        System.out.println("First value: " + t1 + "\nSecond value: " + t2 + "\nThird value: " + t3);
        if (t1.compareTo(t2) > 0 && (t1.compareTo(t3) > 0)) {
            return t1;
        }
        if(t2.compareTo(t1) > 0 && (t2.compareTo(t3)) > 0)
        {
            return t2;
        }
        else
            return t3;
    }
}

