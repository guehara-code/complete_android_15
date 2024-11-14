package com.example.thequizapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.thequizapp.databinding.ActivityMainBinding;
import com.example.thequizapp.model.Question;
import com.example.thequizapp.model.QuestionList;
import com.example.thequizapp.viewmodel.QuizViewModel;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    QuizViewModel quizViewModel;
    List<Question> questionList;

    static int result = 0;
    static int totalQuestions = 0;
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Log.v("MyActivity", "start" );

        binding = DataBindingUtil.setContentView(
                this,
                R.layout.activity_main
        );

        Log.v("MyActivity", "DataBinding OK");
        result = 0;
        totalQuestions = 0;

        quizViewModel = new ViewModelProvider(this).get(QuizViewModel.class);
        Log.v("MyActivity", "QuizModel OK" );

        DisplayFirstQuestion();

        binding.btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplayNextQuestion();
            }
        });
    }

    public void DisplayFirstQuestion() {
        quizViewModel.getQuestionListLiveData().observe(
                this,
                new Observer<QuestionList>() {

                    @Override
                    public void onChanged(QuestionList questions) {
                        questionList = questions;
                        binding.txtQuestion.setText("Question 1: " + questions.get(0).getQuestion());
                        binding.radio1.setText(questions.get(0).getOption1());
                        binding.radio2.setText(questions.get(0).getOption2());
                        binding.radio3.setText(questions.get(0).getOption3());
                        binding.radio4.setText(questions.get(0).getOption4());
                    }
                }
        );
    }

    public void DisplayNextQuestion() {

        if(binding.btnNext.getText().equals("Finish")) {
            Intent i = new Intent(MainActivity.this, ResultsActivity.class);
            startActivity(i);
            finish();
        }

        int selectedOption = binding.radioGroup.getCheckedRadioButtonId();
        Log.v("MyActivity", "RadioId=" + selectedOption);
        if(selectedOption != -1) {
            Log.v("MyActivity", "result=" + result);
            RadioButton radioButton = findViewById(selectedOption);

            if((questionList.size() - i) > 0) {
                totalQuestions = questionList.size();
                Log.v("MyActivity", "radioTxt=" + radioButton.getText().toString());
                Log.v("MyActivity", "CorrectAns=" + questionList.get(i).getCorrectOption());
                if(radioButton.getText().toString().equals(
                        questionList.get(i).getCorrectOption()
                )) {
                    result++;
                    Log.v("MyActivity", "result=" + result);
                    binding.txtResult.setText(
                            "Correct Answers: " + result
                    );
                }

                if(i == 0) {
                    i++;
                }

                binding.txtQuestion.setText("Question " + (i + 1) + " : " +
                        questionList.get(i).getQuestion());

                binding.radio1.setText(questionList.get(i).getOption1());
                binding.radio2.setText(questionList.get(i).getOption2());
                binding.radio3.setText(questionList.get(i).getOption3());
                binding.radio4.setText(questionList.get(i).getOption4());

                if(i == (questionList.size() - 1)) {
                    binding.btnNext.setText("Finish");
                }

                binding.radioGroup.clearCheck();
                i++;
            } else {
                if(radioButton.getText().toString().equals(
                        questionList.get(i - 1).getCorrectOption()
                )) {
                    result++;
                    Log.v("MyActivity", "result=" + result);
                    binding.txtResult.setText("Correct Answers: " + result);
                }
            }
        } else {
            Toast.makeText(
                    this,
                    "You need to make a selection",
                    Toast.LENGTH_SHORT).show();
        }
    }
}