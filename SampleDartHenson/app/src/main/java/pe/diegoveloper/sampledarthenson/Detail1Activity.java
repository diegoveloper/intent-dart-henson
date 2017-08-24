package pe.diegoveloper.sampledarthenson;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.f2prateek.dart.Dart;
import com.f2prateek.dart.InjectExtra;

/**
 * Created by diegoveloper on 8/10/17.
 */

public class Detail1Activity extends Activity{

    @InjectExtra MySerializableObject myObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail1);
        Dart.inject(this);
        showInformation(myObject);
    }

    private void showInformation(MySerializableObject mySerializableObject){
        ((TextView)findViewById(R.id.data)).setText(mySerializableObject.getSomeData());
    }
}
