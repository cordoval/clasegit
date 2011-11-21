package dojo;

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

}
