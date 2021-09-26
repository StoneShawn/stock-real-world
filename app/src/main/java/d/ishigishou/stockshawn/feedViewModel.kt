package d.ishigishou.stockshawn

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import d.ishigishou.api.model.entities.Article
import d.ishigishou.stockshawn.data.ArticlesRepo
import kotlinx.coroutines.launch

class feedViewModel : ViewModel() {


    private val _feed = MutableLiveData<List<Article>>()
    val feed: LiveData<List<Article>> = _feed

    fun fetchGlobalFeed() = viewModelScope.launch {
        ArticlesRepo.getGlobalFeed()?.let {
            _feed.postValue(it)
        }

    }


}
