package com.generics;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class MaximumValueTest<T> {
    MaximumValue<String> Obj2= new MaximumValue<>();

    @Test
    void Given_ThreeStrings_When_Given_MaximumValue_FirstPositionReturns(){
        String firstMaxValue = Obj2.findMaximumValue("Peach","Apple","Banana");
        Assertions.assertEquals("Peach", firstMaxValue);
    }
    @Test
    void Given_ThreeStrings_When_Given_MaximumValue_SecondPositionReturns() {
        String secondMaxValue = Obj2.findMaximumValue("Apple","Kiwi","Banana");
        Assertions.assertEquals("Kiwi", secondMaxValue);
    }

    @Test
    void Given_ThreeStirngs_When_Given_MaximumValue_ThirdPositionReturns() {
        String thirdMaxValue = Obj2.findMaximumValue("Apple","Mango","Peach");
        Assertions.assertEquals("Peach", thirdMaxValue);
    }
}
