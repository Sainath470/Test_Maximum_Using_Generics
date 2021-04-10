package com.generics;
public class MaximumGeneric<T extends Comparable<T>> {

    //for finding maximum String value based on length
    public <T extends Comparable<T>> int findStringMaximumValue(T t1, T t2, T t3)
    {
        int length1 = t1.toString().length();
        int length2 = t2.toString().length();
        int length3 = t3.toString().length();
        if(length1 > length2 && length1 > length3)
        {
            return length1;
        }
        if(length2 > length1 && length2 > length3)
        {
            return length2;
        }
        else
        return length3;
    }

}
