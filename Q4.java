import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] codigos = new int[n];
        int x;
        int posicao = -1;
        boolean encontrou = false;

        for(int i = 0; i < n; i++){
            System.out.println("Digite o código" + i + ": ");
            codigos[i] = sc.nextInt();
        }

        System.out.println("qual codigo deseja procurar?");
        x = sc.nextInt();

        for(int i = 0; i < n; i++){
            if(codigos[i] == x){
                encontrou = true;
            }
        }

        if(encontrou){
            System.out.println("Código encontrado!");
        } else {
            System.out.println("Código não encontrado.");
        }
    }}
}
