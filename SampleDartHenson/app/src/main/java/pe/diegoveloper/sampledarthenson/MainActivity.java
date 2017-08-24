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
        MySerializableObject object = new MySerializableObject();
        object.setSomeData("Android 2017-2");
        Intent intent = Henson.with(this)
                .gotoDetail1Activity()
                .myObject(object).build();
        startActivity(intent);
    }

    public void onClickIntent2(View view){
        Intent intent = Henson.with(this)
                .gotoDetail2Activity()
                .lastName("Velasquez")
                .name("Diego").build();
        startActivity(intent);
    }

    public void onClickIntent3(View view){
        Intent intent = Henson.with(this).gotoDetail3Activity() .lastName("Velasquez")
                .name("Diego")
                .country("Peru 2017")
                .build();
        startActivity(intent);
    }
}
