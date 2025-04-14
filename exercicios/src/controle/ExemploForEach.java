package controle;

public class ExemploForEach {
	public static void main(String[] args) {
		
		int[] numeros = {1, 2, 3, 4, 10};

		int soma = 0;
		for (int numero : numeros) {
			
			soma += numero; // Adiciona cada número à soma
			if(soma > 15) {
				System.out.println("Soma maior que 15 = " + soma);
			} 
			else {
				System.out.println("Soma menor que 15 = " + soma);
			}
			
		}

	}
}
