package Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
public static void main(String[] args) {
    
    //ArrayDeque: implementa uma pilha
    Deque<String> livros = new ArrayDeque<String>();
    
    livros.add("O Pequeno Príncipe");
    livros.push("Don Quixote");
    livros.push("O Hobbit");

    //push : retorna uma excessão referente a capacidadea

    //Retorna sempre o último elemento adicionado
    System.out.println(livros.peek());
    System.out.println(livros.element());
    
    //Remover
    System.out.println(livros.pop());
    System.out.println(livros.poll());

    //size (tamanho)
    //clear (limpar)
    //contains(saber se determinado elemento está contido)
    //isEmpty(saber se a pilha está vazia)

    //Percorrer os elementos da lista
    for(String livro: livros){
        System.out.println(livro);
    }

    }
}
