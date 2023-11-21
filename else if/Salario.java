import java.util.Scanner;
public class Salario {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		
		double salario, salarioMin;
		
		System.out.println("Digite seu salário");
		salario = in.nextDouble();
		System.out.println("Digite o salário minímo atual");
		salarioMin = in.nextDouble();
		
		if(salario<salarioMin) {
			System.out.println("Você ganha uma quantidade inadequada");
		}
		else {
			System.out.println("Você ganha uma quantidade igual ou acima do salario minímo");
		}
		
		in.close();
	}
}
