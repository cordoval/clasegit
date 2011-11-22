package dojo;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ConversorNumeroTest {
	private Conversor conversor = null;
	String resultadoConversion = null;

	@Before
	public void inicia() {
		conversor = new Conversor();
		resultadoConversion = "";
	}

	@Test
	public void verificarConversionNumero1() {
		resultadoConversion = conversor.convertirNumeroDecimalToRomano(1);
		assertEquals("I", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero2() {
		resultadoConversion = conversor.convertirNumeroDecimalToRomano(2);
		assertEquals("II", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero3() {
		resultadoConversion = conversor.convertirNumeroDecimalToRomano(3);
		assertEquals("III", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero4() {
		resultadoConversion = conversor.convertirNumeroDecimalToRomano(4);
		assertEquals("IV", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero5() {
		resultadoConversion = conversor.convertirNumeroDecimalToRomano(5);
		assertEquals("V", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero6() {
		resultadoConversion = conversor.convertirNumeroDecimalToRomano(6);
		assertEquals("VI", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero7() {
		resultadoConversion = conversor.convertirNumeroDecimalToRomano(7);
		assertEquals("VII", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero8() {
		resultadoConversion = conversor.convertirNumeroDecimalToRomano(8);
		assertEquals("VIII", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero9() {
		resultadoConversion = conversor.convertirNumeroDecimalToRomano(9);
		assertEquals("IX", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero10() {
		resultadoConversion = conversor.convertirNumeroDecimalToRomano(10);
		assertEquals("X", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero11() {
		resultadoConversion = conversor.convertirNumeroDecimalToRomano(11);
		assertEquals("XI", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero12() {
		resultadoConversion = conversor.convertirNumeroDecimalToRomano(12);
		assertEquals("XII", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero13() {
		resultadoConversion = conversor.convertirNumeroDecimalToRomano(13);
		assertEquals("XIII", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero14() {
		resultadoConversion = conversor.convertirNumeroDecimalToRomano(14);
		assertEquals("XIV", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero15() {
		resultadoConversion = conversor.convertirNumeroDecimalToRomano(15);
		assertEquals("XV", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero16() {
		resultadoConversion = conversor.convertirNumeroDecimalToRomano(16);
		assertEquals("XVI", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero17() {
		resultadoConversion = conversor.convertirNumeroDecimalToRomano(17);
		assertEquals("XVII", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero18() {
		resultadoConversion = conversor.convertirNumeroDecimalToRomano(18);
		assertEquals("XVIII", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero19() {
		resultadoConversion = conversor.convertirNumeroDecimalToRomano(19);
		assertEquals("XIX", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero20() {
		resultadoConversion = conversor.convertirNumeroDecimalToRomano(20);
		assertEquals("XX", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero21() {
		resultadoConversion = conversor.convertirNumeroDecimalToRomano(21);
		assertEquals("XXI", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero22() {
		resultadoConversion = conversor.convertirNumeroDecimalToRomano(22);
		assertEquals("XXII", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero23() {
		resultadoConversion = conversor.convertirNumeroDecimalToRomano(23);
		assertEquals("XXIII", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero24() {
		resultadoConversion = conversor.convertirNumeroDecimalToRomano(24);
		assertEquals("XXIV", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero25() {
		resultadoConversion = conversor.convertirNumeroDecimalToRomano(25);
		assertEquals("XXV", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero26() {
		resultadoConversion = conversor.convertirNumeroDecimalToRomano(26);
		assertEquals("XXVI", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero27() {
		resultadoConversion = conversor.convertirNumeroDecimalToRomano(27);
		assertEquals("XXVII", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero28() {
		resultadoConversion = conversor.convertirNumeroDecimalToRomano(28);
		assertEquals("XXVIII", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero29() {
		resultadoConversion = conversor.convertirNumeroDecimalToRomano(29);
		assertEquals("XXIX", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero30() {
		resultadoConversion = conversor.convertirNumeroDecimalToRomano(30);
		assertEquals("XXX", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero35() {
		resultadoConversion = conversor.convertirNumeroDecimalToRomano(35);
		assertEquals("XXXV", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero39() {
		resultadoConversion = conversor.convertirNumeroDecimalToRomano(39);
		assertEquals("XXXIX", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero40() {
		resultadoConversion = conversor.convertirNumeroDecimalToRomano(40);
		assertEquals("XL", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero50() {
		resultadoConversion = conversor.convertirNumeroDecimalToRomano(50);
		assertEquals("L", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero51() {
		resultadoConversion = conversor.convertirNumeroDecimalToRomano(51);
		assertEquals("LI", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero59() {
		resultadoConversion = conversor.convertirNumeroDecimalToRomano(59);
		assertEquals("LIX", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero74() {
		resultadoConversion = conversor.convertirNumeroDecimalToRomano(74);
		assertEquals("LXXIV", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero79() {
		resultadoConversion = conversor.convertirNumeroDecimalToRomano(79);
		assertEquals("LXXIX", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero89() {
		resultadoConversion = conversor.convertirNumeroDecimalToRomano(89);
		assertEquals("LXXXIX", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero90() {
		resultadoConversion = conversor.convertirNumeroDecimalToRomano(90);
		assertEquals("XC", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero99() {
		resultadoConversion = conversor.convertirNumeroDecimalToRomano(99);
		assertEquals("XCIX", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero100() {
		resultadoConversion = conversor.convertirNumeroDecimalToRomano(100);
		assertEquals("C", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero101() {
		resultadoConversion = conversor.convertirNumeroDecimalToRomano(101);
		assertEquals("CI", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero109() {
		resultadoConversion = conversor.convertirNumeroDecimalToRomano(109);
		assertEquals("CIX", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero399() {
		resultadoConversion = conversor.convertirNumeroDecimalToRomano(399);
		assertEquals("CCCXCIX", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero899() {
		resultadoConversion = conversor.convertirNumeroDecimalToRomano(899);
		assertEquals("DCCCXCIX", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero989() {
		resultadoConversion = conversor.convertirNumeroDecimalToRomano(989);
		assertEquals("CMLXXXIX", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero999() {
		resultadoConversion = conversor.convertirNumeroDecimalToRomano(999);
		assertEquals("CMXCIX", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero1000() {
		resultadoConversion = conversor.convertirNumeroDecimalToRomano(1000);
		assertEquals("M", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero1010() {
		resultadoConversion = conversor.convertirNumeroDecimalToRomano(1010);
		assertEquals("MX", resultadoConversion);
	}

	@Test
	public void verificarConversionNumero1050() {
		resultadoConversion = conversor.convertirNumeroDecimalToRomano(1050);
		assertEquals("ML", resultadoConversion);
	}

	// El maximo valor a testear es 3999, debido ha que no existe el 5000 en
	// romanos y este simbolo es necesario para formar el 4000
	@Test
	public void verificarConversionNumero3999() {
		resultadoConversion = conversor.convertirNumeroDecimalToRomano(3999);
		assertEquals("MMMCMXCIX", resultadoConversion);
	}

}
