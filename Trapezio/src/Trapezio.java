/**
 * <u>CLASSE TRAPEZIO</u>
 * 
 * @author <mark>Francesco Giuri</mark>
 *
 */
public class Trapezio {

	// attributi
	private float baseMag, baseMin, alt;

	/**
	 * COSTRUTTORE DELLA CLASSE TRAPEZIO
	 * 
	 * @param baseMag base maggiore
	 * @param baseMin base minore
	 * @param alt     altezza
	 */
	public Trapezio(float baseMag, float baseMin, float alt) {
		this.baseMag = baseMag;
		this.baseMin = baseMin;
		this.alt = alt;
	}

	/**
	 * CALCOLA AREA DEL TRAPEZIO
	 * 
	 * @return AREA DEL TRAPEZIO
	 */
	public float calcolaArea() {
		return ((baseMag * baseMin) * alt) / 2; // errore
	}

	/**
	 * Classe test main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

	}

}
