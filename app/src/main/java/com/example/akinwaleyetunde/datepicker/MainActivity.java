package com.example.akinwaleyetunde.datepicker;

import android.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void SetDate(View v){
        DatePicker newFragment = new DatePicker();
        newFragment.show(getSupportFragmentManager(),
        getString(R.string.date_picker));

    }
    public void SetTime(View v){
        BlankFragment newFragment = new BlankFragment()
                ;
        newFragment.show(getSupportFragmentManager(),
        getString(R.string.time_picker));
    }

    public void DatePickerResult(int year,int month,int day){
        String month_string= Integer.toString(month+1);
        String day_string = Integer.toString(day);
        String year_string= Integer.toString(year);

        String CurrentDate=(day_string + "/" + month_string + "/" + year_string);

        Toast.makeText(this, "Date:" + CurrentDate,Toast.LENGTH_SHORT).show();
    }
    public void TimePickerResult(int hourOfDay, int minute) {

        String hour_string = Integer.toString(hourOfDay);
        String minute_string = Integer.toString(minute);
        String timeMessage = (hour_string + ":" + minute_string);
        Toast.makeText(this,"Time:" +timeMessage,Toast.LENGTH_SHORT).show();
    }
}
