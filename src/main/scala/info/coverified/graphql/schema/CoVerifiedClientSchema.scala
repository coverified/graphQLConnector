/**
 * © 2021. CoVerified,
 * Diehl, Fetzer, Hiry, Kilian, Mayer, Schlittenbauer, Schweikert, Vollnhals, Weise GbR
 **/

package info.coverified.graphql.schema

import caliban.client.CalibanClientError.DecodingError
import caliban.client.FieldBuilder._
import caliban.client.SelectionBuilder._
import caliban.client._
import caliban.client.Operations._
import caliban.client.__Value._

object CoVerifiedClientSchema {

  type ID = String

  type JSON = String

  sealed trait SortUrlsBy extends scala.Product with scala.Serializable
  object SortUrlsBy {
    case object id_ASC extends SortUrlsBy
    case object id_DESC extends SortUrlsBy
    case object name_ASC extends SortUrlsBy
    case object name_DESC extends SortUrlsBy
    case object lastCrawl_ASC extends SortUrlsBy
    case object lastCrawl_DESC extends SortUrlsBy

    implicit val decoder: ScalarDecoder[SortUrlsBy] = {
      case __StringValue("id_ASC")         => Right(SortUrlsBy.id_ASC)
      case __StringValue("id_DESC")        => Right(SortUrlsBy.id_DESC)
      case __StringValue("name_ASC")       => Right(SortUrlsBy.name_ASC)
      case __StringValue("name_DESC")      => Right(SortUrlsBy.name_DESC)
      case __StringValue("lastCrawl_ASC")  => Right(SortUrlsBy.lastCrawl_ASC)
      case __StringValue("lastCrawl_DESC") => Right(SortUrlsBy.lastCrawl_DESC)
      case other =>
        Left(DecodingError(s"Can't build SortUrlsBy from input $other"))
    }
    implicit val encoder: ArgEncoder[SortUrlsBy] = new ArgEncoder[SortUrlsBy] {
      override def encode(value: SortUrlsBy): __Value = value match {
        case SortUrlsBy.id_ASC         => __EnumValue("id_ASC")
        case SortUrlsBy.id_DESC        => __EnumValue("id_DESC")
        case SortUrlsBy.name_ASC       => __EnumValue("name_ASC")
        case SortUrlsBy.name_DESC      => __EnumValue("name_DESC")
        case SortUrlsBy.lastCrawl_ASC  => __EnumValue("lastCrawl_ASC")
        case SortUrlsBy.lastCrawl_DESC => __EnumValue("lastCrawl_DESC")
      }
      override def typeName: String = "SortUrlsBy"
    }
  }

  sealed trait OrderDirection extends scala.Product with scala.Serializable
  object OrderDirection {
    case object asc extends OrderDirection
    case object desc extends OrderDirection

    implicit val decoder: ScalarDecoder[OrderDirection] = {
      case __StringValue("asc")  => Right(OrderDirection.asc)
      case __StringValue("desc") => Right(OrderDirection.desc)
      case other =>
        Left(DecodingError(s"Can't build OrderDirection from input $other"))
    }
    implicit val encoder: ArgEncoder[OrderDirection] =
      new ArgEncoder[OrderDirection] {
        override def encode(value: OrderDirection): __Value = value match {
          case OrderDirection.asc  => __EnumValue("asc")
          case OrderDirection.desc => __EnumValue("desc")
        }
        override def typeName: String = "OrderDirection"
      }
  }

  sealed trait SortSourcesBy extends scala.Product with scala.Serializable
  object SortSourcesBy {
    case object id_ASC extends SortSourcesBy
    case object id_DESC extends SortSourcesBy
    case object name_ASC extends SortSourcesBy
    case object name_DESC extends SortSourcesBy
    case object acronym_ASC extends SortSourcesBy
    case object acronym_DESC extends SortSourcesBy
    case object url_ASC extends SortSourcesBy
    case object url_DESC extends SortSourcesBy

    implicit val decoder: ScalarDecoder[SortSourcesBy] = {
      case __StringValue("id_ASC")       => Right(SortSourcesBy.id_ASC)
      case __StringValue("id_DESC")      => Right(SortSourcesBy.id_DESC)
      case __StringValue("name_ASC")     => Right(SortSourcesBy.name_ASC)
      case __StringValue("name_DESC")    => Right(SortSourcesBy.name_DESC)
      case __StringValue("acronym_ASC")  => Right(SortSourcesBy.acronym_ASC)
      case __StringValue("acronym_DESC") => Right(SortSourcesBy.acronym_DESC)
      case __StringValue("url_ASC")      => Right(SortSourcesBy.url_ASC)
      case __StringValue("url_DESC")     => Right(SortSourcesBy.url_DESC)
      case other =>
        Left(DecodingError(s"Can't build SortSourcesBy from input $other"))
    }
    implicit val encoder: ArgEncoder[SortSourcesBy] =
      new ArgEncoder[SortSourcesBy] {
        override def encode(value: SortSourcesBy): __Value = value match {
          case SortSourcesBy.id_ASC       => __EnumValue("id_ASC")
          case SortSourcesBy.id_DESC      => __EnumValue("id_DESC")
          case SortSourcesBy.name_ASC     => __EnumValue("name_ASC")
          case SortSourcesBy.name_DESC    => __EnumValue("name_DESC")
          case SortSourcesBy.acronym_ASC  => __EnumValue("acronym_ASC")
          case SortSourcesBy.acronym_DESC => __EnumValue("acronym_DESC")
          case SortSourcesBy.url_ASC      => __EnumValue("url_ASC")
          case SortSourcesBy.url_DESC     => __EnumValue("url_DESC")
        }
        override def typeName: String = "SortSourcesBy"
      }
  }

  sealed trait SortLanguagesBy extends scala.Product with scala.Serializable
  object SortLanguagesBy {
    case object id_ASC extends SortLanguagesBy
    case object id_DESC extends SortLanguagesBy
    case object name_ASC extends SortLanguagesBy
    case object name_DESC extends SortLanguagesBy

    implicit val decoder: ScalarDecoder[SortLanguagesBy] = {
      case __StringValue("id_ASC")    => Right(SortLanguagesBy.id_ASC)
      case __StringValue("id_DESC")   => Right(SortLanguagesBy.id_DESC)
      case __StringValue("name_ASC")  => Right(SortLanguagesBy.name_ASC)
      case __StringValue("name_DESC") => Right(SortLanguagesBy.name_DESC)
      case other =>
        Left(DecodingError(s"Can't build SortLanguagesBy from input $other"))
    }
    implicit val encoder: ArgEncoder[SortLanguagesBy] =
      new ArgEncoder[SortLanguagesBy] {
        override def encode(value: SortLanguagesBy): __Value = value match {
          case SortLanguagesBy.id_ASC    => __EnumValue("id_ASC")
          case SortLanguagesBy.id_DESC   => __EnumValue("id_DESC")
          case SortLanguagesBy.name_ASC  => __EnumValue("name_ASC")
          case SortLanguagesBy.name_DESC => __EnumValue("name_DESC")
        }
        override def typeName: String = "SortLanguagesBy"
      }
  }

  sealed trait SortTagsBy extends scala.Product with scala.Serializable
  object SortTagsBy {
    case object id_ASC extends SortTagsBy
    case object id_DESC extends SortTagsBy
    case object name_ASC extends SortTagsBy
    case object name_DESC extends SortTagsBy
    case object highlighted_ASC extends SortTagsBy
    case object highlighted_DESC extends SortTagsBy
    case object generated_ASC extends SortTagsBy
    case object generated_DESC extends SortTagsBy

    implicit val decoder: ScalarDecoder[SortTagsBy] = {
      case __StringValue("id_ASC")          => Right(SortTagsBy.id_ASC)
      case __StringValue("id_DESC")         => Right(SortTagsBy.id_DESC)
      case __StringValue("name_ASC")        => Right(SortTagsBy.name_ASC)
      case __StringValue("name_DESC")       => Right(SortTagsBy.name_DESC)
      case __StringValue("highlighted_ASC") => Right(SortTagsBy.highlighted_ASC)
      case __StringValue("highlighted_DESC") =>
        Right(SortTagsBy.highlighted_DESC)
      case __StringValue("generated_ASC")  => Right(SortTagsBy.generated_ASC)
      case __StringValue("generated_DESC") => Right(SortTagsBy.generated_DESC)
      case other =>
        Left(DecodingError(s"Can't build SortTagsBy from input $other"))
    }
    implicit val encoder: ArgEncoder[SortTagsBy] = new ArgEncoder[SortTagsBy] {
      override def encode(value: SortTagsBy): __Value = value match {
        case SortTagsBy.id_ASC           => __EnumValue("id_ASC")
        case SortTagsBy.id_DESC          => __EnumValue("id_DESC")
        case SortTagsBy.name_ASC         => __EnumValue("name_ASC")
        case SortTagsBy.name_DESC        => __EnumValue("name_DESC")
        case SortTagsBy.highlighted_ASC  => __EnumValue("highlighted_ASC")
        case SortTagsBy.highlighted_DESC => __EnumValue("highlighted_DESC")
        case SortTagsBy.generated_ASC    => __EnumValue("generated_ASC")
        case SortTagsBy.generated_DESC   => __EnumValue("generated_DESC")
      }
      override def typeName: String = "SortTagsBy"
    }
  }

  sealed trait SortEntriesBy extends scala.Product with scala.Serializable
  object SortEntriesBy {
    case object id_ASC extends SortEntriesBy
    case object id_DESC extends SortEntriesBy
    case object name_ASC extends SortEntriesBy
    case object name_DESC extends SortEntriesBy
    case object hasBeenTagged_ASC extends SortEntriesBy
    case object hasBeenTagged_DESC extends SortEntriesBy
    case object content_ASC extends SortEntriesBy
    case object content_DESC extends SortEntriesBy
    case object summary_ASC extends SortEntriesBy
    case object summary_DESC extends SortEntriesBy
    case object date_ASC extends SortEntriesBy
    case object date_DESC extends SortEntriesBy
    case object nextCrawl_ASC extends SortEntriesBy
    case object nextCrawl_DESC extends SortEntriesBy
    case object updatedAt_ASC extends SortEntriesBy
    case object updatedAt_DESC extends SortEntriesBy
    case object eTag_ASC extends SortEntriesBy
    case object eTag_DESC extends SortEntriesBy
    case object profileHash_ASC extends SortEntriesBy
    case object profileHash_DESC extends SortEntriesBy
    case object contentHash_ASC extends SortEntriesBy
    case object contentHash_DESC extends SortEntriesBy
    case object disabled_ASC extends SortEntriesBy
    case object disabled_DESC extends SortEntriesBy

    implicit val decoder: ScalarDecoder[SortEntriesBy] = {
      case __StringValue("id_ASC")    => Right(SortEntriesBy.id_ASC)
      case __StringValue("id_DESC")   => Right(SortEntriesBy.id_DESC)
      case __StringValue("name_ASC")  => Right(SortEntriesBy.name_ASC)
      case __StringValue("name_DESC") => Right(SortEntriesBy.name_DESC)
      case __StringValue("hasBeenTagged_ASC") =>
        Right(SortEntriesBy.hasBeenTagged_ASC)
      case __StringValue("hasBeenTagged_DESC") =>
        Right(SortEntriesBy.hasBeenTagged_DESC)
      case __StringValue("content_ASC")   => Right(SortEntriesBy.content_ASC)
      case __StringValue("content_DESC")  => Right(SortEntriesBy.content_DESC)
      case __StringValue("summary_ASC")   => Right(SortEntriesBy.summary_ASC)
      case __StringValue("summary_DESC")  => Right(SortEntriesBy.summary_DESC)
      case __StringValue("date_ASC")      => Right(SortEntriesBy.date_ASC)
      case __StringValue("date_DESC")     => Right(SortEntriesBy.date_DESC)
      case __StringValue("nextCrawl_ASC") => Right(SortEntriesBy.nextCrawl_ASC)
      case __StringValue("nextCrawl_DESC") =>
        Right(SortEntriesBy.nextCrawl_DESC)
      case __StringValue("updatedAt_ASC") => Right(SortEntriesBy.updatedAt_ASC)
      case __StringValue("updatedAt_DESC") =>
        Right(SortEntriesBy.updatedAt_DESC)
      case __StringValue("eTag_ASC")  => Right(SortEntriesBy.eTag_ASC)
      case __StringValue("eTag_DESC") => Right(SortEntriesBy.eTag_DESC)
      case __StringValue("profileHash_ASC") =>
        Right(SortEntriesBy.profileHash_ASC)
      case __StringValue("profileHash_DESC") =>
        Right(SortEntriesBy.profileHash_DESC)
      case __StringValue("contentHash_ASC") =>
        Right(SortEntriesBy.contentHash_ASC)
      case __StringValue("contentHash_DESC") =>
        Right(SortEntriesBy.contentHash_DESC)
      case __StringValue("disabled_ASC")  => Right(SortEntriesBy.disabled_ASC)
      case __StringValue("disabled_DESC") => Right(SortEntriesBy.disabled_DESC)
      case other =>
        Left(DecodingError(s"Can't build SortEntriesBy from input $other"))
    }
    implicit val encoder: ArgEncoder[SortEntriesBy] =
      new ArgEncoder[SortEntriesBy] {
        override def encode(value: SortEntriesBy): __Value = value match {
          case SortEntriesBy.id_ASC    => __EnumValue("id_ASC")
          case SortEntriesBy.id_DESC   => __EnumValue("id_DESC")
          case SortEntriesBy.name_ASC  => __EnumValue("name_ASC")
          case SortEntriesBy.name_DESC => __EnumValue("name_DESC")
          case SortEntriesBy.hasBeenTagged_ASC =>
            __EnumValue("hasBeenTagged_ASC")
          case SortEntriesBy.hasBeenTagged_DESC =>
            __EnumValue("hasBeenTagged_DESC")
          case SortEntriesBy.content_ASC      => __EnumValue("content_ASC")
          case SortEntriesBy.content_DESC     => __EnumValue("content_DESC")
          case SortEntriesBy.summary_ASC      => __EnumValue("summary_ASC")
          case SortEntriesBy.summary_DESC     => __EnumValue("summary_DESC")
          case SortEntriesBy.date_ASC         => __EnumValue("date_ASC")
          case SortEntriesBy.date_DESC        => __EnumValue("date_DESC")
          case SortEntriesBy.nextCrawl_ASC    => __EnumValue("nextCrawl_ASC")
          case SortEntriesBy.nextCrawl_DESC   => __EnumValue("nextCrawl_DESC")
          case SortEntriesBy.updatedAt_ASC    => __EnumValue("updatedAt_ASC")
          case SortEntriesBy.updatedAt_DESC   => __EnumValue("updatedAt_DESC")
          case SortEntriesBy.eTag_ASC         => __EnumValue("eTag_ASC")
          case SortEntriesBy.eTag_DESC        => __EnumValue("eTag_DESC")
          case SortEntriesBy.profileHash_ASC  => __EnumValue("profileHash_ASC")
          case SortEntriesBy.profileHash_DESC => __EnumValue("profileHash_DESC")
          case SortEntriesBy.contentHash_ASC  => __EnumValue("contentHash_ASC")
          case SortEntriesBy.contentHash_DESC => __EnumValue("contentHash_DESC")
          case SortEntriesBy.disabled_ASC     => __EnumValue("disabled_ASC")
          case SortEntriesBy.disabled_DESC    => __EnumValue("disabled_DESC")
        }
        override def typeName: String = "SortEntriesBy"
      }
  }

  sealed trait PasswordAuthErrorCode
      extends scala.Product
      with scala.Serializable
  object PasswordAuthErrorCode {
    case object FAILURE extends PasswordAuthErrorCode
    case object IDENTITY_NOT_FOUND extends PasswordAuthErrorCode
    case object SECRET_NOT_SET extends PasswordAuthErrorCode
    case object MULTIPLE_IDENTITY_MATCHES extends PasswordAuthErrorCode
    case object SECRET_MISMATCH extends PasswordAuthErrorCode

