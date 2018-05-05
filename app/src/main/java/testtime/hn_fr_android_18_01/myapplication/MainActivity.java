package testtime.hn_fr_android_18_01.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private void tinhtoan123() {
        Toast.makeText(this,"asdasd",Toast.LENGTH_LONG).show();
        Toast.makeText(this,"sadas",Toast.LENGTH_LONG).show();
        Toast.makeText(this,"thay doi 3",Toast.LENGTH_LONG).show();
        Toast.makeText(this,"thay doi 4",Toast.LENGTH_LONG).show();
    }
}
