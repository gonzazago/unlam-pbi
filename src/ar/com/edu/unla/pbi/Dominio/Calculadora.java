package ar.com.edu.unla.pbi.Dominio;

import java.util.Scanner;

public class Calculadora {
	private final static String OPERADOR_SUMA = "+";
	private final static String OPERADOR_RESTA = "-";
	private final static String OPERADOR_MULTIPLICAR = "*";
	private final static String OPERADOR_DIVIDIR = "/";
	private final static String mensajeBienvenida = "Bienvenido a Calculadora";
	

	
	public static void iniciarCalculadora() {
		Scanner teclado = new Scanner(System.in);
		Calculadora calculadora = new Calculadora();

		System.out.println("******************************************");
		System.out.println("** " + mensajeBienvenida.toUpperCase() + "             **");
		System.out.println("** Seleccione la operacion a realizar   **");
		System.out.println("** Presione + para sumar                **");
		System.out.println("** Presione - para restar               **");
		System.out.println("** Presione * para multiplicar          **");
		System.out.println("** Presione / para dividir              **");
		System.out.println("******************************************");
		System.out.print("Opcion: ");
		String opcion = teclado.nextLine();
		System.out.print("Ingrese primer operando: ");
		double operando1 = teclado.nextDouble();
		System.out.print("Ingrese segundo operando: ");
		double operando2 = teclado.nextDouble();
		double resultado = calculadora.seleccionarOperacion(opcion, operando1, operando2);
		System.out.println("El resultado es: " + resultado);
		teclado.close();

	}

//	private double seleccionarOperacion(String opcion, double operando1, double operando2) {
//		double resultado = 0.0;
//		if (opcion.equals(OPERADOR_SUMA)) {
//			resultado = sumar(operando1, operando2);
//		} else if (opcion.equals(OPERADOR_RESTA)) {
//			resultado = restar(operando1, operando2);
//		} else if (opcion.equals(OPERADOR_MULTIPLICAR)) {
//			resultado = multiplicar(operando1, operando2);
//		} else if (opcion.equals(OPERADOR_DIVIDIR)) {
//			resultado = dividir(operando1, operando2);
//		} else {
//			System.out.println("La opcion ingresada es invalida");
//			System.out.println(" ");
//		
//			iniciarCalculadora();
//		}
//		return resultado;
//
//	}

	private double sumar(double operando1, double operando2) {
		return operando1 + operando2;
	}

	private double restar(double operando1, double operando2) {
		return operando1 - operando2;
	}

	private double multiplicar(double operando1, double operando2) {
		return operando1 * operando2;
	}

	private double dividir(double operando1, double operando2) {
		double resultado = 0.0;
		if (operando2 > 0) {
			resultado = operando1 / operando2;
		}
		return resultado;
	}

	private double seleccionarOperacion(String opcion, double operando1, double operando2) {
	double resultado = 0.0;
	switch (opcion) {
	case OPERADOR_SUMA: {
		resultado = sumar(operando1, operando2);
		break;
	}
	case OPERADOR_RESTA: {
		resultado = restar(operando1, operando2);
		break;
	}
	case OPERADOR_MULTIPLICAR: {
		resultado = multiplicar(operando1, operando2);
		break;
	}
	case OPERADOR_DIVIDIR: {
		resultado = dividir(operando1, operando2);
		break;
	}
	default:
		System.out.println("La opcion ingresada es invalida");
		iniciarCalculadora();
		break;
	}
	return resultado;
}
}
