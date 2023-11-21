package switchCase;
import java.util.Scanner;

	public class PlacaVeiculo {
		public static void main(String[]args) {
			Scanner in = new Scanner(System.in);
			
			int p;
			
			System.out.println("Digite o ultimo numero da placa do seu carro:");
			p = in.nextInt();
			
			switch(p) {
			case 1:
			case 2:
				System.out.println("Segunda-Feira");
				break;
			case 3:
			case 4:
				System.out.println("Terça-Feira");
				break;
			case 5:
			case 6:
				System.out.println("Quarta-Feira");
				break;
			case 7:
			case 8:
				System.out.println("Quinta-Feira");
				break;
			case 9:
			case 0:
				System.out.println("Sexta-Feira");
				break;
			default:
				System.out.println("Placa de veiculo invalida");
			}
		}
}
