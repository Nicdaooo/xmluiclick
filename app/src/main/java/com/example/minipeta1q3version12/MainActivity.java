package com.example.minipeta1q3version12;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        // Connect XML components
        EditText username = findViewById(R.id.username);
        EditText password = findViewById(R.id.password);
        Button loginButton = findViewById(R.id.loginButton);
        TextView resultText = findViewById(R.id.resultText);

        // Login button function
        loginButton.setOnClickListener(v -> {

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

            } else {

                resultText.setText(R.string.invalid_credentials);

                Toast.makeText(this,
                        R.string.login_failed,
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}