import java.util.Scanner;
public class Nove {
	    public static void main(String[] args) {
	    	Scanner in = new Scanner(System.in);
	    	int[] A = new int[10];
	        int[] B = new int[10];
	        int[] C = new int[10];

	        System.out.println("Digite 10 elementos inteiros para o vetor A:");

	        for (int i = 0; i < 10; i++) {
	            System.out.print("Elemento " + (i + 1) + ": ");
	            A[i] = in.nextInt();
	        }

	        System.out.println("Digite 10 elementos inteiros para o vetor B:");

	        for (int i = 0; i < 10; i++) {
	            System.out.print("Elemento " + (i + 1) + ": ");
	            B[i] = in.nextInt();
	        }

	        System.out.println("Vetor A:");
	        imprimirVetor(A);

	        System.out.println("\nVetor B:");
	        imprimirVetor(B);

	        System.out.println("\nInterseção (Vetor C):");
	        calcularIntersecao(A, B);
	    }

	    public static void calcularIntersecao(int[] A, int[] B) {
	        for (int elementoA : A) {
	            for (int elementoB : B) {
	                if (elementoA == elementoB) {
	                    System.out.print(elementoA + " ");
	                    break;
	                }
	            }
	        }
	    }

	    public static void imprimirVetor(int[] vetor) {
	        for (int elemento : vetor) {
	            System.out.print(elemento + " ");
	        }
	        System.out.println();
	    }
	}
