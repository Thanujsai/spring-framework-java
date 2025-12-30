package com.spring.basics.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MyMathTest {
  
  @Test
  public void testCalculateSum() {
    MyMath myMath = new MyMath();
    int[] numbers = {1, 2, 3, 4, 5};
    int result = myMath.calculateSum(numbers);
    assertEquals(15, result);
  }

}
