package kr.co.company.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv_hello = null, tv_name = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_hello = findViewById(R.id.tv_hello); // R.id.tv_hello 주소값을 넘겨 받는다
        tv_name = findViewById(R.id.tv_name);

        int a = R.string.change;
        tv_hello.setText(R.string.change);
        tv_name.setText("알로항!");
    }
}
