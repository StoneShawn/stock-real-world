package d.ishigishou.stockshawn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import d.ishigishou.stockshawn.databinding.ActivityMainBinding
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: feedViewModel
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)

        viewModel = ViewModelProvider(this).get(feedViewModel::class.java)



        binding.buttonGOGO.setOnClickListener {
            viewModel.fetchGlobalFeed()
        }



    }
}