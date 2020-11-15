package xio.akka.runner

import java.util

import akka.actor.typed.scaladsl.Behaviors
import akka.actor.typed._
import zio._

class ActionQueue {

  val queue: java.util.Queue[ActorToZIO.InputZIO] = new util.LinkedList[ActorToZIO.InputZIO]
  var replyTo: ActorToZIO.ReceiveZIOAction        = null

  def apply(): Behavior[ActorToZIO.QueueReceive] = Behaviors.receive { (context, message) =>
    message match {
      case in: ActorToZIO.InputZIO =>
        queue.offer(in)
        if (replyTo != null) {
          val ele = queue.poll()
          if (ele != null) {
            replyTo.from(ZIO.succeed(ele))
            replyTo = null
          }
        }
      case i: ActorToZIO.ReceiveZIOAction =>
        val ele = queue.poll()
        if (ele != null) {
          i.from(ZIO.succeed(ele))
        } else {
          replyTo = i
        }
    }
    Behaviors.same
  }
}
