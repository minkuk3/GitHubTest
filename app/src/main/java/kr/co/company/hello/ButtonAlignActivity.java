package kr.co.company.hello;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class ButtonAlignActivity extends AppCompatActivity {

    private TextView tv_btn_nm;
    private Button btn_1;
    private Button btn_2;
    private Button btn_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_align);

        tv_btn_nm = findViewById(R.id.tv_btn_nm);
        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
    }

    public void clkBtn1(View v) {
        Button btn = (Button) v;
        tv_btn_nm.setText(btn.getText());

        if (v.getId() == R.id.btn_1) {
            btn_1.setText("1");
            btn_2.setText("0");
            btn_3.setText("0");

        } else if (v.getId() == R.id.btn_2) {
            btn_1.setText("0");
            btn_2.setText("1");
            btn_3.setText("0");

        } else if (v.getId() == R.id.btn_3) {
            btn_1.setText("0");
            btn_2.setText("0");
            btn_3.setText("1");
        }
    }

    public void clkBtn2(View v) {

        tv_btn_nm.setText("버튼2");
    }
}
