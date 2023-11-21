import java.util.Scanner;
public class AB {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int a[], b[], i, r;
		final int TAM = 10;
		a = new int[TAM];
		b = new int[TAM];
		
		for(i = 0; i < TAM; i++) {
			System.out.println("Digite o "+(i+1)+" número");
			a[i] = in.nextInt();
		}
		
		for(i = 0; i < TAM; i++) {
			r = a[i] % 2;
			if(r == 0) {
				b[i] = 1;
			}else {
				b[i] = 0;
			}
		}
		
		for(i = 0; i < TAM; i++) {
			System.out.println(b[i]);
		}
	}

}
