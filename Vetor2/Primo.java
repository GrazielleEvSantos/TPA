import java.util.Scanner;
public class Primo {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		int a[], i, r;
		final int TAM = 10;
		a= new int [TAM];
		
		for(i = 0; i <TAM; i++) {
			System.out.println("Digite o "+(i+1)+" número");
			a[i]= in.nextInt();
			
		}
		
		for(i = 0; i < TAM; i++) {
			r = a[i]%2;
			
			if(a[i] == 2) {
				System.out.println(a[i]+" - Número primo");
			}else if(a[i]== 1) {
				System.out.println(a[i]);
			}else if(r != 0) {
				System.out.println(a[i]+" - Número primo");
			}else {
				System.out.println(a[i]);
			}
		}
		in.close();
	}
}
