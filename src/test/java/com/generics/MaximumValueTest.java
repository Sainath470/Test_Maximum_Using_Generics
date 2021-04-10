package com.generics;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class MaximumValueTest<T>{
     MaximumValue<Integer> intObj = new MaximumValue<>();
    
    @Test
    void GivenThreeIntegersGiven_MaximumValue_FirstPositionReturns(){
        int firstMaxValue = intObj.findMaximumValue(91,32,43);
        Assertions.assertEquals(91, firstMaxValue);
    }

    @Test
    void GivenThreeIntegersGiven_MaximumValue_SecondPositionReturns(){
        int secondMaxValue = intObj.findMaximumValue(42, 76, 43);
        Assertions.assertEquals(76, secondMaxValue);
    }
}
