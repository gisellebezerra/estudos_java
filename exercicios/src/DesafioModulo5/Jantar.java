package DesafioModulo5;

public class Jantar {
    public static void main(String[] args) {
  

        Comida c1 = new Comida("Pao",0.500);
        Comida c2 = new Comida("Chocolate",0.900);
        
        Pessoa p = new Pessoa("Karol", 50.0);
        
        System.out.printf("Peso %s: %.2f%n", p.nome, p.peso);
        p.comer(c1);
        p.comer(c2);
        System.out.printf("Peso %s: %.2f", p.nome, p.peso);

        }

    
    
}
