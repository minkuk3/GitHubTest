package kr.co.company.hello;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class test1 extends AppCompatActivity {

    private Button dd1, dd2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test1);

        init();

    }

    public void init() {
        dd1 = findViewById(R.id.btn1);
        dd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //todo
                Toast.makeText(test1.this, "버튼1", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(test1.this,TwoActivity.class);
                startActivity(intent);

            }
        });

        dd2 = findViewById(R.id.btn2);
        dd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(test1.this, "버튼2", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(test1.this,ThreeActivity.class);
                startActivity(intent);
            }
        });
    }
}

