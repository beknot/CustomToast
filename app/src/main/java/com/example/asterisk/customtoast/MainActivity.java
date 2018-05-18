package com.example.asterisk.customtoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.click);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = new Toast(MainActivity.this);
                toast.setGravity(Gravity.CENTER,0,120);
                toast.setDuration(Toast.LENGTH_SHORT);
                LayoutInflater inflater = getLayoutInflater();
                View view = inflater.inflate(R.layout.toastlayout,null);
                toast.setView(view);
                toast.show();
            }
        });
    }
}
