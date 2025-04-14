package Classe;

public class ProdutoDesconto {

    double preco;
    static double desconto = 0.25;

    ProdutoDesconto(double precoInicial){
        preco = precoInicial;
    }

    double precoFinal(){
        return preco - (preco * desconto);
    }
    
}
