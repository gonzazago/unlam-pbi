package ar.com.edu.unla.pbi.Dominio;

import java.util.Scanner;

public class Cobro {

	private final static String MERCADO_PAGO = "MP";
	private final static String DEBITO = "DB";
	private final static String EFECTIVO = "EF";
	private final static String CREDITO = "CR";
	private final static String mensajeBienvenida = "Bienvenido a Cobrar";

	public void iniciarCobrador() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("******************************************");
		System.out.println("** " + mensajeBienvenida.toUpperCase() + "             **");
		System.out.println("** Seleccione la operacion a realizar  **");
		System.out.println("** Ingrese MP para Mercado Pago        **");
		System.out.println("** Ingrese DB para D\u00e9bito             **");
		System.out.println("** Ingrese CR para Cr\u00e9dito             **");
		System.out.println("** Ingrese EF para Efectivo            **");
		System.out.println("******************************************");

		System.out.print("Opcion: ");
		String opcion = teclado.nextLine();

		System.out.print("Ingrese el subtotal: ");
		double subTotal = teclado.nextDouble();
		double precio = calcularTotal(subTotal, opcion);
		System.out.print("El precio total es: " + precio);
		teclado.close();
	}

	private double calcularTotal(double subTotal, String medioDePago) {
		double total = 0.0;
		double dto = 0.0;

		switch (medioDePago) {
		case MERCADO_PAGO:
		case DEBITO: {
			dto = subTotal * 0.05;
			total = subTotal - dto;
			break;
		}
		case CREDITO: {
			total =  subTotal + (subTotal  * 0.5);
			break;
		}
		case EFECTIVO: {
			dto = subTotal * 0.05;
			total = subTotal - dto;
			break;
		}
		default:
			System.out.println("La opcion ingresada es invalida");
			iniciarCobrador();
			break;
		}
		return total;
	}

}
