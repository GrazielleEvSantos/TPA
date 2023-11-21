import java.util.Scanner;
public class Media {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double n1, n2, media, exame, notaExame;
		
		System.out.println("Digite a sua primeira nota");
		n1 = in.nextDouble();
		System.out.println("Digite sua segunda nota");
		n2 = in.nextDouble();
		media = (n1+n2)/2;
		
		if(media <3 ) {
			System.out.println("Reprovado");
		}
		else if(media >=6) {
			System.out.println("Aprovado");
		}
		else {
			System.out.println("Você está em exame. Digite sua nota do exame");
			exame = in.nextDouble();
			notaExame = (media+exame)/2;
			
			if(notaExame >6) {
				System.out.println("Aprovado");
			}
			else {
				System.out.println("Reprovado");
			}
		}
	}
}
