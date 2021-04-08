package com.ranga.spark.hive.udf;

import org.apache.hadoop.hive.ql.exec.UDF;

/**
 * Spark Hive UDF Example 
 * author: Ranga
 * created: 8-Apr-2021
 */

class UpperCaseUDF extends UDF {
  public String evaluate(String input) {
    
    if(input == null || input.length() == 0) 
	return input;
    
    return input.toUpperCase();
  } 
}
