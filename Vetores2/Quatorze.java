import java.util.Scanner;

public class Quatorze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[10];

        System.out.println("Digite 10 elementos inteiros para o vetor A:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            A[i] = scanner.nextInt();
        }

        System.out.println("Digite 10 elementos inteiros para o vetor B:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            B[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (A[i] > B[i]) {
                C[i] = 1; // A[i] é maior que B[i], então C[i] recebe 1
            } else if (A[i] == B[i]) {
                C[i] = 0; // A[i] é igual a B[i], então C[i] recebe 0
            } else {
                C[i] = -1; // A[i] é menor que B[i], então C[i] recebe -1
            }
        }

        System.out.println("\nVetor A:");
        imprimirVetor(A);

        System.out.println("\nVetor B:");
        imprimirVetor(B);

        System.out.println("\nVetor C (construído com base em A e B):");
        imprimirVetor(C);
    }

    public static void imprimirVetor(int[] vetor) {
        for (int elemento : vetor) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}

