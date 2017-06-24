
import org.apache.spark.SparkConf;
import org.apache.spark.SparkContext;
import org.apache.spark.SparkContext._;
object car {
  def main(args:Array[String]){
    val conf=new SparkConf()
    conf.setMaster("local").setAppName("wordcount")
    val sc=new SparkContext(conf)
    var rdd=sc.textFile("./data/mllib/car.data.txt")
   // var rdd=sc.textFile("hdfs://192.168.16.130:9000/spark_cardata/car.data.txt")
    //每种属性统计一次
   //  rdd.flatMap(_.split(",")).map((_,1)).reduceByKey(_+_).sortByKey(true).saveAsTextFile("./data/count_result")
    //第一个属性的数量
      rdd.map(line=>(line.split(",")(0),1)).reduceByKey(_+_).collect().foreach(println) 
      rdd.map(line=>(line.split(",")(1),1)).reduceByKey(_+_).collect().foreach(println)
      rdd.map(line=>(line.split(",")(2),1)).reduceByKey(_+_).collect().foreach(println)
      rdd.map(line=>(line.split(",")(3),1)).reduceByKey(_+_).collect().foreach(println)
      rdd.map(line=>(line.split(",")(4),1)).reduceByKey(_+_).collect().foreach(println)
      rdd.map(line=>(line.split(",")(5),1)).reduceByKey(_+_).collect().foreach(println)
      //最后一个属性的数量
      rdd.map(line=>(line.split(",")(6),1)).reduceByKey(_+_).collect().foreach(println)
     
      sc.stop()
}
}