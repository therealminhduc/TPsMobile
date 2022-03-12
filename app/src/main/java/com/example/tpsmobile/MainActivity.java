package com.example.tpsmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview);

        String [] nomExo = new String[] {
                "0. HelloWorld", "1. Cycle d'une activité", "2. ImageButton", "3. Intent", "4. Simple Toast", "5. FrameLayout",
                "6. Weight", "7. Text aléatoire", "8. Login", "9. Personalisé Toast", "10. SeekBar", "11. Simple Liste v1",
                "12. Simple Liste v2", "13. Map", "14. Progress Bar"
        };

        //context = this, ressource = simple_list_item_1 (row layout file in res/layout), textview ressource, list object = string array
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, android.R.id.text1, nomExo);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if (i == 0){
                    Intent intent = new Intent(view.getContext(), HelloWorld.class);
                    startActivity(intent);
                }

                if (i == 1){
                    Intent intent = new Intent(view.getContext(), CycleVie.class);
                    startActivity(intent);
                }

                if (i == 2){
                    Intent intent = new Intent(view.getContext(), ImageButton.class);
                    startActivity(intent);
                }

                if (i == 3){
                    Intent intent = new Intent(view.getContext(), IntentExo.class);
                    startActivity(intent);
                }

                if (i == 4){
                    Intent intent = new Intent(view.getContext(), SimpleToast.class);
                    startActivity(intent);
                }

                if (i == 5){
                    Intent intent = new Intent(view.getContext(), FrameLayoutExo.class);
                    startActivity(intent);
                }

                if (i == 6){
                    Intent intent = new Intent(view.getContext(), Weight.class);
                    startActivity(intent);
                }

                if (i == 7){
                    Intent intent = new Intent(view.getContext(), TextRandom.class);
                    startActivity(intent);
                }

                if (i == 8){
                    Intent intent = new Intent(view.getContext(), Login.class);
                    startActivity(intent);
                }

                if (i == 9){
                    Intent intent = new Intent(view.getContext(), PersonaliseToast.class);
                    startActivity(intent);
                }

                if (i == 10){
                    Intent intent = new Intent(view.getContext(), SeekBarExo.class);
                    startActivity(intent);
                }

                if (i == 11){
                    Intent intent = new Intent(view.getContext(), SimpleListeV1.class);
                    startActivity(intent);
                }

                if (i == 12){
                    Intent intent = new Intent(view.getContext(), SimpleListeV2.class);
                    startActivity(intent);
                }

                if (i == 13){
                    Intent intent = new Intent(view.getContext(), Map.class);
                    startActivity(intent);
                }

                if (i == 14){
                    Intent intent = new Intent(view.getContext(), ProgressBarExo.class);
                    startActivity(intent);
                }


            }
        });


    }



}