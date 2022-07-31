package com.example.arz.Shape;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.arz.R;

public class Square extends AppCompatActivity {

    private EditText EditTextArea;
    private Button calculateAreaBtn;
    private TextView resulteAreaTextView;
    private EditText EditTextEnvironment;
    private Button calculateEnvironmentBtn;
    private TextView resulteEnvironmentTextview;

    int size;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.square_area_environment);

        EditTextArea = findViewById(R.id.EditTextArea);
        calculateAreaBtn = findViewById(R.id.calculateAreaBtn);
        resulteAreaTextView = findViewById(R.id.resulteAreaTextView);

        EditTextEnvironment = findViewById(R.id.EditTextEnvironment);
        calculateEnvironmentBtn = findViewById(R.id.calculateEnvironmentBtn);
        resulteEnvironmentTextview = findViewById(R.id.resulteEnvironmentTextview);


        calculateAreaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                size = Integer.parseInt(EditTextArea.getText().toString());

                Square Square = new Square();
                int result = Square.calculateArea(size);

                resulteAreaTextView.setText(result + "");
            }
        });
        calculateEnvironmentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                size = Integer.parseInt(EditTextEnvironment.getText().toString());

                Square Square = new Square();
                int result = Square.calculateEnvironment(size);

                resulteEnvironmentTextview.setText(result + "");
            }
        });
    }

    public int calculateArea(int size) {
        return size * size;

    }
    public int calculateEnvironment(int size) {
        return size * 4;

    }

}