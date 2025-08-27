package models;

import java.util.HashMap;
import java.util.Map;

public class Gods {

    public static final Map<Integer, Gods> gods = new HashMap<>();
    private final int godId;
    private String godName;
    private String godDescription;
    private String godRealm;

    public Gods(int godId, String godName, String godDescription, String godRealm)
    {
        this.godId = godId;
        this.godName = godName;
        this.godDescription = godDescription;
        this.godRealm = godRealm;

        gods.put(godId, this);
    }

    @Override
    public String toString()
    {
        return "ID " + godId + "\n" +
                "Name: " + godName + "\n" +
                "Description: " + godDescription + "\n" +
                "Realm: " + godRealm + "\n";
    }

}
