package com.java.exercise.ejerciciosbasicos2;

import java.util.Scanner;

public class SwitchBasico {

	public static void main(String[] args) {
		/*
		 * 17) Crea una aplicacion que nos pida un dia de la semana y que nos diga si
		 * es un dia laboral o no. Usa un switch para ello.
		 */

		System.out.println("Introduce un dia de la semana.");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String dia = sc.nextLine();

		// uso de switch sencillo, para todos estos casos, se va a cumplir la misma condicion
		switch (dia) {
		case "lunes":
		case "martes":
		case "miercoles":
		case "jueves":
		case "viernes":
			System.out.println("Es dia laboral.");
			break;
		case "sabado":
		case "domingo":
			System.out.println("Es dia festivo.");
		default:
			System.out.println("Día introducido incorrecto.");
		}
	}
}
