package exercicio_230;

public class Separar {
	public String separarNumero(int numero){
		
		int resto = numero;
		String retorno = "";
		
		for (int i = 10000; i >= 1; i /= 10) {
			int divisor = resto / i;
			resto = numero % i;
			retorno += divisor + "   ";
		}
		return retorno;	
	}
}
