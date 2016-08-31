package com.example.bhuvan.rgukt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button= (Button)findViewById(R.id.submit);
    }

    public void submit(View v) {
        Toast.makeText(MainActivity.this, "Welcome to RGUKT-NUZVID", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,welcomescreen.class);
        startActivity(intent);
    }

}
