package exercicio_314;

public class Employee {
	private String nome;
	private String sobrenome;
	private double salarioMensal;
	private double salarioAnual;
	
	public Employee(String nome, String sobrenome, double salarioMensal){
		this.setNome(nome);
		this.setSobrenome(sobrenome);
		this.setSalarioMensal(salarioMensal);
		salarioAnual(salarioMensal);
		}
	
	public double salarioAnual(double salarioMensal){
		this.salarioAnual = salarioMensal * 12;
		return salarioAnual;
	}
	public double aumentoSalarioAnual(){
		double aumento = (this.salarioAnual * 0.1) + this.salarioAnual;
		return aumento;
		}
	public String getNome(){
		return nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getSobrenome(){
		return sobrenome;
	}
	public void setSobrenome(String sobrenome){
		this.sobrenome = sobrenome;
	}
	public double getSalarioMensal(){
		return salarioMensal;
	}
	public void setSalarioMensal(double salarioMensal){
		this.salarioMensal = salarioMensal;
	}
	public void exibirDados(){
		System.out.println("Nome: " + getNome());
		System.out.println("Sobrenome: " + getSobrenome());
		System.out.println("Salário Mensal: R$ " + getSalarioMensal());
		System.out.println("Salário Anual: R$ " + salarioAnual(salarioMensal));
		System.out.println("Salário Anual após o aumento(10%): R$ " + aumentoSalarioAnual() + "\n");
	}
}
