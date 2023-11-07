import java.util.Scanner;
public class Pares {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i, a[], b[], r;
		final int TAM = 10;
		a = new int [TAM];
		b = new int [TAM];
		
		for(i = 0; i < TAM; i++) {
			System.out.println("Entre com o "+(i+1)+" número");
			a[i] = in.nextInt();
		}
		
		System.out.println("Os números pares são:");
		for(i = 0; i < TAM; i++) {
			
			r = a[i]%2;
			if(r == 0) {
				b[i] = a[i];
				
				System.out.println(b[i]);
				
			}
		}
		System.out.println("Os números impares são: ");
		for(i = 0; i <TAM; i++) {
			
			r = a[i]%2;
			if(r != 0) {
				b[i] = a[i];
				
				System.out.println(b[i]);
			}
		}
		
		in.close();

	}

}
