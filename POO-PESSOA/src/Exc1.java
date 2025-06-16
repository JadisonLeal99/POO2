
public class Exc1 {
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		pessoa1.nome = "André";
		pessoa1.sexo = 'M';
		pessoa1.dataNascimento = "11/06/2004";
		pessoa1.estadoCivil = "Solteiro";
		
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.nome = "Maicon";
		pessoa2.sexo = 'M';
		pessoa2.dataNascimento = "21/03/2006";
		pessoa2.estadoCivil = "Solteiro";
		
		System.out.println(pessoa1.nome + " nasceu em " + pessoa1.dataNascimento );
		System.out.println(pessoa2.nome + " nasceu em " + pessoa2.dataNascimento );
	}
}
