package com.example.tpsmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FrameLayoutExo extends AppCompatActivity {
    Button button1;
    Button button2;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_layout_exo);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);

        button1.setVisibility(View.VISIBLE);
        button2.setVisibility(View.INVISIBLE);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView = findViewById(R.id.textView);
                textView.setText("Bouton 1 appuye");
                button2.setVisibility(view.VISIBLE);
                button1.setVisibility(view.INVISIBLE);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView = findViewById(R.id.textView);
                textView.setText("Bouton 2 appuye");
                button1.setVisibility(view.VISIBLE);
                button2.setVisibility(view.INVISIBLE);
            }
        });

    }
}