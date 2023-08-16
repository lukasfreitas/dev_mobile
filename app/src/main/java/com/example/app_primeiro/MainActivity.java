package com.example.app_primeiro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView count_text;
    int count =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        count_text = findViewById(R.id.count_text);
    }

    public void click(View v){
        count++;
        count_text.setText("Fui Clicado" + count + " vezes");

    }
}