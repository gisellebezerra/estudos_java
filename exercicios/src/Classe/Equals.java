package Classe;

public class Equals {

    public static void main(String[] args) {
        
        Usuario u1 = new Usuario();
        u1.nome = "Ana Silva";
        u1.email = "ana@";
        u1.idade ="20 anos";
        
        Usuario u2 = new Usuario();
        u2.nome = "Ana Silva";
        u2.email = "ana@";
        u2.idade ="20 anos";
        
        System.out.println(u1.equals(u2));
                        
    }

}
