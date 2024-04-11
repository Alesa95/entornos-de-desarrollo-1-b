package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import modelos.Rectangulo;

class TestRectangulo {
	static Rectangulo r1;
	static Rectangulo r2;
	
	@BeforeAll
	static void setup() {
		r1 = new Rectangulo();
		r2 = new Rectangulo(3,2);
	}
	
	@Test
	void areaR1() {
		double areaEsperada = 1;
		double areaObtenida = r1.area();
		assertEquals(areaEsperada, areaObtenida);
	}
}
