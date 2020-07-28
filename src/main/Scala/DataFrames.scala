import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions._
import org.apache.log4j.{Level, Logger}

object DataFrames extends App {

  def setupLogging() = {
    val rootLogger = Logger.getRootLogger()
    rootLogger.setLevel(Level.ERROR)
  }

  val spark = SparkSession
    .builder()
    .appName("NYT")
    .master("local[*]")
    .getOrCreate()

  setupLogging()


}
