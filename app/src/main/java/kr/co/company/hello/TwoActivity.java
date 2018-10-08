package kr.co.company.hello;

import android.content.res.Configuration;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TwoActivity extends AppCompatActivity {
    MediaPlayer mp = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two2);
        init();
    }

    private void init() {
        getSupportActionBar().setTitle(R.string.title_activity_two);
    }

    public void clkBtn(View v) {
        if (v instanceof Button) {
            Button b = (Button) v;

            switch (b.getId()) {
                case R.id.mister:
                    stop();
                    mp = MediaPlayer.create(TwoActivity.this, R.raw.sondia_my_mister);
                    mp.start();
                    break;

                case R.id.sick:
                    stop();
                    mp = MediaPlayer.create(TwoActivity.this, R.raw.sosick_ne_yo);
                    mp.start();
                    break;

                case R.id.start1:

                    if (mp == null) {
                        return;
                    } else {
                        //멈춘다
                        if (b.getText().toString().equals(getString(R.string.change_start))) {
                            mp.pause();
                            b.setText(R.string.start);
                        } else {
                            // 재생
                            mp.start();
                            b.setText(R.string.change_start);
                        }
                    }
                    break;

                case R.id.stop:
                    stop();
                    break;
            }
        }

    }

    public void stop() {

        if (mp != null) {
            mp.stop();
            mp.release();
            mp = null;
        }

    }
}


