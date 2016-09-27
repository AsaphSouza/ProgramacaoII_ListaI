package exercicio_232;

import java.util.Scanner;

public class PositivoNegativoNulo {

	public static void main(String[] args) {
		Verificar verificaNumero = new Verificar();
		
		for (int i = 0; i < 5; i++) {
			System.out.printf("(%d de 5) Insira um número: ", (i+1));
			Scanner numero = new Scanner(System.in);
			int num = numero.nextInt();
			verificaNumero.verificaNum(num);
		}
		
		System.out.println("\nNumero(s) positivo(s):  " + verificaNumero.contPositivo);
		System.out.println("Numero(s) negativos(s): " + verificaNumero.contNegativo);
		System.out.println("Numero(s) zero(s):      " + verificaNumero.contNulo);
	}
	
}
