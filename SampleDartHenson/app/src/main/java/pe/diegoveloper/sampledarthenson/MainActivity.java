package pe.diegoveloper.sampledarthenson;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickIntent1(View view){
        Intent intent = new Intent(this, Detail1Activity.class);
        startActivity(intent);
    }

    public void onClickIntent2(View view){
        Intent intent = new Intent(this, Detail2Activity.class);
        startActivity(intent);
    }

    public void onClickIntent3(View view){
        Intent intent = new Intent(this, Detail3Activity.class);
        startActivity(intent);
    }
}
