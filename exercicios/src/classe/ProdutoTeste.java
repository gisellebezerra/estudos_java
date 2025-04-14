package classe;

public class ProdutoTeste {
	public static void main(String[] args) {

		Produto p1 = new Produto();
		p1.nome = "Tv";
		p1.preco = 2500;
		p1.desconto = 0.25;

		double precoFinal = p1.precoComDesconto();
		System.out.println("O preço final do(a) " + p1.nome + " com desconto é R$ " + String.format("%.2f", precoFinal));

		Produto p2 = new Produto();
		p2.nome = "Celular";
		p2.preco = 1000;
		p2.desconto = 0.10;

		System.out.println("O preço final do(a) " + p2.nome + " com desconto é R$ " + String.format("%.2f", p2.precoComDesconto()) );

	}
}
