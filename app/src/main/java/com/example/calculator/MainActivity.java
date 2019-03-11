package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText editText_x1, editText_x2;
    TextView textView_operation, textView_equals, textView_Y;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button plus = findViewById(R.id.plus);
        Button minus = findViewById(R.id.minus);
        Button times = findViewById(R.id.times);
        Button divided_by = findViewById(R.id.divided_by);

        plus.setOnClickListener(this);
        minus.setOnClickListener(this);
        times.setOnClickListener(this);
        divided_by.setOnClickListener(this);

        editText_x1 = (EditText) findViewById(R.id.editText_x1);
        editText_x2 = (EditText) findViewById(R.id.editText_x2);

        textView_operation = (TextView) findViewById(R.id.textView_operation);
        textView_equals = (TextView) findViewById(R.id.textView_equals);
        textView_Y = (TextView) findViewById(R.id.textView_Y);
    }

    public void onClick(View v) {
        double x1 = Float.valueOf(editText_x1.getText().toString());
        double x2 = Float.valueOf(editText_x2.getText().toString());
        double Y = 0;
        String operation = "";

        switch (v.getId()) {

            case R.id.plus:
                operation = "+";
                Y = x1 + x2;
                break;

            case R.id.minus:
                operation = "-";
                Y = x1 - x2;
                break;

            case R.id.times:
                operation = "*";
                Y = x1 * x2;
                break;

            case R.id.divided_by:
                operation = "/";
                Y = x1 / x2;
                break;

            default:
                break;
        }

        textView_operation.setText(operation);
        textView_Y.setText(Double.toString(Y));
    }
}

