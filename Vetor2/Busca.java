import java.util.Scanner;
public class Busca {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a[], x, i, r = 0;
		final int TAM = 10;
		a = new int [TAM];
		
		for(i = 0; i < TAM; i++) {
			System.out.println("Digite o "+(i+1)+" número");
			a[i] = in.nextInt();
		}
		
		System.out.println("Digite o número");
		x = in.nextInt();
		
		for(i = 0; i < TAM; i++) {
			if(a[i] == x) {
				r++;
			}
		}
		
		if(r > 0) {
			System.out.println("O número está em A");
		}else {
			System.out.println("O número não está disponivel em A");
		}
		
		in.close();
	}

}
