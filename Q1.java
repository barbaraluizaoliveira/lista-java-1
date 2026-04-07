import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        double[] consumos;
        double soma = 0;
        double media;
        int contador = 0;

        System.out.println("Digite o número de dias:");
        n = sc.nextInt();
        consumos = new double[n];

        for (int i = 0; i < consumos.length; i++) {
            System.out.println("Digite o consumo do dia " + (i + 1) + ":");
            consumos[i] = sc.nextDouble();
            soma += consumos[i];
        }

        media = soma / n;

        for (int i = 0; i < consumos.length; i++) {
            if (consumos[i] > media) {
                contador++;
            }
        }

        System.out.println("Consumo total: " + soma);
        System.out.println("Consumo médio: " + media);
        System.out.println("Dias acima da média: " + contador);
    }
}
