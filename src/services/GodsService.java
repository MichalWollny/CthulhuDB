package services;

import java.sql.*;

import services.DatabaseService;
import models.Gods;

public class GodsService
{
    public static void selectGods()
    {
        try (Connection connection = DatabaseService.getConnection(); Statement statement = connection.createStatement())
        {
            ResultSet rs = statement.executeQuery("select * from gods");
            while (rs.next())
            {
                int godId = rs.getInt("god_id");
                String godName = rs.getString("name");
                String godDescription = rs.getString("description");
                String godRealm = rs.getString("realm");

                new Gods(godId,godName,godDescription,godRealm);
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
}
