package com.example.dfreeman.todolist;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DisplayToDoActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_display_to_do);
        ListView listView = getListView();
        ArrayAdapter<toDoItem> listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, toDoItem.testToDo);
        listView.setAdapter(listAdapter);
    }
}
