import java.util.Arrays;

public class Exercicio {

    public static void main(String[] args) {
        
        double[] notasAlunoA = new double[3];

        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;

    System.out.println(Arrays.toString(notasAlunoA));

    //Percorrendo o Array
    
    double total = 0;
    for(int i = 0; i < 3; i++ ){
        total = total + notasAlunoA[i];
    }

    System.out.println(String.format("%.2f", total/3));

    // Usando Length para obter o tamanho do Array

    double soma = 0;

    for(int i = 0; i < notasAlunoA.length; i++){
        
        soma = soma + notasAlunoA[i];
    }
    System.out.println(soma);


    //
    double soma2 = 0;
    double[] notasAlunoB = {10, 6, 4};

    for(int i = 0; i < notasAlunoB.length; i++){
        soma2 = soma2 + notasAlunoB[i];
        
    }
    System.out.println(soma2);
}

}
