package com.example.menusystem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText ed1,ed2;
AppCompatButton b1;
String getuname,getpass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=(EditText) findViewById(R.id.uname);
        ed2=(EditText) findViewById(R.id.pass);
        b1=(AppCompatButton) findViewById(R.id.login);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getuname=ed1.getText().toString();
                getpass=ed2.getText().toString();
                if(getuname.equals("admin")&&(getpass.equals("1234")))
                {
                    Toast.makeText(getApplicationContext(),"Authentication Success", Toast.LENGTH_SHORT).show();
                    Intent i=new Intent(getApplicationContext(),MenuActivity.class);
                    startActivity(i);
                }
                else {
                    Toast.makeText(getApplicationContext(), "Authentication Failed", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}