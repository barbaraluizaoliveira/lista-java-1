import java.util.Scanner;

public class Q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] notas = new double[n];
        double soma = 0;
        double maiorNota = 0.0;
        double menorNota = 10.0;
        int alunosAprovados = 0;

        for(int i = 0; i < notas.length; i++){
            System.out.println("digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
            soma += notas[i];

            if(notas[i] > maiorNota){
                maiorNota = notas[i];
            }
            if(notas[i] < menorNota){
                menorNota = notas[i];
            }
            if(notas[i] >= 7.0){
                alunosAprovados++;
            }
        }
        double media = soma / n;
        System.out.println("Maior nota: " + maiorNota);
        System.out.println("Menor nota: " + menorNota);
        System.out.println("Media da turma: " + media);
        System.out.println("Alunos com nota maior ou igual a 7.0: " + alunosAprovados);
    }
}
