package com.example.quizzhomework;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button mStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.tatu_nicolae_bogdan_toolbar_main);
        TextView toolbartitle = findViewById(R.id.tatu_nicolae_bogdan_toolbar_title);

        toolbar.setTitle("");

        toolbartitle.setText(R.string.app_name);

        setSupportActionBar(toolbar);


        mStart =findViewById(R.id.tatu_nicolae_bogdan_start);

        mStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent i = new Intent(getApplicationContext(), question1.class);
                startActivity(i);
            }
        });




    }


}