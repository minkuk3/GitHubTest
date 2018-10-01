package kr.co.company.hello;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PrintStarActivity extends AppCompatActivity {

    private EditText Print_Edit;
    private Button Print_btn;
    private TextView Print_btnNm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_print_star);
        getSupportActionBar().setTitle("별찍기");
        init();

        /*ActionBar ab = getSupportActionBar();
        ab.setTitle("aaaa");*/
    }

    private int chekInteger(String v) {
        int result = 0;
        try {
            result = Integer.parseInt(v);
        } catch (Exception e) {
        }
        return result;
    }

    public void init() {
        Print_Edit = findViewById(R.id.Print_Edit);
        Print_btn = findViewById(R.id.Print_btn);
        Print_btnNm = findViewById(R.id.Print_btnNm);

        Print_Edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = Print_Edit.getText().toString();
                int no = chekInteger(value);

                if (no > 0) {
                    String result = "";
                    for (int i = 0; i <= no; i++) {
                        for (int j = 0; j < i; j++) {
                            result += "*";
                        }
                        result += "\n";
                    }
                    Print_btnNm.setText(result);
                }
                Print_Edit.setText("");
            }

        });

    }


}
