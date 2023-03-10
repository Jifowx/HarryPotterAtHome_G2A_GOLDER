import java.util.ArrayList;
import java.util.List;

public class Game {
    public static void main(String[] args) {
        List<House> houses = new ArrayList<House>();
        houses.add(new House("Gryffindor", 0.5F,1, 1, 1));
        houses.add(new House("Slytherin", 1, 1,1.5F, 1));
        houses.add(new House("Hufflepuff", 1,1,1, 1.5F));
        houses.add(new House("Ravenclaw",1, 1.5F, 1, 1));


    }
}
