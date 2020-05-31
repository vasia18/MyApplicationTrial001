package com.example.myapplication_trial001;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Main6Activity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        Button btnActivitySixGo = findViewById(R.id.btnActivitySixGo);
        btnActivitySixGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main6Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Button btnActivitySixEnd = findViewById(R.id.btnActivitySixEnd);
        btnActivitySixEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main6Activity.this, Main5Activity.class);
                Main6Activity.this.startActivity(intent);

            }
        });

        btnActivitySixGo = findViewById(R.id.btnActivitySixGo);
        btnActivitySixGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main6Activity.this, MainActivity.class);
                Main6Activity.this.startActivity(intent);
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.home) {
            this.finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}