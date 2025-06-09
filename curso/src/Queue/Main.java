package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        // Criando a fila de ninjas usando a interface Queue e a implementação LinkedList
        Queue<String> filaDeMissao = new LinkedList<>();

        // Adicionando personagens na fila
        filaDeMissao.add("Naruto Uzumaki");
        filaDeMissao.add("Sasuke Uchiha");
        filaDeMissao.add("Sakura Haruno");
        filaDeMissao.add("Kakashi Hatake");

        // Exibindo a fila
        System.out.println("Fila inicial: " + filaDeMissao);

        // Chamando o próximo ninja para a missão
        String ninjaChamado = filaDeMissao.poll(); // Remove e retorna o primeiro da fila
        System.out.println("Ninja chamado para a missão: " + ninjaChamado);

        // Exibindo a fila após a chamada
        System.out.println("Fila após a chamada: " + filaDeMissao);

        // Espiando o próximo ninja sem remover
        String proximoNinja = filaDeMissao.peek();
        System.out.println("Próximo ninja na fila: " + proximoNinja);
    }
}
