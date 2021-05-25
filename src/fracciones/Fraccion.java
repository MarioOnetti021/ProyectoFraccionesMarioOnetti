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
 * 	Añadir las siguientes operaciones a Fracción
 * 
 * 
 */
	public static Fraccion simplifica(Fraccion entrada) {

		//Solo simplifica fracciones par

		int num = entrada.numerador;
		int den = entrada.denominador;
		int divid =0 ;

		if (num % 2 == 0){
			divid = 2;
		}
		else if (num % 3 == 0){
			divid = 3;
		}

		while (num / divid >5 || den / divid>5){
			num = num / divid;
			den = den / divid;
		}

		return new Fraccion(num,den);
	}
	/*
	public static Fraccion suma(Fraccion sumando1, Fraccion sumando2) {
	}
	public static Fraccion multiplicacion(Fraccion sumando1, Fraccion sumando2) {
	}
	public static Fraccion division(Fraccion sumando1, Fraccion sumando2) {
	}
*/
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
		return numerador + "/" + denominador;
	}

}
