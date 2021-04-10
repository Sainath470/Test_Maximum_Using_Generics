package com.generics;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class MaximumValueTest<T> {
    MaximumValue<Float> Obj2= new MaximumValue<>();

    @Test
    void GivenThreeFloatGiven_MaximumValue_FirstPositionReturns(){
        float firstMaxValue = Obj2.findMaximumValue(91.0f,32.3f,43.4f);
        Assertions.assertEquals(91.0f, firstMaxValue);
    }
    @Test
    void GivenThreeFloatGiven_MaximumValue_SecondPositionReturns() {
        float secondMaxValue = Obj2.findMaximumValue(42.1f, 76.4f, 43.3f);
        Assertions.assertEquals(76.4f, secondMaxValue);
    }

    @Test
    void GivenThreeFloatGiven_MaximumValue_ThirdPositionReturns() {
        float thirdMaxValue = Obj2.findMaximumValue(21.4f, 32.3f, 77.5f);
        Assertions.assertEquals(77.5f, thirdMaxValue);
    }
}
