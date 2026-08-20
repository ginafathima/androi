package com.example.validation;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText name, password;
    RadioGroup gender;
    CheckBox terms;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        password = findViewById(R.id.password);
        gender = findViewById(R.id.gender);
        terms = findViewById(R.id.terms);
        submit = findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(name.getText().toString().isEmpty()){
                    name.setError("Enter your name");
                    return;
                }
                if(password.getText().toString().isEmpty()) {
                    password.setError("Enter your password");
                    return;
                }
                if (password.length() < 8){
                    password.setError("Password must contain 8 character");
                    return;
                }

                if (gender.getCheckedRadioButtonId() == -1){
                    Toast.makeText(MainActivity.this,
                            "Select gender",
                            Toast.LENGTH_SHORT).show();
                    return;
                }

                if (!terms.isChecked()){
                    Toast.makeText(MainActivity.this,
                            "Accept terms and conditions",
                            Toast.LENGTH_SHORT).show();
                    return;
                }
                Toast.makeText(MainActivity.this,
                        "Registration successful",
                        Toast.LENGTH_SHORT).show();
            }
        });


    }
}