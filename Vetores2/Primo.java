import java.util.Scanner;
public class Primo {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int i, a[], r, p;
		
		final int TAM = 10;
		a = new int [TAM];
		
		for(i = 0; i < TAM; i++) {
			System.out.println("Digite um numero inteiro:");
			a[i] = in.nextInt();
			
			
			
		}
		for(i = 0; i <TAM; i++) {
			
			//r = a[i]/2;
			
			
			if(2 % a[i] == 1) {
				System.out.println(a[i]+": É número primo");
				
			}else {
				System.out.println(a[i]);
			}
		}
		

	}

}
