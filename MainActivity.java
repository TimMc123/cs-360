package com.example.projecttwo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private void loginSuccess(View view){
        Intent intent = new Intent(this, main_screen.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText username =(EditText) findViewById(R.id.textUsername);
        EditText password =(EditText) findViewById(R.id.textPassword);

        Button loginbutton = (Button) findViewById(R.id.buttonLogin);

        // username and password login in credentials, can be changed to anything
        // for this were just using the username and password and our login information.
        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().equals("username") && password.getText().toString().equals("password")){
                    //correct
                    loginSuccess(v);
                }else
                    //incorrect
                    Toast.makeText(MainActivity.this,"Failed to login!!!",Toast.LENGTH_SHORT).show();
            }
        });
    }
}