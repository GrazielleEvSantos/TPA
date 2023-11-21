import java.util.Scanner;
public class ABC {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a[], b[], c[], i;
		final int TAM = 10;
		a = new int [TAM];
		b = new int [TAM];
		c = new int [TAM];
		
		for(i = 0; i < TAM; i++) {
			System.out.println("Digite o "+(i+1)+" número de A");
			a[i] = in.nextInt();
		}
		
		for(i = 0; i < TAM; i++) {
			System.out.println("Digite o "+(i+1)+" número de B");
			b[i] = in.nextInt();
		}
		
		for(i = 0; i < TAM; i++) {
			if(a[i] > b[i]) {
				c[i] = 1;
			}else if(a[i] == b[i]) {
				c[i] = 0;
			}else if(a[i] < b[i]) {
				c[i] = -1;
			}
		}
		
		for(i = 0; i < TAM; i++) {
			System.out.println(c[i]);
		}
		
		in.close();
	}

}
