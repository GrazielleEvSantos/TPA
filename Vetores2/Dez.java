import java.util.Scanner;
public class Dez {
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
	        System.out.println("Vetor A:");
	        for (int elementoA : A) {
	            System.out.print(elementoA + " ");
	        }

	        System.out.println("\nVetor B:");
	        for (int elementoB : B) {
	            System.out.print(elementoB + " ");
	        }

	        System.out.println("\nDiferença (Vetor C):");
	        int[] C1 = new int[A.length];
	        int tamanhoC = 0;

	        for (int elementoA : A) {
	            int contador = 0;

	            for (int elementoB : B) {
	                if (elementoA == elementoB) {
	                    contador++;
	                }
	            }

	            if (contador == 0) {
	                C1[tamanhoC] = elementoA;
	                tamanhoC++;
	            }
	        }

	        for (int i = 0; i < tamanhoC; i++) {
	            System.out.print(C1[i] + " ");
	        }
	    }
	}
