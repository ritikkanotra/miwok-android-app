package com.example.android.miwok;

import android.app.Activity;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mBgColor;

    public WordAdapter(Activity context, ArrayList<Word> numbers, int bgColor) {
        super(context, 0, numbers);
        mBgColor = bgColor;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listView = convertView;
        if(listView == null) {
            listView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        View textContainer = listView.findViewById(R.id.root_linear_layout);
        int color = ContextCompat.getColor(getContext(), mBgColor);


        Word currentWord = getItem(position);
        TextView miwokText = listView.findViewById(R.id.miwok_text_view);
        miwokText.setText(currentWord.getMiwokTranslation());
        textContainer.setBackgroundColor(color);

        TextView defaultText = listView.findViewById(R.id.eng_text_view);
        defaultText.setText(currentWord.getEnglishTranslation());

        ImageView representImage = listView.findViewById(R.id.represent_image);

        if(currentWord.hasImage()) {
            representImage.setImageResource(currentWord.getImageResourceId());
            representImage.setVisibility(View.VISIBLE);
        }
        else {
            representImage.setVisibility(View.GONE);
        }

        return listView;
    }
}
