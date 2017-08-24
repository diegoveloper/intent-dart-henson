package pe.diegoveloper.sampledarthenson;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

import com.f2prateek.dart.Dart;
import com.f2prateek.dart.InjectExtra;

/**
 * Created by diegoveloper on 8/10/17.
 */

public class Detail2Activity extends Activity{

    @InjectExtra String name;
    @InjectExtra String lastName;

    @Nullable @InjectExtra String country = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail2);
        Dart.inject(this);
        showInformation(name, lastName, country);
    }
    private void showInformation(String name, String lastName, String country){
        ((TextView)findViewById(R.id.name)).setText(name);
        ((TextView)findViewById(R.id.last_name)).setText(lastName);
        ((TextView)findViewById(R.id.country)).setText(country);
    }
}
