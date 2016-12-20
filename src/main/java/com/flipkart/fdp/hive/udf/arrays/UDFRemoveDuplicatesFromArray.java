package com.flipkart.fdp.hive.udf.arrays;

import org.apache.hadoop.hive.ql.exec.Description;
import org.apache.hadoop.hive.ql.exec.UDF;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

@Description(
    name="remove_duplicates_from_array",
    value = "array<int>"
)
public class UDFRemoveDuplicatesFromArray extends UDF {
  public List<Integer> evaluate(List<Integer> input) {
    HashSet<Integer> hashSet = new LinkedHashSet<>();
    hashSet.addAll(input);
    if(hashSet != null) {
      return new ArrayList<>(hashSet);
    } else {
      return null;
    }
  }
}
