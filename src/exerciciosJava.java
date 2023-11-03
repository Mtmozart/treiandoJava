import java.util.Scanner;
import java.util.Locale;

public class exerciciosJava {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c;
		double pi = 3.14159;
		
		System.out.println("Digite trÊs valores de entrada: ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c= sc.nextDouble();

		double triangulo = (a * c) /2;
		double circulo = pi * (c * c);
		double trapezio = ((a + b) * c) /2;
		double quadrado = b * b;
		double retangulo = a * b;
		
		
	    System.out.printf("Retângulo: %.4f", triangulo);
	    System.out.println();
	    System.out.printf("círculo: %.4f", circulo);
	    System.out.println();
	    System.out.printf("trapezio: %.4f", trapezio);
	    System.out.println();
	    System.out.printf("quadrado: %.4f", quadrado);
	    System.out.println();
	    System.out.printf("retangulo : %.4f", retangulo);

		sc.close();
	}

}
