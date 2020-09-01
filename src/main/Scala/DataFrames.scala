import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions._
import org.apache.log4j.{Level, Logger}
import org.apache.spark.sql.types.LongType
import Utilities._

object DataFrames extends App {

  Utilities.setupLogging()

  val spark = SparkSession
    .builder()
    .appName("MusicalInstruments")
    .master("local[*]")
    .getOrCreate()


  val firstDataFrame = spark
    .read
    .format("json")
    .option("inferSchema", "true")
    .load("data/MusicalInstrumentReviews.json")

  firstDataFrame.show()
  firstDataFrame.printSchema()



}
