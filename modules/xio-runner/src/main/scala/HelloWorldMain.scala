package xio.akka.runner

import zio._

import scala.concurrent.duration.Duration
import scala.concurrent.{Await, Future}

object HelloWorldMain {

  def main(args: Array[String]): Unit = {

    import scala.collection.compat._

    val aa = (1 to 1000)
      .to(List)
      .map(i =>
        for {
          i1 <- random.nextLongBounded(3000)
          _  <- clock.sleep(zio.duration.Duration.fromMillis(i1))
        } yield i
      )

    val runner = Runner.default

    import scala.concurrent.ExecutionContext.Implicits.global

    val n: Future[List[Int]] = Future.sequence(aa.map(i => runner.unsafeToFuture(i): Future[Int]))

    val n1: Future[Unit] = n.map { list =>
      println(list.mkString("\n"))
      println((1 to 1000).to(List) == list) // true
    }

    Await.result(n1, Duration.Inf)
    runner.close()
  }
}
