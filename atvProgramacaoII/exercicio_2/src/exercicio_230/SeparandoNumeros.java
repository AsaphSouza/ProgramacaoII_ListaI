package exercicio_230;

import java.util.Scanner;

public class SeparandoNumeros {

	public static void main(String[] args) {
		System.out.print("Informe um número inteiro de 5 dígitos: ");
		Scanner num = new Scanner(System.in);
		int numeroInformado = num.nextInt();
		
		num.close();
		
		if (numeroInformado <= 9999 || numeroInformado >= 100000){
			System.out.println("O número informado não corresponde a 5 dígitos.");
		}
		else{
			Separar separa = new Separar();
			String printar = separa.separarNumero(numeroInformado);
			System.out.println(printar);
		}

	}

}
