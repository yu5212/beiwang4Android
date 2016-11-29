package online.beiwang.beiwang4android;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class RegActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_reg);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar4);
        if(toolbar != null) {
            toolbar.setTitle("新用户注册");

            //右上角的菜单
            toolbar.inflateMenu(R.menu.back);

            toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                return false;
            }
        });
        }
    }

    @Override
    public void onClick(View v) {

    }
}
