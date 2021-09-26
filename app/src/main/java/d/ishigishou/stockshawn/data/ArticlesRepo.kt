package d.ishigishou.stockshawn.data

import d.ishigishou.api.StockClient

object ArticlesRepo {
    val api = StockClient.publicApi
//    val authApi = ConduitClient.authApi

    suspend fun getGlobalFeed() = api.getArticles().body()?.articles
//    suspend fun getMyFeed() = authApi.getFeedArticles().body()?.articles
}