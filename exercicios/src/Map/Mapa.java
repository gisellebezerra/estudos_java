package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

    public static void main(String[] args) {
        
        Map<Integer, String> usuarios = new HashMap<>();

        //Adicioa e Substitui
        //Não utiliza o Método add no Map
        usuarios.put(1, "Roberto");
        usuarios.put(2, "Ricardo");
        usuarios.put(3, "Rafaela");
        usuarios.put(4, "Rebeca");

        //Retorna todas as chaves do Map
        System.out.println(usuarios.keySet());
                
        //Retorna todos os valores do Map
        System.out.println(usuarios.values());
        
        //Retorna todos os valores e chaves do Map
        System.out.println(usuarios.entrySet());
        
        //Verificar se o valor ou a chave estão contodos no Map
        System.out.println(usuarios.containsKey(1));
        System.out.println(usuarios.containsValue("Rebeca"));
        
        //Pegar o valor pela chave
        System.out.println(usuarios.get(1));
        
        //Remover elementos
        System.out.println(usuarios.remove(1));
        System.out.println(usuarios.remove(1, "Roberto"));

        for(int chave: usuarios.keySet()){
            System.out.println(chave);
        }
        
        for(String valor: usuarios.values()){
            
            System.out.println(valor);
        }

        //A única forma de percorrer o dois elementos ao mesmo tempo (chave e valor)
        
        for (Entry<Integer, String> registro: usuarios.entrySet()){
            System.out.println(registro.getKey());
            System.out.println(registro.getValue());
        }
    }
}
