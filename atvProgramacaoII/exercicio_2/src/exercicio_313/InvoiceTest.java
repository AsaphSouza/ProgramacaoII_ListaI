package exercicio_313;

public class InvoiceTest {

	public static void main(String[] args) {
		Invoice teste = new Invoice("13497","Sabonete", 2, 8.50);
		
		System.out.printf("Número: " + teste.getNumero() + "\nDescrição: " + teste.getDescricao() + "\nQuantidade: " + teste.getQuantidade() + "\nPreço do Item: R$ %.2f", teste.getPrecoItem());
		
		System.out.printf("\n\nPREÇO TOTAL: R$ %.2f", teste.getInvoiceAmount(teste.getQuantidade(), teste.getPrecoItem()));
		
		

	}

}
