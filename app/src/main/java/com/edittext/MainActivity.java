package com.edittext;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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

        try {
            String bigNum = bigNumber.getText().toString();
            String smallNum = smallNumber.getText().toString();

            double big = Double.parseDouble(bigNum);
            double small = Double.parseDouble(smallNum);

            if (view.getId()==R.id.addButtonId){
                double add = big + small;
                result.setText("Results = " + add);
            }

            if (view.getId()==R.id.subButtonId){
                double sum = big + small;
                result.setText("Results = " + sum);
            }

        } catch (Exception e){
            Toast.makeText(MainActivity.this, "Please Enter Number", Toast.LENGTH_SHORT).show();

        }



    }
}