import org.apache.log4j.{Level, Logger}

object Utilities {

  def setupLogging() = {
    Logger.getLogger("org.apache.spark").setLevel(Level.ERROR)
  }
}
