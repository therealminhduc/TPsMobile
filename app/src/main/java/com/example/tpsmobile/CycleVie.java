package com.example.tpsmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class CycleVie extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cycle_vie);

        textView = findViewById(R.id.textView2);
        Log.i("onCreate()","onCreate");
        textView.setText("onCreate()\n");
    }
    @Override
    protected void onStart(){
        super.onStart();
        textView.append("onStart()\n");
        Log.i("onStart()", "onStart()");
    }

    protected void onPause(){
        super.onPause();
        textView.append("onPause()\n");
        Log.i("onPause()", "onPause()");
        if(isFinishing()){
            textView.append("... fin");
            Log.i("fin", "FINI");
        }
        else{
            textView.append("... continue");
            Log.i("continue", "CONTINUE");
        }
    }

    protected void onRestart() {
        super.onRestart();
        textView.append("onRestart()\n");
        Log.i("onRestart()", "onRestart()");
    }

    protected void onStop(){
        super.onStop();
        textView.append("onStop()\n");
        Log.i("onStop()", "onStop()");
    }

    protected void onDestroy(){
        super.onDestroy();
        textView.append("onDestroy()\n");
        Log.i("onDestroy()", "onDestroy()");
    }
}