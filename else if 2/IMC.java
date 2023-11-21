import java.util.Scanner;
public class IMC {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		double peso, altura, imc;
		
		System.out.println("Digite seu peso");
		peso = in.nextDouble();
		System.out.println("Digite sua altura");
		altura = in.nextDouble();
		
		imc = peso/(altura*altura);
		
		if(imc < 18.5) {
			System.out.printf("Seu peso � %.2f - Excesso de magreza", imc);
			
		}
		else if(imc >=18.5 && imc <25) {
			System.out.printf("Seu peso � %.2f - Peso normal", imc);
		}
		else if(imc >=25 && imc <30) {
			System.out.printf("Seu peso � %.2f - Excesso de peso", imc);
			
		}
		else if(imc >=30 && imc <35) {
			System.out.printf("Seu peso � %.2f - Obesidade(Grau 1)", imc);
		}
		else if(imc >=35 && imc <40) {
			System.out.printf("Seu peso � %.2f - Obesidade(Grau 2)", imc);
		}
		else if(imc >40) {
			System.out.printf("Seu peso � %.2f - Obesidade(Grau 3)", imc);
		}
	
	}
}
