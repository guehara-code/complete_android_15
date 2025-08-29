package com.example.kotlinretrofitdemoapp

import android.os.Bundle
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

    lateinit var resultTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        resultTextView = findViewById(R.id.textView2)

        val retrofitInstance = RetrofitInstance
            .getRetrofitInstance()
            .create(CompaniesService::class.java)

        val responseLiveData: LiveData<Response<CompaniesList>> =
            liveData {
                val countriesResponse = retrofitInstance.getAllCompanies()
                emit(countriesResponse)
            }

        // Observing data changes in LiveData

        responseLiveData.observe(this, Observer {

            // execute this code when the LiveData`s value changes
            val companiesList = it.body()?.listIterator()
            if(companiesList != null) {
                while (companiesList.hasNext()) {
                    val companyItem = companiesList.next()

                    val companiesResult = " Company Name: ${companyItem.name} \n"
                    resultTextView.append(companiesResult)
                }
            }
        })

    }
}