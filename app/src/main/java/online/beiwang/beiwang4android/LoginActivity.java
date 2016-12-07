package online.beiwang.beiwang4android;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.sql.Time;
import java.util.Date;

/**
 * Created by yuying on 2016/11/29.
 */

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);

        View vv = findViewById(R.id.btn_reg);


        Button reg = (Button) vv;
        Button login = (Button) findViewById(R.id.btn_login);

        if (reg != null)
            reg.setOnClickListener(this);

        if (login != null)
            login.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_reg) {
            Intent intent = new Intent(this, RegActivity.class);
            startActivity(intent);
        } else {
            //check login
            Intent intent = new Intent(this, ListActivity.class);
            startActivity(intent);
        }
    }

    long _click=0;

    @Override
    public void onBackPressed() {
        // your code.

        long _current=new Date().getTime();

        if(_current!=_click&&_current-_click<2000)
        {
            finish();
        }
        else {
            _click=_current;
            Context context = getApplicationContext();
            CharSequence text = "再按一次退出当前程序";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
            return;
        }
    }
}
