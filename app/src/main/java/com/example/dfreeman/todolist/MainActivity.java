package com.example.dfreeman.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.view.View;
import android.content.Intent;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static ArrayList<String> todoItems = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listToDos = (ListView)findViewById(R.id.toDoList);
        EditText myEditText = (EditText) findViewById(R.id.enter_name);
        ArrayAdapter<String> listAdapter;
        listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, todoItems);
        listToDos.setAdapter(listAdapter);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> listView, View v, int position, long id) {
                    Intent intent = new Intent(MainActivity.this, DisplayToDoActivity.class);
                    intent.putExtra(DisplayToDoActivity.EXTRA_TODONO, (int) id);
                    startActivity(intent);
            }
        };
        listToDos.setOnItemClickListener(itemClickListener);
    }

    public void onAddNewActivity(View view) {



        Intent intent = new Intent(this, AddNewActivity.class);
        startActivity(intent);
    }
}
