package exercicio_230;

import java.util.Scanner;

public class SeparandoNumeros {

	public static void main(String[] args) {
		System.out.print("Informe um n�mero inteiro de 5 d�gitos: ");
		Scanner num = new Scanner(System.in);
		int numeroInformado = num.nextInt();
		
		num.close();
		
		if (numeroInformado <= 9999 || numeroInformado >= 100000){
			System.out.println("O n�mero informado n�o corresponde a 5 d�gitos.");
		}
		else{
			Separar separa = new Separar();
			String printar = separa.separarNumero(numeroInformado);
			System.out.println(printar);
		}

	}

}
