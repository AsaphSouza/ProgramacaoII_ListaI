package exercicio_317;

import java.util.Scanner;
 
public class HealthProfileTest {
	
	public static void main(String[] args) {
		System.out.print("Informe seu primeiro nome: ");
		Scanner entrada = new Scanner(System.in);
		String nomePaciente = entrada.nextLine();
		
		System.out.print("Informe seu sobrenome: ");
		String sobrenomePaciente = entrada.nextLine();
		
		System.out.print("Informe seu sexo: ");
		String sexoPaciente = entrada.nextLine();
		
		System.out.print("Informe o dia de seu nascimento: ");
		int diaNascPaciente = entrada.nextInt();
		
		System.out.print("Informe o mês de seu nascimento(ex. 01, 02, 03): ");
		int mesNascPaciente = entrada.nextInt();
		
		System.out.print("Informe o ano de seu nascimento: ");
		int anoNascPaciente = entrada.nextInt();
		
		System.out.print("Informe seu peso(em libras): ");
		double pesoPaciente = entrada.nextDouble();
		
		System.out.print("Informe sua altura(em polegadas): ");
		double alturaPaciente = entrada.nextDouble();
		entrada.close();
		
		HealthProfile paciente1 = new HealthProfile(nomePaciente, sobrenomePaciente, sexoPaciente, diaNascPaciente, mesNascPaciente, anoNascPaciente, alturaPaciente, pesoPaciente);
		paciente1.exibirDados();
	}
}
