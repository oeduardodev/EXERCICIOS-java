package Arrays;

public class array {
    public static void main(String[] args) {
        String[] ninjas = new String[10];
        ninjas[0] = "Naruto";
        ninjas[1] = "Sasuke";
        ninjas[2] = "Kiba";
        ninjas[3] = "Iruka";
        ninjas[4] = "Kakashi";
        ninjas[5] = "Lee";
        ninjas[6] = "Neji";
        ninjas[7] = "Shino";
        ninjas[8] = "Guy";
        ninjas[9] = "Tenten";

        System.out.println(ninjas[0]);

        for (String ninja : ninjas) {
            System.out.println(ninja);
        }

    }
}
