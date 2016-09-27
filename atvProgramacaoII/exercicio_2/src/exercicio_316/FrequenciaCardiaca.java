package exercicio_316;

import java.util.Scanner;

public class FrequenciaCardiaca {

	public static void main(String[] args) {
		System.out.print("Informe seu primeiro nome: ");
		Scanner entrada = new Scanner(System.in);
		String nomePaciente = entrada.nextLine();
		
		System.out.print("Informe seu sobrenome: ");
		String sobrenomePaciente = entrada.nextLine();
		
		System.out.print("Informe o dia de seu nascimento: ");
		int diaNascPaciente = entrada.nextInt();
		
		System.out.print("Informe o mês de seu nascimento(ex. 01, 02, 03): ");
		int mesNascPaciente = entrada.nextInt();
		
		System.out.print("Informe o ano de seu nascimento: ");
		int anoNascPaciente = entrada.nextInt();
		
		entrada.close();
		
		HeartRates paciente = new HeartRates(nomePaciente, sobrenomePaciente, diaNascPaciente, mesNascPaciente, anoNascPaciente);
		paciente.exibirDados();
	}

}
