package com.example.myapplication_trial001;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //кнопка назад
        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        Button btnActivityTwoGo = findViewById(R.id.btnActivityTwoGo);
        btnActivityTwoGo.setOnClickListener(this);

        Button btnActivityTwoEnd = findViewById(R.id.btnActivityTwoEnd);
        btnActivityTwoEnd.setOnClickListener(this);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {   //Реализация метода для кнопки назад
        if (item.getItemId() == R.id.home) {
            this.finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnActivityTwoGo:
                Intent intent = new Intent(this, Main3Activity.class);
                startActivity(intent);
                //Напишим переход на другое Activity
                break;
            default:
            case R.id.btnActivityTwoEnd:
                Intent intent1 = new Intent(this, MainActivity.class);
                startActivity(intent1);
                break;
        }


    }
}
