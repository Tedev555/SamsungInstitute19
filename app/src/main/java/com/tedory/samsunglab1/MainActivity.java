package com.tedory.samsunglab1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView mainTv;
    Button calBtn;
    Button openUrlBtn;
    EditText phoneEdt;
    EditText urlEdt;

    String phoneNumber;
    String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainTv = findViewById(R.id.main_tv);
        calBtn = findViewById(R.id.call_btn);
        openUrlBtn = findViewById(R.id.open_url_btn);
        phoneEdt = findViewById(R.id.phone_edt);
        urlEdt = findViewById(R.id.url_edt);

        final Intent intent = getIntent();
        String userName = intent.getStringExtra("USERNAME");
        mainTv.setText("Hello, " + userName);

        calBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                phoneNumber = phoneEdt.getText().toString();

                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + phoneNumber));

                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });

        openUrlBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!urlEdt.getText().toString().isEmpty()) {
                    url = urlEdt.getText().toString();
                    Uri uri = Uri.parse(url);
                    Intent intent2 = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent2);
                } else {
                    //Toast: Please enter URL
                }
            }
        });

    }
}
