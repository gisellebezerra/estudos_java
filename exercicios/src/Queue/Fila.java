package Queue;

import java.util.LinkedList;
import java.util.Queue;



public class Fila {

    public static void main(String[] args) {

        //LinkedList: é uma estrutura de dados linear que armazena elementos em locais de memória não contíguos
        Queue<String> fila = new LinkedList<>();

        fila.add("Ana");
        //offer: ser para adicionar, retorna verdadeiro ou falso
        //Diferença entre o offer e add é o comportamento quando a fila está cheia
        fila.offer("Bia");
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Gui");

        //peek() permite ver o valor do item que está no início da fila, sem removê-lo.
        //retorna falso se a fila estiver vazia
        
        //Diferença entre os dois quando a fila está vazia peek retorna nulo e element gera uma excessão informando que a fila está vazia 
        System.out.println(fila.peek());        
        System.out.println(fila.element());
        
        // size(): retorna um número de elementos 
        // clear(): limpar fila 
        // isEmpty(): para saber se a fila está ou não vazia 
        
        //Chama o primeiro elemento da fila e elimina
        //se a fila estiver vazia retorna nulo 
        System.out.println(fila.poll());
        //Faz a mesma coisa do poll
        //remove() se a fila estiver vazia ele joga uma excessão informando que a fila está vazia 
        System.out.println(fila.remove());





        
    }
}
