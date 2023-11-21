package switchCase2;
import java.util.Scanner;
public class Cantina {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int c;
		
		System.out.println("Digite o código do produto: ");
		c = in.nextInt();
		
		switch(c) {
		
		case 1:
			System.out.println("Cachorro quente de R$ 8,00");
			break;
		case 2:
			System.out.println("Cheeseburguer de R$ 12,00");
			break;
		case 3:
			System.out.println("X-Salada de R$ 15,00");
			break;
		case 4:
			System.out.println("Misto quente de R$ 11,00");
			break;
		case 5:
			System.out.println("Pão na chapa de R$ 6,00");
			break;
		default:
			System.out.println("Esse código é inexistente");
		}
		
	}

}
