/**
 * © 2021. CoVerified GmbH
 **/

package info.coverified.graphql.util

trait ClientSchemaUpdater {
  protected val packageName: Option[String] = Some(
    "info.coverified.graphql.schema"
  )
  protected val objName = "CoVerifiedClientSchema"
  protected val outputPath =
    "src/main/scala/info/coverified/graphql/schema/CoVerifiedClientSchema.scala"
  protected implicit val unwantedKeyWords: Vector[String] =
    Vector("keystone", "user", "authenticateditem")
}
