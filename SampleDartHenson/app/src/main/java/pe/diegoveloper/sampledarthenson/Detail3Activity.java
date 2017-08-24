package pe.diegoveloper.sampledarthenson;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.f2prateek.dart.Dart;
import com.f2prateek.dart.HensonNavigable;

/**
 * Created by diegoveloper on 8/10/17.
 */

@HensonNavigable(model = UserModel.class)
public class Detail3Activity extends Activity{

    UserModel userModel = new UserModel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail3);
        Dart.inject(userModel, this);
        showInformation(userModel);
    }

    private void showInformation(UserModel userModel){
        ((TextView)findViewById(R.id.name)).setText(userModel.name);
        ((TextView)findViewById(R.id.last_name)).setText(userModel.lastName);
        ((TextView)findViewById(R.id.country)).setText(userModel.country);
    }
}
