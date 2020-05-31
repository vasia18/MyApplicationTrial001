package com.example.myapplication_trial001;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity implements OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        //добавляем кнопку назад
        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        Button btnActivityFreeGo = findViewById(R.id.btnActivityFreeGo);
        btnActivityFreeGo.setOnClickListener(this);

        Button btnActivityFreeEnd = findViewById(R.id.btnActivityFreeEnd);
        btnActivityFreeEnd.setOnClickListener(this);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {  //Реализация метода
        //для кнопки НАЗАД
        if (item.getItemId() == R.id.home) {
            this.finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnActivityFreeGo:
                Intent intent = new Intent(this, Main4Activity.class);
                startActivity(intent);
                break;
            default:
            case R.id.btnActivityFreeEnd:
                Intent intent1 = new Intent(this, Main2Activity.class);
                startActivity(intent1);
                break;
        }


    }
}
