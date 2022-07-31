package com.example.arz.Shape;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.arz.R;

public class Rectangle extends AppCompatActivity {

    int length;
    int width;

    private EditText EditTextLengthArea;
    private EditText EditTextWidthArea;
    private Button calculateAreaBtn;
    private TextView resulteAreaTextView;
    private EditText EditTextLengthEnvironment;
    private EditText EditTextWidthEnvironment;
    private Button calculateEnvironmentBtn;
    private TextView resulteEnvironmentTextview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rectangle_area_environment);


        EditTextLengthArea = findViewById(R.id.EditTextLengthArea);
        EditTextWidthArea = findViewById(R.id.EditTextWidthArea);
        calculateAreaBtn = findViewById(R.id.calculateAreaBtn);
        resulteAreaTextView = findViewById(R.id.resulteAreaTextView);


        EditTextLengthEnvironment = findViewById(R.id.EditTextLengthEnvironment);
        EditTextWidthEnvironment = findViewById(R.id.EditTextWidthEnvironment);
        calculateEnvironmentBtn = findViewById(R.id.calculateEnvironmentBtn);
        resulteEnvironmentTextview = findViewById(R.id.resulteEnvironmentTextview);

        calculateAreaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                length = Integer.parseInt(EditTextLengthArea.getText().toString());
                width = Integer.parseInt(EditTextWidthArea.getText().toString());

                Rectangle rectangle1 = new Rectangle();
                int result = rectangle1.calculateArea(length,width);

                resulteAreaTextView.setText(result + "");

            }
        });


        calculateEnvironmentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                length = Integer.parseInt(EditTextLengthEnvironment.getText().toString());
                width = Integer.parseInt(EditTextWidthEnvironment.getText().toString());

                Rectangle rectangle1 = new Rectangle();
                int result = rectangle1.calculateEnvironment(length,width);

                resulteEnvironmentTextview.setText(result + "");

            }
        });
    }

    public int calculateArea(int Length,int Width) {
        return Length * Width;

    }
    public int calculateEnvironment(int length,int width) {
        return (length + width) * 2;
    }
}
