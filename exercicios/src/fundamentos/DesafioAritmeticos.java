package fundamentos;

public class DesafioAritmeticos {
	
	public static void main(String[] args) {
		
		int parenteseUm = 6 * (3 + 2);
		double colchetesUm = Math.pow(parenteseUm, 2)/(3*2);
		
		int parenteseDois = (1 - 5) * (2 - 7) /2;
		double potenciaDois = Math.pow(parenteseDois, 2);
		
		double subtracao = Math.pow(colchetesUm - potenciaDois, 3);
		
		double potenciaTres = Math.pow(10, 3);
		
		int divisao = (int) (subtracao / potenciaTres);
		
				
		System.out.println("O resultado é " + divisao);
		
		
	}

}
