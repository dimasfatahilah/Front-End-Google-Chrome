package com.example.googleclassroom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Kelas extends AppCompatActivity {
    ImageButton tgs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kelas);

        tgs = (ImageButton) findViewById(R.id.tugas1);

        tgs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tug = new Intent(Kelas.this, Tenggat.class);
                startActivity(tug);
            }
        });
    }
}
