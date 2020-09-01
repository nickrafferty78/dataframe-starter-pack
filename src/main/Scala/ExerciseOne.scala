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
      .schema(yelpSchema)
      .format("json")
      .load("data/yelp.json")

    yelpDF.show()
    yelpDF.printSchema()


}
