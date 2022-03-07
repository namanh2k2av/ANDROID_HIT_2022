package com.example.facebook;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.jetbrains.annotations.Nullable;

public class Info extends AppCompatActivity {
    TextView email, pass;
    Button logout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info);

        email = findViewById(R.id.emailView);
        pass = findViewById(R.id.passwordView);
        logout = findViewById(R.id.logout);

        Intent intent = getIntent();
        Account acc = intent.getParcelableExtra("acc");
        System.out.println(acc.getEmail());
        System.out.println(acc.getPassword());

        email.setText("Email: " + acc.getEmail());
        pass.setText("Password: " + acc.getPassword());

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Info.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
