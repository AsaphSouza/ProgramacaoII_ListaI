package exercicio_313;

public class InvoiceTest {

	public static void main(String[] args) {
		Invoice teste = new Invoice("13497","Sabonete", 2, 8.50);
		
		System.out.printf("N�mero: " + teste.getNumero() + "\nDescri��o: " + teste.getDescricao() + "\nQuantidade: " + teste.getQuantidade() + "\nPre�o do Item: R$ %.2f", teste.getPrecoItem());
		
		System.out.printf("\n\nPRE�O TOTAL: R$ %.2f", teste.getInvoiceAmount(teste.getQuantidade(), teste.getPrecoItem()));
		
		

	}

}
