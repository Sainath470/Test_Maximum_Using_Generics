package com.generics;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class MaximumValueTest<T> {
    MaximumValue<Integer> Obj1= new MaximumValue<>();
    MaximumValue<Float> Obj2= new MaximumValue<>();
    MaximumValue<String> Obj3= new MaximumValue<>();

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

    //Test cases for float values
    @Test
    void GivenThreeFloat_When_Given_FirstPositionReturns(){
        T firstFloatValue= (T) Obj2.findMaximumValue(91.0,32.3,43.4);
        Assertions.assertEquals(91.0, firstFloatValue);
    }
    @Test
    void GivenThreeFloat_When_Given_SecondPositionReturns() {
        T secondFloatValue = (T) Obj2.findMaximumValue(42.1, 76.4, 43.3);
        Assertions.assertEquals(76.4, secondFloatValue);
    }

    @Test
    void GivenThreeFloat_When_Given_ThirdPositionReturns() {
        T thirdFloatValue = (T) Obj2.findMaximumValue(21.4, 32.3, 77.5);
        Assertions.assertEquals(77.5, thirdFloatValue);
    }

    //String test cases
    @Test
    void Given_ThreeStrings_When_Given_FirstPositionReturns(){
        T firstStringValue= (T) Obj3.findMaximumValue("Peach","Apple","Banana");
        Assertions.assertEquals("Peach", firstStringValue);
    }
    @Test
    void Given_ThreeStrings_When_Given_SecondPositionReturns() {
        T secondStringValue = (T) Obj3.findMaximumValue("Apple","Kiwi","Banana");
        Assertions.assertEquals("Kiwi", secondStringValue);
    }

    @Test
    void Given_ThreeStirngs_When_Given_ThirdPositionReturns() {
        T thirdStringValue = (T) Obj3.findMaximumValue("Apple","Mango","Peach");
        Assertions.assertEquals("Peach", thirdStringValue);
    }
}