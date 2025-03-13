package com.example.projecttwo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Calendar;


public class weight_entry extends AppCompatActivity {

    protected EditText dateEntry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight_entry);

        dateEntry = findViewById(R.id.editWeightDate);

        dateEntry.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                //calendar.
                final Calendar c = Calendar.getInstance();


                // calendar year, month, date.
                int year = c.get(Calendar.YEAR);
                int month = c.get(Calendar.MONTH);
                int day = c.get(Calendar.DAY_OF_MONTH);

                // I had help with this from the tutoring service, from here down.
                //date picker
                DatePickerDialog datePickerDialog = new DatePickerDialog(
                        weight_entry.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int year,
                                                  int monthOfYear, int dayOfMonth) {
                                // date entered is setting the date to edit text.
                                dateEntry.setText((monthOfYear + 1) + "-" + dayOfMonth  + "-" + year);

                            }
                        },
                        //set the year, month, and date
                        year, month, day);
                // displays the date picker
                datePickerDialog.show();
            }

        });
    }

    public void openMainForm(View view){
        Intent intent = new Intent(this, main_screen.class);
        startActivity(intent);
    }
}