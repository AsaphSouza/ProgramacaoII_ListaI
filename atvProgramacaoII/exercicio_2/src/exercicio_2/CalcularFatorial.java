package exercicio_2;
// Método para calcular o fatorial
public class CalcularFatorial {
	public int calcularFatorial(int numeroInteiro){
		
		int cont = numeroInteiro;
		
		while(cont > 1){
			numeroInteiro *= cont - 1;
			cont -= 1;
		}
		return numeroInteiro;
	}
}
