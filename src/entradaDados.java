import java.util.Scanner;


public class entradaDados {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*int x = sc.nextInt();
		double z = sc.nextDouble();
		char y = sc.next().charAt(0);
		String a = sc.nextLine();
		//libera o recurso que aloque quando fiz o scanner.
		//Obs -- tem que fazer limpeza de buffer, sc.nextLine()
		sc.close();*/
		
		System.out.println("Digite o seu nome: ");
		String nome = sc.nextLine();
		System.out.println("Digite a sua idade");
		int idade = sc.nextInt();
		
		System.out.println("Digite o seu nome 2: ");
	    sc.nextLine(); // ----> Limpando o buffer
		String nome2 = sc.nextLine();
		System.out.println("Digite a sua idade 2");
		int idade2 = sc.nextInt();
		
		//char
		a = sc.next().charAt(0);
		
		//mais de vários dados - s'por um atraś do outro
		
		
		System.out.println("nome 1: " + nome + "idade1: " + idade + "nome2 " + nome2 + " idade 2 " + idade2);
	}

}
