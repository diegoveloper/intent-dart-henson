package pe.diegoveloper.sampledarthenson;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by diegoveloper on 8/10/17.
 */

public class Detail3Activity extends Activity{

    UserModel userModel = new UserModel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail3);
        showInformation(userModel);
    }

    private void showInformation(UserModel userModel){
        ((TextView)findViewById(R.id.name)).setText(userModel.getName());
        ((TextView)findViewById(R.id.last_name)).setText(userModel.getLastName());
        ((TextView)findViewById(R.id.country)).setText(userModel.getCountry());
    }
}
