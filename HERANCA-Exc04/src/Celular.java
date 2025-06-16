
public class Celular extends Computador{
	private int operadora;
	private boolean cameraFrontal;
	public Celular(String modelo, double ram, double armazenamento, int operadora, boolean camera) {
		super(modelo, ram, armazenamento);
		setOperadora(operadora);
		setCameraFrontal(cameraFrontal);
	}
	
	public boolean tirarSelfie() {
		if(cameraFrontal == true) {
			return true;
		}
		return false;
	}
	
	public boolean ligar(String pwr) {
		return pwr.charAt(1) == operadora;	
	}
	
	public boolean rodarAplicacao(String str) {
		if(str.equalsIgnoreCase(".apk")) {
			return true;
		}
		return false;
	}
	
	
	
	public int getOperadora() {
		return operadora;
	}
	public void setOperadora(int operadora) {
		if(operadora < 0) {
			throw new IllegalArgumentException("Quantidade de operadora inválida!");
		}
		this.operadora = operadora;
	}
	public boolean getCameraFrontal() {
		return cameraFrontal;
	}
	public void setCameraFrontal(boolean cameraFrontal) {
		this.cameraFrontal = cameraFrontal;
	}

	@Override
	public String ligarOuDesligar(boolean pwr) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
