package fundamentos;

import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	public static void main(String[] args) {
		
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro número");
		String valor2 = JOptionPane.showInputDialog("Digite o segundo número");
	
		//Converter para Double
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
				
		//Para um valor com maior prec. utilizar bigdecimal 
		
		BigDecimal num1 = BigDecimal.valueOf(numero1);
		BigDecimal num2 = BigDecimal.valueOf(numero2);
		BigDecimal soma = num1.add(num2);
		
		soma = soma.setScale(2, RoundingMode.HALF_UP);

		
		System.out.println(soma);
		
	}

}
