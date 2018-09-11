package com.java.exercise.ejerciciosbasicos2;

import java.util.Scanner;

public class GenerarRandomNumber {

	/*
	 * 18) Pide por teclado dos numeros y genera 10 numeros aleatorios entre esos
	 * numeros. Usa el metodo Math.random para generar un numero entero aleatorio
	 * (recuerda el casting de double a int).
	 */

	public static void main(String[] args) {

		System.out.println("Introduce dos numeros aleatorios:");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		double number1 = sc.nextDouble();

		System.out.println("Ahora otro:");
		double number2 = sc.nextDouble();

		System.out.println("Ahora te voy a dar 10 numeros aleatorios entre esos dos numeros:");

		for (int i = 0; i < 10; i++) {
			double aleatorios = Math.floor(Math.random() * (number1 - number2) + number2);
			System.out.println(aleatorios);
		}

	}
}
