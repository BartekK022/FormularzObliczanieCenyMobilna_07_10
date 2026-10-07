package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText editTextCena, editTextRabat;
    CheckBox checkBoxCzyRabat;
    Button buttonOblicz;
    TextView textViewWynik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        editTextCena = findViewById(R.id.editTextNumber);
        editTextRabat = findViewById(R.id.editTextNumber2);
        checkBoxCzyRabat = findViewById(R.id.checkBox);
        buttonOblicz = findViewById(R.id.button);
        textViewWynik = findViewById(R.id.textView3);

        buttonOblicz.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (checkBoxCzyRabat.isChecked()) {

                        }
                    }
                }
        );

    }
}