//Demostração de Set com dados homogêneos

package Set;

import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
public static void main(String[] args) {
    
    //Definido entra tags o tipo de dado, mas não garante a ordenação
    //Set<String> listaAprovados = new HashSet<>();

    //Garante a ordenação
    SortedSet<String> listaAprovados = new TreeSet<>();

    listaAprovados.add("Ana");
    listaAprovados.add("Carlos");
    listaAprovados.add("Luca");
    listaAprovados.add("Pedro");
    
    for(String candidato: listaAprovados) {
        System.out.println(candidato);
    }

    //Set<int> nums = new HashSet<>(); Não aceita, terira que usar a classe Integer


}
}
