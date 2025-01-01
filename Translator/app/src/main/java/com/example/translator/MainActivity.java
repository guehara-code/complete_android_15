package com.example.translator;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.mlkit.nl.translate.TranslateLanguage;

public class MainActivity extends AppCompatActivity {

    // Widgets

    private Spinner fromSpinner, toSpinner;
    private EditText sourceEdt;
    private Button btn;
    private TextView translatedTV;

    // Source Array of Strings - Spinners` data
    String[] fromLanguages = {
            "from", "English", "Afrikaans", "Arabic", "Belarusian", "Bengali", "Catalan", "Hindi", "Urdu"
    };

    String[] toLanguages = {
            "to", "English", "Afrikaans", "Arabic", "Belarusian", "Bengali", "Catalan", "Hindi", "Urdu"
    };

    // Permissions
    private static final int REQUEST_CODE = 1;

    String languageCode, fromLanguageCode, toLanguageCode;

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

        fromSpinner = findViewById(R.id.idFromSpinner);
        toSpinner = findViewById(R.id.idToSpinner);
        sourceEdt = findViewById(R.id.idEdtSource);
        btn = findViewById(R.id.button);
        translatedTV = findViewById(R.id.idTvTranslatedTV);

        fromSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                fromLanguageCode = GetLanguageCode(fromLanguages[i]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }

    private String GetLanguageCode(String language) {
        String LanguageCode;

        switch (language) {
            case "English":
                LanguageCode = TranslateLanguage.ENGLISH;
                break;
            case "Afrikaans":
                LanguageCode = TranslateLanguage.AFRIKAANS;
                break;
            case "Arabic":
                LanguageCode = TranslateLanguage.ARABIC;
                break;
            case "Belarusian":
                LanguageCode = TranslateLanguage.BELARUSIAN;
                break;
            case "Bengali":
                LanguageCode = TranslateLanguage.BENGALI;
                break;
            case "Catalan":
                LanguageCode = TranslateLanguage.CATALAN;
                break;
            case "Hindi":
                LanguageCode = TranslateLanguage.HINDI;
                break;
            case "Urdu":
                LanguageCode = TranslateLanguage.URDU;
                break;
            default:
                LanguageCode = "";
        }

        return languageCode;
    }


}