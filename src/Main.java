import services.*;
import models.Gods;

public class Main {
    public static void main(String[] args)
    {
        GodsService.selectGods();

        for (Gods g : Gods.gods.values())
            System.out.println(g);
    }
}