import java.util.Scanner;
public class Tabuada {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int n, r, i = 1;
		
		System.out.println("Digite o número para a tabuada");
		n = in.nextInt();
		
		while(i<11) {
			
			//Calculando a tabuada
			 r = n*i;
			 
			//Resultado
			 
			 System.out.println(n+"x"+i+" = "+r);
			 i++;
			
		}
		in.close();
	}

}
