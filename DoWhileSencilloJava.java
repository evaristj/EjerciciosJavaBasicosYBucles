package com.java.exercise.ejerciciosbasicos2;

import java.util.Scanner;

public class DoWhileSencilloJava {

	/*
	 * 15) Lee un numero por teclado y comprueba que este numero es mayor o igual
	 * que cero, si no lo es lo volvera a pedir, despues muestra ese numero por
	 * consola.
	 */

	public static void main(String[] args) {

		System.out.println("Vamos a comprobar si un numero es mayor o igual que cero: ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int numero = 0;

		do {
			numero = sc.nextInt();
			System.out.println("Intentalo de nuevo:");
		} while (numero < 0);
		{
			System.out.println("El numero: " + numero + " es mayor o igual a cero.");
		}

	}
}
