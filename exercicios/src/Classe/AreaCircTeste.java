package Classe;

public class AreaCircTeste {
    public static void main(String[] args) {
        
       //Objeto 1
        AreaCirc a1 = new AreaCirc(10); 
        // Valor do PI pode ser alterado 
        //a1.pi = 10;
        System.out.println(a1.area());
        // Objeto 2
        AreaCirc a2 = new AreaCirc(5);        
        //a2.pi = 5;
        System.out.println(a2.area());
    }

}
