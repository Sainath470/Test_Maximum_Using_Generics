package com.generics;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class MaximumValueTest<T>{
  
  MaximumValue<Integer> intObj = new MaximumValue<>();
  MaximumValue<Float> floatObj = new MaximumValue<>();
  MaximumValue<String> stringObj = new MaximumValue<>();
  
      
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

    @Test
    void GivenThreeIntegersGiven_MaximumValue_ThirdPositionReturns() {
        int thirdMaxValue = intObj.findMaximumValue(21, 32, 77);
        Assertions.assertEquals(77, thirdMaxValue);
    }
  
    @Test
    void GivenThreeFloatGiven_MaximumValue_FirstPositionReturns(){
        float firstMaxValue = floatObj.findMaximumValue(91.0f,32.3f,43.4f);
        Assertions.assertEquals(91.0f, firstMaxValue);
    }
  
    @Test
    void GivenThreeFloatGiven_MaximumValue_SecondPositionReturns() {
        float secondMaxValue = floatObj.findMaximumValue(42.1f, 76.4f, 43.3f);
        Assertions.assertEquals(76.4f, secondMaxValue);
    }

    @Test
    void GivenThreeFloatGiven_MaximumValue_ThirdPositionReturns() {
        float thirdMaxValue = floatObj.findMaximumValue(21.4f, 32.3f, 77.5f);
        Assertions.assertEquals(77.5f, thirdMaxValue);
    }
  
    @Test
    void Given_ThreeStrings_When_Given_MaximumValue_FirstPositionReturns(){
        String firstMaxValue = stringObj.findMaximumValue("Peach","Apple","Banana");
        Assertions.assertEquals("Peach", firstMaxValue);
    }
  
    @Test
    void Given_ThreeStrings_When_Given_MaximumValue_SecondPositionReturns(){
        String secondMaxValue = stringObj.findMaximumValue("Apple","Kiwi","Banana");
        Assertions.assertEquals("Kiwi", secondMaxValue);
    }

    @Test
    void Given_ThreeStirngs_When_Given_MaximumValue_ThirdPositionReturns(){
        String thirdMaxValue = stringObj.findMaximumValue("Apple","Mango","Peach");
        Assertions.assertEquals("Peach", thirdMaxValue);
    }
}
