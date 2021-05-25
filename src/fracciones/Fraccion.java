package fracciones;




public class Fraccion {
	private int numerador;
	private int denominador;

	public Fraccion(int numerador, int denominador) {
		super();
		this.numerador = numerador;
		this.denominador = denominador;
	}
/*
	public static Fraccion simplifica(Fraccion entrada) {
		return entrada;
	}

 */
	
	public static Fraccion suma(Fraccion sumando1, Fraccion sumando2) {
		int denomC = sumando1.getDenominador() * sumando2.getDenominador();

		int n1 = sumando1.getNumerador() * sumando2.getDenominador();
		int n2 = sumando2.getNumerador() * sumando1.getDenominador();
		
		return new Fraccion(n1 + n2, denomC);

	}

	public static Fraccion multiplicacion(Fraccion sumando1, Fraccion sumando2) {

		int n1 = sumando1.getNumerador() * sumando2.getNumerador();
		int n2 = sumando1.getDenominador() * sumando2.getDenominador();


		return new Fraccion(n1,n2);


	}
	public static Fraccion division(Fraccion sumando1, Fraccion sumando2) {
		int n1 = sumando1.getNumerador() * sumando2.getDenominador();
		int n2 = sumando1.getDenominador() * sumando2.getNumerador();


		return new Fraccion(n1,n2);
	}

	public int getNumerador() {
		return numerador;
	}

	public int getDenominador() {
		return denominador;
	}


	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}

	@Override
	public String toString() {

		return numerador + "/ " + denominador;
	}

}
