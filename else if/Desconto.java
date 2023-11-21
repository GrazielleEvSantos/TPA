import java.util.Scanner;
public class Desconto {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		double desc, produto, produtoFinal;
		
		System.out.println("Digite o valor do produto");
		produto = in.nextDouble();
		
		if(produto <= 100) {
			System.out.println("Você não tem desconto :(" );
		
		}else if(produto <=500) {
			desc = (5*produto)/100;
			produtoFinal = produto-desc;
			System.out.println("Você vai pagar com desconto R$"+produtoFinal);
			
		}else if(produto <= 1000) {
			desc = (10*produto)/100;
			produtoFinal = produto-desc;
			System.out.println("Você vai pagar com desconto R$"+produtoFinal);
		}
		else if(produto <= 2000) {
			desc = (15*produto)/100;
			produtoFinal = produto-desc;
			System.out.println("Você vai pagar com desconto R$"+produtoFinal);
		}
		else {
			desc = (20*produto)/100;
			produtoFinal = produto-desc;
			System.out.println("Você vai pagar com desconto R$"+produtoFinal);
		}
		in.close();
	}

}
