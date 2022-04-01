package com.example.myapplication;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity  implements OnItemSelectedListener {

    String[] events = {"_","Event 1","Event 2","Event 3"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spin = findViewById(R.id.spinner);
        spin.setOnItemSelectedListener(this);

        ArrayAdapter ar = new ArrayAdapter(this,android.R.layout.simple_spinner_item,events);
        ar.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(ar);
    }



    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        if(events[i].equals("Event 1")){
            Intent intent=new Intent(this,MainActivity2.class);
            startActivity(intent);

        }
        if(events[i].equals("Event 2")){
            Intent intent=new Intent(this,MainActivity3.class);
            startActivity(intent);

        }
        if(events[i].equals("Event 3")){
            Intent intent=new Intent(this,MainActivity4.class);
            startActivity(intent);

        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}