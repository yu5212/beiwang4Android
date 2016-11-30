package online.beiwang.beiwang4android;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_reg);

        Button reg = (Button) findViewById(R.id.btn_sign_in);
        reg.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        //System.out.print("reg");

        EditText t_email=(EditText)findViewById(R.id.t_email);
        EditText t_psw=(EditText)findViewById(R.id.t_password);
        EditText t_copsw=(EditText)findViewById(R.id.t_confirm_password);

        String email=t_email.getText().toString();
        String password=t_psw.getText().toString();
        String password2=t_copsw.getText().toString();

        if(email.equals("")){
            _message("请输入信箱作为登录帐号");
            return;
        }


        if(password.equals("")||password2.equals("")){
            _message("请输入密码");
            return;
        }

        if(!password.equals(password2))
        {
            _message("输入密码不一致");
            t_psw.setText("");
            t_copsw.setText("");
            return;
        }



        //登录成功
        Intent intent=new Intent(this,ListActivity.class);
        startActivity(intent);
    }

    void _message(String msg)
    {
        Context context = getApplicationContext();
        CharSequence text = msg;
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
