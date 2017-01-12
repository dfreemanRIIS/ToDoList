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
        toDoItem toDo = toDoItem.testToDo[toDoNo];

        TextView name = (TextView)findViewById(R.id.name);
        name.setText(toDo.getName());

        Calendar completionCalendar = toDo.getCompletionCalendar();
        TextView completeDate = (TextView) findViewById(R.id.completeDate);
        if (completionCalendar != null) {
            String completeToString = sdf.format(toDo.getCompletionCalendar().getTime());
            completeDate.setText("Completion date: " + completeToString);
        } else {
            completeDate.setText("No completion date set!");
        }

        Calendar startCalendar = toDo.getStartCalendar();
        TextView startDate = (TextView)findViewById(R.id.startDate);
        if (startCalendar != null) {
            String startToString = sdf.format(toDo.getStartCalendar().getTime());
            startDate.setText("Start date: " + startToString);
        } else {
            startDate.setText("No start date set!");
        }

        TextView complete = (TextView)findViewById(R.id.complete);
        String completeAsString = String.valueOf(toDo.isComplete());
        complete.setText("Task complete: " + completeAsString);

        TextView hasReminder =(TextView) findViewById(R.id.hasReminder);
        String isReminderAsString = String.valueOf(toDo.isReminder());
        hasReminder.setText("Task has a reminder: " + isReminderAsString);
    }
}
