/**
 * © 2021. CoVerified GmbH
 **/

package info.coverified.graphql.util

import caliban.tools.{Formatter, SchemaLoader}
import zio.{Task, UIO}

import java.io.{File, PrintWriter}

/** Updating client schema from file
  */
object FileSchemaUpdater extends ClientSchemaUpdater with App {
  // params
  val schemaFilePath = "input/schema.graphql"
  val genView = true

  // generate schema
  zio.Runtime.default.unsafeRun(for {
    schema <- SchemaLoader.fromFile(schemaFilePath).load
    code = ClientWriter.write(schema, objName, packageName, genView)
    formattedCode <- Formatter.format(code, None)
    _ <- Task(new PrintWriter(new File(outputPath)))
      .bracket(q => UIO(q.close()), pw => Task(pw.println(formattedCode)))
  } yield ())
}
