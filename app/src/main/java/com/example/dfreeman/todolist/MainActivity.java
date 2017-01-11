package com.example.dfreeman.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listToDos = (ListView)findViewById(R.id.toDoList);
        ArrayAdapter<toDoItem> listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, toDoItem.testToDo);
        listToDos.setAdapter(listAdapter);
    }
}
