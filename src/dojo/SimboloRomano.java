package dojo;

import java.util.HashMap;
import java.util.Map;

public enum SimboloRomano {

	UNO("I"), CINCO("V"), DIEZ("X"), CINCUENTA("L"), CIEN("C"), QUINIENTOS("D"), MIL(
			"M");

	private String representacionRomana;

	private SimboloRomano(String valor) {
		representacionRomana = valor;
	}

	public String getRepresentacionRomana() {
		return representacionRomana;
	}

	public static Map<Integer, String[]> obtenerCaracteresRomanos() {
		Map<Integer, String[]> caracteresRomanos = new HashMap<Integer, String[]>();
		String[] unidades = { UNO.representacionRomana,
				CINCO.representacionRomana, DIEZ.representacionRomana };
		String[] decenas = { DIEZ.representacionRomana,
				CINCUENTA.representacionRomana, CIEN.representacionRomana };
		String[] centenas = { CIEN.representacionRomana,
				QUINIENTOS.representacionRomana, MIL.representacionRomana };
		String[] millares = { MIL.representacionRomana, "", "" };
		caracteresRomanos.put(0, unidades);
		caracteresRomanos.put(1, decenas);
		caracteresRomanos.put(2, centenas);
		caracteresRomanos.put(3, millares);
		return caracteresRomanos;
	}

}
