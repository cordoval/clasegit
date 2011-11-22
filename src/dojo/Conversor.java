package dojo;

import java.util.Map;
import java.util.Stack;

public class Conversor {

	Map<Integer, String[]> caracteresRomanos = SimboloRomano
			.obtenerCaracteresRomanos();

	public String convertirNumeroDecimalToRomano(int valorConvertir) {
		String resultadoFinal = "";

		String cadenaInvertida = new StringBuilder().append(valorConvertir)
				.reverse().toString();

		Stack<String> resultadoPreliminarPorPosicion = new Stack<String>();

		for (int i = 0; i < cadenaInvertida.length(); i++)
			resultadoPreliminarPorPosicion.push(obtenerCaracterRomanoSegunPosicion(
					cadenaInvertida.charAt(i), i));

		while (!resultadoPreliminarPorPosicion.empty())
			resultadoFinal += resultadoPreliminarPorPosicion.pop();

		return resultadoFinal;
	}

	private String obtenerCaracterRomanoSegunPosicion(Character valor, int posicion) {
		String resultado = "";

		int valorNumerico = new Integer(valor.toString());

		resultado = escribeRango1To9(valorNumerico,
				caracteresRomanos.get(posicion)[0],
				caracteresRomanos.get(posicion)[1],
				caracteresRomanos.get(posicion)[2]);

		return resultado;
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

		resultado = cuerpoRepetido(diferenciaLateral,
				simboloRomanoBase, simboloRomanoLateral);

		return resultado;
	}

	private String cuerpoRepetido(int diferenciaLateral,
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

}
