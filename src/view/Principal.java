package view;

import javax.swing.JOptionPane;

import br.edu.fateczl.vinicius.pilhastring.Pilha;
import controller.PalindromoController;

public class Principal {

	public static void main(String[] args) {
		PalindromoController Pcontroller = new PalindromoController();
		Boolean Validador = false;
		String stringinvertida;
		Pilha Ptexto = new Pilha();
		String texto = "";
		texto = JOptionPane.showInputDialog("Validador de Palindromo\n" + "Insira o texto: ");
		stringinvertida = Pcontroller.invertePalavra(Ptexto, texto);
		System.out.println(stringinvertida);
		Validador = Pcontroller.comparaPalavras(stringinvertida, texto);
		if (Validador == true) {
			JOptionPane.showMessageDialog(null, "Essa palavra é um Palindromo");
		} else {
			JOptionPane.showMessageDialog(null, "Essa palavra não é um Palindromo");
		}
	}
}
