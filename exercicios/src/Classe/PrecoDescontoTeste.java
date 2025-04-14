package Classe;

public class PrecoDescontoTeste {
    public static void main(String[] args) {

        ProdutoDesconto preco1 = new ProdutoDesconto(100);
        System.out.println(preco1.precoFinal());

        
        //Criando outro objeto com o desconto diferente do padrão       
        ProdutoDesconto preco2 = new ProdutoDesconto(100);
        // preco2.desconto = 0.10;
        ProdutoDesconto.desconto = 0.10;
        System.out.println(preco2.precoFinal());
    }
    
}
