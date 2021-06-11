/**
 * © 2021. CoVerified,
 * Diehl, Fetzer, Hiry, Kilian, Mayer, Schlittenbauer, Schweikert, Vollnhals, Weise GbR
 **/

package info.coverified.graphql

import sttp.client3.{Request, UriContext}
import sttp.client3.asynchttpclient.zio.{SttpClient, send}
import caliban.client.{CalibanClientError, SelectionBuilder}
import com.typesafe.scalalogging.LazyLogging
import zio.console.{Console, putStrLn}
import zio.{App, ExitCode, RIO, ZIO}

/**
  * //ToDo: Class Description
  *
  * @version 0.1
  * @since 25.02.21
  */
object Connector extends LazyLogging {

  def sendRequest[T](
      req: Request[Either[CalibanClientError, T], Any]
  ): RIO[Console with SttpClient, T] = {
    send(req)
      .map(_.body)
      .absolve
      .tap(res => {
        logger.trace(s"Result: $res")
        putStrLn(
          s"Successfully received result of type '${res.getClass.getName}'."
        )
      })
  }

}
