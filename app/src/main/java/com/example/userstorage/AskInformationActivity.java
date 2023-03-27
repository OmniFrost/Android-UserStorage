package com.example.userstorage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;

public class AskInformationActivity extends AppCompatActivity {

    private EditText etName;
    private EditText etSurname;
    private EditText etEmail;
    private RadioGroup rgDegreeProgram;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ask_information);

        etName = findViewById(R.id.etName);
        etSurname = findViewById(R.id.etSurname);
        etEmail = findViewById(R.id.etEmail);
        rgDegreeProgram = findViewById(R.id.rgDegreeProgram);
    }

    public void addUser(View view) {
        String firstName = etName.getText().toString();
        String lastName = etSurname.getText().toString();
        String email = etEmail.getText().toString();
        String degreeProgram = "";



        switch (rgDegreeProgram.getCheckedRadioButtonId()) {
            case R.id.rbTietotekniikka:
                degreeProgram = "Tietotekniikka";
                break;
            case R.id.rbTuotantotalous:
                degreeProgram = "Tuotantotalous";
                break;
            case R.id.rbLaskennallinenTekniikka:
                degreeProgram = "Laskennallinen tekniikka";
                break;
            case R.id.rbSahkotekniikka:
                degreeProgram = "Sähkötekniikka";
                break;
        }

        User newUser = new User(firstName, lastName, email, degreeProgram);
        UserStorage.getInstance().addUser(newUser);


    }

}