    implicit val decoder: ScalarDecoder[PasswordAuthErrorCode] = {
      case __StringValue("FAILURE") => Right(PasswordAuthErrorCode.FAILURE)
      case __StringValue("IDENTITY_NOT_FOUND") =>
        Right(PasswordAuthErrorCode.IDENTITY_NOT_FOUND)
      case __StringValue("SECRET_NOT_SET") =>
        Right(PasswordAuthErrorCode.SECRET_NOT_SET)
      case __StringValue("MULTIPLE_IDENTITY_MATCHES") =>
        Right(PasswordAuthErrorCode.MULTIPLE_IDENTITY_MATCHES)
      case __StringValue("SECRET_MISMATCH") =>
        Right(PasswordAuthErrorCode.SECRET_MISMATCH)
      case other =>
        Left(
          DecodingError(s"Can't build PasswordAuthErrorCode from input $other")
        )
    }
    implicit val encoder: ArgEncoder[PasswordAuthErrorCode] =
      new ArgEncoder[PasswordAuthErrorCode] {
        override def encode(value: PasswordAuthErrorCode): __Value =
          value match {
            case PasswordAuthErrorCode.FAILURE => __EnumValue("FAILURE")
            case PasswordAuthErrorCode.IDENTITY_NOT_FOUND =>
              __EnumValue("IDENTITY_NOT_FOUND")
            case PasswordAuthErrorCode.SECRET_NOT_SET =>
              __EnumValue("SECRET_NOT_SET")
            case PasswordAuthErrorCode.MULTIPLE_IDENTITY_MATCHES =>
              __EnumValue("MULTIPLE_IDENTITY_MATCHES")
            case PasswordAuthErrorCode.SECRET_MISMATCH =>
              __EnumValue("SECRET_MISMATCH")
          }
        override def typeName: String = "PasswordAuthErrorCode"
      }
  }

  type Url
  object Url {

    final case class UrlView[SourceSelection](
        id: String,
        name: Option[String],
        source: Option[SourceSelection],
        lastCrawl: Option[String]
    )

    type ViewSelection[SourceSelection] =
      SelectionBuilder[Url, UrlView[SourceSelection]]

    def view[SourceSelection](
        sourceSelection: SelectionBuilder[Source, SourceSelection]
    ): ViewSelection[SourceSelection] =
      (id ~ name ~ source(sourceSelection) ~ lastCrawl).map {
        case (((id, name), source), lastCrawl) =>
          UrlView(id, name, source, lastCrawl)
      }

    def id: SelectionBuilder[Url, String] = Field("id", Scalar())
    def name: SelectionBuilder[Url, Option[String]] =
      Field("name", OptionOf(Scalar()))
    def source[A](
        innerSelection: SelectionBuilder[Source, A]
    ): SelectionBuilder[Url, Option[A]] =
      Field("source", OptionOf(Obj(innerSelection)))
    def lastCrawl: SelectionBuilder[Url, Option[String]] =
      Field("lastCrawl", OptionOf(Scalar()))
  }

  type Source
  object Source {

    final case class SourceView(
        id: String,
        name: Option[String],
        acronym: Option[String],
        url: Option[String]
    )

    type ViewSelection = SelectionBuilder[Source, SourceView]

    def view: ViewSelection = (id ~ name ~ acronym ~ url).map {
      case (((id, name), acronym), url) => SourceView(id, name, acronym, url)
    }

    def id: SelectionBuilder[Source, String] = Field("id", Scalar())
    def name: SelectionBuilder[Source, Option[String]] =
      Field("name", OptionOf(Scalar()))
    def acronym: SelectionBuilder[Source, Option[String]] =
      Field("acronym", OptionOf(Scalar()))
    def url: SelectionBuilder[Source, Option[String]] =
      Field("url", OptionOf(Scalar()))
  }

  type Language
  object Language {

    final case class LanguageView(id: String, name: Option[String])

    type ViewSelection = SelectionBuilder[Language, LanguageView]

    def view: ViewSelection = (id ~ name).map {
      case (id, name) =>
        LanguageView(id, name)
    }

    def id: SelectionBuilder[Language, String] = Field("id", Scalar())
    def name: SelectionBuilder[Language, Option[String]] =
      Field("name", OptionOf(Scalar()))
  }

  type Tag
  object Tag {

    final case class TagView[LanguageSelection](
        id: String,
        name: Option[String],
        language: Option[LanguageSelection],
        highlighted: Option[Boolean],
        generated: Option[Boolean]
    )

    type ViewSelection[LanguageSelection] =
      SelectionBuilder[Tag, TagView[LanguageSelection]]

    def view[LanguageSelection](
        languageSelection: SelectionBuilder[Language, LanguageSelection]
    ): ViewSelection[LanguageSelection] =
      (id ~ name ~ language(languageSelection) ~ highlighted ~ generated).map {
        case ((((id, name), language), highlighted), generated) =>
          TagView(id, name, language, highlighted, generated)
      }

    def id: SelectionBuilder[Tag, String] = Field("id", Scalar())
    def name: SelectionBuilder[Tag, Option[String]] =
      Field("name", OptionOf(Scalar()))
    def language[A](
        innerSelection: SelectionBuilder[Language, A]
    ): SelectionBuilder[Tag, Option[A]] =
      Field("language", OptionOf(Obj(innerSelection)))
    def highlighted: SelectionBuilder[Tag, Option[Boolean]] =
      Field("highlighted", OptionOf(Scalar()))
    def generated: SelectionBuilder[Tag, Option[Boolean]] =
      Field("generated", OptionOf(Scalar()))
  }

  type Entry
  object Entry {

    final case class EntryView[
        UrlSelection,
        TagsSelection,
        _tagsMetaSelection,
        LanguageSelection
    ](
        id: String,
        name: Option[String],
        hasBeenTagged: Option[Boolean],
        url: Option[UrlSelection],
        tags: Option[List[TagsSelection]],
        _tagsMeta: Option[_tagsMetaSelection],
        tagsCount: Option[Int],
        language: Option[LanguageSelection],
        content: Option[String],
        summary: Option[String],
        date: Option[String],
        nextCrawl: Option[String],
        updatedAt: Option[String],
        eTag: Option[String],
        profileHash: Option[String],
        contentHash: Option[String],
        disabled: Option[Boolean]
    )

    type ViewSelection[
        UrlSelection,
        TagsSelection,
        _tagsMetaSelection,
        LanguageSelection
    ] = SelectionBuilder[Entry, EntryView[
      UrlSelection,
      TagsSelection,
      _tagsMetaSelection,
      LanguageSelection
    ]]

    def view[
        UrlSelection,
        TagsSelection,
        _tagsMetaSelection,
        LanguageSelection
    ](
        tagsWhere: TagWhereInput,
        tagsSearch: Option[String] = None,
        tagsOrderBy: List[TagOrderByInput] = Nil,
        tagsFirst: Option[Int] = None,
        tagsSkip: Int,
        _tagsMetaWhere: TagWhereInput,
        _tagsMetaSearch: Option[String] = None,
        _tagsMetaOrderBy: List[TagOrderByInput] = Nil,
        _tagsMetaFirst: Option[Int] = None,
        _tagsMetaSkip: Int,
        tagsCountWhere: TagWhereInput
    )(
        urlSelection: SelectionBuilder[Url, UrlSelection],
        tagsSelection: SelectionBuilder[Tag, TagsSelection],
        _tagsMetaSelection: SelectionBuilder[_QueryMeta, _tagsMetaSelection],
        languageSelection: SelectionBuilder[Language, LanguageSelection]
    ): ViewSelection[
      UrlSelection,
      TagsSelection,
      _tagsMetaSelection,
      LanguageSelection
    ] =
      (id ~ name ~ hasBeenTagged ~ url(urlSelection) ~ tags(
        tagsWhere,
        tagsSearch,
        tagsOrderBy,
        tagsFirst,
        tagsSkip
      )(tagsSelection) ~ _tagsMeta(
        _tagsMetaWhere,
        _tagsMetaSearch,
        _tagsMetaOrderBy,
        _tagsMetaFirst,
        _tagsMetaSkip
      )(_tagsMetaSelection) ~ tagsCount(tagsCountWhere) ~ language(
        languageSelection
      ) ~ content ~ summary ~ date ~ nextCrawl ~ updatedAt ~ eTag ~ profileHash ~ contentHash ~ disabled)
        .map {
          case (
              (
                (
                  (
                    (
                      (
                        (
                          (
                            (
                              (
                                (
                                  (
                                    ((((id, name), hasBeenTagged), url), tags),
                                    _tagsMeta
                                  ),
                                  tagsCount
                                ),
                                language
                              ),
                              content
                            ),
                            summary
                          ),
                          date
                        ),
                        nextCrawl
                      ),
                      updatedAt
                    ),
                    eTag
                  ),
                  profileHash
                ),
                contentHash
              ),
              disabled
              ) =>
            EntryView(
              id,
              name,
              hasBeenTagged,
              url,
              tags,
              _tagsMeta,
              tagsCount,
              language,
              content,
              summary,
              date,
              nextCrawl,
              updatedAt,
              eTag,
              profileHash,
              contentHash,
              disabled
            )
        }

    def id: SelectionBuilder[Entry, String] = Field("id", Scalar())
    def name: SelectionBuilder[Entry, Option[String]] =
      Field("name", OptionOf(Scalar()))
    def hasBeenTagged: SelectionBuilder[Entry, Option[Boolean]] =
      Field("hasBeenTagged", OptionOf(Scalar()))
    def url[A](
        innerSelection: SelectionBuilder[Url, A]
    ): SelectionBuilder[Entry, Option[A]] =
      Field("url", OptionOf(Obj(innerSelection)))
    def tags[A](
        where: TagWhereInput,
        search: Option[String] = None,
        orderBy: List[TagOrderByInput] = Nil,
        first: Option[Int] = None,
        skip: Int
    )(
        innerSelection: SelectionBuilder[Tag, A]
    ): SelectionBuilder[Entry, Option[List[A]]] = Field(
      "tags",
      OptionOf(ListOf(Obj(innerSelection))),
      arguments = List(
        Argument("where", where),
        Argument("search", search),
        Argument("orderBy", orderBy),
        Argument("first", first),
        Argument("skip", skip)
      )
    )
    @deprecated(
      "This query will be removed in a future version. Please use tagsCount instead.",
      ""
    )
    def _tagsMeta[A](
        where: TagWhereInput,
        search: Option[String] = None,
        orderBy: List[TagOrderByInput] = Nil,
        first: Option[Int] = None,
        skip: Int
    )(
        innerSelection: SelectionBuilder[_QueryMeta, A]
    ): SelectionBuilder[Entry, Option[A]] = Field(
      "_tagsMeta",
      OptionOf(Obj(innerSelection)),
      arguments = List(
        Argument("where", where),
        Argument("search", search),
        Argument("orderBy", orderBy),
        Argument("first", first),
        Argument("skip", skip)
      )
    )
    def tagsCount(where: TagWhereInput): SelectionBuilder[Entry, Option[Int]] =
      Field(
        "tagsCount",
        OptionOf(Scalar()),
        arguments = List(Argument("where", where))
      )
    def language[A](
        innerSelection: SelectionBuilder[Language, A]
    ): SelectionBuilder[Entry, Option[A]] =
      Field("language", OptionOf(Obj(innerSelection)))
    def content: SelectionBuilder[Entry, Option[String]] =
      Field("content", OptionOf(Scalar()))
    def summary: SelectionBuilder[Entry, Option[String]] =
      Field("summary", OptionOf(Scalar()))
    def date: SelectionBuilder[Entry, Option[String]] =
      Field("date", OptionOf(Scalar()))
    def nextCrawl: SelectionBuilder[Entry, Option[String]] =
      Field("nextCrawl", OptionOf(Scalar()))
    def updatedAt: SelectionBuilder[Entry, Option[String]] =
      Field("updatedAt", OptionOf(Scalar()))
    def eTag: SelectionBuilder[Entry, Option[String]] =
      Field("eTag", OptionOf(Scalar()))
    def profileHash: SelectionBuilder[Entry, Option[String]] =
      Field("profileHash", OptionOf(Scalar()))
    def contentHash: SelectionBuilder[Entry, Option[String]] =
      Field("contentHash", OptionOf(Scalar()))
    def disabled: SelectionBuilder[Entry, Option[Boolean]] =
      Field("disabled", OptionOf(Scalar()))
  }

  type _QueryMeta
  object _QueryMeta {

    final case class _QueryMetaView(count: Option[Int])

    type ViewSelection = SelectionBuilder[_QueryMeta, _QueryMetaView]

    def view: ViewSelection = count.map(count => _QueryMetaView(count))

    def count: SelectionBuilder[_QueryMeta, Option[Int]] =
      Field("count", OptionOf(Scalar()))
  }

  type PasswordState
  object PasswordState {

    final case class PasswordStateView(isSet: Boolean)

    type ViewSelection = SelectionBuilder[PasswordState, PasswordStateView]

    def view: ViewSelection = isSet.map(isSet => PasswordStateView(isSet))

    def isSet: SelectionBuilder[PasswordState, Boolean] =
      Field("isSet", Scalar())
  }

  type SearchResult
  object SearchResult {

    final case class SearchResultView[ResultsSelection](
        results: Option[List[Option[ResultsSelection]]],
        totalResults: Int
    )

    type ViewSelection[ResultsSelection] =
      SelectionBuilder[SearchResult, SearchResultView[ResultsSelection]]

    def view[ResultsSelection](
        resultsSelection: SelectionBuilder[Entry, ResultsSelection]
    ): ViewSelection[ResultsSelection] =
      (results(resultsSelection) ~ totalResults).map {
        case (results, totalResults) => SearchResultView(results, totalResults)
      }

    def results[A](
        innerSelection: SelectionBuilder[Entry, A]
    ): SelectionBuilder[SearchResult, Option[List[Option[A]]]] =
      Field("results", OptionOf(ListOf(OptionOf(Obj(innerSelection)))))
    def totalResults: SelectionBuilder[SearchResult, Int] =
      Field("totalResults", Scalar())
  }

