package com.example.amuzic_ver_10;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity implements View.OnClickListener {

    ImageButton im1,im2;
    TextView tv_m, tv_h;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        tv_h=findViewById(R.id.tv_health);
        tv_m = findViewById(R.id.tv_music);
        im1 =  findViewById(R.id.img_health);
        im2 = findViewById(R.id.img_music);
        im2.setOnClickListener(this);
        im1.setOnClickListener(this);
        View view = this.getWindow().getDecorView();

        view.setBackgroundColor(0xaaaaaaaa);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.img_music:
                musicPlay();
                break;
            case R.id.img_health:
                healthPlay();
        }
    }

    private void healthPlay() {
        startActivity(new Intent(this, Health_Activity.class));
    }

    private void musicPlay() {
        Intent intent = new Intent(this,PlayYoutubeActivity.class);
        startActivity(intent);

    }
}
