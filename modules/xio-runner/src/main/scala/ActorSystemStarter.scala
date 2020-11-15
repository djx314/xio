package xio.akka.runner

import akka.actor.typed.scaladsl.Behaviors
import akka.actor.typed._

object ActorSystemStarter {
  def apply(): Behavior[ActorToZIO.InputZIO] = Behaviors.setup { context =>
    val replyTo = context.spawn((new ActionQueue).apply(), "zio-sender")
    ActorToZIO.fromActorRef(replyTo)

    Behaviors.receiveMessage { message =>
      replyTo ! message
      Behaviors.same
    }
  }
}
