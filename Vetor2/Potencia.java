import java.util.Scanner;
public class Potencia {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a[], i;
		final int TAM = 11;
		a = new int [TAM];
		
		
		a[0] = 1;
		for(i = 1; i < TAM; i++) {
			a[i] = a[i -1] * 2;
		}
		
		for(i = 0; i < TAM; i++) {
			System.out.println("A["+(i+1)+"] = "+a[i]);
		}
		
		in.close();

	}

}
