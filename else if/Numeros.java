import java.util.Scanner;
public class Numeros {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		
		int n1;
		
		System.out.println("Digite seu número");
		n1 = in.nextInt();
		
		if(n1==0) {
			System.out.println("O número é neutro");
		}
		else if(n1>0) {
			System.out.println("O número é positivo");
		}
		else {
			System.out.println("O número é negativo");
		}
		
		in.close();
	}
}
