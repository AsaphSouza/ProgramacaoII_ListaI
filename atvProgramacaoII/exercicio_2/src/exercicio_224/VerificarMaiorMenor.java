package exercicio_224;

public class VerificarMaiorMenor {
	int maiorNum = 0;
	int menorNum = 1000000;
	
	public void verificarNum(int num){
		if (num > maiorNum){
			maiorNum = num;
		}
		else if (num < menorNum){
			menorNum = num;
		}
	}
}
