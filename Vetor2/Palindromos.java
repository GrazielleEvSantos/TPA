import java.util.Scanner;
public class Palindromos {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a[], b[], i, j, r = 0;
		final int TAM = 10;
		a = new int[TAM];
		b = new int[TAM];
		
		for(i = 0; i < TAM; i++) {
			System.out.println("Digite o "+(i+1)+" número");
			a[i] = in.nextInt();
		}
		
		for(i = 0; i < TAM; i++) {
				if(a[i]==a[TAM-1-i]) {
					r += 1;
				
			}
		}
		
		if(r  == a.length) {
			System.out.println("É um palindromo");
		}else {
			System.out.println("Não é um palindromo");
		}
		
		in.close();
	}

}
