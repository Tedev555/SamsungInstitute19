package com.tedory.samsunglab1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText userNameEdt;
    EditText passwordEdt;
    Button loginBtn;

    String userStr;
    String passStr;
    String user = "Samsung";
    String pass = "123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        userNameEdt = findViewById(R.id.user_edt);
        passwordEdt = findViewById(R.id.pass_edt);
        loginBtn = findViewById(R.id.login_btn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userStr = userNameEdt.getText().toString();
                passStr = passwordEdt.getText().toString();

//                if (userStr.equals(user) & passStr.equals(pass)) {
                    if (1 == 1) {

                    Intent intent = new Intent(getApplicationContext(),
                            MainActivity.class);
                    intent.putExtra("USERNAME", userStr);
                    startActivity(intent);

                } else {
                    //False
                    Toast.makeText(getApplicationContext(),
                            "Login Failed!",
                            Toast.LENGTH_SHORT).show();
                    userNameEdt.setText("");
                    passwordEdt.setText("");
                }
            }
        });

    }
}
