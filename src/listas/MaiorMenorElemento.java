package listas;

import java.util.ArrayList;

public class MaiorMenorElemento {

	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<>();
		
		lista.add(65);
		lista.add(12);
		lista.add(2);
		
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		
		for (int numero : lista) {
			if (numero > maior) {
				maior = numero;
			} 
			if (numero < menor) {
				menor = numero;
			}
		}
		
		System.out.println("Maior número: " + maior);
		System.out.println("Menor número: " + menor);
	}
}
