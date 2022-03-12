package com.example.tpsmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HelloWorld extends AppCompatActivity {

    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world);

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView = findViewById(R.id.textView);
                //tv.setText("bonjour tout le monde");

                //utilisation de variable newtext dans le fichier strings.xml au lieu du string a la ligne 25
                textView.setText(R.string.newtext);
            }
        });
    }
}