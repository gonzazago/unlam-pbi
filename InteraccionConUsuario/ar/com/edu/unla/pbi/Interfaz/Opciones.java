package ar.com.edu.unla.pbi.Interfaz;

import java.util.Scanner;

public class Opciones {
	public static void main(String[] args) {
		int opcion = 0;

		System.out.println("******************************************");
		System.out.println("** Seleccione la operacion a realizar  **");
		System.out.println("** Ingrese MP para Mercado Pago        **");
		System.out.println("** Ingrese DB para D\u00e9bito             **");
		System.out.println("** Ingrese CR para Cr\u00e9dito             **");
		System.out.println("** Ingrese EF para Efectivo            **");
		System.out.println("******************************************");
		Scanner teclado = new Scanner(System.in);
		opcion = teclado.nextInt();
//		opcion = menu();

		switch (opcion) {
		case 1:
			System.out.println("Opcion 1");
			break;

		case 2:
			System.out.println("Opcion 2");
			break;
		case 3:
			System.out.println("Opcion 3");
			break;
		default:
			System.out.println("Opcion invalida");
		}
		//
	}

	public static int menu() {
		System.out.println("******************************************");
		System.out.println("** Seleccione la operacion a realizar  **");
		System.out.println("** Ingrese MP para Mercado Pago        **");
		System.out.println("** Ingrese DB para D\u00e9bito             **");
		System.out.println("** Ingrese CR para Cr\u00e9dito             **");
		System.out.println("** Ingrese EF para Efectivo            **");
		System.out.println("******************************************");
		Scanner teclado = new Scanner(System.in);
		int opcion = teclado.nextInt();
		return opcion;
	}

}
