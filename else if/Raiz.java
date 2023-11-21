import java.util.Scanner;
public class Raiz {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double a, b ,c, delta, x, x1, x2;
		
		System.out.println("Digite o valor de A");
		a = in.nextDouble();
		System.out.println("Digite o valor de B");
		b = in.nextDouble();
		System.out.println("Digite o valor de C");
		c = in.nextDouble();
		
		delta = (b*b)- 4*a*c;
		
		if(delta < 0) {
			System.out.println("Não existem raizes reais para a equação");
		}
		else if(delta == 0) {
			x = -b /(2*a);
			System.out.println("Existem apenas a raiz real para a equação x = "+x);
		}
		else {
			x1 = (-b + Math.sqrt(delta)) /(2*a);
			x2 = (-b - Math.sqrt(delta)) /(2*a);
			System.out.println("Existem duas raizes reais para a equação");
			System.out.println("X1 = "+ x1);
			System.out.println("X2 = "+ x2);
		}
	}
}
