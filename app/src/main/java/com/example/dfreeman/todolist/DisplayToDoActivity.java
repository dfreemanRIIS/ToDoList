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
        if (completionCalendar != null) {
            TextView completeDate = (TextView) findViewById(R.id.completeDate);
            String completeToString = sdf.format(toDo.getCompletionCalendar().getTime());
            completeDate.setText(completeToString);
        }

        Calendar startCalendar = toDo.getStartCalendar();
        if (startCalendar != null) {
            TextView startDate = (TextView)findViewById(R.id.startDate);
            String startToString = sdf.format(toDo.getStartCalendar().getTime());
            startDate.setText(startToString);
        }

        TextView complete = (TextView)findViewById(R.id.complete);
        String completeAsString = String.valueOf(toDo.isComplete());
        complete.setText(completeAsString);

        TextView hasReminder =(TextView) findViewById(R.id.hasReminder);
        String isReminderAsString = String.valueOf(toDo.isReminder());
        hasReminder.setText(isReminderAsString);
    }
}
