package Matematicas;

import java.util.Scanner;

public class mate {
    public static void op_mate() {
        Scanner scanner = new Scanner(System.in);

        // Mostrar opciones disponibles
        System.out.println("Opciones:");
        System.out.println("[1] Suma");
        System.out.println("[2] Resta");
        System.out.println("[3] Multiplicación");
        System.out.println("[4] División");
        System.out.print("Elija una opción: ");

        int opcion = scanner.nextInt();

        // Solicitar dos números al usuario para resolver operacion eligida
        System.out.print("Ingrese un número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        // Realizar la operación seleccionada del usuario
        double resultado = 0;
        String operacion = "";
        switch (opcion) {
            case 1:
                resultado = num1 + num2;
                operacion = "Suma";
                break;
            case 2:
                resultado = num1 - num2;
                operacion = "Resta";
                break;
            case 3:
                resultado = num1 * num2;
                operacion = "Multiplicación";
                break;
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                    operacion = "División";
                } else {
                    System.out.println("ERROR!!! No se puede dividir por cero");
                    return;
                }
                break;
        }

        // Mostrar el resultado
        System.out.println("El resultado de la " + operacion + " es: " + resultado);

        scanner.close();
    }
}