
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
    StructField("business_id", StringType, nullable = true),
    StructField("name", StringType, nullable = true),
    StructField("address", StringType, nullable = true),
    StructField("city", ArrayType(IntegerType, true)),
    StructField("state", StringType, nullable = true),
    StructField("postal_code", DoubleType, nullable = true),
    StructField("latitude", StringType, nullable = true),
    StructField("longitude", LongType, nullable = true),
    StructField("stars", StringType, nullable = true),
    StructField("review_count", StringType, nullable = true),
    StructField("is_open", DoubleType, nullable = true),
    StructField("attributes", StringType, nullable = true),
    StructField("categories", LongType, nullable = true),
    StructField("hours", StringType, nullable = true),
  ))
}
