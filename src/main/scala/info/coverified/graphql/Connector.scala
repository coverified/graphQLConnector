/**
 * © 2021. CoVerified,
 * Diehl, Fetzer, Hiry, Kilian, Mayer, Schlittenbauer, Schweikert, Vollnhals, Weise GbR
 **/

package info.coverified.graphql

import caliban.client.{CalibanClientError, SelectionBuilder}
import sttp.client3.{Request, UriContext}
import sttp.client3.asynchttpclient.zio.{SttpClient, send}
import zio.RIO
import zio.console.{Console, putStrLn}
import caliban.client.Operations.RootQuery
import caliban.client.{CalibanClientError, SelectionBuilder}
import info.coverified.graphql.schema.CoVerifiedClientSchema._
import sttp.client3.{UriContext, _}
import sttp.client3.asynchttpclient.zio.{AsyncHttpClientZioBackend, _}
import zio.console.{Console, putStrLn}
import zio.{App, ExitCode, RIO, ZIO}

/**
  * //ToDo: Class Description
  *
  * @version 0.1
  * @since 25.02.21
  */
object Connector {

  def sendRequest[T](
      req: Request[Either[CalibanClientError, T], Any]
  ): RIO[Console with SttpClient, T] = {
    send(req)
      .map(_.body)
      .absolve
      .tap(res => {
        putStrLn(s"Result: $res")
      })
  }

}
