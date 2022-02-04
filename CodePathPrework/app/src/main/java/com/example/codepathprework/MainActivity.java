package com.example.codepathprework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // User can tap a button to change the color of the text
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Change the color of the text
                ((TextView)findViewById(R.id.text)).setTextColor(getResources().getColor(R.color.white));
            }
        });

        // User can tap this button to change the color of the background
        findViewById(R.id.changeBackgroundButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.lightBlue));
            }
        });

        //User will change the text to "Android is Awesome!" when this button is clicked
        findViewById(R.id.changeTextButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((TextView) findViewById(R.id.text)).setText("Android is Awesome!");
            }
        });

        findViewById(R.id.parent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((TextView) findViewById(R.id.text)).setText("Hello from Andres!");
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.lavender));
                ((TextView)findViewById(R.id.text)).setTextColor(getResources().getColor(R.color.black));
            }
        });
    }



}