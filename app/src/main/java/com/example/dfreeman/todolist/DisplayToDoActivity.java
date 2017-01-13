package com.example.dfreeman.todolist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;
import java.text.SimpleDateFormat;

public class DisplayToDoActivity extends AppCompatActivity {

    public static final String EXTRA_TODONO = "toDoNumber";
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_to_do);

        int toDoNo = (Integer)getIntent().getExtras().get(EXTRA_TODONO);

        //Display Name
        TextView name = (TextView)findViewById(R.id.name);
        name.setText(MainActivity.todoItems.get(toDoNo));

        //Display Comp Cal
        TextView completeDate = (TextView) findViewById(R.id.completeDate);
        Calendar completionCalendar = MainActivity.todoCompleteCal.get(toDoNo);
        if (completionCalendar != null) {
            String completeToString = "Completion date: " + sdf.format(MainActivity.todoCompleteCal.get(toDoNo).getTime());
            completeDate.setText(completeToString);
        } else {
            String temp = "No completion date set!";
            completeDate.setText(temp);
        }

        //Display Start Cal
        TextView startDate = (TextView)findViewById(R.id.startDate);
        Calendar startCalendar = MainActivity.todoStartCal.get(toDoNo);
        if (startCalendar != null) {
            String startToString = "Start date: " + sdf.format(MainActivity.todoStartCal.get(toDoNo).getTime());
            startDate.setText(startToString);
        } else {
            String temp = "No start date set!";
            startDate.setText(temp);
        }

        //Display Complete bool
        TextView complete = (TextView)findViewById(R.id.complete);
        String completeAsString = "Task complete: " + String.valueOf(MainActivity.todoComplete.get(toDoNo));
        complete.setText(completeAsString);

        //Display Reminder bool
        TextView hasReminder =(TextView) findViewById(R.id.hasReminder);
        String isReminderAsString = "Task has a reminder: " + String.valueOf(MainActivity.todoReminder.get(toDoNo));
        hasReminder.setText(isReminderAsString);
    }

    public void remove_task(View v) {
        int toDoNo = (Integer)getIntent().getExtras().get(EXTRA_TODONO);
        String name = MainActivity.todoItems.get(toDoNo);
        MainActivity.todoItems.remove(name);
        Toast.makeText(this, "DELETE " + name, Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
