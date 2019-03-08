package com.example.amuzic_ver_10;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Activity1 extends AppCompatActivity implements View.OnClickListener {

    public static  final  String EXTRA = "key_1";
    EditText edittext;
    Button but1;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        initViews();
        View view = this.getWindow().getDecorView();

        view.setBackgroundColor(0xaaaaaaaa);
    }

    private  void initViews()
    {
        but1 = findViewById(R.id.bt1);
        edittext = findViewById(R.id.editText);
        but1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this,Activity2.class);
        String user_id = edittext.getText().toString();
        intent.putExtra("name",user_id);
        startActivity(intent);
    }

}
