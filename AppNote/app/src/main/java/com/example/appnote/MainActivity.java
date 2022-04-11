package com.example.appnote;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    DataSQLite dataSQLite;
    List<Note> noteList = new ArrayList<>();
    RecyclerView recyclerView;
    NoteAdapter noteAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dataSQLite = new DataSQLite(this, "datanote.sqlite", null, 1);
        dataSQLite.QueryDate("CREATE TABLE IF NOT EXISTS Note(Id INTEGER PRIMARY KEY AUTOINCREMENT, Content VARCHAR(1000))");

        EditText ghichu = findViewById(R.id.ghichu);
        ImageView add = findViewById(R.id.add);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dataSQLite.QueryDate("INSERT INTO Note VALUES (null, '"+ghichu.getText().toString()+"')");
                ghichu.setText("");
                Toast.makeText(MainActivity.this, "Thêm thành công", Toast.LENGTH_SHORT).show();
                getData();
            }
        });
        getData();
    }

    void getData(){
        Cursor cursor = dataSQLite.GetData("SELECT * FROM Note");
        noteList.clear();
        while (cursor.moveToNext()) {
            int id = cursor.getInt(0);
            String content = cursor.getString(1);
            noteList.add(new Note(id, content));
        }
        recyclerView = findViewById(R.id.recy);
        noteAdapter = new NoteAdapter(this, noteList);
        recyclerView.setAdapter(noteAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
    }

    public void xoa(int pos) {
        dataSQLite.QueryDate("DELETE FROM Note WHERE Id ='"+noteList.get(pos).getId()+"'");
        noteList.remove(pos);
        recyclerView.setAdapter(noteAdapter);
    }
}