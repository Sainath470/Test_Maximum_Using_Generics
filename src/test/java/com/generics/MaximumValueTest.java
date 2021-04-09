package com.generics;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class MaximumValueTest<T> {
    MaximumValue<Integer> Obj1= new MaximumValue<>();

    //Test cases for integer values
    @Test
    void GivenThreeIntegers_When_Given_FirstPositionReturns(){
        T firstIntegerValue= (T) Obj1.findMaximumValue(91,32,43);
        Assertions.assertEquals(91, firstIntegerValue);
    }
    @Test
    void GivenThreeIntegers_When_Given_SecondPositionReturns() {
        T secondIntegerValue = (T) Obj1.findMaximumValue(42, 76, 43);
        Assertions.assertEquals(76, secondIntegerValue);
    }
    @Test
    void GivenThreeIntegers_When_Given_ThirdPositionReturns() {
        T thirdIntegerValue = (T) Obj1.findMaximumValue(21, 32, 77);
        Assertions.assertEquals(77, thirdIntegerValue);
    }
}