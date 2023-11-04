import java.util.Scanner;

public class condicional {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double salario = sc.nextDouble();
		double impostoEroubo;
		
		if(salario <= 2000) {
			impostoEroubo = 0;
		}else if(salario > 2000 && salario <= 3000) {
			impostoEroubo = salario * 0.08;
		}else if(salario > 3000	 && salario <= 4500) {
			impostoEroubo = salario * 0.18;
		}else {
			impostoEroubo = salario * 0.28;
		}
		
		
		System.out.printf("%.2f%n",impostoEroubo);
		
		
				
	sc.close();			
	}

}
