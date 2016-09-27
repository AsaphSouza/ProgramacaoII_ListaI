package exercicio_232;

public class Verificar {
	int contPositivo = 0;
	int contNegativo = 0;
	int contNulo = 0;
	public void verificaNum(int numero){
		
		if (numero > 0){
			contPositivo++;
			}
		
		else if (numero == 0){
			contNulo++;
			}
		
		else{
			contNegativo++;
			}
	}

}
