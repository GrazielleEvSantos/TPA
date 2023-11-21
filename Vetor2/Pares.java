import java.util.Scanner;
public class Pares {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a[], b[], i, ii;
		final int TAM = 10;
		
		a = new int [TAM];
		
		
		for(i = 0; i < TAM; i++) {
			System.out.println("Digite o valor do "+(i+1)+" número");
			a[i] = in.nextInt();
			
			
		}
		
		for(i = 0; i < TAM; i++) {
			System.out.println(a[i]+" - Números de pares:");
			
			 for(ii = 0; ii <= a[i]; ii+=2) {
				 System.out.println(ii);
			 }
		}
		
			
		in.close();

	}

}
