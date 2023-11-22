package com.example.simpleyetcalculator;

import com.example.simpleyetcalculator.R;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnAdd, btnSub, btnMul, btnDiv;
    TextView answerTextView, firstTextView, secondTextView;
    EditText firstEditText, secondEditText;
    int num1, num2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMul = findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv);
        answerTextView = findViewById(R.id.textViewAnswer);
        firstTextView = findViewById(R.id.textViewFirst);
        secondTextView = findViewById(R.id.textViewSecond);
        firstEditText = findViewById(R.id.editTextFirst);
        secondEditText = findViewById(R.id.editTextSecond);
        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnDiv.setOnClickListener(this);

    }

    public int getNumber(EditText editText) {
        if (editText.getText().toString().isEmpty()) {
            Toast.makeText(this, "Please enter a number", Toast.LENGTH_SHORT).show();
            return 0;
        } else {
            return Integer.parseInt(editText.getText().toString());
        }
    }

    @Override
    public void onClick(View view) {
        num1 = getNumber(firstEditText);
        num2 = getNumber(secondEditText);

        if (view.getId() == R.id.btnAdd) {
            answerTextView.setText("Answer is " + (num1 + num2));
        } else if (view.getId() == R.id.btnSub) {
            answerTextView.setText("Answer is " + (num1 - num2));
        } else if (view.getId() == R.id.btnMul) {
            answerTextView.setText("Answer is " + (num1 * num2));
        } else if (view.getId() == R.id.btnDiv) {
            if (num2 != 0) {
                answerTextView.setText("Answer is " + (num1 / num2));
            } else {
                Toast.makeText(this, "Cannot divide by zero", Toast.LENGTH_SHORT).show();
            }
        }
    }
}

/*
Zekarias Aschalew.......2834/13
Alebachew Biyazn........0265/13
Fikradis Geletaw........0094/13
Sewmehon Gelaw..........0211/13
 */