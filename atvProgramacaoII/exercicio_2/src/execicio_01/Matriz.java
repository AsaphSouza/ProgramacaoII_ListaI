package execicio_01;

import java.util.Scanner;

public class Matriz {
	private int linhas;
	private int colunas;
	private double matriz[][];
	
	public Matriz(int linhas, int colunas){
		this.linhas = linhas;
		this.colunas = colunas;
		matriz = new double[linhas][colunas];	
	}
	public void preencherMatriz(){
		for(int i = 0; i < this.linhas; i++){
			for(int j = 0; j < this.colunas; j++){
				Scanner scan = new Scanner(System.in);
				System.out.printf("Informe o %d elemento da %d coluna da matriz: ",i  + 1, j + 1);
				this.matriz[i][j] = scan.nextInt();
			}
		}
	}
	public Matriz multiplicarMatriz (Matriz m1, Matriz m2){
		if (m1.getLinhas() != m2.getColunas()){
			System.out.println("Não foi possível realizar a operação.");
		}
		Matriz resultado = new Matriz(m2.getColunas(), m1.getLinhas());
	    for (int i = 0; i < m2.getColunas(); i++) {
	    	for (int j = 0; j < m1.getLinhas(); j++) {
	    		for (int k = 0; k < m2.getColunas(); k++) {
						resultado.getMatriz()[i][j] += (m2.getMatriz()[k][j] * m1.getMatriz()[i][k]);
				}
			}
		}
	    return resultado;
	}
	 public void exibirMatriz(Matriz resolvida){
         String imprimeMatriz = "";
         for (int i = 0; i < resolvida.getLinhas(); i++){
        	 imprimeMatriz += " | ";
            for (int j = 0; j < resolvida.getColunas(); j++){
            	imprimeMatriz += matriz [i][j] + " ";            
            	}
            imprimeMatriz += " | \n";
            }
         System.out.println(imprimeMatriz);
    }
	
	 public int getLinhas() {
		return linhas;
	}
	public void setLinhas(int linhas) {
		this.linhas = linhas;
	}
	public int getColunas() {
		return colunas;
	}
	public void setColunas(int colunas) {
		this.colunas = colunas;
	}
	public double[][] getMatriz() {
		return matriz;
	}
	public void setMatriz(double[][] matriz) {
		this.matriz = matriz;
	}
	
}
