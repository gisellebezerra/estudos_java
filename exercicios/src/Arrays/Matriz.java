// Proposta do exercício: Criar uma MATRIZ com a quantidade de alunos e de notas
//Por fim, calcular a média da turma

import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        //Recebe a quantidade de alunos: Arrays Externo
        System.out.println("Quantos alunos? ");
        int qtdAlunos = entrada.nextInt();

        //Recebe a quantidade de notas por aluno: Array Interno        
        System.out.println("Quantidade de notas por aluno? ");
        int qtdNotas = entrada.nextInt();

        //Montando a matriz: armazena a quantidade de alunos e notas
        double[] [] notasDaTurma = new double[qtdAlunos] [qtdNotas];
        
        //Criando a variável total para somar as notas
        double total = 0;

        //O primeiro for irá percorrer a quantidade de alunos 
        for(int aluno = 0; aluno < notasDaTurma.length; aluno++){
            //O segundo for irá percorrer a quantidade de notas 
            //Será executado de acordo com a quantidade de alunos para que cada aluno receba sua determinada quantidade de notas 
            for(int nota = 0; nota < notasDaTurma[aluno].length; nota++){

                System.out.printf("Informe a nota " + (nota + 1) + " do aluno " + (aluno + 1) + " : ");
                
                //Entrada de dados das notas de acordo com a quantidade declarada acima
                //Cada aluno receberá X quantidade de notas
                notasDaTurma [aluno] [nota] = entrada.nextDouble();
                
                //Soma todas as notas dos alunos 
                total = total + notasDaTurma[aluno][nota];
           
            }
        }

        //Variável para calcular a média (total) soma de todas as notas / quantidade de alunos * quantidade de notas 
        double media = total / (qtdAlunos * qtdNotas);
        System.out.println("Média da turma é " + media);

        entrada.close();
    }
}
