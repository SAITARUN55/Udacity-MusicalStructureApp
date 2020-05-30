package com.ksaitarun.udacity_musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class BaroqueActivity extends AppCompatActivity implements ListView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play_list);


        // Create an array of opuses.
        ArrayList<Opus> opuses = new ArrayList<Opus>();

        // Adding opuses to an array.
        opuses.add(new Opus("Handel",
                "Water Music, Suite No. 3 in G major, Minuet I, II."));
        opuses.add(new Opus("Pachelbel",
                "Canon in D Major"));
        opuses.add(new Opus("Rameau",
                "Suite en la Gavotte et six Doubles"));
        opuses.add(new Opus("Pergolesi",
                "Stabat Mater Dolorosa "));
        opuses.add(new Opus("Purcell",
                "The Cold Song"));
        opuses.add(new Opus("Telemann",
                "Concerto in E major for flute, oboe d'amore, viola d'amore & strings"));
        opuses.add(new Opus("Vinci",
                "In braccio a mille furie (Semiramide riconosciuta)"));
        opuses.add(new Opus("Leo",
                "Mesero pargoletto (Demofoonte)"));
        opuses.add(new Opus("Porpora",
                "Passaggier che sulla sponda (Semiramide riconosciuta)"));
        opuses.add(new Opus("Lully",
                "Marche pour la cérémonie des Turcs"));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        OpusAdapter adapter = new OpusAdapter(this, opuses);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // play_list file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);

        // Set OnClickListener on ListView to identify the item on ListView clicked by user
        // Text on the ListView item clicked is passed on to PlayerActivity
        listView.setOnItemClickListener(this);
    }

    /**
     * Method to identify ListView item clicked and launch PlayerActivity
     */
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
        // Get the selected opus.
        Opus currentOpus = (Opus) adapterView.getItemAtPosition(position);

        // Extract strings from Opus object.
        String opusForPlaying = currentOpus.getOpus();
        String composerForPlaying = currentOpus.getNameOfComposer();

        // Sending the name of composer and his opus to PlayerActivity.
        Intent opusIntent = new Intent(this, PlayerActivity.class);
        opusIntent.putExtra("opus", opusForPlaying);
        opusIntent.putExtra("composer", composerForPlaying);
        startActivity(opusIntent);
    }
}
