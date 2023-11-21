package laçoRepetição1;

import java.util.Scanner;

public class MaiorMenor {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        int i = 0, menoresIdade = 0, maioresIdade=0;
	        
	        while (i < 10) {
	            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
	            int idade = scanner.nextInt();
	            
	            if (idade < 18) {
	                menoresIdade++;
	                
	            } else {
	                maioresIdade++;
	            }
	            
	            i++;
	        }
	        
	        System.out.println("Tem " + menoresIdade+ "pessoas menores de idade.");
	        System.out.println("Tem " + maioresIdade+ "pessoas maiores de idade");
	        
	        scanner.close();
	    }
	}
