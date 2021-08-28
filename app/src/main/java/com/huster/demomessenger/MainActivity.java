package com.huster.demomessenger;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rvMessage = findViewById(R.id.rvMessage);
        MessageAdapter adapter = new MessageAdapter(Message.getFakeData());
        rvMessage.setAdapter(adapter);
    }
}