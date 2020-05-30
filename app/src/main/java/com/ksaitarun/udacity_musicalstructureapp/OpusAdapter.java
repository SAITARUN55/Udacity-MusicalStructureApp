package com.ksaitarun.udacity_musicalstructureapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class OpusAdapter extends ArrayAdapter<Opus> {
    // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
    // the second argument is used when the ArrayAdapter is populating a single TextView.
    // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
    // going to use this second argument, so it can be any value. Here, we used 0.
    public OpusAdapter (Context context, ArrayList<Opus> object) {
        super(context, 0, object);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Opus} object located at this position in the list
        Opus currentWord= (Opus) getItem(position);

        // Find the TextView in the list_item.xml layout with the ID opus_text_view
        TextView opusTextView = (TextView) listItemView.findViewById(R.id.opus_text_view);
        // Get the name of opus from the current opus object and
        // set this text on the name TextView
        opusTextView.setText(currentWord.getOpus());

        // Find the TextView in the list_item.xml layout with the ID composer_text_view
        TextView composerTextView = (TextView) listItemView.findViewById(R.id.composer_text_view);
        // Get the name of the composer from the current opus object and
        // set this text on the name TextView
        composerTextView.setText(currentWord.getNameOfComposer());

        // Return the whole list item layout (containing 2 TextViews)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
