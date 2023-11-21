import java.util.Scanner;
public class IdadeUsuario {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		int id,idadeVelho, idadeNovo;
		String nome, nomeVelho, nomeNovo;
		
		System.out.println("Digite o nome da 1o Pessoa");
		nome = in.next();
		System.out.println("Entre com a idade de "+nome);
		id = in.nextInt();
		
		nomeVelho = nome;
		idadeVelho = id;
		
		nomeNovo = nome;
		idadeNovo = id;
		
		//2 pessoa
		System.out.println("Digite o nome da 2o Pessoa");
		nome = in.next();
		System.out.println("Entre com a idade de "+nome);
		id = in.nextInt();
		if(id > idadeVelho) {
			idadeVelho = id;
			nomeVelho = nome;
		}
		else if (idadeNovo >id){
			nomeNovo = nome;
			idadeNovo = id;
		}
		//3
		System.out.println("Digite o nome da 3o Pessoa");
		nome = in.next();
		System.out.println("Entre com a idade de "+nome);
		id = in.nextInt();
		if(id > idadeVelho) {
			idadeVelho = id;
			nomeVelho = nome;
		}
		else if (idadeNovo >id){
			nomeNovo = nome;
			idadeNovo = id;
		
		//4
		System.out.println("Digite o nome da 4o Pessoa");
		nome = in.next();
		System.out.println("Entre com a idade de "+nome);
		id = in.nextInt();
		if(id > idadeVelho) {
			idadeVelho = id;
			nomeVelho = nome;
		}
		else if (idadeNovo >id){
			nomeNovo = nome;
			idadeNovo = id;
		}
		//5
		System.out.println("Digite o nome da 5o Pessoa");
		nome = in.next();
		System.out.println("Entre com a idade de "+nome);
		id = in.nextInt();
		if(id > idadeVelho) {
			idadeVelho = id;
			nomeVelho = nome;
		}
		else if (idadeNovo >id){
			nomeNovo = nome;
			idadeNovo = id;
			
		}
		
		System.out.println("O mais velho é "+nomeVelho+" com a idade "+idadeVelho);
		System.out.println("O mais novo é "+nomeNovo+" com a idade "+idadeNovo);
		}
	}
}
