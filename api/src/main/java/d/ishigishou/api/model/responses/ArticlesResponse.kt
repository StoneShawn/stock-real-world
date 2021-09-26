package d.ishigishou.api.model.responses


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import d.ishigishou.api.model.entities.Article

@JsonClass(generateAdapter = true)
data class ArticlesResponse(
    @Json(name = "articles")
    val articles: List<Article>,
    @Json(name = "articlesCount")
    val articlesCount: Int
)