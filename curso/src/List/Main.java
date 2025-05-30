package List;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("naruto");
        ninjasList.add("sasuke");
        ninjasList.add("tobirama");
        System.out.println(ninjasList);

        ninjasList.remove("sasuke");
        System.out.println(ninjasList);

        ninjasList.set(0, "Obito");
        System.out.println(ninjasList);
        System.out.println(ninjasList.size());
    }
}
