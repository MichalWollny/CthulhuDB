import models.Locations;
import services.*;
import models.Gods;

public class Main {
    public static void main(String[] args)
    {
        GodsService.selectGods();
        LocationsService.selectLocations();

        for (Gods g : Gods.gods.values())
            System.out.println("\\\\// Gods \\\\//" + "\n" + g + "\n");
        for (Locations l : Locations.locations.values())
            System.out.println("\\\\// Locations \\\\//" + "\n" + l);
    }
}
