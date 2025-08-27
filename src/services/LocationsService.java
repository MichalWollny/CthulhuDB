package services;

import java.sql.*;

import models.Gods;
import models.Locations;

public class LocationsService {
    public static void selectLocations()
    {
        try (Connection connection = DatabaseService.getConnection();
             Statement statement = connection.createStatement())
        {
            ResultSet rs = statement.executeQuery("select * from locations");
            while (rs.next())
            {
                int locationId = rs.getInt("location_id");
                String locationName = rs.getString("name");
                String locationRegion = rs.getString("region");

                new Locations(locationId, locationName, locationRegion);
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
}
