package com.example.amuzic_ver_10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Health_Activity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_);
        textView = findViewById(R.id.H_Tv);
        View view = this.getWindow().getDecorView();
        view.setBackgroundColor(0xaaaaaaaa);
    }
}
