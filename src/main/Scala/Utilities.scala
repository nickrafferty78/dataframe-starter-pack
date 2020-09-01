
import org.apache.log4j.{Level, Logger}
import org.apache.spark.sql.types.{ArrayType, DoubleType, IntegerType, LongType, StringType, StructField, StructType}

object Utilities {

  def setupLogging() = {
    Logger.getLogger("org.apache.spark").setLevel(Level.ERROR)
  }

  val musicalInstrumentsSchema = StructType(Array(
      StructField("reviewerID", StringType, nullable = true),
       StructField("asin", StringType, nullable = true),
      StructField("reviewerName", StringType, nullable = true),
      StructField("helpful", ArrayType(IntegerType, true)),
      StructField("reviewText", StringType, nullable = true),
      StructField("overall", DoubleType, nullable = true),
      StructField("summary", StringType, nullable = true),
      StructField("unixReviewTime", LongType, nullable = true),
      StructField("reviewTime", StringType, nullable = true)
  ))


  val yelpSchema = StructType(Array(
    StructField("name", StringType, nullable = true),
    StructField("city", StringType, nullable = true),
    StructField("stars", StringType, nullable = true),
    StructField("review_count", StringType, nullable = true),
    StructField("hours", StructType(
      Array(
        StructField("Monday", StringType),
        StructField("Tuesday", StringType),
        StructField("Wednesday", StringType),
        StructField("Thursday", StringType),
        StructField("Friday", StringType),
        StructField("Saturday", StringType),
        StructField("Sunday", StringType)
      )
    )),
  ))

}
