package com.example.practice12;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView nameView = findViewById(R.id.name);
        TextView capitalView = findViewById(R.id.capital);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String capital = intent.getStringExtra("capital");

        nameView.setText(name);
        capitalView.setText(capital);
    }
}
