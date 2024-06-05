package programas;

import java.util.Scanner;

public class IMC {

    public static double calcularIMc(double peso, double altura) {
        return peso / (altura * altura);
    }

    public static void programaIMC() {
        Scanner intDato = new Scanner(System.in);

        System.out.print("Introduzca el peso: ");
        double peso = intDato.nextDouble();

        System.out.print("Introduzca la altura: ");
        double altura = intDato.nextDouble();

        double imc = calcularIMc(peso, altura);
        System.out.println("El IMC es: " + imc);
    }
}
