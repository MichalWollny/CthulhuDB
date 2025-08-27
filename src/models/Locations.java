package models;

import java.util.HashMap;
import java.util.Map;
public class Locations
{
    public static final Map <Integer, Locations> locations = new HashMap<>();
    private final int locationId;
    private String locationName;
    private String locationRegion;

    public Locations(int locationId, String locationName, String locationRegion)
    {
        this.locationId = locationId;
        this.locationName = locationName;
        this.locationRegion = locationRegion;

        locations.put(locationId, this);
    }

    public int getLocationId(){return locationId;};
    public String getLocationName(){return locationName;};
    public String getLocationRegion(){return locationRegion;};

    @Override
    public String toString()
    {
        return "ID " + locationId +
                "Name: " + locationName  +
                "Region" + locationRegion + "\n";
    }
}
