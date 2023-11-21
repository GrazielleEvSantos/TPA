import java.util.Scanner;
public class Signo {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		
		int d, m;
		
		System.out.println("Digite o dia que você nasceu:");
		d = in.nextInt();
		System.out.println("Digite o mês que você nasceu");
		m = in.nextInt();
		
		switch(m){
			case 3:
				if(d<=20) {
					System.out.println("Peixes");
				}
				else if(d>=21 && d<= 31) {
					System.out.println("Áries");
				}
				break;
			case 4:
				if(d<=20) {
					System.out.println("Áries");
				}
				else if(d>=21 && d<=30){
					System.out.println("Touro");
				}
				break;
			case 5:
				if(d<=20) {
					System.out.println("Touro");
					
				}
				else if(d>=21 && d<=31){
					System.out.println("Gêmeos");
		}		
				break;
			case 6:
				if(d<=20) {
					System.out.println("Gêmeos");
					
				}
				else if(d>=21 && d<=30){
					System.out.println("Cancer");
		}
				break;
			case 7:
				if(d<=22) {
					System.out.println("Cancer");
					
				}
				else if(d>=23 && d<=31){
					System.out.println("Leão");
		}
				break;
			case 8:
				if(d<=23) {
					System.out.println("Leão");
					
				}
				else if(d>=23 && d<=30){
					System.out.println("Virgem");
		}
				break;
			case 9:
				if(d<=22) {
					System.out.println("Virgem");
					
				}
				else if(d>=23 && d<=31){
					System.out.println("Libra");
		}
				break;
			case 10:
				if(d<=22) {
					System.out.println("Libra");
					
				}
				else if(d>=23 && d<=31){
					System.out.println("Escorpião");
		}
				break;
			case 11:
				if(d<=21) {
					System.out.println("Escorpião");
					
				}
				else if(d>=22 && d<=30){
					System.out.println("Sagitário");
		}
				break;
			case 12:
				if(d<=21) {
					System.out.println("Sagitário");
					
				}
				else if(d>=22 && d<=31){
					System.out.println("Capricórnio");
		}
				break;
			case 1:
				if(d<=20) {
					System.out.println("Capricórnio");
					
				}
				else if(d>=21 && d<=31){
					System.out.println("Aquário");
		}
				break;
			case 2:
				if(d<=18) {
					System.out.println("Aquário");
					
				}
				else if(d>=19 && d<=28){
					System.out.println("Peixes");
		}
				break;
			default:
				System.out.println("Informações invalidas");
		
		
		in.close();
	}
}
}
