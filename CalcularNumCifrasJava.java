package com.java.exercise.ejerciciosbasicos2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcularNumCifrasJava {

	public static void main(String[] args) throws InputMismatchException {
		/*
		 * 19) Pide por teclado un numero entero positivo (debemos controlarlo) y
		 * muestra el numero de cifras que tiene. Por ejemplo: si introducimos 1250, nos
		 * muestre que tiene 4 cifras. Tendremos que controlar si tiene una o mas
		 * cifras, al mostrar el mensaje.
		 */

		// creamos las variables al principio como buena practica de programacion
		int number;
		int cifras = 0;

		// capturamos los errores con try catch
		try {
			do {
				System.out.println("Introduce un numero entero positvo:");
				@SuppressWarnings("resource")
				Scanner sc = new Scanner(System.in);
				number = sc.nextInt();

			} while (number < 0);
			// recorremos el numero introducido, y cada division de ese numero entre 10,
			// sumará una cifra al contador de cifras
			for (int i = number; i > 0; i /= 10) {
				cifras++;
			}

			if (cifras == 1) {
				System.out.println("El nº introducido tiene " + cifras + " cifras.");
			} else {
				System.out.println("El nº introducido tiene " + cifras + " cifras.");
			}

			// capturamos excepciones en caso de introducir datos incorrectos
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

	}
}
