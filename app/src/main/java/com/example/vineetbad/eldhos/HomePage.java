package com.example.vineetbad.eldhos;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class HomePage extends AppCompatActivity {

    Spinner spinner_driving_options;
    ArrayAdapter<CharSequence> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
// setup the spinner below with the array in strings.xml
        spinner_driving_options = (Spinner)findViewById(R.id.driving_options);
        adapter = ArrayAdapter.createFromResource(this, R.array.driving_dropdown_options, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_driving_options.setAdapter(adapter);
        // setup the
        spinner_driving_options.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String driving_options_selected = adapterView.getItemAtPosition(i).toString();
                //Need to create an implement activity that can save something if not then cancel
                AlertDialog.Builder driving_state_change_dialog = new AlertDialog.Builder(HomePage.this);
                //Toast.makeText(adapterView.getContext(), driving_options_selected, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}
