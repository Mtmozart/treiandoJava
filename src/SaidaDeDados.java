import java.util.Locale;

public class SaidaDeDados {

	public static void main(String[] args) {
		//Mesma linha System.out.print()uebra de linha System.out.println() e "+" para a concatenação
		
		Locale.setDefault(Locale.US);
		
		int idade;
		double salario, altura;
		char genero;
		String nome;
		
		idade = 25;
		salario = 5500.65;
		altura = 1.78;
		genero = 'm';
		nome = "Matheus Mozart da Silva Neves Borges";
		
		System.out.println("Olá, meu nome é " + nome + ", eu tenho " + idade + " anos, recebo o total de " + salario + ", sou do gênero" + genero + "e tenho " + altura  + "m de altura");
		System.out.println(" - ");
		double x = 45574.54656;
		//formatar -- essa rega o dois e o f são de float e a quantidade
		System.out.println(String.format("%.2f", x));
	}

}
