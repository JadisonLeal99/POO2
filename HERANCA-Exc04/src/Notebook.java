
public class Notebook extends Computador{ 
	
	private double peso;

	public Notebook(String modelo, double ram, double armazenamento, double peso) {
		super(modelo, ram, armazenamento);
		setPeso(peso);
	}

	
	
	public void aumentarRam(double maisRam) {
		super.setRam(super.getRam() + maisRam); 
	}
	
	
	public String ligarOuDesligar(boolean pwr) {
		if(pwr == true) {
			return "Ligando...";
		}
		return "Desligando";
	}
	
	
	public boolean rodarAplicacao(String str) {
		if(str.equalsIgnoreCase(".exe")) {
			return true;
		}
		return false;
	}
	
	
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if(peso <= 0) {
			throw new IllegalArgumentException("Quantidade de RAM inválida!");
		}
		this.peso = peso;
	}
	
	

}
