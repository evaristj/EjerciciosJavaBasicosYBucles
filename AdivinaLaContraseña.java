package com.java.exercise.ejerciciosbasicos2;

import java.util.Scanner;

public class AdivinaLaContraseña {

	public static void main(String[] args) {
		/*
		 * 16) Escribe una aplicacion con un String que contenga una contraseña
		 * cualquiera. Despues se te pedira que introduzcas la contraseña, con 3
		 * intentos. Cuando aciertes ya no pedira mas la contraseña y mostrara un
		 * mensaje diciendo Enhorabuena. Piensa bien en la condicion de salida (3
		 * intentos y si acierta sale, aunque le queden intentos).
		 */

		// introducimos la contraseña, no la pedimos por teclado
		String password = "nombre";
		// creamos la variable de intentos
		int intentos = 0;
		// creamos el boolean que cambiará más adelante
		boolean correcta = false;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		// creamos bucle do while para saber cuantos intentos tiene y cuando ha acertado o cuando no
		do {
			for (int i = intentos; i < 3 && !correcta; i++) {
				System.out.println("Adivina la contraseña. Es un string de 6 caracteres, minusculas.");
				String contraseña = sc.nextLine();
				// sumamos un intento cada vez que no la introduzca correctamente
				intentos++;
				// equals es para comprobar si realmente son iguales en cuanto a caracteres
				if (password.equals(contraseña)) {
					System.out.println("Enhorabuena! Has acertado la contraseña: " + contraseña);
					correcta = true;
				}
			}

		} while (!correcta && 3 < intentos);

		if (!correcta) {
			System.out.println(
					"Lo sentimos, no has acertado la contraseña y se te han acabado los intentos.\nContacta con el Administrador.");
		}

	}

}
