import java.time.LocalDate;

public class Cliente extends Pessoa{
	int pontuacao;
	int cashback;
	public Cliente(String nome, String sobrenome, String endereco, LocalDate dataNascimento, int pontuacao,
			int cashback) {
		super(nome, sobrenome, endereco, dataNascimento);
		this.pontuacao = pontuacao;
		this.cashback = cashback;
	}
}
