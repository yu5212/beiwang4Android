package online.beiwang.beiwang4android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
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

        Button reg=(Button)findViewById(R.id.btn_reg);
        Button login=(Button)findViewById(R.id.btn_login);

        reg.setOnClickListener(this);
        login.setOnClickListener(this);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar3);
        if(toolbar != null) {
            toolbar.setTitle("用户登录");
        }
    }


    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.btn_reg) {
            Intent intent = new Intent(this, RegActivity.class);
            startActivity(intent);
        }
        else {
            setContentView(R.layout.activity_list);
        }
    }
}
