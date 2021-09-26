package d.ishigishou.stockapi.model.responses


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import d.ishigishou.api.model.entities.Article

@JsonClass(generateAdapter = true)
data class ArticleResponse(
    @Json(name = "article")
    val article: Article
)