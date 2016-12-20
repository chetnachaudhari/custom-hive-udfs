package com.flipkart.fdp.hive.udf.arrays;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class UDFRemoveDuplicatedFromArrayTest {
  @Test
  public void testRemoveDuplicates() {
    UDFRemoveDuplicatesFromArray udfRemoveDuplicatedFromArray = new UDFRemoveDuplicatesFromArray();
    List<Integer> input1 = Lists.newArrayList(1, 1, 4, 6, 100);
    List<Integer> output1 = Lists.newArrayList(1, 4, 6, 100);
    assertTrue(output1.equals(udfRemoveDuplicatedFromArray.evaluate(input1)));
  }
}
