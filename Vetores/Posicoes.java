import java.util.Scanner;
public class Posicoes {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int i, a[], b[];
		final int TAM = 10;
		a = new int [TAM];
		b = new int [TAM];
		
		for(i = 0; i < TAM; i++) {
			System.out.println("Entre com o "+(i+1)+" número");
			a[i]= in.nextInt();
		}
		
		for(i = 0; i < TAM; i++) {
			b[i] = a[TAM - 1 - i];
		}
		
		System.out.println("O número invertido é: ");
		for(i = 0; i <TAM; i++){
			
			System.out.println(b[i]);
		}
		
	}
}
