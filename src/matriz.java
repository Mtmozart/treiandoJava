import java.util.Locale;
import java.util.Scanner;

public class matriz {

	public static void main(String[] args) {
		// iNTIGICO O TIPO DE DADO COM UM COCHETES DOUBLE[]
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números vocÊ quer ?");
		int n = sc.nextInt();
		System.out.println("Quantos números vocÊ quer ?");
		int m = sc.nextInt();
		
		//aqui está a mágica
		int[][] mat = new int[n][m];
				
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				System.out.println("Digite um número");
				mat[i][j] = sc.nextInt();
			}
		}
			System.out.println("-----------------");
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				System.out.print(mat[i][j] + ""); 
			}	
			System.out.println();
		}
			sc.close();
		}
		
	}
		
		
		
		
		
		

