package online.beiwang.beiwang4android;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

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
}
