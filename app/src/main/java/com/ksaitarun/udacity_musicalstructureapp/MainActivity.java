package com.ksaitarun.udacity_musicalstructureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the baroque category
        TextView baroque = findViewById(R.id.baroque);

        // Set a click listener on that View
        baroque.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the baroque View is clicked on.
            @Override
            public void onClick(View view) {
                Intent baroqueIntent = new Intent(MainActivity.this, BaroqueActivity.class);
                startActivity(baroqueIntent);
            }
        });
        // Find the View that shows the classical category
        TextView classical = findViewById(R.id.classical);

        // Set a click listener on that View
        classical.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the classical View is clicked on.
            @Override
            public void onClick(View view) {
                Intent classicalIntent = new Intent(MainActivity.this, com.ksaitarun.udacity_musicalstructureapp.ClassicalActivity.class);
                startActivity(classicalIntent);
            }
        });


        // Find the View that shows the romantic category
        TextView romantic = findViewById(R.id.romantic);

        // Set a click listener on that View
        romantic.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the romantic View is clicked on.
            @Override
            public void onClick(View view) {
                Intent romanticlIntent = new Intent(MainActivity.this, RomanticActivity.class);
                startActivity(romanticlIntent);
            }
        });
    }
}
