package com.example.quizzhomework;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class question1 extends AppCompatActivity {
private TextInputEditText text;
    private Button button;
   List<Boolean> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);

        Toolbar toolbar = findViewById(R.id.tatu_nicolae_bogdan_toolbar_main);
        TextView toolbartitle = findViewById(R.id.tatu_nicolae_bogdan_toolbar_title);
        toolbartitle.setText(R.string.quiz);

        setSupportActionBar(toolbar);

        list = new ArrayList<>();

        text = findViewById(R.id.tatu_nicolae_bogdan_tiet1);




        button =findViewById(R.id.tatu_nicolae_bogdan_qbtn1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println(text.getText().toString());
                System.out.println(getString(R.string.a_1));
                if (text.getText().toString().equals(getString(R.string.a_1))) {
                    list.add(true);
                } else {
                    list.add(false);
                }
                System.out.println(list);
                Intent i = new Intent(getApplicationContext(), question2.class);
                i.putExtra("List", (Serializable) list);
                startActivity(i);
            }
        });

    }
}