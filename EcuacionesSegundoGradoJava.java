package com.java.exercise.ejerciciosbasicos2;

import java.util.Scanner;

public class EcuacionesSegundoGradoJava {

	public static void main(String[] args) {

		/*
		 * 14) Realiza una aplicacion que nos calcule una ecuacion de segundo grado.
		 * Debes pedir las variables a, b y c por teclado y comprobar antes que el
		 * discriminante (operacion en la raiz cuadrada). Para la raiz cuadrada usa el
		 * metodo sqrt de Math.
		 */

		System.out.println("Vamos a calcular una ecuacion de 2º grado.");
		System.out.println("Introduce la variable 'a':");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("Introduce la variable 'b':");
		int b = sc.nextInt();
		System.out.println("Introduce la variable 'c':");
		int c = sc.nextInt();

		double discriminante = Math.pow(b, 2) - (4 * a * c);

		// Mensaje de traza
		System.out.println("Discriminante: " + discriminante);

		if (discriminante > 0) {

			double x1 = ((b * (-1)) + Math.sqrt(discriminante)) / (2 * a);
			double x2 = ((b * (-1)) - Math.sqrt(discriminante)) / (2 * a);

			System.out.println("El valor negativo de la ecuacion es: " 
					+ x1 + "\ny el valor positivo de la ecuacion es: " + x2);
		} else {
			System.out.println("El discriminante es negativo");
		}
	}

}
