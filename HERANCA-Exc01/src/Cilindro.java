
public class Cilindro extends Circulo{
	
	private double altura;

	public Cilindro(String cor, double raio, double altura) {
		super(cor, raio);
		setAltura(altura);
	}
	
	
	public double calcularVolume() {
		return super.calcularArea() * altura;
	}
	
	public double getAltura() {
		if(altura <= 0) {
			throw new IllegalArgumentException("Altura inválida!");
		}
		return altura;
	}



	public void setAltura(double altura) {
		this.altura = altura;
	}

}
