package com.java.exercise.ejerciciosbasicos2;

import java.util.Scanner;

public class ForDentroDeIf {

	public static void main(String[] args) {

		/*
		 * 13) Realiza una aplicación que nos pida un número de ventas a introducir,
		 * después nos pedirá tantas ventas por teclado como número de ventas se hayan
		 * indicado. Al final mostrara la suma de todas las ventas. Piensa que es lo que
		 * se repite y lo que no.
		 */

		System.out.println("Introduce el nº de ventas de la semana (límite 30):");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int ventas = sc.nextInt();
		int totalVentas = 0;

		// condicion que verifica el limite de 30
		if (ventas <= 30) {
			// si es cierto, recorremos cada venta
			for (int i = 1; i <= ventas; i++) {
				System.out.println("Introduce el valor para la venta: " + i);
				int precio = sc.nextInt();
				// sumamos el precio de cada venta al precio total
				totalVentas += precio;
			}
			System.out.println("El precio total de las " + ventas + " ventas es: " + totalVentas + "€.");

		} else {
			System.out.println("Has excedido el nº de ventas");
		}

	}

}
