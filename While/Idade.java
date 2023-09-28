import java.util.Scanner;
public class Idade {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int nasc, ano, id, i = 0;
		
		do {
			System.out.println("Digite seu ano nascimento");
			nasc = in.nextInt();
			System.out.println("Digite o ano atual");
			ano = in.nextInt();
			
			id = ano - nasc;
			if(id>=18) {
				System.out.println("Sua idade é " +id +" Sendo assim maior de idade");
			}
			else {
				System.out.println("Sua idade é " +id+" Sendo assim menor de idade");
			}
			
			
			System.out.println("deseja continuar a execução? Sim = 1 ou Não = 2");
			i = in.nextInt();
			
		} while (i == 1);
		

	}

}
