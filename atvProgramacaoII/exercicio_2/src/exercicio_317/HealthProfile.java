package exercicio_317;

public class HealthProfile {
	private String nome;
	private String sobrenome;
	private String sexo;
	private int dia;
	private int mes;
	private int ano;
	private double altura;
	private double peso;
	
	public HealthProfile(String nome, String sobrenome, String sexo, int dia, int mes, int ano, double altura, double peso) {
		setNome(nome);
		setSobrenome(sobrenome);
		setSexo(sexo);
		setDia(dia);
		setMes(mes);
		setAno(ano);
		setAltura(altura);
		setPeso(peso);
	}
	
	public double pesoKg() {
		return getPeso() / 2.2046;
	}
	public double alturaM() {
		return (getAltura() * 2.5) / 100;
	}
	public double imc() {
		return pesoKg() / (alturaM() * alturaM());
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
		System.out.println("Sexo: " + getSexo());
		System.out.println("Altura: " + getAltura());
		System.out.println("Peso: " + getPeso());
		System.out.println("Idade: " + idade());
		System.out.println("Data de nascimento: " + getDia() + "/" + getMes() + "/" + getAno());
		System.out.println("Frequência máxima cardíaca: " + frequenciaMax());
		System.out.printf("Frequência cardíaca-alvo: %.2f", frequenciaAlvo());
		System.out.println("\nIMC: " + imc() + "\n\nAbaixo do peso: menos que 18.5\nNormal: entre 18.5 e 24.9\nObeso: 30 ou maior");
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
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
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
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
}
