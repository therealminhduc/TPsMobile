package com.example.tpsmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class PersonaliseToast extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personalise_toast);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View vp = getLayoutInflater().inflate(R.layout.layout_perso,findViewById(R.id.toastperso));
                TextView tvp = vp.findViewById(R.id.tvp);


                ImageView imageView = (ImageView) vp.findViewById(R.id.imageView);
                imageView.setImageResource(R.drawable.ic_launcher_foreground);
                TextView text = (TextView) vp.findViewById(R.id.tvp);
                text.setText("custom toast");

                Toast toast = new Toast(getApplicationContext());
                toast.setGravity(Gravity.BOTTOM, 0, 0);

                toast.setView(vp);
                toast.show();
            }
        });
    }
}