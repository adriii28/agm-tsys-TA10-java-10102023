package Ej5;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio5App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Indica el tamaño para el array de passwords: ");
			int numArray = sc.nextInt();
			
			System.out.print("Indica la longitud de las contraseñas: ");
			int longitudContra = sc.nextInt();
			
			Password[] passwords = new Password[numArray];
			ArrayList<Boolean> passwordsFuertes = new ArrayList<Boolean>();
			
			for (int i = 0; i < passwords.length; i++) {
				passwords[i] = new Password(longitudContra);
				
				if (passwords[i].esFuerte()) {
					passwordsFuertes.add(true);
				} else {
					passwordsFuertes.add(false);

				}
				
				System.out.println(passwords[i].getContrasena() + " - " + passwordsFuertes.get(i));
			}
		} catch (InputMismatchException e) {
			System.out.println("Numero introducido invalido");

		}
		
	}
}
