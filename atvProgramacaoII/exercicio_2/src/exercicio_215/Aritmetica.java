package exercicio_215;
// Programa exibirá a soma, produto, diferença e quociente dos números informados.

import java.util.Scanner;

public class Aritmetica {

	public static void main(String[] args) {
		System.out.print("Informe um número inteiro: ");
		
		Scanner num1 = new Scanner(System.in);
		int entradaNum1 = num1.nextInt();
		
		
		System.out.print("Informe um segundo número inteiro: ");
		
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
		System.out.println("Subtração: " + resultado2);
		System.out.println("Multiplicação: " + resultado3);
		System.out.printf("Divisão: %.1f" , resultado4);
	}

}
