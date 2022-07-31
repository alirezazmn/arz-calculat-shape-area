package com.example.arz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.arz.Shape.Circle;
import com.example.arz.Shape.Rectangle;
import com.example.arz.Shape.Square;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_layout_first_layout);
    }

    public void Rectangle(View V) {
        Intent GoActivity = new Intent(MainActivity.this, Rectangle.class);
        startActivity(GoActivity);
        Toast.makeText(getApplicationContext(), "Rectangle", Toast.LENGTH_LONG).show();
    }
    public void Square(View V) {
        Intent GoActivity = new Intent(MainActivity.this, Square.class);
        startActivity(GoActivity);
        Toast.makeText(getApplicationContext(), "Square", Toast.LENGTH_LONG).show();
    }
    public void Circle(View V) {
        Intent GoActivity = new Intent(MainActivity.this, Circle.class);
        startActivity(GoActivity);
        Toast.makeText(getApplicationContext(), "Square", Toast.LENGTH_LONG).show();
    }
}