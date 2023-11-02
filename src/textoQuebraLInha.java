import java.util.Scanner;
public class textoQuebraLInha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*Só chamar o nextLIne - linha inteira e limpeza de buffer, só fazer um nextLIne extra*/
		String s1, s2, s3;
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		System.out.println("DADOS DIGITADOS:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		sc.close();

	}

}

