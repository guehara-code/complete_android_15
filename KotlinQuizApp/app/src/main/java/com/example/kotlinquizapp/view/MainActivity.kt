package com.example.kotlinquizapp.view

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.kotlinquizapp.R
import com.example.kotlinquizapp.databinding.ActivityMainBinding
import com.example.kotlinquizapp.model.Question
import com.example.kotlinquizapp.viewmodel.QuizViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var quizViewModel: QuizViewModel
    lateinit var questionsList: List<Question>

    companion object {
        var result = 0
        var totalQuestions = 0
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        Log.i("TAGY", "passou")
//        setContentView(R.layout.activity_main)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }

        Log.i("TAGY", "passou")

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        // Reseting the scores
        result = 0
        totalQuestions = 0

        // Getting the response
        quizViewModel = ViewModelProvider(this)
            .get(QuizViewModel::class.java)

        // Display the first question
        GlobalScope.launch(Dispatchers.Main) {

            quizViewModel.getQuestionsFromLiveData().observe(this@MainActivity, Observer {
                if(it.size > 0) {
                    questionsList = it
                    Log.i("TAGY", "This is the 1st question: ${questionsList[0]}")

                    binding.apply {
                        txtQuestion.text = questionsList!![0].question
                        radio1.text = questionsList!![0].option1
                        radio2.text = questionsList!![0].option2
                        radio3.text = questionsList!![0].option3
                        radio4.text = questionsList!![0].option4
                    }
                }
            })

        }

        // Adding functionality no next button
        var i = 1
        binding.apply {
            btnNext.setOnClickListener(View.OnClickListener {
                val selectedOption = radioGroup?.checkedRadioButtonId


                if(selectedOption != -1) {
                    val radButton = findViewById<View>(selectedOption!!) as RadioButton
//

                        questionsList.let {
                        if (i < it.size!!) {
                            totalQuestions = it.size
                            if(radButton.text.toString().equals(it[i-1].correct_option)) {
                                result++
                                txtResult?.text = "Correct Answer: $result"
                            }

                            // Displaying the next Questions
                            txtQuestion.text = "Question ${i+1}: " + questionsList[i].question
                            radio1.text = it[i].option1
                            radio2.text = it[i].option2
                            radio3.text = it[i].option3
                            radio4.text = it[i].option4

                            // Checking if it is the last question
                            if(i == it.size!!.minus(1)) {
                                btnNext.text = "FINISH"
                            }

                            radioGroup?.clearCheck()
                            i++
                        } else {
                            if(radButton.text.toString().equals(it[i-1].correct_option)) {
                                result++
                                txtResult?.text = "Correct Answer: $result"
                            } else {

                            }

                            val intent = Intent(this@MainActivity, ResultActivity::class.java)
                            startActivity(intent)
                            finish()
                        }
                    }
                } else {
                    Toast.makeText(this@MainActivity, "Please select on option",
                        Toast.LENGTH_LONG).show()
                }

            })
        }


    }
}