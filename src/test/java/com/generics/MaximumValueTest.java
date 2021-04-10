package com.generics;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class MaximumValueTest<T> {
    MaximumValue<Integer> Obj2= new MaximumValue<>();

    @Test
    void GivenThreeIntegersGiven_MaximumValue_FirstPositionReturns(){
        int firstMaxValue = Obj2.findMaximumValue(91,32,43);
        Assertions.assertEquals(91, firstMaxValue);
    }
    @Test
    void GivenThreeIntegersGiven_MaximumValue_SecondPositionReturns() {
        int secondMaxValue =  Obj2.findMaximumValue(42, 76, 43);
        Assertions.assertEquals(76, secondMaxValue);
    }
}
