package com.generics;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class MaximumValueTest<T> {
    MaximumValue<Integer> Obj2= new MaximumValue<>();

    @Test
    void GivenThreeIntegersGiven_MaximumValue_FirstPositionReturns(){
        T firstMaxValue= (T) Obj2.findMaximumValue(91,32,43);
        Assertions.assertEquals(91, firstMaxValue);
    }
    @Test
    void GivenThreeIntegersGiven_MaximumValue_SecondPositionReturns() {
        T firstMaxValue = (T) Obj2.findMaximumValue(42, 76, 43);
        Assertions.assertEquals(76, firstMaxValue);
    }

    @Test
    void GivenThreeIntegersGiven_MaximumValue_ThirdPositionReturns() {
        T firstMaxValue = (T) Obj2.findMaximumValue(21, 32, 77);
        Assertions.assertEquals(77, firstMaxValue);
    }
}