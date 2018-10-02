package kr.co.company.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ThreeActivity extends AppCompatActivity {

    private EditText et_no1, et_no2;
    private TextView tv_no1, tv_no2, tv_no3;
    private Button btn_c, enter;
    /*나누기*/ /*곱하기*/ /*빼기*/ /*더하기*/
    private Button btn_d, btn_mu, btn_mi, btn_p;
    private Button btn_no0, btn_no9, btn_no8, btn_no7, btn_no6, btn_no5, btn_no4, btn_no3, btn_no2, btn_no1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);

        init();
        /*
        LinearLayout manager = (LinearLayout)findViewById(R.id.LayoutManager);
        manager.setOrientation(LinearLayout.HORIZONTAL);*/
    }

    private void init() {
        getSupportActionBar().setTitle("계산기");

        et_no1 = findViewById(R.id.et_no1);
        et_no1.setShowSoftInputOnFocus(false);

        et_no2 = findViewById(R.id.et_no2);
        et_no2.setShowSoftInputOnFocus(false);

        tv_no1 = findViewById(R.id.tv_no1);
        tv_no2 = findViewById(R.id.tv_no2);
        tv_no3 = findViewById(R.id.tv_no3);

    }

    public void clkDiv(View v) {
        if (v instanceof Button) {
            Button b = (Button) v;
            String str = b.getText().toString(); // + - 담겨두는

            if (str.equals("c")) {
                et_no1.setText(null);
                et_no2.setText(null);
                tv_no1.setText(null);
                tv_no3.setText(null);

            } else {
                tv_no1.setText(str);
            }


        }

    }


}
