package DesafioModulo5;

public class Pessoa {
    
    String nome;
    double peso;

    Pessoa(String nome, double peso){
        this.nome = nome;
        this.peso = peso;
    }
    
    void comer(Comida asteristico){ 
        if (asteristico != null){
            this.peso += asteristico.peso;
        }
    }
}
