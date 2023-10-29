
public class casting {

	public static void main(String[] args) {
		// em números int ou conversão, eu boto o tipo antes da variável
		int a, b;
		double result;
		
		a = 2;
		b = 5;
	   result = (double) b / a;
	   System.out.println(result);
	   
	   // outro caso - java não é permitido atribuição de variáveis diferentes
	   double c;
	   int d;
	   c = 5.0;
	   d = (int)a;
	   System.out.println(d);

	}

}
