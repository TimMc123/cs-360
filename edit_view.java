package com.example.projecttwo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class edit_view extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_view);
    }
    public void openWeightForm(View view){
        Intent intent = new Intent(this, weight_entry.class);
        startActivity(intent);
    }
}