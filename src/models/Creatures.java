package models;

import java.util.HashMap;
import java.util.Map;

public class Creatures {
    public static final Map<Integer, Creatures> creatures = new HashMap<>();
    private final int creatureId;
    private String creatureName;
    private String creatureDescription;
    private final Locations locations;

    public Creatures(int creatureId, String creatureName, String creatureDescription, Locations locations) {
        this.creatureId = creatureId;
        this.creatureName = creatureName;
        this.creatureDescription = creatureDescription;
        this.locations = locations;

        creatures.put(creatureId, this);
    }

    public int getCreatureId() {
        return creatureId;
    }

    ;

    public String getCreatureName() {
        return creatureName;
    }

    ;

    public String getCreatureDescription() {
        return creatureDescription;
    }

    ;

    public Locations getLocations() {
        return locations;
    }

    ;

    @Override
    public String toString()
    {
        return "ID: " + creatureId + "\n" +
                "Name: " + creatureName + "\n" +
                "Description: " + creatureDescription + "\n" +
                "Origin Location: " + locations + "\n";
    }
}
