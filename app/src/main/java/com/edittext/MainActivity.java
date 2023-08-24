package com.edittext;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText bigNumber, smallNumber;
    private Button addButton, subButton;
    private TextView result;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bigNumber = findViewById(R.id.bigNumberId);
        smallNumber = findViewById(R.id.smallNumberId);
        addButton = findViewById(R.id.addButtonId);
        subButton = findViewById(R.id.subButtonId);
        result = findViewById(R.id.resultTextViewId);

        addButton.setOnClickListener(this);
        subButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {


    }
}