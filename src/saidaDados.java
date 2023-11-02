import java.util.Locale;

public class saidaDados {

	public static void main(String[] args) {
		//com quebra de linhas
		System.out.println("Bom dia");
		//sem quebra
		System.out.print("Bom dia");
		System.out.print("Boa tarde");
		System.out.println();
		int y = 32;
		System.out.println(y);
		//com números reais
		Locale.setDefault(Locale.US);
		double z = 32.45555555;
		System.out.printf("%.2f%n", z);
		
		//CONCATECAÇÃO
		System.out.println("Resultado: " + z + "m");
		
		//CONCATECAÇÃO COM PRINTF
		System.out.printf("RESULTADO: %.2f metros%n", z);
		//vários elementos - % string, %d inteiros %f flutuantes	
		String name = "maria";
		int idade = 34;
		double renda = 10000.35;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais %n", name, idade, renda);
				
				
	
	}

}
