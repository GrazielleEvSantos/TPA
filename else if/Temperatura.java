import java.util.Scanner;
public class Temperatura {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double fahrenheit, celcius;
		
		System.out.println("Digite a temperatura em fahrenheit");
		fahrenheit = in.nextDouble();
		celcius = (fahrenheit - 32) * 5/9;
		
		if(celcius <15) {
			System.out.println("A temperatura é de "+celcius);
			System.out.println("E está frio");
		}
		else if(celcius <22) {
			System.out.println("A temperatura é de "+celcius);
			System.out.println("A temperatura está amena");
		}
		else {
			System.out.println("A temperatura é de "+celcius);
			System.out.println("E está calor");
		}
		in.close();
	}
}
