package com.example.tpsmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ImageButton extends AppCompatActivity {

    //l'image du bouton doit être stocké dans res/drawable sous format jpg ou png
    View imageButton;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_button);

        imageButton = findViewById(R.id.imageButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView = findViewById(R.id.textView);
                textView.setText(R.string.bonjour);
            }
        });

    }
}