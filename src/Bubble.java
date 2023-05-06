import java.util.Scanner;

public class Bubble {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 0;

        System.out.printf("Quantos elementos o vetor terá: ");
        n = scan.nextInt();

        int vetor[] = new int[n];

        //Povoando Vetor
        for (int i = 0; i < n; i++){
            System.out.println("Digite o valor: ");
            vetor[i] = scan.nextInt();
        }

        //for (int i = 0; i < vetor.length; i++) System.out.println(vetor[i]);

        //BubbleSort
        for (int i = 0; i < vetor.length - 1; i++){
            for (int j = 0; j < vetor.length - 1; j++){
                if (vetor[j] > vetor[j+1]){
                    int aux;
                    aux = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = aux;
                }
            }
        }
        for (int x = 0; x < vetor.length; x++) System.out.println(vetor[x]);



    }
}
