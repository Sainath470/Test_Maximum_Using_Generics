package com.generics;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class MaximumValueTest<T> {
    MaximumValue<String> Obj2= new MaximumValue<>();

    @Test
    void Given_ThreeStrings_When_Given_MaximumValue_FirstPositionReturns(){
        T firstMaxValue= (T) Obj2.findMaximumValue("Peach","Apple","Banana");
        Assertions.assertEquals("Peach", firstMaxValue);
    }
    @Test
    void Given_ThreeStrings_When_Given_MaximumValue_SecondPositionReturns() {
        T firstMaxValue = (T) Obj2.findMaximumValue("Apple","Kiwi","Banana");
        Assertions.assertEquals("Kiwi", firstMaxValue);
    }

    @Test
    void Given_ThreeStirngs_When_Given_MaximumValue_ThirdPositionReturns() {
        T firstMaxValue = (T) Obj2.findMaximumValue("Apple","Mango","Peach");
        Assertions.assertEquals("Peach", firstMaxValue);
    }
}