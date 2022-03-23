import java.util.Scanner;

public class Main{
		public static void main(String[] args) {
	    double investimento, taxa, mes, rendimento;
	    Scanner ler = new Scanner(System.in);
	    
	    System.out.println("Entre com o valor a ser investido: ");
	    investimento = ler.nextDouble();
	    System.out.println("Entre com a taxa ao mes: ");
	    taxa = ler.nextDouble();
	    System.out.println("Informe quantos meses o dinheiro será investido: ");
	    mes = ler.nextDouble();
		
		Rendimento r1 = new Rendimento(investimento, taxa, mes);
		
		System.out.println(r1.formulaRendimento());	
	}

}