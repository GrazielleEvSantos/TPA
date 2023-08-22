import java.util.Scanner;
public class EscolaDeFutebol {
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			
			int i;
			
			System.out.println("Digite sua idade:");
			i = in.nextInt();
			
			switch(i) {
				case 6:
					System.out.println("Dente de Leite");
					break;
				case 7:
					System.out.println("Júnior");
					break;
				case 8:
					System.out.println("Júnior Max");
					break;
				case 9:
					System.out.println("Júnior Master");
					break;
				case 10:
					System.out.println("Master");
					break;
				default:
					System.out.println("Idade inválida");
			}
			
			
			in.close();
		}
}
