package hoffrogge.lehreinheit02;

public class FehlerFaelle {

	private void testeArrayIndexOutOfBoundsException() {

		int[] zahlen = { 1, 2, 3, 4, 5 };

		System.out.println(zahlen[0]);

		System.out.println(zahlen[5]);
	}

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

		Obst apfel = new Apfel();
		Obst birne = new Birne();

		apfel = (Apfel) birne;

	}

	public static void main(String[] args) {

		FehlerFaelle fehlerFaelle = new FehlerFaelle();

		 try {
			fehlerFaelle.testeArrayIndexOutOfBoundsException();
		} catch (Exception e) {
			System.err.println("Hier wurde eine ArrayIndexOutOfBoundsException demonstriert.");
		}

		 try {
			fehlerFaelle.testeNullPointerException();
		} catch (Exception e) {
			System.err.println("Hier wurde eine NullPointerException demonstriert.");
		}

		 try {
			fehlerFaelle.testeDurchNullTeilen();
		} catch (Exception e) {
			System.err.println("Hier wurde eine ArithmeticException demonstriert.");
		}

		try {
			fehlerFaelle.testeClassCastException();
		} catch (Exception e) {
			System.err.println("Hier wurde eine ClassCastException demonstriert.");
		}
	}

	private class Obst {
	}

	private class Apfel extends Obst {
	}

	private class Birne extends Obst {
	}
}