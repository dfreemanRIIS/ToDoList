package com.example.dfreeman.todolist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.support.v4.app.DialogFragment;
import android.widget.CheckBox;
import android.widget.EditText;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class AddNewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new);
    }

    public void showTimePickerDialog(View v) {
        DialogFragment newFragment = new TimePickerFragment();
        newFragment.show(getSupportFragmentManager(), "timePicker");
    }

    public void showDatePickerDialog(View v) {
        DatePickerFragment.isStartDate = true;
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(), "datePicker");
    }

    public void showBoth(View v) {
        //Make sure we dont offer them a reminder set when they uncheck
        if (((CheckBox) v).isChecked()){
            showDatePickerDialog(v);
            showTimePickerDialog(v);
        }
    }

    public void newToDoDone(View v) {
        //Pass new list item name
        EditText newTaskName = (EditText)findViewById(R.id.enter_name);
        String newTaskNameString = newTaskName.getText().toString();
        MainActivity.todoItems.add(newTaskNameString);

        //Pass in new Start Calendar  MOCK
        Calendar testComp = new GregorianCalendar(2017, 1, 10, 12, 12, 12);
        MainActivity.todoCompleteCal.add(testComp);

        //Pass in new Completion Calendar  MOCK
        //MainActivity.todoStartCal.add(testComp);

        //Pass in new is complete bool  MOCK
        MainActivity.todoComplete.add(false);

        //Pass in new has reminder bool
        CheckBox myCheckbox;
        myCheckbox = (CheckBox) findViewById(R.id.reminderOption);
        if(myCheckbox.isChecked()) {
            MainActivity.todoReminder.add(true);
        } else {
            MainActivity.todoReminder.add(false);
        }

        //Go back to main menu
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}