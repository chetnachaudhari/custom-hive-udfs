package com.flipkart.fdp.hive.udf.arrays;


import org.apache.hadoop.hive.ql.exec.Description;
import org.apache.hadoop.hive.ql.exec.UDF;

import java.util.List;

@Description(
        name="sum_long_array",
        value = "array<long>"
)
public class UDFSumLongArray extends UDF {
    public Long evaluate(List<Long> input) {
        if(input.isEmpty() || input == null) {
            return 0L;
        }
        Long sum = 0L;
        for ( Long element: input) {
            sum = sum + element;
        }
        return sum;
    }
}
