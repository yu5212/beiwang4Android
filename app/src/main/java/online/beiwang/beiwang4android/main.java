package online.beiwang.beiwang4android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

public class main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View view=findViewById(R.id.activity_main);



        view.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View view,MotionEvent event) {

                //检查登录状态，如果已登录，则跳转到列表页



                View login=getLayoutInflater().inflate(R.layout.activity_login,null);
                setContentView(login);
                return true;
            }
        });
    }
}
