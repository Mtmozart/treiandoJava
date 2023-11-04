import java.util.Scanner;

public class forExercicio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um  valor");
		int n = sc.nextInt();
	
		int in = 0;
		int  out = 0;
		
		for(int i = 1; i <= n; i++) {
			
			int z = sc.nextInt();
			
			if(z >= 10 && z <= 20) {
				in++;
			} out++;
		}
		
		System.out.println("entrada: " + in + "; saída: " + out);
		sc.close();
	}
	

}
