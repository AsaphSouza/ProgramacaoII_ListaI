package execicio_01;

public class MatrizTest {

	public static void main(String[] args) {
		
		Matriz matriz1 = new Matriz(3,2);
		Matriz matriz2 = new Matriz(2,3);
		
		matriz1.preencherMatriz();
		matriz2.preencherMatriz();
		
		matriz1.exibirMatriz(matriz1.multiplicarMatriz(matriz1, matriz2));
		
	}

}
