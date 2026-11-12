package com.example.minipeta1q3version12;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);

        Button btnClassList = findViewById(R.id.btn_class_list);
        Button btnAttendanceList = findViewById(R.id.btn_attendance_list);
        Button btnRecordAttendance = findViewById(R.id.btn_record_attendance);
        Button btnExit = findViewById(R.id.btn_exit);

        btnClassList.setOnClickListener(v ->
                Toast.makeText(this, R.string.class_list, Toast.LENGTH_SHORT).show()
        );

        btnAttendanceList.setOnClickListener(v -> {
            Intent intent = new Intent(DashboardActivity.this, AttendanceTrackerActivity.class);
            startActivity(intent);
        });

        btnRecordAttendance.setOnClickListener(v -> {
            Intent intent = new Intent(DashboardActivity.this, AttendanceTrackerActivity.class);
            startActivity(intent);
        });

        btnExit.setOnClickListener(v -> finishAffinity());
    }
}