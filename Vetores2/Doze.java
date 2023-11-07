import java.util.Scanner;
public class Doze {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int[] A = new int[10];
	        int tamanho = 10;
	        
	        System.out.println("Digite 10 elementos inteiros para o vetor A:");

	        for (int i = 0; i < 10; i++) {
	            System.out.print("Elemento " + (i + 1) + ": ");
	            A[i] = scanner.nextInt();
	        }

	        int i = 0;
	        int j = tamanho - 1;
	        int palindromo = 1; // Supomos inicialmente que o vetor é um palíndromo

	        while (i < j) {
	            if (A[i] != A[j]) {
	                palindromo = 0; // Se encontrarmos uma diferença, não é um palíndromo
	                break;
	            }
	            i++;
	            j--;
	        }

	        if (palindromo == 1) {
	            System.out.println("O vetor A é um palíndromo.");
	        } else {
	            System.out.println("O vetor A não é um palíndromo.");
	        }
	    }
	}

