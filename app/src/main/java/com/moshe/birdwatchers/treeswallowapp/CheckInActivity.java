package com.moshe.birdwatchers.treeswallowapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class CheckInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_in);

        // Populate the drop down with available locations
        Spinner spinner = (Spinner) findViewById(R.id.location_spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.locations_array, android.R.layout.simple_spinner_item);
        spinner.setAdapter(adapter);

        // Set a callback for 'Check In' button
        final Button button = (Button) findViewById(R.id.check_in_button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click

                // Get Name
                EditText nameField = (EditText) findViewById(R.id.full_name);
                Log.d("checkinActivity", nameField.getText().toString());

                // Start Box List Activity
                Intent intent = new Intent(CheckInActivity.this, BoxListActivity.class);
                startActivity(intent);
            }
        });
    }
}
