import com.yparser.{ArrayContext, BooleanContext, IntContext, Parser}
import utest._

object PaserSpec extends TestSuite {
  val tests = Tests {
    "For parse" - {
      "when the yaml is a single Int value" - {
        "it should return the IntContext" - {
          val yaml =
            """
              |number: 10
            """.stripMargin

          Parser.parse(yaml) ==> IntContext("number", 10)
        }
      }

      "when the yaml is a single string value" - {
        "it should return the StringContext" - {
          val yaml =
            """
              |name: dave
            """.stripMargin

          Parser.parse(yaml) ==> StringContext("name", "dave")
        }
      }

      "when the yaml is a single boolean value" - {
        "it should return the BooleanContext" - {
          val yaml =
            """
              |isok: false
            """.stripMargin

          Parser.parse(yaml) ==> BooleanContext("isok", false)
        }
      }

      "when the yaml is a single array of int value" - {
        "it should return the ArrayContext" - {
          val yaml =
            """
              |ids:
              |  - 1
              |  - 2
              |  - 3
              |  - 4
            """.stripMargin

          Parser.parse(yaml) ==> ArrayContext("ids", List())
        }
      }
    }
  }
}
