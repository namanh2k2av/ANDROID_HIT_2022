package com.example.monan;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

public class InfoMonan extends AppCompatActivity {

    ImageView img_infor,exit;
    TextView namemonan, textNL, textCT, textCP;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_monan);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        Bundle bundle = getIntent().getExtras();
        if (bundle == null) {
            return;
        }

        MonAn monAn = (MonAn) bundle.get("monAn");

        img_infor = findViewById(R.id.img_info);
        namemonan = findViewById(R.id.namemonan);
        textNL = findViewById(R.id.textNL);
        textCT = findViewById(R.id.textCT);
        textCP = findViewById(R.id.textCP);
        exit = findViewById(R.id.exit);


        Picasso.get().load(monAn.getAvt()).into(img_infor);
        namemonan.setText(monAn.getMonanname());
        textNL.setText(monAn.getNguyenlieu());
        textCT.setText(monAn.getCongthuc());
        textCP.setText(monAn.getTien());

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InfoMonan.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
