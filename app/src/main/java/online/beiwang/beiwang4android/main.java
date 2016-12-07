package online.beiwang.beiwang4android;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txt=(TextView) findViewById(R.id.main_text2);

        String mess = getResources().getString(R.string.main_welcome);

        String[] messages=mess.split("\\|");

        int index=(int)(messages.length*Math.random());
        if(index<0){
            index=0;
        }
        if(index>=messages.length)
        {
            index=messages.length-1;
        }

        txt.setText(messages[index]);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        if (toolbar != null) {
            setSupportActionBar(toolbar);
            getSupportActionBar().setTitle("My custom toolbar!");
            getSupportActionBar().setHomeButtonEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        View view = findViewById(R.id.activity_main);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _gotoLogin();
            }
        });


        //定时进入
        CountDownTimer cdt = new CountDownTimer(1000, 5) {
            @Override
            public void onTick(long millisUntilFinished) {
            }
            @Override
            public void onFinish() {
                _gotoLogin();
            }
        };

        cdt.start();
    }

    void _gotoLogin() {
        Intent intent = new Intent(this, LoginActivity.class);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}
