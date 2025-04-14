package fundamentos;

public class OperadorTernario {
	public static void main(String[] args) {
		
		double media = 8.6;
		
		//Operador Ternário
		String resultado = media > 7.5 ? "aporovado" : "reprovado";
		
		System.out.println("O aluno teve média = " + media + " e foi " +  resultado);
	}

}
