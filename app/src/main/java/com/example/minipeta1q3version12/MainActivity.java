package com.example.minipeta1q3version12;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Connect XML components
        EditText username = findViewById(R.id.username);
        EditText password = findViewById(R.id.password);
        Button loginButton = findViewById(R.id.loginButton);
        Button signInButton = findViewById(R.id.signInButton);
        TextView resultText = findViewById(R.id.resultText);

        // Connect ImageView
        ImageView logoImage = findViewById(R.id.imageView10);

        // Connect ImageView
        ImageView bgImage = findViewById(R.id.imageView2);

        // Helper function for authenticating and navigating
        Runnable handleSignIn = () -> {
            String user = username.getText().toString().trim();
            String pass = password.getText().toString();

            if (user.isEmpty() || pass.isEmpty()) {
                Toast.makeText(this,
                        R.string.please_enter_credentials,
                        Toast.LENGTH_SHORT).show();
            } else if ("admin".equals(user) && "1234".equals(pass)) {
                resultText.setText(R.string.login_successful);
                Toast.makeText(this,
                        getString(R.string.welcome_user, user),
                        Toast.LENGTH_SHORT).show();

                // Transition to Dashboard
                Intent intent = new Intent(MainActivity.this, DashboardActivity.class);
                startActivity(intent);
            } else {
                resultText.setText(R.string.invalid_credentials);
                Toast.makeText(this,
                        R.string.login_failed,
                        Toast.LENGTH_SHORT).show();
            }
        };

        // Login button function
        loginButton.setOnClickListener(v -> handleSignIn.run());

        // Sign In button function -> transition to RegisterActivity
        signInButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
            startActivity(intent);
        });
    }
}