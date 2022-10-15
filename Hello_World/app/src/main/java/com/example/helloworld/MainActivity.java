package com.example.helloworld;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView firstNameView = findViewById(R.id.txtFirstNameView);
    TextView secondNameView = findViewById(R.id.txtSecondNameView);
    TextView emailView = findViewById(R.id.txtEmailView);
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstNameView.setText("");
        secondNameView.setText("");
        emailView.setText("");
    }
    public void registerUser(View view){
        EditText firstNameInput = findViewById(R.id.txtFirstNameInput);
        EditText secondNameInput = findViewById(R.id.txtSecondNameInput);
        EditText emailInput = findViewById(R.id.txtemailInput);

        firstNameView.setText(firstNameInput.getText().toString());
        secondNameView.setText(secondNameInput.getText().toString());
        emailView.setText(emailInput.getText().toString());
    }
}
