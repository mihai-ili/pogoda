package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    public void perexod (View view) {
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(intent);
        finish();
    }
    public void perexod2 (View view) {
        Intent intent = new Intent(MainActivity.this, MainActivity3.class);
        startActivity(intent);
        finish();
    }
    public void perexod3 (View view) {
        Intent intent = new Intent(MainActivity.this, MainActivity4.class);
        startActivity(intent);
        finish();
    }
    public void perexod4 (View view) {
        Intent intent = new Intent(MainActivity.this, MainActivity5.class);
        startActivity(intent);
        finish();
    }
    public void perexod5 (View view) {
        Intent intent = new Intent(MainActivity.this, MainActivity6.class);
        startActivity(intent);
        finish();
    }
    public void perexod6 (View view) {
        Intent intent = new Intent(MainActivity.this, MainActivity7.class);
        startActivity(intent);
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}