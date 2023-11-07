import java.util.Scanner;
public class Onze {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int[] A = new int[10];
	        int X;

	        System.out.println("Digite 10 elementos inteiros para o vetor A:");

	        for (int i = 0; i < 10; i++) {
	            System.out.print("Elemento " + (i + 1) + ": ");
	            A[i] = scanner.nextInt();
	        }

	        System.out.print("Digite o elemento que deseja buscar (X): ");
	        X = scanner.nextInt();

	        int encontrado = 0;

	        for (int i = 0; i < 10; i++) {
	            if (A[i] == X) {
	                encontrado = 1;
	                break;
	            }
	        }

	        if (encontrado == 1) {
	            System.out.println("O elemento " + X + " está presente no vetor A.");
	        } else {
	            System.out.println("O elemento " + X + " não está presente no vetor A.");
	        }
	    }
	}

