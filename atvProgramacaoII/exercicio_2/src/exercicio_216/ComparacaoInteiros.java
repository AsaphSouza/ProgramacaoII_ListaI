package exercicio_216;

import java.util.Scanner;

public class ComparacaoInteiros {

	public static void main(String[] args) {
		System.out.print("Informe um número inteiro: ");
		
		Scanner num1 = new Scanner(System.in);
		int entradaNum1 = num1.nextInt();
		
		
		System.out.print("Informe um segundo número inteiro: ");
		
		Scanner num2 = new Scanner(System.in);
		int entradaNum2 = num2.nextInt();
		
		num1.close();
		num2.close();
		
		Comparar comparacao = new Comparar();
		
		comparacao.compararNumeros(entradaNum1,entradaNum2);
	}

}
