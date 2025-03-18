package Repeticoes;

public class lacosDeRepeticao {
    public static void main(String[] args) throws InterruptedException {
        String[] ninjas = {"tsunade", "kakashi", "naruto"};

        for (int i = 0; i < ninjas.length; i++) {
            if (ninjas[i].equals("naruto")) { // Correta comparação de String
                System.out.println(ninjas[i] + " " + i);

            }
        }

        int numeroDeClones = 0;
        int chackra = 140;
        int chackraVermelho = 600;
        int clone = 26;

        while (chackra >= clone) {
            chackra -= clone;
            numeroDeClones++;
            System.out.println("Clone criado️! " + "clones: " + numeroDeClones + " Chakra restante: " + chackra);
            Thread.sleep(200);
        }

        System.out.println("Total de clones criados: " + numeroDeClones + "😎".repeat(numeroDeClones));
        for (int cloneVermelho = 1; chackraVermelho >= clone; cloneVermelho++) {
            chackraVermelho -= clone; // Gasta chakra
            numeroDeClones++; // Conta o clone

            // Exibe cada clone criado
            System.out.println("Clone criado: " + cloneVermelho + "😎".repeat(numeroDeClones) + "Chakra sobrando:" + chackraVermelho);
        }

    }
}
