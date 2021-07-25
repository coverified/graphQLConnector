/**
 * © 2021. CoVerified GmbH
 **/

package info.coverified.graphql.util

import caliban.parsing.adt.Document
import caliban.tools.{Formatter, IntrospectionClient}
import zio.{Task, UIO}

import java.io.{File, PrintWriter}

/**
  * Updating client schema from api
  */
object ApiSchemaUpdater extends ClientSchemaUpdater with App {
  // params
  val url = "http://keystone-next.docker/api/graphql"

  // run code
  val runtime = zio.Runtime.default

  val introspectResult: Document =
    runtime.unsafeRun(IntrospectionClient.introspect(url, None))
  val generatedClientSchemaCode =
    ClientWriter.write(
      introspectResult,
      objName,
      packageName = packageName,
      genView = true
    )

  val writeTask = for {
    formattedCode <- Formatter.format(generatedClientSchemaCode, None)
    _ <- Task(new PrintWriter(new File(outputPath)))
      .bracket(q => UIO(q.close()), pw => Task(pw.println(formattedCode)))
  } yield ()

  runtime.unsafeRun(writeTask)
}
