package pe.diegoveloper.sampledarthenson;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by diegoveloper on 8/10/17.
 */

public class Detail1Activity extends Activity{

    public static final String PARAM_OBJECT = "my_object";

    MySerializableObject myObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail1);
        getDataFromIntent(getIntent());
    }

    private void getDataFromIntent(Intent data){
        myObject = (MySerializableObject) data.getSerializableExtra(PARAM_OBJECT);
        showInformation(myObject);
    }

    private void showInformation(MySerializableObject mySerializableObject){
        ((TextView)findViewById(R.id.data)).setText(mySerializableObject.getSomeData());
    }
}
