# Spark Hive UDF Example

## Build the project
```
mvn clean package
```
## Copy the spark-hive-udf-1.0.0-SNAPSHOT.jar to edge node temporary directory
```
spark-hive-udf]# cp target/spark-hive-udf-1.0.0-SNAPSHOT.jar /tmp
```

## Launch the spark-shell with providing the jar
```
spark-shell --master yarn --jars /tmp/spark-hive-udf-1.0.0-SNAPSHOT.jar
```
## Create the Function with name uppercase and list the function
```
spark.sql("CREATE OR REPLACE FUNCTION uppercase AS 'com.ranga.spark.hive.udf.UpperCaseUDF' USING JAR '/tmp/spark-hive-udf-1.0.0-SNAPSHOT.jar'")
spark.catalog.listFunctions.filter('classname like "%UpperCaseUDF%").show(false)
```
## Test the uppercase udf
```
spark.sql("select uppercase('Ranga')")
```
