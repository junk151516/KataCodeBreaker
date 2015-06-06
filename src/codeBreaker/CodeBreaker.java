package codeBreaker;

public class CodeBreaker {

	public CodeBreaker() {

	}

	public String comparar(String numeroSecreto, String numeroCandidato) {
		String resultado = "";
		String resultadoEquis = "";
		String resultadoRaya = "";
		char[] secretoArreglo = numeroSecreto.toCharArray();
		char[] candidatoArreglo = numeroCandidato.toCharArray();
		

		for (int i = 0; i < secretoArreglo.length; i++) {

			if (secretoArreglo[i] == candidatoArreglo[i]) {
				resultadoEquis = resultadoEquis + "X";
			} else
				for (int j = 0; j < secretoArreglo.length; j++) {
					if (secretoArreglo[i] == candidatoArreglo[j]) {
						resultadoRaya = resultadoRaya + "_";
					}
				}
		}

		resultado = resultadoEquis + resultadoRaya;
		return (resultado);
	}
}
