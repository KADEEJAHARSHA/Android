package com.example.array_adaptor;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import  android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String[] animals={"Lion","Tiger","Elephant","Zebra","Leopard"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.listViewItems);
        ArrayAdapter<String> adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,animals);

        listView.setAdapter(adapter);
        };
    }
