package com.example.medi.mediproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ContainerSelectActivity extends BaseActivity {
    private ImageButton imgBtnDiaper;
    private ImageButton imgBtnBottle;
    private ImageButton imgBtnGreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);

        buttonPrev.findViewById(R.id.btnPrev);
        buttonNext.findViewById(R.id.btnNext);

        imgBtnDiaper.findViewById(R.id.imgDiaper);
        imgBtnBottle.findViewById(R.id.imgBottle);
        imgBtnGreen.findViewById(R.id.imgGreen);

        imgBtnDiaper.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intDiaper = new Intent(ContainerSelectActivity.this, PromptDiaperActivity.class);
                startActivity(intDiaper);
            }
        });

        imgBtnBottle.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intBottle = new Intent(ContainerSelectActivity.this, PromptBottleActivity.class);
                startActivity(intBottle);
            }
        });

        imgBtnGreen.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intGreen = new Intent(ContainerSelectActivity.this, PromptGreenActivity.class);
                startActivity(intGreen);
            }
        });
    }

    private void onPrevClick(View view) {

    }

    private void onNextClick(View view) {
        Intent intent = new Intent(ContainerSelectActivity.this, RecordUrineActivity.class);
        startActivity(intent);
    }
}
