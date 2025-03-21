package GarbageCollector;

public class garbageCollector {
    public static void main(String[] args) {
        String[] hokage = new String[10];
        hokage[0] = "Figurante 1";
        hokage[1] = "Figurante 2";
        hokage[2] = "Figurante 3";
        hokage[3] = "Figurante 4";
        hokage[4] = "Figurante 5";

        hokage = new String[5];
        hokage[0] = "Hashirama";
        hokage[1] = "Tobirama";
        hokage[2] = "Hiruzen";
        hokage[3] = "Minato";
        hokage[4] = "Tsunade";

        for (int i = 0; i < hokage.length ; i++) {
            System.out.println(hokage[i]);
        }

    }
}
