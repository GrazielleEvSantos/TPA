import java.util.Scanner;

public class Divisores {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a[], i, ii;
		final int TAM = 10;
		
		a = new int [TAM];
		
		
		for(i = 0; i < TAM; i++) {
			System.out.println("Digite o valor do "+(i+1)+" número");
			a[i] = in.nextInt();
			
			
		}
		
		for(i = 0; i < TAM; i++) {
			System.out.println(a[i]+" - Relação dos divisores:");
			
			
			for (ii = 1; ii < a[i]; ii++) {
				 //r = a[i]% ii;
				if (a[i] % ii == 0) {
					 System.out.println(ii);
				 }
			 }
		}
		
		
		
		in.close();

	}

}
