package exercicio_316;

public class HeartRates {
	private String nome;
	private String sobrenome;
	private int dia;
	private int mes;
	private int ano;
	
	public HeartRates(String nome, String sobrenome, int dia, int mes, int ano) {
		setNome(nome);
		setSobrenome(sobrenome);
		setDia(dia);
		setMes(mes);
		setAno(ano);
	}
	public int idade() {
		return 2016 - getAno();
	}
	public int frequenciaMax() {
		return 220 - idade();
	}
	public double frequenciaAlvo() {
		return (frequenciaMax() * 0.85) - 50;
	}
	public void exibirDados() {
		System.out.println("\nNome: " + getNome());
		System.out.println("Sobrenome: " + getSobrenome());
		System.out.println("Idade: " + idade());
		System.out.println("Data de nascimento: " + getDia() + "/" + getMes() + "/" + getAno());
		System.out.println("Frequência máxima cardíaca: " + frequenciaMax());
		System.out.printf("Frequência cardíaca-alvo: %.2f", frequenciaAlvo());
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
}
