package com.kevinpeppacomputers.alc4phase1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button about = (Button)findViewById(R.id.aboutAlc);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent aboutalc = new Intent(MainActivity.this,AboutALC.class);
                startActivity(aboutalc);
            }
        });

        Button profile = (Button)findViewById(R.id.myProfile);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myProfile = new Intent(MainActivity.this,MyProfile.class);
                startActivity(myProfile);
            }
        });

    }
}
