import java.util.Scanner;
public class Idade {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int idade, anoNasc, anoAtual;
		
		System.out.println("Entre com seu ano de nascimento");
		anoNasc = in.nextInt();
		System.out.println("Entre com o ano atual");
		anoAtual = in.nextInt();
		
		idade = anoAtual-anoNasc;
		
		if(idade <10) {
			System.out.println(idade+ "Criança");
		}
		else if(idade >=10 && idade <18) {
			System.out.println(idade+" Adolescente");
		}
		else if(idade >=18 && idade<60) {
			System.out.println(idade+" Adulto");
		}
		else {
			System.out.println(idade+ " Idoso");
		}
		

	
	}
}
