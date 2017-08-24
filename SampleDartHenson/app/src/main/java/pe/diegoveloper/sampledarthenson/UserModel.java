package pe.diegoveloper.sampledarthenson;

import android.support.annotation.Nullable;

import com.f2prateek.dart.InjectExtra;

/**
 * Created by diegoveloper on 8/10/17.
 */

public class UserModel {

     @InjectExtra String name;
     @InjectExtra String lastName;
     @Nullable @InjectExtra String country;
}
