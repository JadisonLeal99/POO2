import java.time.LocalDate;

public class Funcionario extends Pessoa {
	String matricula;
	LocalDate inicioTrabalho;
	public Funcionario(String nome, String sobrenome, String endereco, LocalDate dataNascimento, String matricula,
			LocalDate inicioTrabalho) {
		super(nome, sobrenome, endereco, dataNascimento);
		this.matricula = matricula;
		this.inicioTrabalho = inicioTrabalho;
	}
	
	
	
	
}
