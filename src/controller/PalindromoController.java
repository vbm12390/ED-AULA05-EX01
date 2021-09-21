package controller;

import br.edu.fateczl.vinicius.pilhastring.Pilha;

public class PalindromoController {

	public String invertePalavra(Pilha Ptexto, String texto) {
		String Textoinvertido = "";
		String Newtexto = texto.replaceAll("\\s+", "");
		System.out.println(Newtexto);

		for (int i = 0; i < Newtexto.length(); i++) {
			String aux = (Newtexto.substring(i, i + 1));
			Ptexto.push(aux);

		}
		while (Ptexto.isEmpty() == false) {
			try {
				Textoinvertido += Ptexto.pop();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return Textoinvertido;
	}

	public Boolean comparaPalavras(String stringinvertida, String texto) {
		Boolean Validador = false;
		String Newtexto = texto.replaceAll("\\s+", "");
		if (Newtexto.equalsIgnoreCase(stringinvertida)){
			Validador = true;
		}
		return Validador;
	}

}