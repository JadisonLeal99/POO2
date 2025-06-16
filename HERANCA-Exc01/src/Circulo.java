
public class Circulo {
	private String cor;
	private double raio;
	
	
	public Circulo(String cor, double raio) {
		setCor(cor);
		setRaio(raio);
	}


	public double calcularArea() {
		return Math.pow(raio, 2) * Math.PI;
	}
	
	public String getCor() {
		if(cor == null || cor.isBlank()) {
			throw new IllegalArgumentException("Cor inválida!");
		}
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public double getRaio() {
		return raio;
	}


	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	
	
	
}
