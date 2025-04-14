package fundamentos;

public class TabelaVerdade {
	public static void main(String[] args) {
		
		//Tabela Verdade E (&&)
		
		System.out.println("Tabela Verdade E (&&)");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		//Tabela Verdade OU (||)
		System.out.println("\nTabela Verdade OU (||)");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		//Tabela Verdade OU EXCLUSIVO (^)
		System.out.println("\nTabela Verdade OU EXCLUSIVO (^)");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		//Tabela Verdade NOT (!)
		
		System.out.println("\nTabela Verdade NOT (!)");
		System.out.println(!true);
		System.out.println(!false);
		
	}

}
