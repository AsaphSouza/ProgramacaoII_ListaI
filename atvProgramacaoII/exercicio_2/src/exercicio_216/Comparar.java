package exercicio_216;

public class Comparar {
	
	public void compararNumeros (int primeiroNum, int segundoNum){
		
		if (primeiroNum > segundoNum){
			System.out.printf("\n%d Is larger", primeiroNum);
		}
		else if (segundoNum > primeiroNum){
			System.out.printf("\n%d Is larger", segundoNum);
		}
		else{
			System.out.printf("\nThese numbers are equal.");
		}
	}
}
