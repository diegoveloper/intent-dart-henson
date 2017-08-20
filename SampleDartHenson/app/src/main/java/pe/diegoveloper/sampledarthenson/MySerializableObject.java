package pe.diegoveloper.sampledarthenson;

import java.io.Serializable;

/**
 * Created by diegoveloper on 8/10/17.
 */

public class MySerializableObject implements Serializable {

    private String someData;

    public String getSomeData() {
        return someData;
    }

    public void setSomeData(String someData) {
        this.someData = someData;
    }
}
