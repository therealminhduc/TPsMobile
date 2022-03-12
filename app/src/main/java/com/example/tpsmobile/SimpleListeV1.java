package com.example.tpsmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SimpleListeV1 extends AppCompatActivity {
    ListView listView;
    String[] data = new String[]{"Réseaux","Mathématiques","Probabilités Statistiques","Gestion de Projet","Prorammation objet","Anglais","Droit","Expression communication","Stage"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_liste_v1);

        listView = (ListView) findViewById(R.id.listview);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);
        listView.setAdapter(adapter);
    }
}