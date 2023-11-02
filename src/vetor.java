import java.util.Locale;
import java.util.Scanner;

public class vetor {

	public static void main(String[] args) {
		// iNTIGICO O TIPO DE DADO COM UM COCHETES DOUBLE[]
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números vocÊ quer ?");
		int n = sc.nextInt();
		
		double[] vet = new double[n];
		
		for(int i = 0; i < n; i++) {
			System.out.println("Digite um número: ");
			vet[i] = sc.nextDouble();
		}
		System.out.println('-');
		for(int i = 0; i < n; i++) {
			System.out.println(vet[i]);
		
		}
		
		
		
		
		sc.close();
		

	}

}
