package com.java.exercise.ejerciciosbasicos2;

import java.util.Scanner;

public class BucleWhileSencillo {

	public static void main(String[] args) {
		/*
		 * 10) Muestra los números del 1 al 100 (ambos incluidos). Usa un bucle while.
		 */
		
		// Introduce un numero y se mostraran los numeros restantes hasta llegar a 100
		System.out.println("Introduce un numero: ");
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		// mientras el numero introducido sea menor o igual a 100, se mostraran los restantes
		while (number <= 100) {
			System.out.println(number++);
		}
	}

}
