package online.beiwang.beiwang4android;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
    }

    @Override
    public void onBackPressed() {
        // your code.
        return;
    }
}
