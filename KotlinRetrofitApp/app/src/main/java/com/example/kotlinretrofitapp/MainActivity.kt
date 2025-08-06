package com.example.kotlinretrofitapp

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.liveData
import retrofit2.Response


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val textView: TextView = findViewById(R.id.textView)

        Log.v("TAGY", "PASS1")


        val retrofitService = RetrofitInstance
            .getRetrofitInstance()
            .create(AlbumService::class.java)

        Log.v("TAGY", "PASS2")
        Log.v("TAGY", "retrofitService" + retrofitService.toString())


        val responseLiveData: LiveData<Response<Albums>> =
            liveData {
                try {
//                    val response = retrofitService.getAlbums()

                    val response2 = retrofitService.getSpecificAlbums(6)
                    emit(response2)
                } catch (e: Exception) {
                    Log.v("TAGY - error", e.toString())
                }
            }
        Log.v("TAGY", "PASS3")
        Log.v("TAGY", "responseLivedata" + responseLiveData.hasObservers().toString())


        responseLiveData.observe(this, Observer {

            val albumsList = it.body()?.listIterator()

            if(albumsList != null) {
                while(albumsList.hasNext()) {
                    val albumItem = albumsList.next()
//                    Log.i("TAGY", albumItem.title)

                    val result = " Album Title: ${albumItem.title} \n"

                    textView.append(result)
                }
            }
        })

    }
}