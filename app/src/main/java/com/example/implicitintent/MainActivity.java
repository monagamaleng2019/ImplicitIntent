package com.example.implicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.drm.DrmStore;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    Button btncall, btnfriend, btnweb, btnmap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btncall = findViewById(R.id.btncall);
        btnfriend = findViewById(R.id.btncallFreind);
        btnweb = findViewById(R.id.web);
        btnmap = findViewById(R.id.map);

        btncall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent call = new Intent(Intent.ACTION_DIAL);
                startActivity(call);

            }
        });

        btnfriend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            Intent callFreind = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:01017155542"));
            startActivity(callFreind);
            }
        });

        btnweb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent web = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
                startActivity(web);
            }
        });

        btnmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            Intent map = new Intent(Intent.ACTION_VIEW, Uri.parse("gao:0,0?"));
            startActivity(map);


            }
        });



    }
}
