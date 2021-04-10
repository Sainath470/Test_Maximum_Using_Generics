package com.generics;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class MaximumValueTest{

    @Test
    public void WhenGiven_Integer_TypeValues_Returns_TheResult(){
        MaximumValue<Integer> intObj = new MaximumValue<>(12, 21, 34, 43, 54);
        int integerMaxValue = intObj.findMaximum();
        Assertions.assertEquals(54, integerMaxValue);
    }

    @Test
    public void WhenGiven_Float_Type_Values_Gives_Result(){
        MaximumValue<Float> floatObj = new MaximumValue<>(12.5f, 22.5f, 43.6f, 11.2f, 10.1f);
        float floatMaxValue = floatObj.findMaximum();
        Assertions.assertEquals(43.6f, floatMaxValue);
    }

    @Test
    public void WhenGiven_String_Type_Values_Gives_ResultBased_OnLength(){
        MaximumGeneric<String> stringObj = new MaximumGeneric<>();
        String stringMaxValue = stringObj.findStringMaximumValue("Banana", "kiwi", "peach");
        Assertions.assertEquals("Banana", stringMaxValue);
    }
}
