package xio.codegen

import java.io.PrintWriter
import java.nio.file.{Files, Paths}

import scala.util.Using

object XIOCodegen {

  val filePath1 = Paths.get(".", "a05-XIO", "xio", "src", "main", "scala", "xio", "nat", "has", "XHas.scala")
  val filePath2 = Paths.get(".", "a05-XIO", "xio", "src", "main", "scala", "xio", "nat", "error", "XErrorAlias.scala")

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
  }

}
