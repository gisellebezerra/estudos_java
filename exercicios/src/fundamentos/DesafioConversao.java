package fundamentos;
import java.util.Locale;
import java.util.Scanner;

public class DesafioConversao {
	@SuppressWarnings({ "deprecation", "resource" })
	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		//System.out.println(Locale.getDefault());
		
		Scanner salarios = new Scanner(System.in);
		
		String salarioUm = salarios.nextLine().replace(",",".");
		double salario1 = Double.parseDouble(salarioUm);
		
		String salarioDois = salarios.nextLine().replace(",",".");
		double salario2 = Double.parseDouble(salarioDois);
		
		String salarioTres = salarios.nextLine().replace(",",".");
		double salario3 = Double.parseDouble(salarioTres);
		
		double media = (salario1 + salario2 + salario3)/3;
		
		System.out.println("Média = " + media);
		
		salarios.close();
	}
	
}
