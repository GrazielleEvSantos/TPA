import java.util.Scanner;
public class Quinze {

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

	        System.out.println("Vetor A:");
	        imprimirVetor(A);

	        ordenarCrescente(A, B);
	        System.out.println("\nVetor B (ordenado em ordem crescente):");
	        imprimirVetor(B);

	        ordenarDecrescente(A, C);
	        System.out.println("\nVetor C (ordenado em ordem decrescente):");
	        imprimirVetor(C);
	    }

	    public static void ordenarCrescente(int[] origem, int[] destino) {
	        int n = origem.length;

	        for (int i = 0; i < n; i++) {
	            int minIndex = i;

	            for (int j = i + 1; j < n; j++) {
	                if (origem[j] < origem[minIndex]) {
	                    minIndex = j;
	                }
	            }

	            int temp = origem[i];
	            origem[i] = origem[minIndex];
	            origem[minIndex] = temp;

	            destino[i] = origem[i];
	        }
	    }

	    public static void ordenarDecrescente(int[] origem, int[] destino) {
	        int n = origem.length;

	        for (int i = 0; i < n; i++) {
	            int maxIndex = i;

	            for (int j = i + 1; j < n; j++) {
	                if (origem[j] > origem[maxIndex]) {
	                    maxIndex = j;
	                }
	            }

	            int temp = origem[i];
	            origem[i] = origem[maxIndex];
	            origem[maxIndex] = temp;

	            destino[i] = origem[i];
	        }
	    }

	    public static void imprimirVetor(int[] vetor) {
	        for (int elemento : vetor) {
	            System.out.print(elemento + " ");
	        }
	        System.out.println();
	    }
	}

