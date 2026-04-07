import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] precos;
        int p;
        double totalAntes = 0;
        double totalDepois = 0;
        double novoPreco;
        precos = new double[n];

        for(int i = 0; i < n; i++){
            System.out.println("Digite o preço do produto " + (i + 1) + ":");
            precos[i] = sc.nextDouble();
            totalAntes += precos[i];
        }

        System.out.println("Digite o percentual de aumento:");
        p = sc.nextInt();

        for(int i = 0; i < n; i++){
            novoPreco = precos[i] + (precos[i] * p / 100);
            totalDepois += novoPreco;
            System.out.printf("Produto %d: Novo Preço = R$ %.2f\n", (i + 1), novoPreco);
        }

        System.out.println("Total antes do aumento: " + totalAntes);
        System.out.println("Total depois do aumento: " + totalDepois);

}
}
