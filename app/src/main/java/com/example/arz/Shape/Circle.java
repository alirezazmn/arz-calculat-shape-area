package com.example.arz.Shape;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.arz.R;

public class Circle extends AppCompatActivity {

    private EditText EditTextRadiusarea;
    private Button calculateAreaBtn;
    private TextView resulteAreaTextView;
    private EditText EditTextRadiusEnvironment;
    private Button calculateEnvironmentBtn;
    private TextView resulteEnvironmentTextview;

    double radius;
    double radius314;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.circle_area_environment);

        EditTextRadiusarea = findViewById(R.id.EditTextRadiusarea);
        calculateAreaBtn = findViewById(R.id.calculateAreaBtn);
        resulteAreaTextView = findViewById(R.id.resulteAreaTextView);

        EditTextRadiusEnvironment = findViewById(R.id.EditTextRadiusEnvironment);
        calculateEnvironmentBtn = findViewById(R.id.calculateEnvironmentBtn);
        resulteEnvironmentTextview = findViewById(R.id.resulteEnvironmentTextview);


        //3333333
        calculateAreaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                radius = Integer.parseInt(EditTextRadiusarea.getText().toString());

                Circle Circle = new Circle();
                double result = Circle.calculateArea(radius);

                resulteAreaTextView.setText(result + "");
            }
        });
        calculateEnvironmentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                radius = Integer.parseInt(EditTextRadiusEnvironment.getText().toString());

                Circle Circle = new Circle();
                double result = Circle.calculateEnvironment(radius);

                resulteEnvironmentTextview.setText(result + "");
            }
        });


    }

    public double calculateArea(double radius) {
        return 2 * 3.14 * radius;

    }

    public double calculateEnvironment(double radius) {
        return radius * 3.14 * 2;

    }

}