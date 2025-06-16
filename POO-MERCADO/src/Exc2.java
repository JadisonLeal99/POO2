import java.text.DecimalFormat;
public class Exc2 {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("0.00");
		Mercado unidadeDeBlumenau = new Mercado();
		unidadeDeBlumenau.nomeMercado = "Cooper Mafisa";
		unidadeDeBlumenau.macasVendidasAno = 360;
		unidadeDeBlumenau.precoVendaMacas = 10.82;
		unidadeDeBlumenau.laranjasVendidasAno = 987;
		unidadeDeBlumenau.precoVendaLaranjas = 6.49;
		unidadeDeBlumenau.faturamentoLaranjasAno = unidadeDeBlumenau.laranjasVendidasAno * unidadeDeBlumenau.precoVendaLaranjas; 
		
		Mercado unidadeDeJoinville = new Mercado();
		unidadeDeJoinville.nomeMercado = "Cooper Joinville";
		unidadeDeJoinville.macasVendidasAno = 678;
		unidadeDeJoinville.precoVendaMacas = 8.45;
		unidadeDeJoinville.laranjasVendidasAno = 1807;
		unidadeDeJoinville.precoVendaLaranjas = 5.89;
		unidadeDeJoinville.faturamentoLaranjasAno = unidadeDeJoinville.laranjasVendidasAno * unidadeDeJoinville.precoVendaLaranjas;
		
		
		Mercado unidadeDeFlorianopolis = new Mercado();
		unidadeDeFlorianopolis.nomeMercado = "Cooper Floripa";
		unidadeDeFlorianopolis.macasVendidasAno = 1248;
		unidadeDeFlorianopolis.precoVendaMacas = 11.76;
		unidadeDeFlorianopolis.laranjasVendidasAno = 2886;
		unidadeDeFlorianopolis.precoVendaLaranjas = 6.79;
		unidadeDeFlorianopolis.faturamentoLaranjasAno = unidadeDeFlorianopolis.laranjasVendidasAno * unidadeDeFlorianopolis.precoVendaLaranjas;
		
	
		System.out.println("A " + unidadeDeBlumenau.nomeMercado + " vendeu " + unidadeDeBlumenau.laranjasVendidasAno + " laranjas no ano de 2025 e arrecadou R$" + df.format(unidadeDeBlumenau.faturamentoLaranjasAno)+".");
		System.out.println("A " + unidadeDeJoinville.nomeMercado + " vendeu " + unidadeDeJoinville.laranjasVendidasAno + " laranjas no ano de 2025 e arrecadou R$" + df.format(unidadeDeJoinville.faturamentoLaranjasAno)+".");
		System.out.println("A " + unidadeDeFlorianopolis.nomeMercado + " vendeu " + unidadeDeFlorianopolis.laranjasVendidasAno + " laranjas no ano de 2025 e arrecadou R$" + df.format(unidadeDeFlorianopolis.faturamentoLaranjasAno)+".");
		
	}
}
