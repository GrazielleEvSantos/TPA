
import java.util.Scanner;
public class Treze {
	    public static void main(String[] args) {
	    	Scanner scanner = new Scanner(System.in);
	        int[] A = new int[10];
	        int[] B = new int[10];

	        System.out.println("Digite 10 elementos inteiros para o vetor A:");

	        for (int i = 0; i < 10; i++) {
	            System.out.print("Elemento " + (i + 1) + ": ");
	            A[i] = scanner.nextInt();
	        }

	        System.out.println("Vetor A:");
	        imprimirVetor(A);

	        for (int i = 0; i < 10; i++) {
	            if (A[i] % 2 == 0) {
	                B[i] = 1; // A[i] é par, então B[i] recebe 1
	            } else {
	                B[i] = 0; // A[i] é ímpar, então B[i] recebe 0
	            }
	        }

	        System.out.println("\nVetor B (construído com base em A):");
	        imprimirVetor(B);
	    }

	    public static void imprimirVetor(int[] vetor) {
	        for (int elemento : vetor) {
	            System.out.print(elemento + " ");
	        }
	        System.out.println();
	    }
	}

