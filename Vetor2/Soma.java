import java.util.Scanner;
public class Soma {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a[], b[], i, j, s = 0;
		final int TAM = 10;
		a= new int[TAM];
		b= new int[TAM];
		
		
		for(i = 0; i < TAM; i++) {
			System.out.println("Digite o"+(i+1)+" número");
			a[i]= in.nextInt();
		}
		
		for(i = 0; i < TAM; i++) {
			for(j = 0; j< TAM;j++) {
				s += a[j];
			}
			b[i] = s;
		}
		
		
		System.out.println("O resultado de B é: ");
		for(i = 0; i < TAM; i++) {
			System.out.println(b[i]);
		}

	}

}
