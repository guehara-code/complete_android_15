package com.example.image2textapp;

import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Activity_scanner extends AppCompatActivity {

    // Widgets
    private ImageView captureIV;
    private TextView resultIV;
    private Button snapBtn, detectBtn;
    private Bitmap imageBitmap;

    static final int REQUEST_IMAGE_CAPTURE = 1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_scanner);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        captureIV = findViewById(R.id.idIVCaptureImage);
        resultIV = findViewById(R.id.idTVDetectedText);
        snapBtn = findViewById(R.id.idButtonSnap);
        detectBtn = findViewById(R.id.idButtonDetect);

        detectBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DetectText();
            }
        });

        snapBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (CheckPermission()) {
                    CaptureImage();
                } else {
                    RequestPermission();
                }
            }
        });

    }

    // Permission methods
    private boolean CheckPermission() {
        int cameraPermission = ContextCompat.checkSelfPermission(getApplicationContext(), CAMERA_SERVICE);
        return cameraPermission == PackageManager.PERMISSION_GRANTED;
    }

    private void RequestPermission() {
        int PERMISSION_CODE = 200;
        ActivityCompat.requestPermissions(this, new String[]{
                android.Manifest.permission.CAMERA
        }, PERMISSION_CODE);
    }

    private void CaptureImage() {

    }


    private void DetectText() {

    }
}