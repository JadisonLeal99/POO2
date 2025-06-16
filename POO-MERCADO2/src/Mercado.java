public class Mercado {
	String nomeMercado;
	int macasVendidas;
	double precoMaca;
	int laranjasVendidas;
	double precoLaranja;

	
	
	public Mercado(String nomeMercado, int macasVendidas, double precoMaca, int laranjasVendidas, double precoLaranja) {
		this.nomeMercado = nomeMercado;
		this.macasVendidas = macasVendidas;
		this.precoMaca = precoMaca;
		this.laranjasVendidas = laranjasVendidas;
		this.precoLaranja = precoLaranja;
	}

	public double faturamentoMacas() {
		return  macasVendidas * precoMaca;
	}
	
	public double faturamentoLaranja() {
		return laranjasVendidas * precoLaranja;
	}
	
	public double receitaTotal() {
		return faturamentoMacas() + faturamentoLaranja();
	}
	
}
