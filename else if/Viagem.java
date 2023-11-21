import java.util.Scanner;
public class Viagem {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double passagem, bagagemVol, bagagemPreco, total;
		String assento, bagagem;
		
		System.out.println("Digite o preço da passagem");
		passagem = in.nextDouble();
		
		System.out.println("Vai despachar bagagem? (Sim ou Não)");
		bagagem = in.next();
		
		if(bagagem.equalsIgnoreCase("Sim")) {
			System.out.println("Digite a quantidade de volumes");
			bagagemVol = in.nextDouble();
			bagagemPreco = bagagemVol*90.00;
			
			System.out.println("Deseja marcar assento? (Sim ou Não)");
			assento = in.next();
			if(assento.equalsIgnoreCase("Sim")) {
				total = bagagemPreco+passagem+60.00;
				
				System.out.println("O preço total da viagem é "+total);
			}else {
				total = bagagemPreco+passagem;
				System.out.println("O preço total da viagem é "+total);
			}
		
			
			
		}
		else {
			System.out.println("Deseja marcar assento? (Sim ou Não)");
			assento = in.next();
			if(assento.equalsIgnoreCase("Sim")) {
				total = passagem+60.00;
				System.out.println("O preço total da viagem é "+total);
				
			}else {
				System.out.println("O preço total da viagem é "+passagem);
			}
		}
		
		in.close();
	}

}
