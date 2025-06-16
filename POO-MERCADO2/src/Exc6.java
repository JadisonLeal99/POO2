
public class Exc6 {
	public static void main(String[] args) {
		Mercado blumenau = new Mercado("Unidade Blumenau", 200, 1.5, 150, 2.0);
		Mercado joinville = new Mercado("Unidade Joinville", 250, 1.3,  130, 2.10);
		Mercado florianopolis = new Mercado("Unidade Florianópolis", 180, 1.4, 250, 1.9);

		
		Mercado[] array = {blumenau, joinville, florianopolis};
		
		//  Quem teve a maior receita vendendo maçãs?
		double maiorReceitaMacas = 0;
		String nomeMaiorReceitaMacas = "";
		for(int i = 0; i < array.length; i++) {
			if(array[i].faturamentoMacas() > maiorReceitaMacas) {
				maiorReceitaMacas = array[i].faturamentoMacas();
				nomeMaiorReceitaMacas = array[i].nomeMercado;
			}
		}
		System.out.println(nomeMaiorReceitaMacas);
		
		
		//Quem teve a maior receita vendendo laranjas?
		double maiorReceitaLaranjas = 0;
		String nomeMaiorReceitaLaranjas = "";
		for(int i = 0; i < array.length; i++) {
			if(array[i].faturamentoLaranja() > maiorReceitaLaranjas) {
				maiorReceitaLaranjas = array[i].faturamentoLaranja();
				nomeMaiorReceitaLaranjas = array[i].nomeMercado;
			}
		}
		System.out.println(nomeMaiorReceitaLaranjas);
		
		
		//Qual das lojas teve a maior receita?
		double maiorReceitaTotal = 0;
		String nomeMaiorReceitaTotal = "";
		for(int i = 0; i < array.length; i++) {
			if(array[i].receitaTotal() > maiorReceitaTotal) {
				maiorReceitaTotal = array[i].receitaTotal();
				nomeMaiorReceitaTotal = array[i].nomeMercado;
			}
		}
		System.out.println(nomeMaiorReceitaTotal);
		
		
		//Qual das lojas teve a menor receita?
		double menorReceitaTotal = Double.MAX_VALUE;
		String nomeMenorReceitaTotal = "";
		for(int i = 0; i < array.length; i++) {
			if(array[i].receitaTotal() < menorReceitaTotal) {
				menorReceitaTotal = array[i].receitaTotal();
				nomeMenorReceitaTotal = array[i].nomeMercado;
			}
		}
		System.out.println(nomeMenorReceitaTotal);
		
		
		//Qual das lojas ficou no "meio" em termos de receita?
		double receitaTotal2 = 0;
		double receitaMeio = 0;
		String receitaMeioNome = "";
		for(int i = 0; i < array.length; i++) {
			if(array[i].receitaTotal() > receitaTotal2) {
				receitaTotal2 = array[i].receitaTotal();
			}
		}
		for(int i = 0; i < array.length; i++) {
			if(array[i].receitaTotal() > receitaMeio && array[i].receitaTotal() != receitaTotal2) {
				receitaMeio = array[i].receitaTotal();
				receitaMeioNome = array[i].nomeMercado;
			}
		}
		System.out.println(receitaMeioNome);
		
		
		// Juntando as 3 lojas, a franquia teve uma receita maior vendendo maçãs ou laranjas?
		double receitaMaca = 0;
		double receitaLaranja = 0;
		for(int i = 0; i < array.length; i++) {
			receitaMaca += array[i].faturamentoMacas();
			receitaLaranja += array[i].faturamentoLaranja();
		}
		
		if(receitaMaca > receitaLaranja) {
			System.out.println("Mais receita em Maçã");
		} else if(receitaLaranja > receitaMaca) {
			System.out.println("Mais receita em Laranja");
		} else {
			System.out.println("Receitas iguais");
		}
		
			
			
			
			
			
			
			
	
			
			
			
//		System.out.println("A " + blumenau.nomeMercado + " vendas Maçãs R$" + blumenau.faturamentoMacas());
//		System.out.println("A " + joinville.nomeMercado + " vendas Maçãs R$" + joinville.faturamentoMacas());
//		System.out.println("A " + florianopolis.nomeMercado + " vendas Maçãs R$" + florianopolis.faturamentoMacas());
//		
//		
//		
//		// QUEM TEVE O MAIOR FATURAMENTO VENDENDO MAÇÃS
//		if(blumenau.faturamentoMacas() > joinville.faturamentoMacas() && blumenau.faturamentoMacas() > florianopolis.faturamentoMacas()) {
//			System.out.println("A " + blumenau.nomeMercado + " teve o maior faturamento vendendo Maçãs R$" + blumenau.faturamentoMacas());
//		} else if(joinville.faturamentoMacas() > florianopolis.faturamentoMacas() && joinville.faturamentoMacas() > blumenau.faturamentoMacas()) {
//			System.out.println("A " + joinville.nomeMercado + " teve o maior faturamento vendendo Maçãs R$" + joinville.faturamentoMacas());
//		} else {
//			System.out.println("A " + florianopolis.nomeMercado + " teve o maior faturamento vendendo Maçãs R$" + florianopolis.faturamentoMacas());
//		}
//		System.out.println();
//		System.out.println("A " + blumenau.nomeMercado + " vendas Laranjas R$" + blumenau.faturamentoLaranja());
//		System.out.println("A " + joinville.nomeMercado + " vendas Laranjas R$" + joinville.faturamentoLaranja());
//		System.out.println("A " + florianopolis.nomeMercado + " vendas Laranjas R$" + florianopolis.faturamentoLaranja());
//		
//		// QUEM TEVE O MAIOR FATURAMENTO VENDENDO LARANJAS
//		if(blumenau.faturamentoLaranja() > joinville.faturamentoLaranja() && blumenau.faturamentoLaranja() > florianopolis.faturamentoLaranja()) {
//			System.out.println("A " + blumenau.nomeMercado + " teve o maior faturamento vendendo Laranjas R$" + blumenau.faturamentoLaranja());
//		} else if(joinville.faturamentoLaranja() > florianopolis.faturamentoLaranja() && joinville.faturamentoLaranja() > blumenau.faturamentoLaranja()) {
//			System.out.println("A " + joinville.nomeMercado + " teve o maior faturamento vendendo Laranjas R$" + joinville.faturamentoLaranja());
//		} else {
//			System.out.println("A " + florianopolis.nomeMercado + " teve o maior faturamento vendendo Laranjas R$" + florianopolis.faturamentoLaranja());
//		}
//		
//		System.out.println();
//		System.out.println();
//		
//		
//		// MAIOR FATURAMENTO GERAL VENDENDO LARANJAS E MAÇAS
//		if(blumenau.receitaTotal() > joinville.receitaTotal() && blumenau.receitaTotal() > florianopolis.receitaTotal()) {
//			System.out.println("A " + blumenau.nomeMercado + " teve a MAIOR receita vendendo Laranjas e Maçãs R$" + blumenau.receitaTotal());
//		} else if(joinville.receitaTotal() > florianopolis.receitaTotal() && joinville.receitaTotal() > blumenau.receitaTotal()) {
//			System.out.println("A " + joinville.nomeMercado + " teve a MAIOR receita vendendo Laranjas e Maçãs R$" + joinville.receitaTotal());
//		} else {
//			System.out.println("A " + florianopolis.nomeMercado + " teve a MAIOR receita vendendo Laranjas e Maçãs R$" + florianopolis.receitaTotal());
//		}
//		
//		// MENOR FATURAMENTO GERAL VENDENDO LARANJAS E MAÇAS
//		if(blumenau.receitaTotal() < joinville.receitaTotal() && blumenau.receitaTotal() < florianopolis.receitaTotal()) {
//			System.out.println("A " + blumenau.nomeMercado + " teve a MENOR receita vendendo Laranjas e Maçãs R$" + blumenau.receitaTotal());
//		} else if(joinville.receitaTotal() < florianopolis.receitaTotal() && joinville.receitaTotal() < blumenau.receitaTotal()) {
//			System.out.println("A " + joinville.nomeMercado + " teve a MENOR receita vendendo Laranjas e Maçãs R$" + joinville.receitaTotal());
//		} else {
//			System.out.println("A " + florianopolis.nomeMercado + " teve a MENOR receita vendendo Laranjas e Maçãs R$" + florianopolis.receitaTotal());
//		}
//	
//		
//		// QUAL UNIDADE FICOU NO MEIO EM TERMOS DE FATURAMENTO GERAL VENDENDO LARANJAS E MAÇAS
//		if(blumenau.receitaTotal() > joinville.receitaTotal() && blumenau.receitaTotal() < florianopolis.receitaTotal()) {
//			System.out.println("A " + blumenau.nomeMercado + " ficou no MEIO em termos de receita vendendo Laranjas e Maçãs R$" + blumenau.receitaTotal());
//		} else if(joinville.receitaTotal() > florianopolis.receitaTotal() && joinville.receitaTotal() < blumenau.receitaTotal()) {
//			System.out.println("A " + joinville.nomeMercado + " ficou no MEIO em termos de receita vendendo Laranjas e Maçãs R$" + joinville.receitaTotal());
//		} else {
//			System.out.println("A " + florianopolis.nomeMercado + " ficou no MEIO em termos de receita vendendo Laranjas e Maçãs R$" + florianopolis.receitaTotal());
//		}
//		System.out.println();
//		
//		
//		// FATURAMENTO TOTAL JUNTANDO AS 3 LOJAS NA VENDA DE LARANJAS E MAÇÃS
//		double faturamentoDas3Lojas = blumenau.receitaTotal() + joinville.receitaTotal() + florianopolis.receitaTotal();
//		System.out.println("As três lojas juntas vendendo Laranjas e Maçãs teve o faturamento de R$" + faturamentoDas3Lojas);
		
	}
}





































