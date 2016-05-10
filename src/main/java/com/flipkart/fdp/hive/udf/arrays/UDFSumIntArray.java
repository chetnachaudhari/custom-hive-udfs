package com.flipkart.fdp.hive.udf.arrays;

import org.apache.hadoop.hive.ql.exec.Description;
import org.apache.hadoop.hive.ql.exec.UDF;

import java.util.List;

@Description(
        name="sum_int_array",
        value = "array<int>"
)
public class UDFSumIntArray  extends UDF {
    public int evaluate(List<Integer> input) {
        if(input.isEmpty() || input == null) {
            return 0;
        }
        int sum = 0;
        for ( Integer element: input) {
            sum = sum + element;
        }
        return sum;
    }
}
