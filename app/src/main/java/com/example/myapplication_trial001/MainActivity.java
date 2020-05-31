package com.example.myapplication_trial001;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//Находим кнопки
        Button btnActivityOneGo_Two = findViewById(R.id.btnActivityOneGo_Two);
        btnActivityOneGo_Two.setOnClickListener(this);

        Button btnActivityOneGo_Free = findViewById(R.id.btnActivityOneGo_Free);
        btnActivityOneGo_Free.setOnClickListener(this);

        Button btnActivityOneGo_Fore = findViewById(R.id.btnActivityOneGo_Fore);
        btnActivityOneGo_Fore.setOnClickListener(this);

        Button btnActivityOneGo_Five = findViewById(R.id.btnActivityOneGo_Five);
        btnActivityOneGo_Five.setOnClickListener(this);

        Button btnActivityOneGo_Six = findViewById(R.id.btnActivityOneGo_Six);
        btnActivityOneGo_Six.setOnClickListener(this);

        Button btnActivityOneGo_Seven = findViewById(R.id.btnActivityOneGo_Seven);
        btnActivityOneGo_Seven.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnActivityOneGo_Two:
                Intent intent = new Intent(this, Main2Activity.class);
                startActivity(intent);
                break;
            case R.id.btnActivityOneGo_Free:
                Intent intent11 = new Intent(this, Main3Activity.class);
                startActivity(intent11);
                break;
            case R.id.btnActivityOneGo_Fore:
                Intent intent22 = new Intent(this, Main4Activity.class);
                startActivity(intent22);
                break;
            case R.id.btnActivityOneGo_Five:
                Intent intent33 = new Intent(this, Main5Activity.class);
                startActivity(intent33);
                break;
            case R.id.btnActivityOneGo_Six:
                Intent intent44 = new Intent(this, Main6Activity.class);
                startActivity(intent44);
                break;
            default:
        }
    }
}
