package xio.codegen

import java.io.PrintWriter
import java.nio.file.{Files, Paths}

import scala.util.Using

object XIOCodegen {

  val filePath = Paths.get(".", "a04-XIO", "xio", "src", "main", "scala", "xio", "nat", "has", "XHasProjection.scala")

  def main(i: Array[String]): Unit = {
    Files.createDirectories(filePath.getParent)
    Using(new PrintWriter(filePath.toFile, "utf-8")) { writer =>
      val content = StringUtil.trimLines(xio.codegen.txt.XHasProjection(maxItem = XIOParam.maxItem).body)
      writer.println(content)
    }

  }
}
