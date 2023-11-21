import java.util.Scanner;
public class Consumo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double km, litro, consumo;
		
		
		System.out.println("Digite a distância percorrida");
		km = in.nextDouble();
		System.out.println("Digite a capacidade do tanque de combustivel");
		litro = in.nextDouble();
		
		consumo = km/litro;
		
		if(consumo >=10) {
			System.out.println(consumo+ " Econômico");
		}
		else {
			System.out.println(consumo+" Não econômico");
		}
	}

}
