package senaiprojetos;
import javax.swing.JOptionPane;

public class Exercicio10 {

	public static void main(String[] args) {
		/*
		 * Crie um array de caracteres com 5 elementos e inverta a ordem dos elementos
		 * no array. Imprima o array invertido.
		 */

		String valorDigitado;

		char[] caractere = new char[5];

		for (int i = 0; i < caractere.length; i++) {

			valorDigitado = JOptionPane.showInputDialog(null, "Digite 5 nomes para extrair suas respectivas iniciais");
			caractere[i] = valorDigitado.charAt(0);
		}
		for (int i = 0; i < caractere.length; i++) {
			
			System.out.println(caractere[i]);

			 for (int j = caractere.length - 1; j >= 0; j--) {
		      
				 System.out.println(caractere[j]);
		        }
		}
		
		
	
	}
	}


