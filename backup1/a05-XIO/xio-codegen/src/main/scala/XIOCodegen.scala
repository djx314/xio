package xio.codegen

import java.io.PrintWriter
import java.nio.file.{Files, Paths}

import scala.util.Using

object XIOCodegen {

  val filePath1 = Paths.get(".", "modules", "xio", "src", "main", "scala", "xio", "nat", "has", "XHasAlias.scala")
  val filePath2 = Paths.get(".", "modules", "xio", "src", "main", "scala", "xio", "nat", "error", "XErrorAlias.scala")
  val filePath3 = Paths.get(".", "modules", "xio", "src", "main", "scala", "xio", "helper", "XIOErrorHelper.scala")
  val filePath4 = Paths.get(".", "modules", "xio", "src", "main", "scala", "xio", "helper", "XIOPlusHelper.scala")
  val filePath5 = Paths.get(".", "modules", "xio", "src", "main", "scala", "xio", "helper", "XIOErrorHelperInstance.scala")
  val filePath6 = Paths.get(".", "modules", "xio", "src", "main", "scala", "xio", "helper", "XIOErrorHelperInstance2.scala")

  def main(i: Array[String]): Unit = {
    Files.createDirectories(filePath1.getParent)
    Using(new PrintWriter(filePath1.toFile, "utf-8")) { writer =>
      val content = StringUtil.trimLines(xio.codegen.txt.XHasProjection(maxItem = XIOParam.maxItem).body)
      writer.println(content)
    }

    Files.createDirectories(filePath2.getParent)
    Using(new PrintWriter(filePath2.toFile, "utf-8")) { writer =>
      val content = StringUtil.trimLines(xio.codegen.txt.XErrorProjection(maxItem = XIOParam.maxItem).body)
      writer.println(content)
    }

    Files.createDirectories(filePath3.getParent)
    Using(new PrintWriter(filePath3.toFile, "utf-8")) { writer =>
      val content = StringUtil.trimLines(xio.codegen.txt.XIOErrorHelper(maxItem = XIOParam.maxItem).body)
      writer.println(content)
    }

    Files.createDirectories(filePath4.getParent)
    Using(new PrintWriter(filePath4.toFile, "utf-8")) { writer =>
      val content = StringUtil.trimLines(xio.codegen.txt.XIOPlusHelper(maxItem = XIOParam.maxItem).body)
      writer.println(content)
    }

    Files.createDirectories(filePath5.getParent)
    Using(new PrintWriter(filePath5.toFile, "utf-8")) { writer =>
      val content = StringUtil.trimLines(xio.codegen.txt.XIOErrorHelperInstance(maxItem = XIOParam.maxItem).body)
      writer.println(content)
    }

    Files.createDirectories(filePath6.getParent)
    Using(new PrintWriter(filePath6.toFile, "utf-8")) { writer =>
      val content = StringUtil.trimLines(xio.codegen.txt.XIOErrorHelperInstance2(maxItem = XIOParam.maxItem).body)
      writer.println(content)
    }
  }

}
