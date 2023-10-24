import java.util.Scanner;
public class Media {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i, a[];
		double m, s = 0;
		final int TAM = 10;
		
		a= new int [TAM];
		
		for(i = 0; i < TAM; i++) {
			System.out.println("Entre com o "+(i+1)+" número");
			a[i] = in.nextInt();
			
		}
		for(i = 0; i < TAM; i++) {
			s = s +a[i];
		}
		
		m = s/TAM;
		System.out.println("A média é igual a: \n"+m);
		
		
		
	}

}
