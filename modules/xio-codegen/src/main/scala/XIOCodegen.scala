package xio.codegen

import java.io.PrintWriter
import java.nio.file.{Files, Paths}

import scala.util.Using

object XIOCodegen {

  val rootDir   = Paths.get(".", "modules", "xio", "src", "main", "scala")
  val filePath2 = rootDir.resolve(Paths.get("xio", "nat", "error", "XErrorAlias.scala"))

  val helperDir = rootDir.resolve(Paths.get("xio", "helper"))
  val filePath3 = helperDir.resolve(Paths.get("XIOErrorHelper.scala"))
  val filePath5 = helperDir.resolve(Paths.get("XIOErrorHelperInstance.scala"))
  val filePath6 = helperDir.resolve(Paths.get("XIOErrorHelperInstance2.scala"))
  val filePath7 = helperDir.resolve(Paths.get("XIOErrorHelperInstance3.scala"))
  val filePath8 = helperDir.resolve(Paths.get("XIOErrorHelperInstance4.scala"))

  def main(i: Array[String]): Unit = {
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

    Files.createDirectories(filePath7.getParent)
    Using(new PrintWriter(filePath7.toFile, "utf-8")) { writer =>
      val content = StringUtil.trimLines(xio.codegen.txt.XIOErrorHelperInstance3(maxItem = XIOParam.maxItem).body)
      writer.println(content)
    }

    Files.createDirectories(filePath8.getParent)
    Using(new PrintWriter(filePath8.toFile, "utf-8")) { writer =>
      val content = StringUtil.trimLines(xio.codegen.txt.XIOErrorHelperInstance4(maxItem = XIOParam.maxItem).body)
      writer.println(content)
    }
  }

}
