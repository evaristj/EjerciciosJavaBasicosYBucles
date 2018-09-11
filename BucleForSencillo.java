package com.java.exercise.ejerciciosbasicos2;

import java.util.Scanner;

public class BucleForSencillo {

	public static void main(String[] args) {

		/*
		 * 11) Haz el mismo ejercicio anterior con un bucle for.
		 */

		// Introduce un numero y se mostraran los numeros restantes hasta llegar a 100
		System.out.println("Introduce un numero: ");

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		// mientras el numero introducido sea menor o igual a 100, se mostraran los restantes
		// esto es distinto al bucle while, pues en este caso habrá que decirle que el
		// inicio del bucle for sea el valor introducido por teclado, en este caso number
		for (int i = number; i <= 100; i++) {
			System.out.println(number++);
		}
	}

}
