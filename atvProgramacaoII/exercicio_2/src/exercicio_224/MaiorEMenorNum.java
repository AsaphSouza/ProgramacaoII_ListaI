package exercicio_224;

import java.util.Scanner;

public class MaiorEMenorNum {

	public static void main(String[] args) {
		VerificarMaiorMenor verificar = new VerificarMaiorMenor();
		
		for (int i = 0; i < 5; i++) {
			System.out.printf("(%d de 5) Insira um n�mero: ", (i+1));
			Scanner numero = new Scanner(System.in);
			int numInformado = numero.nextInt();
			verificar.verificarNum(numInformado);
		}
		System.out.println("\nMaior n�mero: " + verificar.maiorNum);
		System.out.println("Menor n�mero: " + verificar.menorNum);
	}

}
