package com.generics;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class MaximumValueTest<T>{

    @Test
    void GivenThreeIntegersGiven_MaximumValue_FirstPositionReturns(){
        T firstMaxValue =  Obj2.findMaximumValue(91,32,43);
        Assertions.assertEquals(91, firstMaxValue);
    }
    @Test
    void GivenThreeIntegersGiven_MaximumValue_SecondPositionReturns(){
        int secondMaxValue =  Obj2.findMaximumValue(42, 76, 43);
        Assertions.assertEquals(76, secondMaxValue);
    }

    @Test
    void GivenThreeIntegersGiven_MaximumValue_ThirdPositionReturns() {
        int thirdMaxValue = Obj2.findMaximumValue(21, 32, 77);
        Assertions.assertEquals(77, thirdMaxValue);
    }
}
