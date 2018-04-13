package hoffrogge.lehreinheit02;

public class FehlerFaelle {

	private void testeArrayIndexOutOfBoundsException() {

		int[] zahlen = { 1, 2, 3, 4, 5 };

		System.out.println(zahlen[5]);
	}

	@SuppressWarnings("null")
	private void testeNullPointerException() {

		FehlerFaelle nichtInitialisierteFehler = null;
		nichtInitialisierteFehler.testeNullPointerException();
	}

	private void testeDurchNullTeilen() {

		int a = 5;

		int b = 0;

		System.out.println("Versuche durch 0 zu teilen: " + a / b);
	}

	private void testeClassCastException() {

		@SuppressWarnings("unused")
		Obst apfel = new Apfel();
		Obst birne = new Birne();

		apfel = (Apfel) birne;

	}

	public static void main(String[] args) {

		FehlerFaelle fehlerFaelle = new FehlerFaelle();

		// Hier wird eine ArrayIndexOutOfBoundsException demonstriert.
		 fehlerFaelle.testeArrayIndexOutOfBoundsException();

		// Hier wird eine NullPointerException demonstriert.
		 fehlerFaelle.testeNullPointerException();

		// Hier wird eine ArithmeticException: / by zero demonstriert.
		 fehlerFaelle.testeDurchNullTeilen();

		// Hier wird eine ClassCastException demonstriert.
		fehlerFaelle.testeClassCastException();
	}

	private class Obst {
	}

	private class Apfel extends Obst {
	}

	private class Birne extends Obst {
	}
}