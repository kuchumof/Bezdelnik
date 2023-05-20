package com.example.bezdelnik;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView mainText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainText = findViewById(R.id.main_text);

        ArrayList arrayList = new ArrayList();
        arrayList.add("Text 1");
        arrayList.add("Text 2");
        arrayList.add("Text 3");
        arrayList.add("Text 4");
        arrayList.add("Text 5");

        mainText.setText(""+arrayList.get(3));
    }
}