import java.util.Scanner;
public class Crescente {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.println("Digite o primeiro valor");
		n1 = in.nextInt();
		System.out.println("Digite o segundo valor");
		n2 = in.nextInt();
		System.out.println("Digite o terceiro valor");
		n3 = in.nextInt();
		
		if (n1 <n2 && n1 <n3) {
			System.out.println(n1);
			System.out.println(n2);
			System.out.println(n3);
		}
		else if(n2 < n3 && n2 < n1) {
			System.out.println(n2);
			System.out.println(n3);
			System.out.println(n1);
		}
		else {
			System.out.println(n3);
			System.out.println(n2);
			System.out.println(n1);
		}
	}

}
