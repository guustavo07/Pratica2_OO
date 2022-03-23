public class Rendimento {

	double investimento, taxa, mes, rendimento;
		
	
	public Rendimento(double investimento, double taxa,  double mes) {
		this.investimento = investimento;
		this.taxa = taxa;
		this.mes = mes;
	}

	public void formulaRendimento(){
    for(int i=1; i<=mes; i++){
		    rendimento= investimento*taxa/100;
		    investimento+=rendimento;		    
        System.out.printf("Mes %02d   |   Rendimento/Mes  %.2f\n", i,investimento);
    }
	}
	
}