  case class UrlWhereInput(
      AND: Option[List[UrlWhereInput]] = None,
      OR: Option[List[UrlWhereInput]] = None,
      id: Option[String] = None,
      id_not: Option[String] = None,
      id_lt: Option[String] = None,
      id_lte: Option[String] = None,
      id_gt: Option[String] = None,
      id_gte: Option[String] = None,
      id_in: Option[List[String]] = None,
      id_not_in: Option[List[String]] = None,
      name: Option[String] = None,
      name_not: Option[String] = None,
      name_contains: Option[String] = None,
      name_not_contains: Option[String] = None,
      name_starts_with: Option[String] = None,
      name_not_starts_with: Option[String] = None,
      name_ends_with: Option[String] = None,
      name_not_ends_with: Option[String] = None,
      name_i: Option[String] = None,
      name_not_i: Option[String] = None,
      name_contains_i: Option[String] = None,
      name_not_contains_i: Option[String] = None,
      name_starts_with_i: Option[String] = None,
      name_not_starts_with_i: Option[String] = None,
      name_ends_with_i: Option[String] = None,
      name_not_ends_with_i: Option[String] = None,
      name_in: Option[List[Option[String]]] = None,
      name_not_in: Option[List[Option[String]]] = None,
      source: Option[SourceWhereInput] = None,
      source_is_null: Option[Boolean] = None,
      lastCrawl: Option[String] = None,
      lastCrawl_not: Option[String] = None,
      lastCrawl_lt: Option[String] = None,
      lastCrawl_lte: Option[String] = None,
      lastCrawl_gt: Option[String] = None,
      lastCrawl_gte: Option[String] = None,
      lastCrawl_in: Option[List[Option[String]]] = None,
      lastCrawl_not_in: Option[List[Option[String]]] = None
  )
  object UrlWhereInput {
    implicit val encoder: ArgEncoder[UrlWhereInput] =
      new ArgEncoder[UrlWhereInput] {
        override def encode(value: UrlWhereInput): __Value =
          __ObjectValue(
            List(
              "AND" -> value.AND.fold(__NullValue: __Value)(
                value => __ListValue(value.map(value => encode(value)))
              ),
              "OR" -> value.OR.fold(__NullValue: __Value)(
                value => __ListValue(value.map(value => encode(value)))
              ),
              "id" -> value.id.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "id_not" -> value.id_not.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "id_lt" -> value.id_lt.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "id_lte" -> value.id_lte.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "id_gt" -> value.id_gt.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "id_gte" -> value.id_gte.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "id_in" -> value.id_in.fold(__NullValue: __Value)(
                value =>
                  __ListValue(
                    value.map(
                      value => implicitly[ArgEncoder[String]].encode(value)
                    )
                  )
              ),
              "id_not_in" -> value.id_not_in.fold(__NullValue: __Value)(
                value =>
                  __ListValue(
                    value.map(
                      value => implicitly[ArgEncoder[String]].encode(value)
                    )
                  )
              ),
              "name" -> value.name.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "name_not" -> value.name_not.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "name_contains" -> value.name_contains.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "name_not_contains" -> value.name_not_contains.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "name_starts_with" -> value.name_starts_with.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "name_not_starts_with" -> value.name_not_starts_with.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "name_ends_with" -> value.name_ends_with.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "name_not_ends_with" -> value.name_not_ends_with.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "name_i" -> value.name_i.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "name_not_i" -> value.name_not_i.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "name_contains_i" -> value.name_contains_i.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "name_not_contains_i" -> value.name_not_contains_i.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "name_starts_with_i" -> value.name_starts_with_i.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "name_not_starts_with_i" -> value.name_not_starts_with_i.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "name_ends_with_i" -> value.name_ends_with_i.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "name_not_ends_with_i" -> value.name_not_ends_with_i.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "name_in" -> value.name_in.fold(__NullValue: __Value)(
                value =>
                  __ListValue(
                    value.map(
                      value =>
                        value.fold(__NullValue: __Value)(
                          value => implicitly[ArgEncoder[String]].encode(value)
                        )
                    )
                  )
              ),
              "name_not_in" -> value.name_not_in.fold(__NullValue: __Value)(
                value =>
                  __ListValue(
                    value.map(
                      value =>
                        value.fold(__NullValue: __Value)(
                          value => implicitly[ArgEncoder[String]].encode(value)
                        )
                    )
                  )
              ),
              "source" -> value.source.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[SourceWhereInput]].encode(value)
              ),
              "source_is_null" -> value.source_is_null.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[Boolean]].encode(value)),
              "lastCrawl" -> value.lastCrawl.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "lastCrawl_not" -> value.lastCrawl_not.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "lastCrawl_lt" -> value.lastCrawl_lt.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "lastCrawl_lte" -> value.lastCrawl_lte.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "lastCrawl_gt" -> value.lastCrawl_gt.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "lastCrawl_gte" -> value.lastCrawl_gte.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "lastCrawl_in" -> value.lastCrawl_in.fold(__NullValue: __Value)(
                value =>
                  __ListValue(
                    value.map(
                      value =>
                        value.fold(__NullValue: __Value)(
                          value => implicitly[ArgEncoder[String]].encode(value)
                        )
                    )
                  )
              ),
              "lastCrawl_not_in" -> value.lastCrawl_not_in.fold(
                __NullValue: __Value
              )(
                value =>
                  __ListValue(
                    value.map(
                      value =>
                        value.fold(__NullValue: __Value)(
                          value => implicitly[ArgEncoder[String]].encode(value)
                        )
                    )
                  )
              )
            ).filterNot(_._2.equals(__NullValue))
          )
        override def typeName: String = "UrlWhereInput"
      }
  }
  case class UrlWhereUniqueInput(
      id: Option[String] = None,
      name: Option[String] = None
  )
  object UrlWhereUniqueInput {
    implicit val encoder: ArgEncoder[UrlWhereUniqueInput] =
      new ArgEncoder[UrlWhereUniqueInput] {
        override def encode(value: UrlWhereUniqueInput): __Value =
          __ObjectValue(
            List(
              "id" -> value.id.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "name" -> value.name.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              )
            ).filterNot(_._2.equals(__NullValue))
          )
        override def typeName: String = "UrlWhereUniqueInput"
      }
  }
  case class UrlOrderByInput(
      id: Option[OrderDirection] = None,
      name: Option[OrderDirection] = None,
      lastCrawl: Option[OrderDirection] = None
  )
  object UrlOrderByInput {
    implicit val encoder: ArgEncoder[UrlOrderByInput] =
      new ArgEncoder[UrlOrderByInput] {
        override def encode(value: UrlOrderByInput): __Value =
          __ObjectValue(
            List(
              "id" -> value.id.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[OrderDirection]].encode(value)
              ),
              "name" -> value.name.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[OrderDirection]].encode(value)
              ),
              "lastCrawl" -> value.lastCrawl.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[OrderDirection]].encode(value)
              )
            ).filterNot(_._2.equals(__NullValue))
          )
        override def typeName: String = "UrlOrderByInput"
      }
  }
  case class UrlUpdateInput(
      name: Option[String] = None,
      source: Option[SourceRelateToOneInput] = None,
      lastCrawl: Option[String] = None
  )
  object UrlUpdateInput {
    implicit val encoder: ArgEncoder[UrlUpdateInput] =
      new ArgEncoder[UrlUpdateInput] {
        override def encode(value: UrlUpdateInput): __Value =
          __ObjectValue(
            List(
              "name" -> value.name.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "source" -> value.source.fold(__NullValue: __Value)(
                value =>
                  implicitly[ArgEncoder[SourceRelateToOneInput]].encode(value)
              ),
              "lastCrawl" -> value.lastCrawl.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              )
            ).filterNot(_._2.equals(__NullValue))
          )
        override def typeName: String = "UrlUpdateInput"
      }
  }
  case class SourceRelateToOneInput(
      create: Option[SourceCreateInput] = None,
      connect: Option[SourceWhereUniqueInput] = None,
      disconnect: Option[SourceWhereUniqueInput] = None,
      disconnectAll: Option[Boolean] = None
  )
  object SourceRelateToOneInput {
    implicit val encoder: ArgEncoder[SourceRelateToOneInput] =
      new ArgEncoder[SourceRelateToOneInput] {
        override def encode(value: SourceRelateToOneInput): __Value =
          __ObjectValue(
            List(
              "create" -> value.create.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[SourceCreateInput]].encode(value)
              ),
              "connect" -> value.connect.fold(__NullValue: __Value)(
                value =>
                  implicitly[ArgEncoder[SourceWhereUniqueInput]].encode(value)
              ),
              "disconnect" -> value.disconnect.fold(__NullValue: __Value)(
                value =>
                  implicitly[ArgEncoder[SourceWhereUniqueInput]].encode(value)
              ),
              "disconnectAll" -> value.disconnectAll.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[Boolean]].encode(value)
              )
            ).filterNot(_._2.equals(__NullValue))
          )
        override def typeName: String = "SourceRelateToOneInput"
      }
  }
  case class UrlsUpdateInput(id: String, data: Option[UrlUpdateInput] = None)
  object UrlsUpdateInput {
    implicit val encoder: ArgEncoder[UrlsUpdateInput] =
      new ArgEncoder[UrlsUpdateInput] {
        override def encode(value: UrlsUpdateInput): __Value =
          __ObjectValue(
            List(
              "id" -> implicitly[ArgEncoder[String]].encode(value.id),
              "data" -> value.data.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[UrlUpdateInput]].encode(value)
              )
            ).filterNot(_._2.equals(__NullValue))
          )
        override def typeName: String = "UrlsUpdateInput"
      }
  }
  case class UrlCreateInput(
      name: Option[String] = None,
      source: Option[SourceRelateToOneInput] = None,
      lastCrawl: Option[String] = None
  )
  object UrlCreateInput {
    implicit val encoder: ArgEncoder[UrlCreateInput] =
      new ArgEncoder[UrlCreateInput] {
        override def encode(value: UrlCreateInput): __Value =
          __ObjectValue(
            List(
              "name" -> value.name.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "source" -> value.source.fold(__NullValue: __Value)(
                value =>
                  implicitly[ArgEncoder[SourceRelateToOneInput]].encode(value)
              ),
              "lastCrawl" -> value.lastCrawl.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              )
            ).filterNot(_._2.equals(__NullValue))
          )
        override def typeName: String = "UrlCreateInput"
      }
  }
  case class UrlsCreateInput(data: Option[UrlCreateInput] = None)
  object UrlsCreateInput {
    implicit val encoder: ArgEncoder[UrlsCreateInput] =
      new ArgEncoder[UrlsCreateInput] {
        override def encode(value: UrlsCreateInput): __Value =
          __ObjectValue(
            List(
              "data" -> value.data.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[UrlCreateInput]].encode(value)
              )
            ).filterNot(_._2.equals(__NullValue))
          )
        override def typeName: String = "UrlsCreateInput"
      }
  }
  case class SourceWhereInput(
      AND: Option[List[SourceWhereInput]] = None,
      OR: Option[List[SourceWhereInput]] = None,
      id: Option[String] = None,
      id_not: Option[String] = None,
      id_lt: Option[String] = None,
      id_lte: Option[String] = None,
      id_gt: Option[String] = None,
      id_gte: Option[String] = None,
      id_in: Option[List[String]] = None,
      id_not_in: Option[List[String]] = None,
      name: Option[String] = None,
      name_not: Option[String] = None,
      name_contains: Option[String] = None,
      name_not_contains: Option[String] = None,
      name_starts_with: Option[String] = None,
      name_not_starts_with: Option[String] = None,
      name_ends_with: Option[String] = None,
      name_not_ends_with: Option[String] = None,
      name_i: Option[String] = None,
      name_not_i: Option[String] = None,
      name_contains_i: Option[String] = None,
      name_not_contains_i: Option[String] = None,
      name_starts_with_i: Option[String] = None,
      name_not_starts_with_i: Option[String] = None,
      name_ends_with_i: Option[String] = None,
      name_not_ends_with_i: Option[String] = None,
      name_in: Option[List[Option[String]]] = None,
      name_not_in: Option[List[Option[String]]] = None,
      acronym: Option[String] = None,
      acronym_not: Option[String] = None,
      acronym_contains: Option[String] = None,
      acronym_not_contains: Option[String] = None,
      acronym_starts_with: Option[String] = None,
      acronym_not_starts_with: Option[String] = None,
      acronym_ends_with: Option[String] = None,
      acronym_not_ends_with: Option[String] = None,
      acronym_i: Option[String] = None,
      acronym_not_i: Option[String] = None,
      acronym_contains_i: Option[String] = None,
      acronym_not_contains_i: Option[String] = None,
      acronym_starts_with_i: Option[String] = None,
      acronym_not_starts_with_i: Option[String] = None,
      acronym_ends_with_i: Option[String] = None,
      acronym_not_ends_with_i: Option[String] = None,
      acronym_in: Option[List[Option[String]]] = None,
      acronym_not_in: Option[List[Option[String]]] = None,
      url: Option[String] = None,
      url_not: Option[String] = None,
      url_contains: Option[String] = None,
      url_not_contains: Option[String] = None,
      url_starts_with: Option[String] = None,
      url_not_starts_with: Option[String] = None,
      url_ends_with: Option[String] = None,
      url_not_ends_with: Option[String] = None,
      url_i: Option[String] = None,
      url_not_i: Option[String] = None,
      url_contains_i: Option[String] = None,
      url_not_contains_i: Option[String] = None,
      url_starts_with_i: Option[String] = None,
      url_not_starts_with_i: Option[String] = None,
      url_ends_with_i: Option[String] = None,
      url_not_ends_with_i: Option[String] = None,
      url_in: Option[List[Option[String]]] = None,
      url_not_in: Option[List[Option[String]]] = None
  )
  object SourceWhereInput {
    implicit val encoder: ArgEncoder[SourceWhereInput] =
      new ArgEncoder[SourceWhereInput] {
        override def encode(value: SourceWhereInput): __Value =
          __ObjectValue(
            List(
              "AND" -> value.AND.fold(__NullValue: __Value)(
                value => __ListValue(value.map(value => encode(value)))
              ),
              "OR" -> value.OR.fold(__NullValue: __Value)(
                value => __ListValue(value.map(value => encode(value)))
              ),
              "id" -> value.id.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "id_not" -> value.id_not.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "id_lt" -> value.id_lt.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "id_lte" -> value.id_lte.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "id_gt" -> value.id_gt.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "id_gte" -> value.id_gte.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "id_in" -> value.id_in.fold(__NullValue: __Value)(
                value =>
                  __ListValue(
                    value.map(
                      value => implicitly[ArgEncoder[String]].encode(value)
                    )
                  )
              ),
              "id_not_in" -> value.id_not_in.fold(__NullValue: __Value)(
                value =>
                  __ListValue(
                    value.map(
                      value => implicitly[ArgEncoder[String]].encode(value)
                    )
                  )
              ),
              "name" -> value.name.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "name_not" -> value.name_not.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "name_contains" -> value.name_contains.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "name_not_contains" -> value.name_not_contains.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "name_starts_with" -> value.name_starts_with.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "name_not_starts_with" -> value.name_not_starts_with.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "name_ends_with" -> value.name_ends_with.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "name_not_ends_with" -> value.name_not_ends_with.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "name_i" -> value.name_i.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "name_not_i" -> value.name_not_i.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "name_contains_i" -> value.name_contains_i.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "name_not_contains_i" -> value.name_not_contains_i.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "name_starts_with_i" -> value.name_starts_with_i.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "name_not_starts_with_i" -> value.name_not_starts_with_i.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "name_ends_with_i" -> value.name_ends_with_i.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "name_not_ends_with_i" -> value.name_not_ends_with_i.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "name_in" -> value.name_in.fold(__NullValue: __Value)(
                value =>
                  __ListValue(
                    value.map(
                      value =>
                        value.fold(__NullValue: __Value)(
                          value => implicitly[ArgEncoder[String]].encode(value)
                        )
                    )
                  )
              ),
              "name_not_in" -> value.name_not_in.fold(__NullValue: __Value)(
                value =>
                  __ListValue(
                    value.map(
                      value =>
                        value.fold(__NullValue: __Value)(
                          value => implicitly[ArgEncoder[String]].encode(value)
                        )
                    )
                  )
              ),
              "acronym" -> value.acronym.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "acronym_not" -> value.acronym_not.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "acronym_contains" -> value.acronym_contains.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "acronym_not_contains" -> value.acronym_not_contains.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "acronym_starts_with" -> value.acronym_starts_with.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "acronym_not_starts_with" -> value.acronym_not_starts_with.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "acronym_ends_with" -> value.acronym_ends_with.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "acronym_not_ends_with" -> value.acronym_not_ends_with.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "acronym_i" -> value.acronym_i.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "acronym_not_i" -> value.acronym_not_i.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "acronym_contains_i" -> value.acronym_contains_i.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "acronym_not_contains_i" -> value.acronym_not_contains_i.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "acronym_starts_with_i" -> value.acronym_starts_with_i.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "acronym_not_starts_with_i" -> value.acronym_not_starts_with_i
                .fold(__NullValue: __Value)(
                  value => implicitly[ArgEncoder[String]].encode(value)
                ),
              "acronym_ends_with_i" -> value.acronym_ends_with_i.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "acronym_not_ends_with_i" -> value.acronym_not_ends_with_i.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "acronym_in" -> value.acronym_in.fold(__NullValue: __Value)(
                value =>
                  __ListValue(
                    value.map(
                      value =>
                        value.fold(__NullValue: __Value)(
                          value => implicitly[ArgEncoder[String]].encode(value)
                        )
                    )
                  )
              ),
              "acronym_not_in" -> value.acronym_not_in.fold(
                __NullValue: __Value
              )(
                value =>
                  __ListValue(
                    value.map(
                      value =>
                        value.fold(__NullValue: __Value)(
                          value => implicitly[ArgEncoder[String]].encode(value)
                        )
                    )
                  )
              ),
              "url" -> value.url.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "url_not" -> value.url_not.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "url_contains" -> value.url_contains.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "url_not_contains" -> value.url_not_contains.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "url_starts_with" -> value.url_starts_with.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "url_not_starts_with" -> value.url_not_starts_with.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "url_ends_with" -> value.url_ends_with.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "url_not_ends_with" -> value.url_not_ends_with.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "url_i" -> value.url_i.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "url_not_i" -> value.url_not_i.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "url_contains_i" -> value.url_contains_i.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "url_not_contains_i" -> value.url_not_contains_i.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "url_starts_with_i" -> value.url_starts_with_i.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "url_not_starts_with_i" -> value.url_not_starts_with_i.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "url_ends_with_i" -> value.url_ends_with_i.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "url_not_ends_with_i" -> value.url_not_ends_with_i.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "url_in" -> value.url_in.fold(__NullValue: __Value)(
                value =>
                  __ListValue(
                    value.map(
                      value =>
                        value.fold(__NullValue: __Value)(
                          value => implicitly[ArgEncoder[String]].encode(value)
                        )
                    )
                  )
              ),
              "url_not_in" -> value.url_not_in.fold(__NullValue: __Value)(
                value =>
                  __ListValue(
                    value.map(
                      value =>
                        value.fold(__NullValue: __Value)(
                          value => implicitly[ArgEncoder[String]].encode(value)
                        )
                    )
                  )
              )
            ).filterNot(_._2.equals(__NullValue))
          )
        override def typeName: String = "SourceWhereInput"
      }
  }
  case class SourceWhereUniqueInput(
      id: Option[String] = None,
      name: Option[String] = None,
      url: Option[String] = None
  )
  object SourceWhereUniqueInput {
    implicit val encoder: ArgEncoder[SourceWhereUniqueInput] =
      new ArgEncoder[SourceWhereUniqueInput] {
        override def encode(value: SourceWhereUniqueInput): __Value =
          __ObjectValue(
            List(
              "id" -> value.id.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "name" -> value.name.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "url" -> value.url.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              )
            ).filterNot(_._2.equals(__NullValue))
          )
        override def typeName: String = "SourceWhereUniqueInput"
      }
  }
  case class SourceOrderByInput(
      id: Option[OrderDirection] = None,
      name: Option[OrderDirection] = None,
      acronym: Option[OrderDirection] = None,
      url: Option[OrderDirection] = None
  )
  object SourceOrderByInput {
    implicit val encoder: ArgEncoder[SourceOrderByInput] =
      new ArgEncoder[SourceOrderByInput] {
        override def encode(value: SourceOrderByInput): __Value =
          __ObjectValue(
            List(
              "id" -> value.id.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[OrderDirection]].encode(value)
              ),
              "name" -> value.name.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[OrderDirection]].encode(value)
              ),
              "acronym" -> value.acronym.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[OrderDirection]].encode(value)
              ),
              "url" -> value.url.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[OrderDirection]].encode(value)
              )
            ).filterNot(_._2.equals(__NullValue))
          )
        override def typeName: String = "SourceOrderByInput"
      }
  }
  case class SourceUpdateInput(
      name: Option[String] = None,
      acronym: Option[String] = None,
      url: Option[String] = None
  )
  object SourceUpdateInput {
    implicit val encoder: ArgEncoder[SourceUpdateInput] =
      new ArgEncoder[SourceUpdateInput] {
        override def encode(value: SourceUpdateInput): __Value =
          __ObjectValue(
            List(
              "name" -> value.name.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "acronym" -> value.acronym.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "url" -> value.url.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              )
            ).filterNot(_._2.equals(__NullValue))
          )
        override def typeName: String = "SourceUpdateInput"
      }
  }
  case class SourcesUpdateInput(
      id: String,
      data: Option[SourceUpdateInput] = None
  )
  object SourcesUpdateInput {
    implicit val encoder: ArgEncoder[SourcesUpdateInput] =
      new ArgEncoder[SourcesUpdateInput] {
        override def encode(value: SourcesUpdateInput): __Value =
          __ObjectValue(
            List(
              "id" -> implicitly[ArgEncoder[String]].encode(value.id),
              "data" -> value.data.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[SourceUpdateInput]].encode(value)
              )
            ).filterNot(_._2.equals(__NullValue))
          )
        override def typeName: String = "SourcesUpdateInput"
      }
  }
  case class SourceCreateInput(
      name: Option[String] = None,
      acronym: Option[String] = None,
      url: Option[String] = None
  )
  object SourceCreateInput {
    implicit val encoder: ArgEncoder[SourceCreateInput] =
      new ArgEncoder[SourceCreateInput] {
        override def encode(value: SourceCreateInput): __Value =
          __ObjectValue(
            List(
              "name" -> value.name.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "acronym" -> value.acronym.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "url" -> value.url.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              )
            ).filterNot(_._2.equals(__NullValue))
          )
        override def typeName: String = "SourceCreateInput"
      }
  }
  case class SourcesCreateInput(data: Option[SourceCreateInput] = None)
  object SourcesCreateInput {
    implicit val encoder: ArgEncoder[SourcesCreateInput] =
      new ArgEncoder[SourcesCreateInput] {
        override def encode(value: SourcesCreateInput): __Value =
          __ObjectValue(
            List(
              "data" -> value.data.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[SourceCreateInput]].encode(value)
              )
            ).filterNot(_._2.equals(__NullValue))
          )
        override def typeName: String = "SourcesCreateInput"
      }
  }
  case class LanguageWhereInput(
      AND: Option[List[LanguageWhereInput]] = None,
      OR: Option[List[LanguageWhereInput]] = None,
      id: Option[String] = None,
      id_not: Option[String] = None,
      id_lt: Option[String] = None,
      id_lte: Option[String] = None,
      id_gt: Option[String] = None,
      id_gte: Option[String] = None,
      id_in: Option[List[String]] = None,
      id_not_in: Option[List[String]] = None,
      name: Option[String] = None,
      name_not: Option[String] = None,
      name_contains: Option[String] = None,
      name_not_contains: Option[String] = None,
      name_starts_with: Option[String] = None,
      name_not_starts_with: Option[String] = None,
      name_ends_with: Option[String] = None,
      name_not_ends_with: Option[String] = None,
      name_i: Option[String] = None,
      name_not_i: Option[String] = None,
      name_contains_i: Option[String] = None,
      name_not_contains_i: Option[String] = None,
      name_starts_with_i: Option[String] = None,
      name_not_starts_with_i: Option[String] = None,
      name_ends_with_i: Option[String] = None,
      name_not_ends_with_i: Option[String] = None,
      name_in: Option[List[Option[String]]] = None,
      name_not_in: Option[List[Option[String]]] = None
  )
  object LanguageWhereInput {
    implicit val encoder: ArgEncoder[LanguageWhereInput] =
      new ArgEncoder[LanguageWhereInput] {
        override def encode(value: LanguageWhereInput): __Value =
          __ObjectValue(
            List(
              "AND" -> value.AND.fold(__NullValue: __Value)(
                value => __ListValue(value.map(value => encode(value)))
              ),
              "OR" -> value.OR.fold(__NullValue: __Value)(
                value => __ListValue(value.map(value => encode(value)))
              ),
              "id" -> value.id.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "id_not" -> value.id_not.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "id_lt" -> value.id_lt.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "id_lte" -> value.id_lte.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "id_gt" -> value.id_gt.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "id_gte" -> value.id_gte.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "id_in" -> value.id_in.fold(__NullValue: __Value)(
                value =>
                  __ListValue(
                    value.map(
                      value => implicitly[ArgEncoder[String]].encode(value)
                    )
                  )
              ),
              "id_not_in" -> value.id_not_in.fold(__NullValue: __Value)(
                value =>
                  __ListValue(
                    value.map(
                      value => implicitly[ArgEncoder[String]].encode(value)
                    )
                  )
              ),
              "name" -> value.name.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "name_not" -> value.name_not.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "name_contains" -> value.name_contains.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "name_not_contains" -> value.name_not_contains.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "name_starts_with" -> value.name_starts_with.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "name_not_starts_with" -> value.name_not_starts_with.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "name_ends_with" -> value.name_ends_with.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "name_not_ends_with" -> value.name_not_ends_with.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "name_i" -> value.name_i.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "name_not_i" -> value.name_not_i.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "name_contains_i" -> value.name_contains_i.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "name_not_contains_i" -> value.name_not_contains_i.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "name_starts_with_i" -> value.name_starts_with_i.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "name_not_starts_with_i" -> value.name_not_starts_with_i.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "name_ends_with_i" -> value.name_ends_with_i.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "name_not_ends_with_i" -> value.name_not_ends_with_i.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "name_in" -> value.name_in.fold(__NullValue: __Value)(
                value =>
                  __ListValue(
                    value.map(
                      value =>
                        value.fold(__NullValue: __Value)(
                          value => implicitly[ArgEncoder[String]].encode(value)
                        )
                    )
                  )
              ),
              "name_not_in" -> value.name_not_in.fold(__NullValue: __Value)(
                value =>
                  __ListValue(
                    value.map(
                      value =>
                        value.fold(__NullValue: __Value)(
                          value => implicitly[ArgEncoder[String]].encode(value)
                        )
                    )
                  )
              )
            ).filterNot(_._2.equals(__NullValue))
          )
        override def typeName: String = "LanguageWhereInput"
      }
  }
  case class LanguageWhereUniqueInput(
      id: Option[String] = None,
      name: Option[String] = None
  )
  object LanguageWhereUniqueInput {
    implicit val encoder: ArgEncoder[LanguageWhereUniqueInput] =
      new ArgEncoder[LanguageWhereUniqueInput] {
        override def encode(value: LanguageWhereUniqueInput): __Value =
          __ObjectValue(
            List(
              "id" -> value.id.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "name" -> value.name.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              )
            ).filterNot(_._2.equals(__NullValue))
          )
        override def typeName: String = "LanguageWhereUniqueInput"
      }
  }
  case class LanguageOrderByInput(
      id: Option[OrderDirection] = None,
      name: Option[OrderDirection] = None
  )
  object LanguageOrderByInput {
    implicit val encoder: ArgEncoder[LanguageOrderByInput] =
      new ArgEncoder[LanguageOrderByInput] {
        override def encode(value: LanguageOrderByInput): __Value =
          __ObjectValue(
            List(
              "id" -> value.id.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[OrderDirection]].encode(value)
              ),
              "name" -> value.name.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[OrderDirection]].encode(value)
              )
            ).filterNot(_._2.equals(__NullValue))
          )
        override def typeName: String = "LanguageOrderByInput"
      }
  }
  case class LanguageUpdateInput(name: Option[String] = None)
  object LanguageUpdateInput {
    implicit val encoder: ArgEncoder[LanguageUpdateInput] =
      new ArgEncoder[LanguageUpdateInput] {
        override def encode(value: LanguageUpdateInput): __Value =
          __ObjectValue(
            List(
              "name" -> value.name.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              )
            ).filterNot(_._2.equals(__NullValue))
          )
        override def typeName: String = "LanguageUpdateInput"
      }
  }
  case class LanguagesUpdateInput(
      id: String,
      data: Option[LanguageUpdateInput] = None
  )
  object LanguagesUpdateInput {
    implicit val encoder: ArgEncoder[LanguagesUpdateInput] =
      new ArgEncoder[LanguagesUpdateInput] {
        override def encode(value: LanguagesUpdateInput): __Value =
          __ObjectValue(
            List(
              "id" -> implicitly[ArgEncoder[String]].encode(value.id),
              "data" -> value.data.fold(__NullValue: __Value)(
                value =>
                  implicitly[ArgEncoder[LanguageUpdateInput]].encode(value)
              )
            ).filterNot(_._2.equals(__NullValue))
          )
        override def typeName: String = "LanguagesUpdateInput"
      }
  }
  case class LanguageCreateInput(name: Option[String] = None)
  object LanguageCreateInput {
    implicit val encoder: ArgEncoder[LanguageCreateInput] =
      new ArgEncoder[LanguageCreateInput] {
        override def encode(value: LanguageCreateInput): __Value =
          __ObjectValue(
            List(
              "name" -> value.name.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              )
            ).filterNot(_._2.equals(__NullValue))
          )
        override def typeName: String = "LanguageCreateInput"
      }
  }
  case class LanguagesCreateInput(data: Option[LanguageCreateInput] = None)
  object LanguagesCreateInput {
    implicit val encoder: ArgEncoder[LanguagesCreateInput] =
      new ArgEncoder[LanguagesCreateInput] {
        override def encode(value: LanguagesCreateInput): __Value =
          __ObjectValue(
            List(
              "data" -> value.data.fold(__NullValue: __Value)(
                value =>
                  implicitly[ArgEncoder[LanguageCreateInput]].encode(value)
              )
            ).filterNot(_._2.equals(__NullValue))
          )
        override def typeName: String = "LanguagesCreateInput"
      }
  }
  case class TagWhereInput(
      AND: Option[List[TagWhereInput]] = None,
      OR: Option[List[TagWhereInput]] = None,
      id: Option[String] = None,
      id_not: Option[String] = None,
      id_lt: Option[String] = None,
      id_lte: Option[String] = None,
      id_gt: Option[String] = None,
      id_gte: Option[String] = None,
      id_in: Option[List[String]] = None,
      id_not_in: Option[List[String]] = None,
      name: Option[String] = None,
      name_not: Option[String] = None,
      name_contains: Option[String] = None,
      name_not_contains: Option[String] = None,
      name_starts_with: Option[String] = None,
      name_not_starts_with: Option[String] = None,
      name_ends_with: Option[String] = None,
      name_not_ends_with: Option[String] = None,
      name_i: Option[String] = None,
      name_not_i: Option[String] = None,
      name_contains_i: Option[String] = None,
      name_not_contains_i: Option[String] = None,
      name_starts_with_i: Option[String] = None,
      name_not_starts_with_i: Option[String] = None,
      name_ends_with_i: Option[String] = None,
      name_not_ends_with_i: Option[String] = None,
      name_in: Option[List[Option[String]]] = None,
      name_not_in: Option[List[Option[String]]] = None,
      language: Option[LanguageWhereInput] = None,
      language_is_null: Option[Boolean] = None,
      highlighted: Option[Boolean] = None,
      highlighted_not: Option[Boolean] = None,
      generated: Option[Boolean] = None,
      generated_not: Option[Boolean] = None
  )
  object TagWhereInput {
    implicit val encoder: ArgEncoder[TagWhereInput] =
      new ArgEncoder[TagWhereInput] {
        override def encode(value: TagWhereInput): __Value =
          __ObjectValue(
            List(
              "AND" -> value.AND.fold(__NullValue: __Value)(
                value => __ListValue(value.map(value => encode(value)))
              ),
              "OR" -> value.OR.fold(__NullValue: __Value)(
                value => __ListValue(value.map(value => encode(value)))
              ),
              "id" -> value.id.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "id_not" -> value.id_not.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "id_lt" -> value.id_lt.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "id_lte" -> value.id_lte.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "id_gt" -> value.id_gt.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "id_gte" -> value.id_gte.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "id_in" -> value.id_in.fold(__NullValue: __Value)(
                value =>
                  __ListValue(
                    value.map(
                      value => implicitly[ArgEncoder[String]].encode(value)
                    )
                  )
              ),
              "id_not_in" -> value.id_not_in.fold(__NullValue: __Value)(
                value =>
                  __ListValue(
                    value.map(
                      value => implicitly[ArgEncoder[String]].encode(value)
                    )
                  )
              ),
              "name" -> value.name.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "name_not" -> value.name_not.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "name_contains" -> value.name_contains.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "name_not_contains" -> value.name_not_contains.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "name_starts_with" -> value.name_starts_with.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "name_not_starts_with" -> value.name_not_starts_with.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "name_ends_with" -> value.name_ends_with.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "name_not_ends_with" -> value.name_not_ends_with.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "name_i" -> value.name_i.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "name_not_i" -> value.name_not_i.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "name_contains_i" -> value.name_contains_i.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "name_not_contains_i" -> value.name_not_contains_i.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "name_starts_with_i" -> value.name_starts_with_i.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "name_not_starts_with_i" -> value.name_not_starts_with_i.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "name_ends_with_i" -> value.name_ends_with_i.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "name_not_ends_with_i" -> value.name_not_ends_with_i.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "name_in" -> value.name_in.fold(__NullValue: __Value)(
                value =>
                  __ListValue(
                    value.map(
                      value =>
                        value.fold(__NullValue: __Value)(
                          value => implicitly[ArgEncoder[String]].encode(value)
                        )
                    )
                  )
              ),
              "name_not_in" -> value.name_not_in.fold(__NullValue: __Value)(
                value =>
                  __ListValue(
                    value.map(
                      value =>
                        value.fold(__NullValue: __Value)(
                          value => implicitly[ArgEncoder[String]].encode(value)
                        )
                    )
                  )
              ),
              "language" -> value.language.fold(__NullValue: __Value)(
                value =>
                  implicitly[ArgEncoder[LanguageWhereInput]].encode(value)
              ),
              "language_is_null" -> value.language_is_null.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[Boolean]].encode(value)),
              "highlighted" -> value.highlighted.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[Boolean]].encode(value)
              ),
              "highlighted_not" -> value.highlighted_not.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[Boolean]].encode(value)),
              "generated" -> value.generated.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[Boolean]].encode(value)
              ),
              "generated_not" -> value.generated_not.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[Boolean]].encode(value)
              )
            ).filterNot(_._2.equals(__NullValue))
          )
        override def typeName: String = "TagWhereInput"
      }
  }
  case class TagWhereUniqueInput(
      id: Option[String] = None,
      name: Option[String] = None
  )
  object TagWhereUniqueInput {
    implicit val encoder: ArgEncoder[TagWhereUniqueInput] =
      new ArgEncoder[TagWhereUniqueInput] {
        override def encode(value: TagWhereUniqueInput): __Value =
          __ObjectValue(
            List(
              "id" -> value.id.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "name" -> value.name.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              )
            ).filterNot(_._2.equals(__NullValue))
          )
        override def typeName: String = "TagWhereUniqueInput"
      }
  }
  case class TagOrderByInput(
      id: Option[OrderDirection] = None,
      name: Option[OrderDirection] = None,
      highlighted: Option[OrderDirection] = None,
      generated: Option[OrderDirection] = None
  )
  object TagOrderByInput {
    implicit val encoder: ArgEncoder[TagOrderByInput] =
      new ArgEncoder[TagOrderByInput] {
        override def encode(value: TagOrderByInput): __Value =
          __ObjectValue(
            List(
              "id" -> value.id.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[OrderDirection]].encode(value)
              ),
              "name" -> value.name.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[OrderDirection]].encode(value)
              ),
              "highlighted" -> value.highlighted.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[OrderDirection]].encode(value)
              ),
              "generated" -> value.generated.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[OrderDirection]].encode(value)
              )
            ).filterNot(_._2.equals(__NullValue))
          )
        override def typeName: String = "TagOrderByInput"
      }
  }
  case class TagUpdateInput(
      name: Option[String] = None,
      language: Option[LanguageRelateToOneInput] = None,
      highlighted: Option[Boolean] = None,
      generated: Option[Boolean] = None
  )
  object TagUpdateInput {
    implicit val encoder: ArgEncoder[TagUpdateInput] =
      new ArgEncoder[TagUpdateInput] {
        override def encode(value: TagUpdateInput): __Value =
          __ObjectValue(
            List(
              "name" -> value.name.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "language" -> value.language.fold(__NullValue: __Value)(
                value =>
                  implicitly[ArgEncoder[LanguageRelateToOneInput]].encode(value)
              ),
              "highlighted" -> value.highlighted.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[Boolean]].encode(value)
              ),
              "generated" -> value.generated.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[Boolean]].encode(value)
              )
            ).filterNot(_._2.equals(__NullValue))
          )
        override def typeName: String = "TagUpdateInput"
      }
  }
  case class LanguageRelateToOneInput(
      create: Option[LanguageCreateInput] = None,
      connect: Option[LanguageWhereUniqueInput] = None,
      disconnect: Option[LanguageWhereUniqueInput] = None,
      disconnectAll: Option[Boolean] = None
  )
  object LanguageRelateToOneInput {
    implicit val encoder: ArgEncoder[LanguageRelateToOneInput] =
      new ArgEncoder[LanguageRelateToOneInput] {
        override def encode(value: LanguageRelateToOneInput): __Value =
          __ObjectValue(
            List(
              "create" -> value.create.fold(__NullValue: __Value)(
                value =>
                  implicitly[ArgEncoder[LanguageCreateInput]].encode(value)
              ),
              "connect" -> value.connect.fold(__NullValue: __Value)(
                value =>
                  implicitly[ArgEncoder[LanguageWhereUniqueInput]].encode(value)
              ),
              "disconnect" -> value.disconnect.fold(__NullValue: __Value)(
                value =>
                  implicitly[ArgEncoder[LanguageWhereUniqueInput]].encode(value)
              ),
              "disconnectAll" -> value.disconnectAll.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[Boolean]].encode(value)
              )
            ).filterNot(_._2.equals(__NullValue))
          )
        override def typeName: String = "LanguageRelateToOneInput"
      }
  }
  case class TagsUpdateInput(id: String, data: Option[TagUpdateInput] = None)
  object TagsUpdateInput {
    implicit val encoder: ArgEncoder[TagsUpdateInput] =
      new ArgEncoder[TagsUpdateInput] {
        override def encode(value: TagsUpdateInput): __Value =
          __ObjectValue(
            List(
              "id" -> implicitly[ArgEncoder[String]].encode(value.id),
              "data" -> value.data.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[TagUpdateInput]].encode(value)
              )
            ).filterNot(_._2.equals(__NullValue))
          )
        override def typeName: String = "TagsUpdateInput"
      }
  }
  case class TagCreateInput(
      name: Option[String] = None,
      language: Option[LanguageRelateToOneInput] = None,
      highlighted: Option[Boolean] = None,
      generated: Option[Boolean] = None
  )
  object TagCreateInput {
    implicit val encoder: ArgEncoder[TagCreateInput] =
      new ArgEncoder[TagCreateInput] {
        override def encode(value: TagCreateInput): __Value =
          __ObjectValue(
            List(
              "name" -> value.name.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "language" -> value.language.fold(__NullValue: __Value)(
                value =>
                  implicitly[ArgEncoder[LanguageRelateToOneInput]].encode(value)
              ),
              "highlighted" -> value.highlighted.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[Boolean]].encode(value)
              ),
              "generated" -> value.generated.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[Boolean]].encode(value)
              )
            ).filterNot(_._2.equals(__NullValue))
          )
        override def typeName: String = "TagCreateInput"
      }
  }
  case class TagsCreateInput(data: Option[TagCreateInput] = None)
  object TagsCreateInput {
    implicit val encoder: ArgEncoder[TagsCreateInput] =
      new ArgEncoder[TagsCreateInput] {
        override def encode(value: TagsCreateInput): __Value =
          __ObjectValue(
            List(
              "data" -> value.data.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[TagCreateInput]].encode(value)
              )
            ).filterNot(_._2.equals(__NullValue))
          )
        override def typeName: String = "TagsCreateInput"
      }
  }
  case class EntryWhereInput(
      AND: Option[List[EntryWhereInput]] = None,
      OR: Option[List[EntryWhereInput]] = None,
      id: Option[String] = None,
      id_not: Option[String] = None,
      id_lt: Option[String] = None,
      id_lte: Option[String] = None,
      id_gt: Option[String] = None,
      id_gte: Option[String] = None,
      id_in: Option[List[String]] = None,
      id_not_in: Option[List[String]] = None,
      name: Option[String] = None,
      name_not: Option[String] = None,
      name_contains: Option[String] = None,
      name_not_contains: Option[String] = None,
      name_starts_with: Option[String] = None,
      name_not_starts_with: Option[String] = None,
      name_ends_with: Option[String] = None,
      name_not_ends_with: Option[String] = None,
      name_i: Option[String] = None,
      name_not_i: Option[String] = None,
      name_contains_i: Option[String] = None,
      name_not_contains_i: Option[String] = None,
      name_starts_with_i: Option[String] = None,
      name_not_starts_with_i: Option[String] = None,
      name_ends_with_i: Option[String] = None,
      name_not_ends_with_i: Option[String] = None,
      name_in: Option[List[Option[String]]] = None,
      name_not_in: Option[List[Option[String]]] = None,
      hasBeenTagged: Option[Boolean] = None,
      hasBeenTagged_not: Option[Boolean] = None,
      url: Option[UrlWhereInput] = None,
      url_is_null: Option[Boolean] = None,
      tags_every: Option[TagWhereInput] = None,
      tags_some: Option[TagWhereInput] = None,
      tags_none: Option[TagWhereInput] = None,
      language: Option[LanguageWhereInput] = None,
      language_is_null: Option[Boolean] = None,
      content: Option[String] = None,
      content_not: Option[String] = None,
      content_contains: Option[String] = None,
      content_not_contains: Option[String] = None,
      content_starts_with: Option[String] = None,
      content_not_starts_with: Option[String] = None,
      content_ends_with: Option[String] = None,
      content_not_ends_with: Option[String] = None,
      content_i: Option[String] = None,
      content_not_i: Option[String] = None,
      content_contains_i: Option[String] = None,
      content_not_contains_i: Option[String] = None,
      content_starts_with_i: Option[String] = None,
      content_not_starts_with_i: Option[String] = None,
      content_ends_with_i: Option[String] = None,
      content_not_ends_with_i: Option[String] = None,
      content_in: Option[List[Option[String]]] = None,
      content_not_in: Option[List[Option[String]]] = None,
      summary: Option[String] = None,
      summary_not: Option[String] = None,
      summary_contains: Option[String] = None,
      summary_not_contains: Option[String] = None,
      summary_starts_with: Option[String] = None,
      summary_not_starts_with: Option[String] = None,
      summary_ends_with: Option[String] = None,
      summary_not_ends_with: Option[String] = None,
      summary_i: Option[String] = None,
      summary_not_i: Option[String] = None,
      summary_contains_i: Option[String] = None,
      summary_not_contains_i: Option[String] = None,
      summary_starts_with_i: Option[String] = None,
      summary_not_starts_with_i: Option[String] = None,
      summary_ends_with_i: Option[String] = None,
      summary_not_ends_with_i: Option[String] = None,
      summary_in: Option[List[Option[String]]] = None,
      summary_not_in: Option[List[Option[String]]] = None,
      date: Option[String] = None,
      date_not: Option[String] = None,
      date_lt: Option[String] = None,
      date_lte: Option[String] = None,
      date_gt: Option[String] = None,
      date_gte: Option[String] = None,
      date_in: Option[List[Option[String]]] = None,
      date_not_in: Option[List[Option[String]]] = None,
      nextCrawl: Option[String] = None,
      nextCrawl_not: Option[String] = None,
      nextCrawl_lt: Option[String] = None,
      nextCrawl_lte: Option[String] = None,
      nextCrawl_gt: Option[String] = None,
      nextCrawl_gte: Option[String] = None,
      nextCrawl_in: Option[List[Option[String]]] = None,
      nextCrawl_not_in: Option[List[Option[String]]] = None,
      updatedAt: Option[String] = None,
      updatedAt_not: Option[String] = None,
      updatedAt_lt: Option[String] = None,
      updatedAt_lte: Option[String] = None,
      updatedAt_gt: Option[String] = None,
      updatedAt_gte: Option[String] = None,
      updatedAt_in: Option[List[Option[String]]] = None,
      updatedAt_not_in: Option[List[Option[String]]] = None,
      eTag: Option[String] = None,
      eTag_not: Option[String] = None,
      eTag_contains: Option[String] = None,
      eTag_not_contains: Option[String] = None,
      eTag_starts_with: Option[String] = None,
      eTag_not_starts_with: Option[String] = None,
      eTag_ends_with: Option[String] = None,
      eTag_not_ends_with: Option[String] = None,
      eTag_i: Option[String] = None,
      eTag_not_i: Option[String] = None,
      eTag_contains_i: Option[String] = None,
      eTag_not_contains_i: Option[String] = None,
      eTag_starts_with_i: Option[String] = None,
      eTag_not_starts_with_i: Option[String] = None,
      eTag_ends_with_i: Option[String] = None,
      eTag_not_ends_with_i: Option[String] = None,
      eTag_in: Option[List[Option[String]]] = None,
      eTag_not_in: Option[List[Option[String]]] = None,
      profileHash: Option[String] = None,
      profileHash_not: Option[String] = None,
      profileHash_contains: Option[String] = None,
      profileHash_not_contains: Option[String] = None,
      profileHash_starts_with: Option[String] = None,
      profileHash_not_starts_with: Option[String] = None,
      profileHash_ends_with: Option[String] = None,
      profileHash_not_ends_with: Option[String] = None,
      profileHash_i: Option[String] = None,
      profileHash_not_i: Option[String] = None,
      profileHash_contains_i: Option[String] = None,
      profileHash_not_contains_i: Option[String] = None,
      profileHash_starts_with_i: Option[String] = None,
      profileHash_not_starts_with_i: Option[String] = None,
      profileHash_ends_with_i: Option[String] = None,
      profileHash_not_ends_with_i: Option[String] = None,
      profileHash_in: Option[List[Option[String]]] = None,
      profileHash_not_in: Option[List[Option[String]]] = None,
      contentHash: Option[String] = None,
      contentHash_not: Option[String] = None,
      contentHash_contains: Option[String] = None,
      contentHash_not_contains: Option[String] = None,
      contentHash_starts_with: Option[String] = None,
      contentHash_not_starts_with: Option[String] = None,
      contentHash_ends_with: Option[String] = None,
      contentHash_not_ends_with: Option[String] = None,
      contentHash_i: Option[String] = None,
      contentHash_not_i: Option[String] = None,
      contentHash_contains_i: Option[String] = None,
      contentHash_not_contains_i: Option[String] = None,
      contentHash_starts_with_i: Option[String] = None,
      contentHash_not_starts_with_i: Option[String] = None,
      contentHash_ends_with_i: Option[String] = None,
      contentHash_not_ends_with_i: Option[String] = None,
      contentHash_in: Option[List[Option[String]]] = None,
      contentHash_not_in: Option[List[Option[String]]] = None,
      disabled: Option[Boolean] = None,
      disabled_not: Option[Boolean] = None
  )
  object EntryWhereInput {
    implicit val encoder: ArgEncoder[EntryWhereInput] =
      new ArgEncoder[EntryWhereInput] {
        override def encode(value: EntryWhereInput): __Value =
          __ObjectValue(
            List(
              "AND" -> value.AND.fold(__NullValue: __Value)(
                value => __ListValue(value.map(value => encode(value)))
              ),
              "OR" -> value.OR.fold(__NullValue: __Value)(
                value => __ListValue(value.map(value => encode(value)))
              ),
              "id" -> value.id.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "id_not" -> value.id_not.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "id_lt" -> value.id_lt.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "id_lte" -> value.id_lte.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "id_gt" -> value.id_gt.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "id_gte" -> value.id_gte.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "id_in" -> value.id_in.fold(__NullValue: __Value)(
                value =>
                  __ListValue(
                    value.map(
                      value => implicitly[ArgEncoder[String]].encode(value)
                    )
                  )
              ),
              "id_not_in" -> value.id_not_in.fold(__NullValue: __Value)(
                value =>
                  __ListValue(
                    value.map(
                      value => implicitly[ArgEncoder[String]].encode(value)
                    )
                  )
              ),
              "name" -> value.name.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "name_not" -> value.name_not.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "name_contains" -> value.name_contains.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "name_not_contains" -> value.name_not_contains.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "name_starts_with" -> value.name_starts_with.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "name_not_starts_with" -> value.name_not_starts_with.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "name_ends_with" -> value.name_ends_with.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "name_not_ends_with" -> value.name_not_ends_with.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "name_i" -> value.name_i.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "name_not_i" -> value.name_not_i.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "name_contains_i" -> value.name_contains_i.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "name_not_contains_i" -> value.name_not_contains_i.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "name_starts_with_i" -> value.name_starts_with_i.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "name_not_starts_with_i" -> value.name_not_starts_with_i.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "name_ends_with_i" -> value.name_ends_with_i.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "name_not_ends_with_i" -> value.name_not_ends_with_i.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "name_in" -> value.name_in.fold(__NullValue: __Value)(
                value =>
                  __ListValue(
                    value.map(
                      value =>
                        value.fold(__NullValue: __Value)(
                          value => implicitly[ArgEncoder[String]].encode(value)
                        )
                    )
                  )
              ),
              "name_not_in" -> value.name_not_in.fold(__NullValue: __Value)(
                value =>
                  __ListValue(
                    value.map(
                      value =>
                        value.fold(__NullValue: __Value)(
                          value => implicitly[ArgEncoder[String]].encode(value)
                        )
                    )
                  )
              ),
              "hasBeenTagged" -> value.hasBeenTagged.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[Boolean]].encode(value)
              ),
              "hasBeenTagged_not" -> value.hasBeenTagged_not.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[Boolean]].encode(value)),
              "url" -> value.url.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[UrlWhereInput]].encode(value)
              ),
              "url_is_null" -> value.url_is_null.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[Boolean]].encode(value)
              ),
              "tags_every" -> value.tags_every.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[TagWhereInput]].encode(value)
              ),
              "tags_some" -> value.tags_some.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[TagWhereInput]].encode(value)
              ),
              "tags_none" -> value.tags_none.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[TagWhereInput]].encode(value)
              ),
              "language" -> value.language.fold(__NullValue: __Value)(
                value =>
                  implicitly[ArgEncoder[LanguageWhereInput]].encode(value)
              ),
              "language_is_null" -> value.language_is_null.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[Boolean]].encode(value)),
              "content" -> value.content.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "content_not" -> value.content_not.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "content_contains" -> value.content_contains.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "content_not_contains" -> value.content_not_contains.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "content_starts_with" -> value.content_starts_with.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "content_not_starts_with" -> value.content_not_starts_with.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "content_ends_with" -> value.content_ends_with.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "content_not_ends_with" -> value.content_not_ends_with.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "content_i" -> value.content_i.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "content_not_i" -> value.content_not_i.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "content_contains_i" -> value.content_contains_i.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "content_not_contains_i" -> value.content_not_contains_i.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "content_starts_with_i" -> value.content_starts_with_i.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "content_not_starts_with_i" -> value.content_not_starts_with_i
                .fold(__NullValue: __Value)(
                  value => implicitly[ArgEncoder[String]].encode(value)
                ),
              "content_ends_with_i" -> value.content_ends_with_i.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "content_not_ends_with_i" -> value.content_not_ends_with_i.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "content_in" -> value.content_in.fold(__NullValue: __Value)(
                value =>
                  __ListValue(
                    value.map(
                      value =>
                        value.fold(__NullValue: __Value)(
                          value => implicitly[ArgEncoder[String]].encode(value)
                        )
                    )
                  )
              ),
              "content_not_in" -> value.content_not_in.fold(
                __NullValue: __Value
              )(
                value =>
                  __ListValue(
                    value.map(
                      value =>
                        value.fold(__NullValue: __Value)(
                          value => implicitly[ArgEncoder[String]].encode(value)
                        )
                    )
                  )
              ),
              "summary" -> value.summary.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "summary_not" -> value.summary_not.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "summary_contains" -> value.summary_contains.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "summary_not_contains" -> value.summary_not_contains.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "summary_starts_with" -> value.summary_starts_with.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "summary_not_starts_with" -> value.summary_not_starts_with.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "summary_ends_with" -> value.summary_ends_with.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "summary_not_ends_with" -> value.summary_not_ends_with.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "summary_i" -> value.summary_i.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "summary_not_i" -> value.summary_not_i.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "summary_contains_i" -> value.summary_contains_i.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "summary_not_contains_i" -> value.summary_not_contains_i.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "summary_starts_with_i" -> value.summary_starts_with_i.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "summary_not_starts_with_i" -> value.summary_not_starts_with_i
                .fold(__NullValue: __Value)(
                  value => implicitly[ArgEncoder[String]].encode(value)
                ),
              "summary_ends_with_i" -> value.summary_ends_with_i.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "summary_not_ends_with_i" -> value.summary_not_ends_with_i.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "summary_in" -> value.summary_in.fold(__NullValue: __Value)(
                value =>
                  __ListValue(
                    value.map(
                      value =>
                        value.fold(__NullValue: __Value)(
                          value => implicitly[ArgEncoder[String]].encode(value)
                        )
                    )
                  )
              ),
              "summary_not_in" -> value.summary_not_in.fold(
                __NullValue: __Value
              )(
                value =>
                  __ListValue(
                    value.map(
                      value =>
                        value.fold(__NullValue: __Value)(
                          value => implicitly[ArgEncoder[String]].encode(value)
                        )
                    )
                  )
              ),
              "date" -> value.date.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "date_not" -> value.date_not.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "date_lt" -> value.date_lt.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "date_lte" -> value.date_lte.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "date_gt" -> value.date_gt.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "date_gte" -> value.date_gte.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "date_in" -> value.date_in.fold(__NullValue: __Value)(
                value =>
                  __ListValue(
                    value.map(
                      value =>
                        value.fold(__NullValue: __Value)(
                          value => implicitly[ArgEncoder[String]].encode(value)
                        )
                    )
                  )
              ),
              "date_not_in" -> value.date_not_in.fold(__NullValue: __Value)(
                value =>
                  __ListValue(
                    value.map(
                      value =>
                        value.fold(__NullValue: __Value)(
                          value => implicitly[ArgEncoder[String]].encode(value)
                        )
                    )
                  )
              ),
              "nextCrawl" -> value.nextCrawl.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "nextCrawl_not" -> value.nextCrawl_not.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "nextCrawl_lt" -> value.nextCrawl_lt.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "nextCrawl_lte" -> value.nextCrawl_lte.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "nextCrawl_gt" -> value.nextCrawl_gt.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "nextCrawl_gte" -> value.nextCrawl_gte.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "nextCrawl_in" -> value.nextCrawl_in.fold(__NullValue: __Value)(
                value =>
                  __ListValue(
                    value.map(
                      value =>
                        value.fold(__NullValue: __Value)(
                          value => implicitly[ArgEncoder[String]].encode(value)
                        )
                    )
                  )
              ),
              "nextCrawl_not_in" -> value.nextCrawl_not_in.fold(
                __NullValue: __Value
              )(
                value =>
                  __ListValue(
                    value.map(
                      value =>
                        value.fold(__NullValue: __Value)(
                          value => implicitly[ArgEncoder[String]].encode(value)
                        )
                    )
                  )
              ),
              "updatedAt" -> value.updatedAt.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "updatedAt_not" -> value.updatedAt_not.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "updatedAt_lt" -> value.updatedAt_lt.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "updatedAt_lte" -> value.updatedAt_lte.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "updatedAt_gt" -> value.updatedAt_gt.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "updatedAt_gte" -> value.updatedAt_gte.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "updatedAt_in" -> value.updatedAt_in.fold(__NullValue: __Value)(
                value =>
                  __ListValue(
                    value.map(
                      value =>
                        value.fold(__NullValue: __Value)(
                          value => implicitly[ArgEncoder[String]].encode(value)
                        )
                    )
                  )
              ),
              "updatedAt_not_in" -> value.updatedAt_not_in.fold(
                __NullValue: __Value
              )(
                value =>
                  __ListValue(
                    value.map(
                      value =>
                        value.fold(__NullValue: __Value)(
                          value => implicitly[ArgEncoder[String]].encode(value)
                        )
                    )
                  )
              ),
              "eTag" -> value.eTag.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "eTag_not" -> value.eTag_not.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "eTag_contains" -> value.eTag_contains.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "eTag_not_contains" -> value.eTag_not_contains.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "eTag_starts_with" -> value.eTag_starts_with.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "eTag_not_starts_with" -> value.eTag_not_starts_with.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "eTag_ends_with" -> value.eTag_ends_with.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "eTag_not_ends_with" -> value.eTag_not_ends_with.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "eTag_i" -> value.eTag_i.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "eTag_not_i" -> value.eTag_not_i.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "eTag_contains_i" -> value.eTag_contains_i.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "eTag_not_contains_i" -> value.eTag_not_contains_i.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "eTag_starts_with_i" -> value.eTag_starts_with_i.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "eTag_not_starts_with_i" -> value.eTag_not_starts_with_i.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "eTag_ends_with_i" -> value.eTag_ends_with_i.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "eTag_not_ends_with_i" -> value.eTag_not_ends_with_i.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "eTag_in" -> value.eTag_in.fold(__NullValue: __Value)(
                value =>
                  __ListValue(
                    value.map(
                      value =>
                        value.fold(__NullValue: __Value)(
                          value => implicitly[ArgEncoder[String]].encode(value)
                        )
                    )
                  )
              ),
              "eTag_not_in" -> value.eTag_not_in.fold(__NullValue: __Value)(
                value =>
                  __ListValue(
                    value.map(
                      value =>
                        value.fold(__NullValue: __Value)(
                          value => implicitly[ArgEncoder[String]].encode(value)
                        )
                    )
                  )
              ),
              "profileHash" -> value.profileHash.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "profileHash_not" -> value.profileHash_not.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "profileHash_contains" -> value.profileHash_contains.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "profileHash_not_contains" -> value.profileHash_not_contains.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "profileHash_starts_with" -> value.profileHash_starts_with.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "profileHash_not_starts_with" -> value.profileHash_not_starts_with
                .fold(__NullValue: __Value)(
                  value => implicitly[ArgEncoder[String]].encode(value)
                ),
              "profileHash_ends_with" -> value.profileHash_ends_with.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "profileHash_not_ends_with" -> value.profileHash_not_ends_with
                .fold(__NullValue: __Value)(
                  value => implicitly[ArgEncoder[String]].encode(value)
                ),
              "profileHash_i" -> value.profileHash_i.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "profileHash_not_i" -> value.profileHash_not_i.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "profileHash_contains_i" -> value.profileHash_contains_i.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "profileHash_not_contains_i" -> value.profileHash_not_contains_i
                .fold(__NullValue: __Value)(
                  value => implicitly[ArgEncoder[String]].encode(value)
                ),
              "profileHash_starts_with_i" -> value.profileHash_starts_with_i
                .fold(__NullValue: __Value)(
                  value => implicitly[ArgEncoder[String]].encode(value)
                ),
              "profileHash_not_starts_with_i" -> value.profileHash_not_starts_with_i
                .fold(__NullValue: __Value)(
                  value => implicitly[ArgEncoder[String]].encode(value)
                ),
              "profileHash_ends_with_i" -> value.profileHash_ends_with_i.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "profileHash_not_ends_with_i" -> value.profileHash_not_ends_with_i
                .fold(__NullValue: __Value)(
                  value => implicitly[ArgEncoder[String]].encode(value)
                ),
              "profileHash_in" -> value.profileHash_in.fold(
                __NullValue: __Value
              )(
                value =>
                  __ListValue(
                    value.map(
                      value =>
                        value.fold(__NullValue: __Value)(
                          value => implicitly[ArgEncoder[String]].encode(value)
                        )
                    )
                  )
              ),
              "profileHash_not_in" -> value.profileHash_not_in.fold(
                __NullValue: __Value
              )(
                value =>
                  __ListValue(
                    value.map(
                      value =>
                        value.fold(__NullValue: __Value)(
                          value => implicitly[ArgEncoder[String]].encode(value)
                        )
                    )
                  )
              ),
              "contentHash" -> value.contentHash.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "contentHash_not" -> value.contentHash_not.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "contentHash_contains" -> value.contentHash_contains.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "contentHash_not_contains" -> value.contentHash_not_contains.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "contentHash_starts_with" -> value.contentHash_starts_with.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "contentHash_not_starts_with" -> value.contentHash_not_starts_with
                .fold(__NullValue: __Value)(
                  value => implicitly[ArgEncoder[String]].encode(value)
                ),
              "contentHash_ends_with" -> value.contentHash_ends_with.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "contentHash_not_ends_with" -> value.contentHash_not_ends_with
                .fold(__NullValue: __Value)(
                  value => implicitly[ArgEncoder[String]].encode(value)
                ),
              "contentHash_i" -> value.contentHash_i.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "contentHash_not_i" -> value.contentHash_not_i.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "contentHash_contains_i" -> value.contentHash_contains_i.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "contentHash_not_contains_i" -> value.contentHash_not_contains_i
                .fold(__NullValue: __Value)(
                  value => implicitly[ArgEncoder[String]].encode(value)
                ),
              "contentHash_starts_with_i" -> value.contentHash_starts_with_i
                .fold(__NullValue: __Value)(
                  value => implicitly[ArgEncoder[String]].encode(value)
                ),
              "contentHash_not_starts_with_i" -> value.contentHash_not_starts_with_i
                .fold(__NullValue: __Value)(
                  value => implicitly[ArgEncoder[String]].encode(value)
                ),
              "contentHash_ends_with_i" -> value.contentHash_ends_with_i.fold(
                __NullValue: __Value
              )(value => implicitly[ArgEncoder[String]].encode(value)),
              "contentHash_not_ends_with_i" -> value.contentHash_not_ends_with_i
                .fold(__NullValue: __Value)(
                  value => implicitly[ArgEncoder[String]].encode(value)
                ),
              "contentHash_in" -> value.contentHash_in.fold(
                __NullValue: __Value
              )(
                value =>
                  __ListValue(
                    value.map(
                      value =>
                        value.fold(__NullValue: __Value)(
                          value => implicitly[ArgEncoder[String]].encode(value)
                        )
                    )
                  )
              ),
              "contentHash_not_in" -> value.contentHash_not_in.fold(
                __NullValue: __Value
              )(
                value =>
                  __ListValue(
                    value.map(
                      value =>
                        value.fold(__NullValue: __Value)(
                          value => implicitly[ArgEncoder[String]].encode(value)
                        )
                    )
                  )
              ),
              "disabled" -> value.disabled.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[Boolean]].encode(value)
              ),
              "disabled_not" -> value.disabled_not.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[Boolean]].encode(value)
              )
            ).filterNot(_._2.equals(__NullValue))
          )
        override def typeName: String = "EntryWhereInput"
      }
  }
  case class EntryWhereUniqueInput(id: Option[String] = None)
  object EntryWhereUniqueInput {
    implicit val encoder: ArgEncoder[EntryWhereUniqueInput] =
      new ArgEncoder[EntryWhereUniqueInput] {
        override def encode(value: EntryWhereUniqueInput): __Value =
          __ObjectValue(
            List(
              "id" -> value.id.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              )
            ).filterNot(_._2.equals(__NullValue))
          )
        override def typeName: String = "EntryWhereUniqueInput"
      }
  }
  case class EntryOrderByInput(
      id: Option[OrderDirection] = None,
      name: Option[OrderDirection] = None,
      hasBeenTagged: Option[OrderDirection] = None,
      content: Option[OrderDirection] = None,
      summary: Option[OrderDirection] = None,
      date: Option[OrderDirection] = None,
      nextCrawl: Option[OrderDirection] = None,
      updatedAt: Option[OrderDirection] = None,
      eTag: Option[OrderDirection] = None,
      profileHash: Option[OrderDirection] = None,
      contentHash: Option[OrderDirection] = None,
      disabled: Option[OrderDirection] = None
  )
  object EntryOrderByInput {
    implicit val encoder: ArgEncoder[EntryOrderByInput] =
      new ArgEncoder[EntryOrderByInput] {
        override def encode(value: EntryOrderByInput): __Value =
          __ObjectValue(
            List(
              "id" -> value.id.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[OrderDirection]].encode(value)
              ),
              "name" -> value.name.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[OrderDirection]].encode(value)
              ),
              "hasBeenTagged" -> value.hasBeenTagged.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[OrderDirection]].encode(value)
              ),
              "content" -> value.content.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[OrderDirection]].encode(value)
              ),
              "summary" -> value.summary.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[OrderDirection]].encode(value)
              ),
              "date" -> value.date.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[OrderDirection]].encode(value)
              ),
              "nextCrawl" -> value.nextCrawl.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[OrderDirection]].encode(value)
              ),
              "updatedAt" -> value.updatedAt.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[OrderDirection]].encode(value)
              ),
              "eTag" -> value.eTag.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[OrderDirection]].encode(value)
              ),
              "profileHash" -> value.profileHash.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[OrderDirection]].encode(value)
              ),
              "contentHash" -> value.contentHash.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[OrderDirection]].encode(value)
              ),
              "disabled" -> value.disabled.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[OrderDirection]].encode(value)
              )
            ).filterNot(_._2.equals(__NullValue))
          )
        override def typeName: String = "EntryOrderByInput"
      }
  }
  case class EntryUpdateInput(
      name: Option[String] = None,
      hasBeenTagged: Option[Boolean] = None,
      url: Option[UrlRelateToOneInput] = None,
      tags: Option[TagRelateToManyInput] = None,
      language: Option[LanguageRelateToOneInput] = None,
      content: Option[String] = None,
      summary: Option[String] = None,
      date: Option[String] = None,
      nextCrawl: Option[String] = None,
      updatedAt: Option[String] = None,
      eTag: Option[String] = None,
      profileHash: Option[String] = None,
      contentHash: Option[String] = None,
      disabled: Option[Boolean] = None
  )
  object EntryUpdateInput {
    implicit val encoder: ArgEncoder[EntryUpdateInput] =
      new ArgEncoder[EntryUpdateInput] {
        override def encode(value: EntryUpdateInput): __Value =
          __ObjectValue(
            List(
              "name" -> value.name.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "hasBeenTagged" -> value.hasBeenTagged.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[Boolean]].encode(value)
              ),
              "url" -> value.url.fold(__NullValue: __Value)(
                value =>
                  implicitly[ArgEncoder[UrlRelateToOneInput]].encode(value)
              ),
              "tags" -> value.tags.fold(__NullValue: __Value)(
                value =>
                  implicitly[ArgEncoder[TagRelateToManyInput]].encode(value)
              ),
              "language" -> value.language.fold(__NullValue: __Value)(
                value =>
                  implicitly[ArgEncoder[LanguageRelateToOneInput]].encode(value)
              ),
              "content" -> value.content.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "summary" -> value.summary.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "date" -> value.date.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "nextCrawl" -> value.nextCrawl.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "updatedAt" -> value.updatedAt.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "eTag" -> value.eTag.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "profileHash" -> value.profileHash.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "contentHash" -> value.contentHash.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "disabled" -> value.disabled.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[Boolean]].encode(value)
              )
            ).filterNot(_._2.equals(__NullValue))
          )
        override def typeName: String = "EntryUpdateInput"
      }
  }
  case class UrlRelateToOneInput(
      create: Option[UrlCreateInput] = None,
      connect: Option[UrlWhereUniqueInput] = None,
      disconnect: Option[UrlWhereUniqueInput] = None,
      disconnectAll: Option[Boolean] = None
  )
  object UrlRelateToOneInput {
    implicit val encoder: ArgEncoder[UrlRelateToOneInput] =
      new ArgEncoder[UrlRelateToOneInput] {
        override def encode(value: UrlRelateToOneInput): __Value =
          __ObjectValue(
            List(
              "create" -> value.create.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[UrlCreateInput]].encode(value)
              ),
              "connect" -> value.connect.fold(__NullValue: __Value)(
                value =>
                  implicitly[ArgEncoder[UrlWhereUniqueInput]].encode(value)
              ),
              "disconnect" -> value.disconnect.fold(__NullValue: __Value)(
                value =>
                  implicitly[ArgEncoder[UrlWhereUniqueInput]].encode(value)
              ),
              "disconnectAll" -> value.disconnectAll.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[Boolean]].encode(value)
              )
            ).filterNot(_._2.equals(__NullValue))
          )
        override def typeName: String = "UrlRelateToOneInput"
      }
  }
  case class TagRelateToManyInput(
      create: Option[List[Option[TagCreateInput]]] = None,
      connect: Option[List[Option[TagWhereUniqueInput]]] = None,
      disconnect: Option[List[Option[TagWhereUniqueInput]]] = None,
      disconnectAll: Option[Boolean] = None
  )
  object TagRelateToManyInput {
    implicit val encoder: ArgEncoder[TagRelateToManyInput] =
      new ArgEncoder[TagRelateToManyInput] {
        override def encode(value: TagRelateToManyInput): __Value =
          __ObjectValue(
            List(
              "create" -> value.create.fold(__NullValue: __Value)(
                value =>
                  __ListValue(
                    value.map(
                      value =>
                        value.fold(__NullValue: __Value)(
                          value =>
                            implicitly[ArgEncoder[TagCreateInput]].encode(value)
                        )
                    )
                  )
              ),
              "connect" -> value.connect.fold(__NullValue: __Value)(
                value =>
                  __ListValue(
                    value.map(
                      value =>
                        value.fold(__NullValue: __Value)(
                          value =>
                            implicitly[ArgEncoder[TagWhereUniqueInput]]
                              .encode(value)
                        )
                    )
                  )
              ),
              "disconnect" -> value.disconnect.fold(__NullValue: __Value)(
                value =>
                  __ListValue(
                    value.map(
                      value =>
                        value.fold(__NullValue: __Value)(
                          value =>
                            implicitly[ArgEncoder[TagWhereUniqueInput]].encode(
                              value
                            )
                        )
                    )
                  )
              ),
              "disconnectAll" -> value.disconnectAll.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[Boolean]].encode(value)
              )
            ).filterNot(_._2.equals(__NullValue))
          )
        override def typeName: String = "TagRelateToManyInput"
      }
  }
  case class EntriesUpdateInput(
      id: String,
      data: Option[EntryUpdateInput] = None
  )
  object EntriesUpdateInput {
    implicit val encoder: ArgEncoder[EntriesUpdateInput] =
      new ArgEncoder[EntriesUpdateInput] {
        override def encode(value: EntriesUpdateInput): __Value =
          __ObjectValue(
            List(
              "id" -> implicitly[ArgEncoder[String]].encode(value.id),
              "data" -> value.data.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[EntryUpdateInput]].encode(value)
              )
            ).filterNot(_._2.equals(__NullValue))
          )
        override def typeName: String = "EntriesUpdateInput"
      }
  }
  case class EntryCreateInput(
      name: Option[String] = None,
      hasBeenTagged: Option[Boolean] = None,
      url: Option[UrlRelateToOneInput] = None,
      tags: Option[TagRelateToManyInput] = None,
      language: Option[LanguageRelateToOneInput] = None,
      content: Option[String] = None,
      summary: Option[String] = None,
      date: Option[String] = None,
      nextCrawl: Option[String] = None,
      updatedAt: Option[String] = None,
      eTag: Option[String] = None,
      profileHash: Option[String] = None,
      contentHash: Option[String] = None,
      disabled: Option[Boolean] = None
  )
  object EntryCreateInput {
    implicit val encoder: ArgEncoder[EntryCreateInput] =
      new ArgEncoder[EntryCreateInput] {
        override def encode(value: EntryCreateInput): __Value =
          __ObjectValue(
            List(
              "name" -> value.name.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "hasBeenTagged" -> value.hasBeenTagged.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[Boolean]].encode(value)
              ),
              "url" -> value.url.fold(__NullValue: __Value)(
                value =>
                  implicitly[ArgEncoder[UrlRelateToOneInput]].encode(value)
              ),
              "tags" -> value.tags.fold(__NullValue: __Value)(
                value =>
                  implicitly[ArgEncoder[TagRelateToManyInput]].encode(value)
              ),
              "language" -> value.language.fold(__NullValue: __Value)(
                value =>
                  implicitly[ArgEncoder[LanguageRelateToOneInput]].encode(value)
              ),
              "content" -> value.content.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "summary" -> value.summary.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "date" -> value.date.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "nextCrawl" -> value.nextCrawl.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "updatedAt" -> value.updatedAt.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "eTag" -> value.eTag.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "profileHash" -> value.profileHash.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "contentHash" -> value.contentHash.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "disabled" -> value.disabled.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[Boolean]].encode(value)
              )
            ).filterNot(_._2.equals(__NullValue))
          )
        override def typeName: String = "EntryCreateInput"
      }
  }
  case class EntriesCreateInput(data: Option[EntryCreateInput] = None)
  object EntriesCreateInput {
    implicit val encoder: ArgEncoder[EntriesCreateInput] =
      new ArgEncoder[EntriesCreateInput] {
        override def encode(value: EntriesCreateInput): __Value =
          __ObjectValue(
            List(
              "data" -> value.data.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[EntryCreateInput]].encode(value)
              )
            ).filterNot(_._2.equals(__NullValue))
          )
        override def typeName: String = "EntriesCreateInput"
      }
  }
  case class SearchWhereInput(
      tag_id_in: Option[List[String]] = None,
      source_id_in: Option[List[String]] = None,
      date_lte: Option[String] = None,
      date_gte: Option[String] = None
  )
  object SearchWhereInput {
    implicit val encoder: ArgEncoder[SearchWhereInput] =
      new ArgEncoder[SearchWhereInput] {
        override def encode(value: SearchWhereInput): __Value =
          __ObjectValue(
            List(
              "tag_id_in" -> value.tag_id_in.fold(__NullValue: __Value)(
                value =>
                  __ListValue(
                    value.map(
                      value => implicitly[ArgEncoder[String]].encode(value)
                    )
                  )
              ),
              "source_id_in" -> value.source_id_in.fold(__NullValue: __Value)(
                value =>
                  __ListValue(
                    value.map(
                      value => implicitly[ArgEncoder[String]].encode(value)
                    )
                  )
              ),
              "date_lte" -> value.date_lte.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              ),
              "date_gte" -> value.date_gte.fold(__NullValue: __Value)(
                value => implicitly[ArgEncoder[String]].encode(value)
              )
            ).filterNot(_._2.equals(__NullValue))
          )
        override def typeName: String = "SearchWhereInput"
      }
  }
  type Query = RootQuery
  object Query {

    /** Search for all Url items which match the where clause.
      */
    def allUrls[A](
        where: UrlWhereInput,
        search: Option[String] = None,
        orderBy: List[UrlOrderByInput] = Nil,
        first: Option[Int] = None,
        skip: Int
    )(
        innerSelection: SelectionBuilder[Url, A]
    ): SelectionBuilder[RootQuery, Option[List[A]]] = Field(
      "allUrls",
      OptionOf(ListOf(Obj(innerSelection))),
      arguments = List(
        Argument("where", where),
        Argument("search", search),
        Argument("orderBy", orderBy),
        Argument("first", first),
        Argument("skip", skip)
      )
    )

    /** Search for the Url item with the matching ID.
      */
    def Url[A](where: UrlWhereUniqueInput)(
        innerSelection: SelectionBuilder[Url, A]
    ): SelectionBuilder[RootQuery, Option[A]] = Field(
      "Url",
      OptionOf(Obj(innerSelection)),
      arguments = List(Argument("where", where))
    )

    /** Perform a meta-query on all Url items which match the where clause.
      */
    @deprecated(
      "This query will be removed in a future version. Please use urlsCount instead.",
      ""
    )
    def _allUrlsMeta[A](
        where: UrlWhereInput,
        search: Option[String] = None,
        orderBy: List[UrlOrderByInput] = Nil,
        first: Option[Int] = None,
        skip: Int
    )(
        innerSelection: SelectionBuilder[_QueryMeta, A]
    ): SelectionBuilder[RootQuery, Option[A]] = Field(
      "_allUrlsMeta",
      OptionOf(Obj(innerSelection)),
      arguments = List(
        Argument("where", where),
        Argument("search", search),
        Argument("orderBy", orderBy),
        Argument("first", first),
        Argument("skip", skip)
      )
    )
    def urlsCount(
        where: UrlWhereInput
    ): SelectionBuilder[RootQuery, Option[Int]] = Field(
      "urlsCount",
      OptionOf(Scalar()),
      arguments = List(Argument("where", where))
    )

    /** Search for all Source items which match the where clause.
      */
    def allSources[A](
        where: SourceWhereInput,
        search: Option[String] = None,
        orderBy: List[SourceOrderByInput] = Nil,
        first: Option[Int] = None,
        skip: Int
    )(
        innerSelection: SelectionBuilder[Source, A]
    ): SelectionBuilder[RootQuery, Option[List[A]]] = Field(
      "allSources",
      OptionOf(ListOf(Obj(innerSelection))),
      arguments = List(
        Argument("where", where),
        Argument("search", search),
        Argument("orderBy", orderBy),
        Argument("first", first),
        Argument("skip", skip)
      )
    )

    /** Search for the Source item with the matching ID.
      */
    def Source[A](where: SourceWhereUniqueInput)(
        innerSelection: SelectionBuilder[Source, A]
    ): SelectionBuilder[RootQuery, Option[A]] = Field(
      "Source",
      OptionOf(Obj(innerSelection)),
      arguments = List(Argument("where", where))
    )

    /** Perform a meta-query on all Source items which match the where clause.
      */
    @deprecated(
      "This query will be removed in a future version. Please use sourcesCount instead.",
      ""
    )
    def _allSourcesMeta[A](
        where: SourceWhereInput,
        search: Option[String] = None,
        orderBy: List[SourceOrderByInput] = Nil,
        first: Option[Int] = None,
        skip: Int
    )(
        innerSelection: SelectionBuilder[_QueryMeta, A]
    ): SelectionBuilder[RootQuery, Option[A]] = Field(
      "_allSourcesMeta",
      OptionOf(Obj(innerSelection)),
      arguments = List(
        Argument("where", where),
        Argument("search", search),
        Argument("orderBy", orderBy),
        Argument("first", first),
        Argument("skip", skip)
      )
    )
    def sourcesCount(
        where: SourceWhereInput
    ): SelectionBuilder[RootQuery, Option[Int]] = Field(
      "sourcesCount",
      OptionOf(Scalar()),
      arguments = List(Argument("where", where))
    )

    /** Search for all Language items which match the where clause.
      */
    def allLanguages[A](
        where: LanguageWhereInput,
        search: Option[String] = None,
        orderBy: List[LanguageOrderByInput] = Nil,
        first: Option[Int] = None,
        skip: Int
    )(
        innerSelection: SelectionBuilder[Language, A]
    ): SelectionBuilder[RootQuery, Option[List[A]]] = Field(
      "allLanguages",
      OptionOf(ListOf(Obj(innerSelection))),
      arguments = List(
        Argument("where", where),
        Argument("search", search),
        Argument("orderBy", orderBy),
        Argument("first", first),
        Argument("skip", skip)
      )
    )

    /** Search for the Language item with the matching ID.
      */
    def Language[A](where: LanguageWhereUniqueInput)(
        innerSelection: SelectionBuilder[Language, A]
    ): SelectionBuilder[RootQuery, Option[A]] = Field(
      "Language",
      OptionOf(Obj(innerSelection)),
      arguments = List(Argument("where", where))
    )

    /** Perform a meta-query on all Language items which match the where clause.
      */
    @deprecated(
      "This query will be removed in a future version. Please use languagesCount instead.",
      ""
    )
    def _allLanguagesMeta[A](
        where: LanguageWhereInput,
        search: Option[String] = None,
        orderBy: List[LanguageOrderByInput] = Nil,
        first: Option[Int] = None,
        skip: Int
    )(
        innerSelection: SelectionBuilder[_QueryMeta, A]
    ): SelectionBuilder[RootQuery, Option[A]] = Field(
      "_allLanguagesMeta",
      OptionOf(Obj(innerSelection)),
      arguments = List(
        Argument("where", where),
        Argument("search", search),
        Argument("orderBy", orderBy),
        Argument("first", first),
        Argument("skip", skip)
      )
    )
    def languagesCount(
        where: LanguageWhereInput
    ): SelectionBuilder[RootQuery, Option[Int]] = Field(
      "languagesCount",
      OptionOf(Scalar()),
      arguments = List(Argument("where", where))
    )

    /** Search for all Tag items which match the where clause.
      */
    def allTags[A](
        where: TagWhereInput,
        search: Option[String] = None,
        orderBy: List[TagOrderByInput] = Nil,
        first: Option[Int] = None,
        skip: Int
    )(
        innerSelection: SelectionBuilder[Tag, A]
    ): SelectionBuilder[RootQuery, Option[List[A]]] = Field(
      "allTags",
      OptionOf(ListOf(Obj(innerSelection))),
      arguments = List(
        Argument("where", where),
        Argument("search", search),
        Argument("orderBy", orderBy),
        Argument("first", first),
        Argument("skip", skip)
      )
    )

    /** Search for the Tag item with the matching ID.
      */
    def Tag[A](where: TagWhereUniqueInput)(
        innerSelection: SelectionBuilder[Tag, A]
    ): SelectionBuilder[RootQuery, Option[A]] = Field(
      "Tag",
      OptionOf(Obj(innerSelection)),
      arguments = List(Argument("where", where))
    )

    /** Perform a meta-query on all Tag items which match the where clause.
      */
    @deprecated(
      "This query will be removed in a future version. Please use tagsCount instead.",
      ""
    )
    def _allTagsMeta[A](
        where: TagWhereInput,
        search: Option[String] = None,
        orderBy: List[TagOrderByInput] = Nil,
        first: Option[Int] = None,
        skip: Int
    )(
        innerSelection: SelectionBuilder[_QueryMeta, A]
    ): SelectionBuilder[RootQuery, Option[A]] = Field(
      "_allTagsMeta",
      OptionOf(Obj(innerSelection)),
      arguments = List(
        Argument("where", where),
        Argument("search", search),
        Argument("orderBy", orderBy),
        Argument("first", first),
        Argument("skip", skip)
      )
    )
    def tagsCount(
        where: TagWhereInput
    ): SelectionBuilder[RootQuery, Option[Int]] = Field(
      "tagsCount",
      OptionOf(Scalar()),
      arguments = List(Argument("where", where))
    )

    /** Search for all Entry items which match the where clause.
      */
    def allEntries[A](
        where: EntryWhereInput,
        search: Option[String] = None,
        orderBy: List[EntryOrderByInput] = Nil,
        first: Option[Int] = None,
        skip: Int
    )(
        innerSelection: SelectionBuilder[Entry, A]
    ): SelectionBuilder[RootQuery, Option[List[A]]] = Field(
      "allEntries",
      OptionOf(ListOf(Obj(innerSelection))),
      arguments = List(
        Argument("where", where),
        Argument("search", search),
        Argument("orderBy", orderBy),
        Argument("first", first),
        Argument("skip", skip)
      )
    )

    /** Search for the Entry item with the matching ID.
      */
    def Entry[A](where: EntryWhereUniqueInput)(
        innerSelection: SelectionBuilder[Entry, A]
    ): SelectionBuilder[RootQuery, Option[A]] = Field(
      "Entry",
      OptionOf(Obj(innerSelection)),
      arguments = List(Argument("where", where))
    )

    /** Perform a meta-query on all Entry items which match the where clause.
      */
    @deprecated(
      "This query will be removed in a future version. Please use entriesCount instead.",
      ""
    )
    def _allEntriesMeta[A](
        where: EntryWhereInput,
        search: Option[String] = None,
        orderBy: List[EntryOrderByInput] = Nil,
        first: Option[Int] = None,
        skip: Int
    )(
        innerSelection: SelectionBuilder[_QueryMeta, A]
    ): SelectionBuilder[RootQuery, Option[A]] = Field(
      "_allEntriesMeta",
      OptionOf(Obj(innerSelection)),
      arguments = List(
        Argument("where", where),
        Argument("search", search),
        Argument("orderBy", orderBy),
        Argument("first", first),
        Argument("skip", skip)
      )
    )
    def entriesCount(
        where: EntryWhereInput
    ): SelectionBuilder[RootQuery, Option[Int]] = Field(
      "entriesCount",
      OptionOf(Scalar()),
      arguments = List(Argument("where", where))
    )

    /** Return <first> search results for <search>, skipping <skip>
      */
    def searchEntries[A](
        search: String,
        where: SearchWhereInput,
        first: Int,
        skip: Int
    )(
        innerSelection: SelectionBuilder[SearchResult, A]
    ): SelectionBuilder[RootQuery, Option[A]] = Field(
      "searchEntries",
      OptionOf(Obj(innerSelection)),
      arguments = List(
        Argument("search", search),
        Argument("where", where),
        Argument("first", first),
        Argument("skip", skip)
      )
    )

    /** Return autocompletion for <search>
      */
    def autocompleteSearchTerm(
        search: String
    ): SelectionBuilder[RootQuery, Option[String]] = Field(
      "autocompleteSearchTerm",
      OptionOf(Scalar()),
      arguments = List(Argument("search", search))
    )

    /** Return suggestions for <search>
      */
    def suggestSearchTerms(
        search: String
    ): SelectionBuilder[RootQuery, Option[List[Option[String]]]] = Field(
      "suggestSearchTerms",
      OptionOf(ListOf(OptionOf(Scalar()))),
      arguments = List(Argument("search", search))
    )
  }

  type Mutation = RootMutation
  object Mutation {

    /** Create a single Url item.
      */
    def createUrl[A](data: Option[UrlCreateInput] = None)(
        innerSelection: SelectionBuilder[Url, A]
    ): SelectionBuilder[RootMutation, Option[A]] = Field(
      "createUrl",
      OptionOf(Obj(innerSelection)),
      arguments = List(Argument("data", data))
    )

    /** Create multiple Url items.
      */
    def createUrls[A](data: Option[List[Option[UrlsCreateInput]]] = None)(
        innerSelection: SelectionBuilder[Url, A]
    ): SelectionBuilder[RootMutation, Option[List[Option[A]]]] = Field(
      "createUrls",
      OptionOf(ListOf(OptionOf(Obj(innerSelection)))),
      arguments = List(Argument("data", data))
    )

    /** Update a single Url item by ID.
      */
    def updateUrl[A](id: String, data: Option[UrlUpdateInput] = None)(
        innerSelection: SelectionBuilder[Url, A]
    ): SelectionBuilder[RootMutation, Option[A]] = Field(
      "updateUrl",
      OptionOf(Obj(innerSelection)),
      arguments = List(Argument("id", id), Argument("data", data))
    )

    /** Update multiple Url items by ID.
      */
    def updateUrls[A](data: Option[List[Option[UrlsUpdateInput]]] = None)(
        innerSelection: SelectionBuilder[Url, A]
    ): SelectionBuilder[RootMutation, Option[List[Option[A]]]] = Field(
      "updateUrls",
      OptionOf(ListOf(OptionOf(Obj(innerSelection)))),
      arguments = List(Argument("data", data))
    )

    /** Delete a single Url item by ID.
      */
    def deleteUrl[A](id: String)(
        innerSelection: SelectionBuilder[Url, A]
    ): SelectionBuilder[RootMutation, Option[A]] = Field(
      "deleteUrl",
      OptionOf(Obj(innerSelection)),
      arguments = List(Argument("id", id))
    )

    /** Delete multiple Url items by ID.
      */
    def deleteUrls[A](ids: Option[List[String]] = None)(
        innerSelection: SelectionBuilder[Url, A]
    ): SelectionBuilder[RootMutation, Option[List[Option[A]]]] = Field(
      "deleteUrls",
      OptionOf(ListOf(OptionOf(Obj(innerSelection)))),
      arguments = List(Argument("ids", ids))
    )

    /** Create a single Source item.
      */
    def createSource[A](data: Option[SourceCreateInput] = None)(
        innerSelection: SelectionBuilder[Source, A]
    ): SelectionBuilder[RootMutation, Option[A]] = Field(
      "createSource",
      OptionOf(Obj(innerSelection)),
      arguments = List(Argument("data", data))
    )

    /** Create multiple Source items.
      */
    def createSources[A](data: Option[List[Option[SourcesCreateInput]]] = None)(
        innerSelection: SelectionBuilder[Source, A]
    ): SelectionBuilder[RootMutation, Option[List[Option[A]]]] = Field(
      "createSources",
      OptionOf(ListOf(OptionOf(Obj(innerSelection)))),
      arguments = List(Argument("data", data))
    )

    /** Update a single Source item by ID.
      */
    def updateSource[A](id: String, data: Option[SourceUpdateInput] = None)(
        innerSelection: SelectionBuilder[Source, A]
    ): SelectionBuilder[RootMutation, Option[A]] = Field(
      "updateSource",
      OptionOf(Obj(innerSelection)),
      arguments = List(Argument("id", id), Argument("data", data))
    )

    /** Update multiple Source items by ID.
      */
    def updateSources[A](data: Option[List[Option[SourcesUpdateInput]]] = None)(
        innerSelection: SelectionBuilder[Source, A]
    ): SelectionBuilder[RootMutation, Option[List[Option[A]]]] = Field(
      "updateSources",
      OptionOf(ListOf(OptionOf(Obj(innerSelection)))),
      arguments = List(Argument("data", data))
    )

    /** Delete a single Source item by ID.
      */
    def deleteSource[A](id: String)(
        innerSelection: SelectionBuilder[Source, A]
    ): SelectionBuilder[RootMutation, Option[A]] = Field(
      "deleteSource",
      OptionOf(Obj(innerSelection)),
      arguments = List(Argument("id", id))
    )

    /** Delete multiple Source items by ID.
      */
    def deleteSources[A](ids: Option[List[String]] = None)(
        innerSelection: SelectionBuilder[Source, A]
    ): SelectionBuilder[RootMutation, Option[List[Option[A]]]] = Field(
      "deleteSources",
      OptionOf(ListOf(OptionOf(Obj(innerSelection)))),
      arguments = List(Argument("ids", ids))
    )

    /** Create a single Language item.
      */
    def createLanguage[A](data: Option[LanguageCreateInput] = None)(
        innerSelection: SelectionBuilder[Language, A]
    ): SelectionBuilder[RootMutation, Option[A]] = Field(
      "createLanguage",
      OptionOf(Obj(innerSelection)),
      arguments = List(Argument("data", data))
    )

    /** Create multiple Language items.
      */
    def createLanguages[A](
        data: Option[List[Option[LanguagesCreateInput]]] = None
    )(
        innerSelection: SelectionBuilder[Language, A]
    ): SelectionBuilder[RootMutation, Option[List[Option[A]]]] = Field(
      "createLanguages",
      OptionOf(ListOf(OptionOf(Obj(innerSelection)))),
      arguments = List(Argument("data", data))
    )

    /** Update a single Language item by ID.
      */
    def updateLanguage[A](id: String, data: Option[LanguageUpdateInput] = None)(
        innerSelection: SelectionBuilder[Language, A]
    ): SelectionBuilder[RootMutation, Option[A]] = Field(
      "updateLanguage",
      OptionOf(Obj(innerSelection)),
      arguments = List(Argument("id", id), Argument("data", data))
    )

    /** Update multiple Language items by ID.
      */
    def updateLanguages[A](
        data: Option[List[Option[LanguagesUpdateInput]]] = None
    )(
        innerSelection: SelectionBuilder[Language, A]
    ): SelectionBuilder[RootMutation, Option[List[Option[A]]]] = Field(
      "updateLanguages",
      OptionOf(ListOf(OptionOf(Obj(innerSelection)))),
      arguments = List(Argument("data", data))
    )

    /** Delete a single Language item by ID.
      */
    def deleteLanguage[A](id: String)(
        innerSelection: SelectionBuilder[Language, A]
    ): SelectionBuilder[RootMutation, Option[A]] = Field(
      "deleteLanguage",
      OptionOf(Obj(innerSelection)),
      arguments = List(Argument("id", id))
    )

    /** Delete multiple Language items by ID.
      */
    def deleteLanguages[A](ids: Option[List[String]] = None)(
        innerSelection: SelectionBuilder[Language, A]
    ): SelectionBuilder[RootMutation, Option[List[Option[A]]]] = Field(
      "deleteLanguages",
      OptionOf(ListOf(OptionOf(Obj(innerSelection)))),
      arguments = List(Argument("ids", ids))
    )

    /** Create a single Tag item.
      */
    def createTag[A](data: Option[TagCreateInput] = None)(
        innerSelection: SelectionBuilder[Tag, A]
    ): SelectionBuilder[RootMutation, Option[A]] = Field(
      "createTag",
      OptionOf(Obj(innerSelection)),
      arguments = List(Argument("data", data))
    )

    /** Create multiple Tag items.
      */
    def createTags[A](data: Option[List[Option[TagsCreateInput]]] = None)(
        innerSelection: SelectionBuilder[Tag, A]
    ): SelectionBuilder[RootMutation, Option[List[Option[A]]]] = Field(
      "createTags",
      OptionOf(ListOf(OptionOf(Obj(innerSelection)))),
      arguments = List(Argument("data", data))
    )

    /** Update a single Tag item by ID.
      */
    def updateTag[A](id: String, data: Option[TagUpdateInput] = None)(
        innerSelection: SelectionBuilder[Tag, A]
    ): SelectionBuilder[RootMutation, Option[A]] = Field(
      "updateTag",
      OptionOf(Obj(innerSelection)),
      arguments = List(Argument("id", id), Argument("data", data))
    )

    /** Update multiple Tag items by ID.
      */
    def updateTags[A](data: Option[List[Option[TagsUpdateInput]]] = None)(
        innerSelection: SelectionBuilder[Tag, A]
    ): SelectionBuilder[RootMutation, Option[List[Option[A]]]] = Field(
      "updateTags",
      OptionOf(ListOf(OptionOf(Obj(innerSelection)))),
      arguments = List(Argument("data", data))
    )

    /** Delete a single Tag item by ID.
      */
    def deleteTag[A](id: String)(
        innerSelection: SelectionBuilder[Tag, A]
    ): SelectionBuilder[RootMutation, Option[A]] = Field(
      "deleteTag",
      OptionOf(Obj(innerSelection)),
      arguments = List(Argument("id", id))
    )

    /** Delete multiple Tag items by ID.
      */
    def deleteTags[A](ids: Option[List[String]] = None)(
        innerSelection: SelectionBuilder[Tag, A]
    ): SelectionBuilder[RootMutation, Option[List[Option[A]]]] = Field(
      "deleteTags",
      OptionOf(ListOf(OptionOf(Obj(innerSelection)))),
      arguments = List(Argument("ids", ids))
    )

    /** Create a single Entry item.
      */
    def createEntry[A](data: Option[EntryCreateInput] = None)(
        innerSelection: SelectionBuilder[Entry, A]
    ): SelectionBuilder[RootMutation, Option[A]] = Field(
      "createEntry",
      OptionOf(Obj(innerSelection)),
      arguments = List(Argument("data", data))
    )

    /** Create multiple Entry items.
      */
    def createEntries[A](data: Option[List[Option[EntriesCreateInput]]] = None)(
        innerSelection: SelectionBuilder[Entry, A]
    ): SelectionBuilder[RootMutation, Option[List[Option[A]]]] = Field(
      "createEntries",
      OptionOf(ListOf(OptionOf(Obj(innerSelection)))),
      arguments = List(Argument("data", data))
    )

    /** Update a single Entry item by ID.
      */
    def updateEntry[A](id: String, data: Option[EntryUpdateInput] = None)(
        innerSelection: SelectionBuilder[Entry, A]
    ): SelectionBuilder[RootMutation, Option[A]] = Field(
      "updateEntry",
      OptionOf(Obj(innerSelection)),
      arguments = List(Argument("id", id), Argument("data", data))
    )

    /** Update multiple Entry items by ID.
      */
    def updateEntries[A](data: Option[List[Option[EntriesUpdateInput]]] = None)(
        innerSelection: SelectionBuilder[Entry, A]
    ): SelectionBuilder[RootMutation, Option[List[Option[A]]]] = Field(
      "updateEntries",
      OptionOf(ListOf(OptionOf(Obj(innerSelection)))),
      arguments = List(Argument("data", data))
    )

    /** Delete a single Entry item by ID.
      */
    def deleteEntry[A](id: String)(
        innerSelection: SelectionBuilder[Entry, A]
    ): SelectionBuilder[RootMutation, Option[A]] = Field(
      "deleteEntry",
      OptionOf(Obj(innerSelection)),
      arguments = List(Argument("id", id))
    )

    /** Delete multiple Entry items by ID.
      */
    def deleteEntries[A](ids: Option[List[String]] = None)(
        innerSelection: SelectionBuilder[Entry, A]
    ): SelectionBuilder[RootMutation, Option[List[Option[A]]]] = Field(
      "deleteEntries",
      OptionOf(ListOf(OptionOf(Obj(innerSelection)))),
      arguments = List(Argument("ids", ids))
    )
    def endSession: SelectionBuilder[RootMutation, Boolean] =
      Field("endSession", Scalar())
  }

}
