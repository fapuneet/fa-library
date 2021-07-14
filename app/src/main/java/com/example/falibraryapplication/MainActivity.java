package com.example.falibraryapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.myfalibrary.HelloActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(r -> onButtonClick());
    }

    private void onButtonClick() {
        Intent intent = new Intent(MainActivity.this, HelloActivity.class);
        startActivity(intent);
    }
}