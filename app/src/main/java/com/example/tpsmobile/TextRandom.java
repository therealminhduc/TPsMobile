package com.example.tpsmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class TextRandom extends AppCompatActivity {
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_random);

        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        String [] name = {"bui", "vu", "minh", "duc"};

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int i = random.nextInt(name.length);
                textView.setText(name[i]);
            }
        });
    }
}