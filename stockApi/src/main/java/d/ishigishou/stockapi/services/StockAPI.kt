package d.ishigishou.stockapi.services

import d.ishigishou.api.model.responses.ArticlesResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface StockAPI {

    @GET("articles")
    suspend fun getArticles(
        @Query("author") author: String? = null,
        @Query("favourited") favourited: String? = null,
        @Query("tag") tag: String? = null
    ): Response<ArticlesResponse>

}