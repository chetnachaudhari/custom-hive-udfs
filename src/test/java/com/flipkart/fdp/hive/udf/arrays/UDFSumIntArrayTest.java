package com.flipkart.fdp.hive.udf.arrays;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class UDFSumIntArrayTest {
    @Test
    public void testArraySum() {
        UDFSumIntArray udfSumIntArray = new UDFSumIntArray();
        assertEquals(100, udfSumIntArray.evaluate(Lists.newArrayList(45, 15, 40)));
//    12213813248 + 21418461}
    }

}