package com.softhans.datatransfer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * 1. Design your xml layout and initialize your TextViews and buttons and other items as always
 * 2. Create a new activity that will receive the data put in. Design the layout as suit.
 * Initialize them as well in the new activity.
 * 3. Set your onclick method for the button/item that transfers the data.
 * 4. Initialize a variable equal to the getText.toString of the data you are about to transfer
 * 5. Create an intent in it that takes us to the target activity. But before your launch the start activity
 * 6. Put and Extra to the intent for the data to carry forward. then startActivity(intent) code
 * 7. In the second Activity, link each textview for data with a setText(getIntent().getStringExtra),
 * and put the name of your data.
 * NB: these names are the names you initialized for your variables in the onclick method
 *
 */

public class MainActivity extends AppCompatActivity {

private EditText myName, myAge, myNationality, myEmail;

private Button saveBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myName = findViewById(R.id.name);
        myAge = findViewById(R.id.age);
        myNationality = findViewById(R.id.nationality);
        myEmail = findViewById(R.id.email);
        saveBtn = findViewById(R.id.save_button);


        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String name =myName.getText().toString();
                String age =myAge.getText().toString();
                String nationality =myNationality.getText().toString();
                String email =myEmail.getText().toString();

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);

                //Put Extra
                intent.putExtra("user_name", name);
                intent.putExtra("user_age", age);
                intent.putExtra("user_nationality", nationality);
                intent.putExtra("user_email", email);


                startActivity(intent);
            }
        });
    }
}
