/**
 * © 2021. CoVerified GmbH
 **/

package info.coverified.graphql

import sttp.client3.Request
import sttp.client3.asynchttpclient.zio.{SttpClient, send}
import caliban.client.CalibanClientError
import com.typesafe.scalalogging.LazyLogging
import zio.console.{Console, putStrLn}
import zio.RIO

/**
  * @version 0.1
  * @since 25.02.21
  * @deprecated will be dropped soon. Please consider implementing your own connector.
  */
@Deprecated
object Connector extends LazyLogging {

  def sendRequest[T](
      req: Request[Either[CalibanClientError, T], Any]
  ): RIO[Console with SttpClient, T] = {
    send(req)
      .map(_.body)
      .absolve
      .map { body =>
        logger.trace(s"Result: $body")
        body
      }
  }

}
