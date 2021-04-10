package com.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaximumValue<T extends Comparable<T>>{

    T firstValue, secondValue, thirdValue, fourthValue,fifthValue;

    MaximumValue(T firstValue,T secondValue, T thirdValue, T fourthValue, T fifthValue){
        this.firstValue= firstValue;
        this.secondValue= secondValue;
        this.thirdValue= thirdValue;
        this.fourthValue= fourthValue;
        this.fifthValue= fifthValue;
    }

    public  static <T extends Comparable<T>> T testMaximum(T firstValue, T secondValue, T thirdValue, T fourthValue, T fifthValue) {
        List<T> listObj = new ArrayList<>();

        listObj.add(firstValue);
        listObj.add(secondValue);
        listObj.add(thirdValue);
        listObj.add(fourthValue);
        listObj.add(fifthValue);
        Collections.sort(listObj);
        T maxValue = listObj.get(4);
        return maxValue;
    }

    public T findMaximum(){
        return MaximumValue.testMaximum(firstValue,secondValue,thirdValue,fourthValue,fifthValue);
    }


    public  <T> void printMax(){
        System.out.println("Maximum Value in :"+firstValue+","+secondValue+","+thirdValue+
                ","+fourthValue+","+fifthValue+" is "+MaximumValue.testMaximum(firstValue,secondValue,thirdValue,fourthValue,fifthValue));
    }

    public static void main(String[] args) {
        MaximumValue<Integer> intObj = new MaximumValue<>(1,2,3,4,5);
        intObj.printMax();
        MaximumValue<Float> floatObj = new MaximumValue<>(12.5f,11.5f,32.4f,21.6f,13.7f);
        floatObj.printMax();
        MaximumGeneric<String> stringObj = new MaximumGeneric<>();
        System.out.println("Maximum String Value: "+stringObj.findStringMaximumValue("Banana","Peach","Apple"));
    }
}



