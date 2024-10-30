package com.example.practice12;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<State> states = new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        setInitialData();

        RecyclerAddapter adapter = new RecyclerAddapter(this, states);
        recyclerView.setAdapter(adapter);
    }

    private void setInitialData() {
        states.add(new State("Коровы", "классные", R.drawable.dc5f5401c0660b04d6252dd831668fc0));
        states.add(new State("Классные", "коровы", R.drawable.dc5f5401c0660b04d6252dd831668fc0));
        states.add(new State("Коровы", "прикольные", R.drawable.dc5f5401c0660b04d6252dd831668fc0));
        states.add(new State("Прикольные", "коровы", R.drawable.dc5f5401c0660b04d6252dd831668fc0));
    }
}
