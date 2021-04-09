package com.generics;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class MaximumValueTest<T> {
    MaximumValue<Float> Obj2= new MaximumValue<>();

    @Test
    void GivenThreeFloatGiven_MaximumValue_FirstPositionReturns(){
        T firstMaxValue= (T) Obj2.findMaximumValue(91.0,32.3,43.4);
        Assertions.assertEquals(91.0, firstMaxValue);
    }
    @Test
    void GivenThreeFloatGiven_MaximumValue_SecondPositionReturns() {
        T firstMaxValue = (T) Obj2.findMaximumValue(42.1, 76.4, 43.3);
        Assertions.assertEquals(76.4, firstMaxValue);
    }

    @Test
    void GivenThreeFloatGiven_MaximumValue_ThirdPositionReturns() {
        T firstMaxValue = (T) Obj2.findMaximumValue(21.4, 32.3, 77.5);
        Assertions.assertEquals(77.5, firstMaxValue);
    }
}