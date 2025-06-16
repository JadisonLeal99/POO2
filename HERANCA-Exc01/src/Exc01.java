import java.util.Scanner;

public class Exc01 {
	public static void main(String[] args) {
		
		Circulo c1 = new Circulo("Preto", 2);
		Circulo c2 = new Circulo("Azul", 3);
		
		Cilindro cil = new Cilindro("Branco", 2, 4);
		
		System.out.println(c1.calcularArea());
		System.out.println(c2.calcularArea());
		System.out.println(cil.calcularArea());
		System.out.println(cil.calcularVolume());
		
	}
}
