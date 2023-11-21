import java.util.Scanner;
public class Combustivel {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		double km, litro, consumo;
		
		System.out.println("Digite a dist�ncia percorrida");
		km = in.nextDouble();
		System.out.println("Digite a capacidade do tanque de combustivel");
		litro = in.nextDouble();
		
		consumo = km/litro;
		
		if (consumo >=10) {
			System.out.println(consumo+ " Econ�mico");
			} else if (consumo <10) {
				System.out.println(consumo+ " N�o Econ�mico");
			}
	}
	
}
