package com.java.exercise.ejerciciosbasicos2;

public class NumerosDivisiblesEntreDosYTres {

	public static void main(String[] args) {

		/*
		 * 12) Muestra los números del 1 al 100 (ambos incluidos) divisibles
		 * entre 2 y 3. Utiliza el bucle que desees.
		 */

		// por defecto vamos a iniciar la aplicacion en 1
		int inicio = 1;
		// recorremos todos los numeros del 1 al 100
		for (int i = inicio; i <= 100; i++) {

			// si son divisibles entre 2 lo mostramos
			if (inicio % 2 == 0) {

				System.out.println("El número: " + inicio + " es divisible entre 2.");

			// si son divisibles entre 3 lo mostramos
			} else if (inicio % 3 == 0) {
				System.out.println("El número: " + inicio + " es divisible entre 3.");

			// si no es divisible por lo anterior indicado, también lo mostramos
			} else {
				System.out.println("El número: " + inicio + " no es divisible entre 2 ni entre 3.");
			}
		}

	}

}
