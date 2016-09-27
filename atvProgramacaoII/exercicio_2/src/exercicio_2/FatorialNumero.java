package exercicio_2;
import java.util.Scanner;

// O programa irá calcular o fatorial de um numero informado pelo usuário

public class FatorialNumero {

	public static void main(String[] args) {
		System.out.print("Informe um numero para calcular o fatorial: ");
		
		Scanner numero = new Scanner(System.in);
		int num = numero.nextInt();
		numero.close();
		
		CalcularFatorial fatorial = new CalcularFatorial();
		
		int resultado = fatorial.calcularFatorial(num);
		System.out.println(num + "! = " + resultado);
		
	}

}
