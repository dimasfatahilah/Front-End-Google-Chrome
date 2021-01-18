package com.example.googleclassroom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageButton kls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        kls = (ImageButton) findViewById(R.id.kelas);

        kls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kelas = new Intent(MainActivity.this, Kelas.class);
                startActivity(kelas);
            }
        });
    }
}
