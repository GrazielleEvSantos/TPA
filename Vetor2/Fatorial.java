import java.util.Scanner;
public class Fatorial {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a[], b[], i,ii;
		final int TAM = 5;
		
		a = new int [TAM];
		b = new int [TAM];
		
		for(i = 0; i < TAM; i++) {
			System.out.println("Digite o valor do "+(i+1)+" número");
			a[i] = in.nextInt();
			
		}
		
		for(i = 0; i < TAM; i++) {
			b[i] = 1;
			
			for(ii = 1; ii <= a[i]; ii++ ) {
				b[i] *= ii;
			}
			
		}
		
		for(i = 0; i < TAM; i++) {
			System.out.println(+a[i]+" Fatorial é igual a: \n"+b[i] );
		}
	in.close();
	}

}
