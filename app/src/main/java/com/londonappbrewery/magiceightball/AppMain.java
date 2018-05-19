package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class AppMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ballButton = findViewById(R.id.askButton);
        final ImageView ballImage = findViewById(R.id.img_Ball);

        final int[] images = new int[]
                {
                  R.drawable.ball1,
                  R.drawable.ball2,
                  R.drawable.ball3,
                  R.drawable.ball4,
                  R.drawable.ball5
                };

        ballButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ballImage.setImageResource(images[new Random().nextInt(5)]);
            }
        });
    }
}
