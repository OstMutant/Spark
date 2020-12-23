package org.ost.investigate.spark;

import static spark.Spark.get;

public class SparkMain {
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello, World!");
    }
}
