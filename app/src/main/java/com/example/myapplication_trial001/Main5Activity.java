package com.example.myapplication_trial001;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class Main5Activity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        //добавляем кнопку назад
        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        Button btnActivityForeGo = findViewById(R.id.btnActivityForeGo);
        btnActivityForeGo.setOnClickListener(this);

        Button btnActivityForeEnd = findViewById(R.id.btnActivityForeEnd);
        btnActivityForeEnd.setOnClickListener(this);


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.home) {
            this.finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnActivityForeGo:
                Intent intent = new Intent(this, Main6Activity.class);
                startActivity(intent);
                break;
            default:
            case R.id.btnActivityForeEnd:
                Intent intent1 = new Intent(this, Main4Activity.class);
                startActivity(intent1);
                break;

        }


    }
}
