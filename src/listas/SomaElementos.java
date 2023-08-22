package listas;

import java.util.ArrayList;

public class SomaElementos {

	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		lista.add(32);
		lista.add(46);
		lista.add(62);
		
		int soma = 0;
		for (int numero : lista) {
			soma += numero;
		}
		
		System.out.println("Soma dos valores em lista: " + soma);
	}
}
