import java.util.Scanner;
public class Interseccao {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a[], b[], c[], d[], i, j;
		final int TAM = 10;
		a = new int [TAM];
		b = new int [TAM];
		c = new int [20];
		d = new int [20];
		
		//ler os valores de A
		
		for(i = 0; i < TAM; i++) {
			System.out.println("Digite o "+(i+1)+" valor do vetor A");
			a[i] = in.nextInt();
			
		}
		
		//ler os valores de B
		for(i = 0; i < TAM; i++) {
			System.out.println("Digite o "+(i+1)+" valor do vetor B");
			b[i] = in.nextInt();
			
		}
		
		
		
		for(i = 0; i < TAM;i++) {
			for(j = 0; j < TAM;j++ )
			if(a[i]==b[j]) {
				c[i] = a[i];
				System.out.println("Intersecão dos valores A e B: \n"+c[i]);
			}
		}
		
	

	}

}
