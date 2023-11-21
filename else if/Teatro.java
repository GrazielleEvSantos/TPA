import java.util.Scanner;
public class Teatro {
	public static void main (String [] args) {
		Scanner in = new Scanner(System.in);
		String estudante;
		double ingresso, preco;
		
		System.out.println("Digite o preço do ingresso");
		ingresso = in.nextDouble();
		
		System.out.println("Você é estudante? Sim ou Não?");
		estudante = in.next();
		
		if(estudante.equalsIgnoreCase("Sim")) {
			preco = ingresso/2;
			System.out.println("Voce paga R$"+preco);
		}
		else {
			System.out.println("Você paga R$"+ingresso);
		}
		
	in.close();
	}
}
