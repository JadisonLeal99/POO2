
public abstract class Computador {
	private String modelo;
	private double ram;
	private double armazenamento;
	
	
	public Computador(String modelo, double ram, double armazenamento) {
		setModelo(modelo);
		setRam(ram);
		setArmazenamento(armazenamento);
	}


	public abstract String ligarOuDesligar(boolean pwr);
	
	public abstract boolean rodarAplicacao(String str);
	
	
	
	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		if(modelo == null || modelo.isBlank()) {
			throw new IllegalArgumentException("Modelo inválido!");
		}
		this.modelo = modelo;
	}


	public double getRam() {
		return ram;
	}


	public void setRam(double ram) {
		if(ram <= 0) {
			throw new IllegalArgumentException("Quantidade de RAM inválida!");
		}
		this.ram = ram;
	}


	public double getArmazenamento() {
		return armazenamento;
	}


	public void setArmazenamento(double armazenamento) {
		if(armazenamento <= 0) {
			throw new IllegalArgumentException("Quantidade de Armazenamento inválida!");
		}
		this.armazenamento = armazenamento;
	}
		
}	
