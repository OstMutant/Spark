package org.ost.investigate.spark.rdd;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

public class SparkRddExample {
    public static void main(String[] args) {
        SparkConf sparkConf = new SparkConf().setAppName("Print Elements of RDD")
                .setMaster("local[2]").set("spark.executor.memory","2g");
        JavaSparkContext sc = new JavaSparkContext(sparkConf);
        JavaRDD<String> lines = sc.textFile("file:///C:/Users/ostmu/tmp/test.txt");
        for(String line:lines.collect()){
            System.out.println("* "+line);
        }
        sc.stop();
    }
}
