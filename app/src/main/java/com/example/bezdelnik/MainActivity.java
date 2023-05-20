package com.example.bezdelnik;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Random random;

    TextView mainText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainText = findViewById(R.id.main_text);
        random = new Random();

        ArrayList arrayList = new ArrayList();
        arrayList.add(getString(R.string.text_0000));
        arrayList.add(getString(R.string.text_0001));
        arrayList.add(getString(R.string.text_0002));
        arrayList.add(getString(R.string.text_0003));
        arrayList.add(getString(R.string.text_0004));
        arrayList.add(getString(R.string.text_0005));




        mainText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainText.setText("" + arrayList.get(random.nextInt(arrayList.size())));
            }
        });

    }
}