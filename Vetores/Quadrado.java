import java.util.Scanner;
public class Quadrado {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i, a[], b[];
		final int TAM = 10;
		
		a= new int[TAM];
		b= new int[TAM];
		
		for(i =0; i <TAM; i++ ) {
			System.out.println("Entre com "+(i+1)+" número");
			a[i] = in.nextInt();
			
		}
		
		System.out.println ("Esses são os quadrados dos numeros do vetor A! :D");
		for(i = 0; i <TAM; i++ ) {

			b[i] = a[i]*a[i];
			System.out.println(b[i]);
			
		}
		
	}

}
