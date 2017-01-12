package com.example.dfreeman.todolist;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class DisplayToDoActivity extends AppCompatActivity {

    public static final String EXTRA_TODONO = "toDoNumber";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_to_do);

        int toDoNo = (Integer)getIntent().getExtras().get(EXTRA_TODONO);
        toDoItem toDo = toDoItem.testToDo[toDoNo];

        TextView name = (TextView)findViewById(R.id.name);
        name.setText(toDo.getName());



        //ListView listView = getListView();
        //ArrayAdapter<toDoItem> listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, toDoItem.testToDo);
        //listView.setAdapter(listAdapter);
    }
}
