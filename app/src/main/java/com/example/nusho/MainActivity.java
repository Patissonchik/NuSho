package com.example.nusho;
//Successfully
//You are mistaken in login or password
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnClick(View view) {
        EditText EditText = (EditText) findViewById(R.id.editText3);
        EditText EditText1 = (EditText) findViewById(R.id.editText);
        String a = EditText.getText().toString();
        String b = EditText.getText().toString();
        if (a == "uf_uf" && b == "salamaleykum") {
        }
    }

    public void proverka(String a, String b) {
        if (a == "uf_uf" && b == "salamaleykum") {

        }

    }
}
