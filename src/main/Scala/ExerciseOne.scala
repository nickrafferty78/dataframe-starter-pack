import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions._
import org.apache.log4j.{Level, Logger}
import org.apache.spark.sql.types.LongType
import Utilities._

object ExerciseOne extends App {


    Utilities.setupLogging()

    val spark = SparkSession.builder()
      .appName("YelpBusinessData")
      .master("local[*]")
      .getOrCreate()

    val yelpDF = spark.read
      .option("inferSchema", "true")
      .format("json")
      .load("data/yelp.json")

    yelpDF.show()
  yelpDF.printSchema()

  val filteredDf = yelpDF.select(col("name"), col("city"), col("stars"), col("review_count"), col("state"), col("hours"))

  filteredDf.write.json("data/filteredJson.json")

}
