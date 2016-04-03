package com.moshe.birdwatchers.treeswallowapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class BoxEditActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.box_edit_layout);


        // Populate "Bird Taxonomy" drop down
        populateDropDown("bird_taxonomy");

        // Populate "Nest Status" drop down
        populateDropDown("nest_status");

        // Populate "Egg Stage" drop down
        populateDropDown("egg_stage");

        // Populate "Nestling Stage" drop down
        populateDropDown("nestling_stage");

        // Populate "Nearby Species" drop down
        populateDropDown("nearby_species");

        // Populate "Nearby Species Activity" drop down
        populateDropDown("nearby_species_activity");
    }

    private void populateDropDown(String id) {
        int resId = getResources().getIdentifier(id, "id", "com.moshe.birdwatchers.treeswallowapp");
        Spinner spinner = (Spinner) findViewById(resId);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.empty_selection, android.R.layout.simple_spinner_item);
        spinner.setAdapter(adapter);
    }
}
