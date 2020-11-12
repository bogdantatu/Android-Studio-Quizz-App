package com.example.quizzhomework;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Final extends AppCompatActivity {
    List<Boolean> list;
    private int contor = 0;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        Toolbar toolbar = findViewById(R.id.tatu_nicolae_bogdan_toolbar_main);
        TextView toolbartitle = findViewById(R.id.tatu_nicolae_bogdan_toolbar_title);
        toolbartitle.setText(R.string.quiz);

        setSupportActionBar(toolbar);

        Intent i = getIntent();
        list = (List<Boolean>) i.getSerializableExtra("List");

        TextView tv = findViewById(R.id.tatu_nicolae_bogdan_finalTV);

        for(Boolean element: list)
        { if(element == true)
        {
            contor+=1; 
        }
        }

        tv.setText(contor + "/3");

        button =findViewById(R.id.tatu_nicolae_bogdan_btnStart);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });
    }
}