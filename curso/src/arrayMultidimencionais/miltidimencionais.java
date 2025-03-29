package arrayMultidimencionais;

public class miltidimencionais {
    public static void main(String[] args) {
        String[][] ninjas = new String[3][3];
        ninjas[0][0] = "Naruto";
        ninjas[0][1] = "Hinata";
        ninjas[0][2] = "hino";

        ninjas[1][0] = "Sakura";
        ninjas[1][1] = "Sai";
        ninjas[1][2] = "Shino";


        ninjas[2][0] = "Sasuke";
        ninjas[2][1] = "Kabuto";
        ninjas[2][2] = "Tenten";



        for (int i = 0; i < ninjas.length; i++) {
                System.out.print(ninjas[i][1]+ " ");

        }
    }
}
