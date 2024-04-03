package Ejercicio_UD4;

import java.util.Scanner;

public class Ej_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número de DNI (de 8 dígitos): ");
        String dni = sc.nextLine();

        if (dni.length() != 8 || !dni.matches("\\d+")) {
            System.out.println("Número de DNI inválido. Debe tener 8 números.");
            return;
        }
        
        
        int numero = Integer.parseInt(dni);

        char letra = calcularLetra(numero);

        System.out.println("La letra es: " + letra);
        System.out.println("El dni es:"+ numero+""+letra);
    }

    private static char calcularLetra(int numero) {
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        int resto = numero % 23;
        return letras[resto];
    }
    

	}


