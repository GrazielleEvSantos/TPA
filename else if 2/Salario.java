import java.util.Scanner;
public class Salario {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		
		double salario, irpf;
		
		System.out.println("Digite seu sal�rio");
		salario = in.nextDouble();
		
		if(salario<=1434.59) {
			System.out.println("Desconto do IRPF �: R$0,00");
		}
		else if(salario>=1434.60 && salario <=2150.00) {
			irpf= salario*7.5/100-107.59;
			System.out.println("Desconto do IRPF � R$"+ irpf);
		}
		else if(salario>=2150.01 && salario <=2866.70) {
			irpf= salario*15.0/100-268.84;
			System.out.println("Desconto do IRPF � R$"+ irpf);
		}
		else if(salario>=2866.71 && salario <=3582.00) {
			irpf= salario*22.5/100-483.84;
			System.out.println("Desconto do IRPF � R$"+ irpf);
		}
		else if(salario>3582.00) {
			irpf= salario*27.5/100-662.94;
			System.out.println("Desconto do IRPF � R$"+ irpf);
		}
	}
}
