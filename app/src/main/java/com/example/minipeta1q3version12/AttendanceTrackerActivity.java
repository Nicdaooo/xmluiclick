package com.example.minipeta1q3version12;

import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class AttendanceTrackerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attendancetracker);

        Button btnBackDashboard = findViewById(R.id.btn_back_dashboard);
        btnBackDashboard.setOnClickListener(v -> finish());
    }
}