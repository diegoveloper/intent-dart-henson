package pe.diegoveloper.sampledarthenson;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by diegoveloper on 8/10/17.
 */

public class Detail2Activity extends Activity{

    public static final String PARAM_NAME = "name";
    public static final String PARAM_LAST_NAME = "last_name";
    public static final String PARAM_COUNTRY = "country";

    String name;
    String lastName;
    String country = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail2);
        getDataFromIntent(getIntent());
    }

    private void getDataFromIntent(Intent data){
        name = data.getStringExtra(PARAM_NAME);
        lastName = data.getStringExtra(PARAM_LAST_NAME);
        if (data.hasExtra(PARAM_COUNTRY)){
            country = data.getStringExtra(PARAM_COUNTRY);
        }
        showInformation(name, lastName, country);
    }

    private void showInformation(String name, String lastName, String country){
        ((TextView)findViewById(R.id.name)).setText(name);
        ((TextView)findViewById(R.id.last_name)).setText(lastName);
        ((TextView)findViewById(R.id.country)).setText(country);
    }
}
