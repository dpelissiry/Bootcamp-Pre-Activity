package com.example.bootcamppreactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //button
        //String[] colors = {"white","purple_700", "teal_200"};
        //Random rand = new Random();
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //change text color of label
                //int random_color = rand.nextInt(2);
                ((TextView) findViewById(R.id.text)).setTextColor(getResources().getColor(R.color.white));
            }
        });
    }
}