package com.example.th_ltdd_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button subm =(Button) findViewById(R.id.button2);
        View.OnClickListener handler = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view == subm)
                    setContentView(R.layout.activity_main2);
            }
        };
        subm.setOnClickListener(handler);
    }


}