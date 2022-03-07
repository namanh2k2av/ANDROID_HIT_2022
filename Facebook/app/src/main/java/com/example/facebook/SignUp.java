package com.example.facebook;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.jetbrains.annotations.Nullable;

public class SignUp extends AppCompatActivity {
    TextView login, note;
    EditText name, email, pass, repass;
    Button signup;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        login = findViewById(R.id.login);
        note = findViewById(R.id.note);
        signup = findViewById(R.id.sign_up);
        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        pass = findViewById(R.id.pass);
        repass = findViewById(R.id.repass);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean isWrong = false;
                String password = pass.getText().toString();
                String confirmPassword = repass.getText().toString();
                if(name.getText().toString().trim() == "") {
                    isWrong = true;
                    note.setText("Vui lòng nhập họ và tên");
                } else if(email.getText().toString().trim() == "") {
                    isWrong = true;
                    note.setText("Vui lòng nhập email");
                } else if(password.trim() == "") {
                    isWrong = true;
                    note.setText("Vui lòng nhập mật khẩu");
                } else if(!password.trim().equals(confirmPassword.trim())) {
                    isWrong = true;
                    note.setText("Mật khẩu không khớp");
                }

                if(!isWrong) {
                    Intent intent = new Intent(SignUp.this, Info.class);

                    Account acc = new Account();
                    acc.setEmail(email.getText().toString());
                    acc.setPassword(pass.getText().toString());
                    intent.putExtra("acc", (Parcelable) acc);

                    startActivity(intent);
                }
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignUp.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
