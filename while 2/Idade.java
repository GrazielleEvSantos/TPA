import java.util.Scanner;
public class Idade {

	public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int id, i = 1;
			
			while(i<11) {
				System.out.println("Digite a idade da "+i+" pessoa");
				id = in.nextInt();
				
				if(id<18) {
					System.out.println("Menor de idade");
				}else {
					System.out.println("Maior de idade");
				}
				i++;
			}
			in.close();
	}

}
