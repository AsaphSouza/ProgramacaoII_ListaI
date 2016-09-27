package exercicio_215;
// Programa exibir� a soma, produto, diferen�a e quociente dos n�meros informados.

import java.util.Scanner;

public class Aritmetica {

	public static void main(String[] args) {
		System.out.print("Informe um n�mero inteiro: ");
		
		Scanner num1 = new Scanner(System.in);
		int entradaNum1 = num1.nextInt();
		
		
		System.out.print("Informe um segundo n�mero inteiro: ");
		
		Scanner num2 = new Scanner(System.in);
		int entradaNum2 = num2.nextInt();
		
		num1.close();
		num2.close();
		
		Calculos calculos = new Calculos();
		
		int resultado1 = calculos.soma(entradaNum1, entradaNum2);
		int resultado2 = calculos.subtracao(entradaNum1, entradaNum2);
		int resultado3 = calculos.multiplicacao(entradaNum1, entradaNum2);
		double resultado4 = calculos.divisao(entradaNum1, entradaNum2);
		
		System.out.println("\nSoma: " + resultado1);
		System.out.println("Subtra��o: " + resultado2);
		System.out.println("Multiplica��o: " + resultado3);
		System.out.printf("Divis�o: %.1f" , resultado4);
	}

}
