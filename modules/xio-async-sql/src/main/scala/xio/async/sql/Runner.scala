package xio.async.sql

object Runner {

  def main(arr: Array[String]): Unit = {
    val callback = new JavaVoidCallback() {
      override def invoke(receiver: V8Object, parameters: V8Array): Unit = {
        if (parameters.length() > 0) {
          val arg1 = parameters.get(0)
          println(arg1)
          if (arg1.isInstanceOf[Releasable]) {
            arg1.asInstanceOf[Releasable].release()
          }
        }
      }
    }
    v8.registerJavaMethod(callback, "print")
    v8.executeScript("print('hello, world');")
  }

}
