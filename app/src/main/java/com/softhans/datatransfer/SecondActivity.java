package com.softhans.datatransfer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView txtName, txtAge, txtNationality, txtEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        txtName = findViewById(R.id.nameTxt);
        txtAge = findViewById(R.id.ageTxt);
        txtNationality = findViewById(R.id.nationalityTxt);
        txtEmail = findViewById(R.id.emailTxt);


        txtName.setText(getIntent().getStringExtra("user_name"));
        txtAge.setText(getIntent().getStringExtra("user_age"));
        txtNationality.setText(getIntent().getStringExtra("user_nationality"));
        txtEmail.setText(getIntent().getStringExtra("user_email"));

    }
}
