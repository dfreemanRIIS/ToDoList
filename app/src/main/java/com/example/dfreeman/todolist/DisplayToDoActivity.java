package com.example.dfreeman.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
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
        toDoItem toDo = toDoItem.testToDo[toDoNo];  //STILL GRABBING OLD TEST DATA

        TextView name = (TextView)findViewById(R.id.name);
        name.setText(MainActivity.todoItems.get(toDoNo));

        Calendar completionCalendar = toDo.getCompletionCalendar();
        TextView completeDate = (TextView) findViewById(R.id.completeDate);
        if (completionCalendar != null) {
            String completeToString = "Completion date: " + sdf.format(toDo.getCompletionCalendar().getTime());
            completeDate.setText(completeToString);
        } else {
            String temp = "No completion date set!";
            completeDate.setText(temp);
        }

        Calendar startCalendar = toDo.getStartCalendar();
        TextView startDate = (TextView)findViewById(R.id.startDate);
        if (startCalendar != null) {
            String startToString = "Start date: " + sdf.format(toDo.getStartCalendar().getTime());
            startDate.setText(startToString);
        } else {
            String temp = "No start date set!";
            startDate.setText(temp);
        }

        TextView complete = (TextView)findViewById(R.id.complete);
        String completeAsString = "Task complete: " + String.valueOf(toDo.isComplete());
        complete.setText(completeAsString);

        TextView hasReminder =(TextView) findViewById(R.id.hasReminder);
        String isReminderAsString = "Task has a reminder: " + String.valueOf(toDo.isReminder());
        hasReminder.setText(isReminderAsString);
    }
}
