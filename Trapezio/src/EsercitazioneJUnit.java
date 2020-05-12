import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EsercitazioneJUnit {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testCalcolaArea1() {
		Trapezio t=new Trapezio(1,2,3);
		assertEquals(4.5, t.calcolaArea());
	}
	
	@Test
	void testCalcolaArea2() {
		Trapezio t=new Trapezio(5,5,5);
		assertEquals(25, t.calcolaArea());
	}
	
	@Test
	void testCalcolaArea3() {
		Trapezio t=new Trapezio(32,1,5);
		assertEquals(82, t.calcolaArea(),0.5); //tolleranza per non commettere errore
	}

}
