package dojo;

public class Conversor {
	int unidades = 0;
	int decenas = 0;
	int centenas = 0;
	int millares = 0;
	PosicionNumeracionDecimal posicionMaximaNumeracionDecimal;

	public String convierteNumeroDecimalToRomano(int valorConvertir) {
		String resultado = "";

		obtenerPosicionMaximoNumeroDecimal(valorConvertir);

		if (posicionMaximaNumeracionDecimal
				.equals(PosicionNumeracionDecimal.UNIDADES)) {
			resultado = obtenerUnidadesRomanas();
		} else if (posicionMaximaNumeracionDecimal
				.equals(PosicionNumeracionDecimal.DECENAS)) {
			resultado = obtenerDecenasRomanas() + obtenerUnidadesRomanas();
		} else if (posicionMaximaNumeracionDecimal
				.equals(PosicionNumeracionDecimal.CENTENAS)) {
			resultado = obtenerCentenasRomanas() + obtenerDecenasRomanas()
					+ obtenerUnidadesRomanas();
		} else if (posicionMaximaNumeracionDecimal
				.equals(PosicionNumeracionDecimal.MILLARES)) {
			resultado = obtenerMillaresRomanas() + obtenerCentenasRomanas()
					+ obtenerDecenasRomanas() + obtenerUnidadesRomanas();
		}
		return resultado;
	}

	private String obtenerUnidadesRomanas() {
		return escribeRango1To9(unidades,
				SimboloRomano.UNO.getRepresentacionRomana(),
				SimboloRomano.CINCO.getRepresentacionRomana(),
				SimboloRomano.DIEZ.getRepresentacionRomana());
	}

	private String obtenerDecenasRomanas() {
		return escribeRango1To9(decenas,
				SimboloRomano.DIEZ.getRepresentacionRomana(),
				SimboloRomano.CINCUENTA.getRepresentacionRomana(),
				SimboloRomano.CIEN.getRepresentacionRomana());
	}

	private String obtenerCentenasRomanas() {
		return escribeRango1To9(centenas,
				SimboloRomano.CIEN.getRepresentacionRomana(),
				SimboloRomano.QUINIENTOS.getRepresentacionRomana(),
				SimboloRomano.MIL.getRepresentacionRomana());
	}

	private String obtenerMillaresRomanas() {
		return escribeRango1To9(millares,
				SimboloRomano.MIL.getRepresentacionRomana(), "", "");
	}

	private String escribeRango1To9(int valor, String romanoInferior,
			String romanoMedio, String romanoSuperior) {
		String resultado = "";
		if (valor >= 1 && valor <= 3)
			resultado = escribirPatronQueRepiteCada3(valor, romanoInferior);
		else if (valor >= 4 && valor <= 8)
			resultado = escribirPatronQueRepiteCada5(valor, 5, romanoMedio,
					romanoInferior);
		else if (valor == 9)
			resultado = escribirPatronQueRepiteCada5(valor, 10, romanoSuperior,
					romanoInferior);
		return resultado;
	}

	private String escribirPatronQueRepiteCada3(int repeticiones,
			String simboloRomano) {
		String resultado = "";
		for (int i = 1; i <= repeticiones; i++)
			resultado += simboloRomano;
		return resultado;
	}

	private String escribirPatronQueRepiteCada5(int valor, int valorBase,
			String simboloRomanoBase, String simboloRomanoLateral) {
		String resultado = "";
		int diferenciaLateral = valor - valorBase;

		resultado = cuerpoRepetidoMejorado(diferenciaLateral,
				simboloRomanoBase, simboloRomanoLateral);

		return resultado;
	}

	private String cuerpoRepetidoMejorado(int diferenciaLateral,
			String simboloRomanoBase, String simboloRomanoLateral) {
		String resultado = "";

		if (diferenciaLateral < 0) {
			resultado = escribirPatronQueRepiteCada3(
					Math.abs(diferenciaLateral), simboloRomanoLateral)
					+ simboloRomanoBase;
		} else if (diferenciaLateral == 0) {
			resultado = simboloRomanoBase;
		} else {
			resultado = simboloRomanoBase
					+ escribirPatronQueRepiteCada3(Math.abs(diferenciaLateral),
							simboloRomanoLateral);
		}
		return resultado;
	}

	private void obtenerPosicionMaximoNumeroDecimal(int numero) {
		if (numero > 0 && numero < 10) {
			posicionMaximaNumeracionDecimal = PosicionNumeracionDecimal.UNIDADES;
			unidades = numero % 10;
		} else if (numero >= 10 && numero < 100) {
			posicionMaximaNumeracionDecimal = PosicionNumeracionDecimal.DECENAS;
			unidades = numero % 10;
			decenas = numero / 10;
		} else if (numero >= 100 && numero < 1000) {
			posicionMaximaNumeracionDecimal = PosicionNumeracionDecimal.CENTENAS;
			unidades = numero % 10;
			decenas = numero % 100 / 10;
			centenas = numero / 100;
		} else if (numero >= 1000 && numero < 10000) {
			posicionMaximaNumeracionDecimal = PosicionNumeracionDecimal.MILLARES;
			unidades = numero % 10;
			decenas = numero % 100 / 10;
			centenas = numero % 1000 / 100;
			millares = numero / 1000;
		}
	}
}
