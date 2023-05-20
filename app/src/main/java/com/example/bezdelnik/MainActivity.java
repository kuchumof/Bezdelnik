package com.example.bezdelnik;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Random random;
    TextView mainText;
    ArrayList arrayList;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer = MediaPlayer.create(this, R.raw.sound_click);

        mainText = findViewById(R.id.main_text);
        random = new Random();

        arrayList = new ArrayList();

        addTextToArrayList();

        mainText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.start();
                mainText.setText("" + arrayList.get(random.nextInt(arrayList.size())));
            }
        });

    }

    private void addTextToArrayList() {

        arrayList.add(getString(R.string.text_0000));
        arrayList.add(getString(R.string.text_0001));
        arrayList.add(getString(R.string.text_0002));
        arrayList.add(getString(R.string.text_0003));
        arrayList.add(getString(R.string.text_0004));
        arrayList.add(getString(R.string.text_0005));
    }
}