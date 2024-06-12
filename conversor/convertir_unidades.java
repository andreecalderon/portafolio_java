package conversor;
import java.util.Scanner;

public class convertir_unidades {

    // Conversión de longitud: metros a pies
    public static double metrosAPies(double metros) {
        return metros * 3.28084;
    }

    // Conversión de longitud: pies a metros
    public static double piesAMetros(double pies) {
        return pies / 3.28084;
    }

    // Conversión de longitud: kilómetros a millas
    public static double kilometrosAMillas(double kilometros) {
        return kilometros * 0.621371;
    }

    // Conversión de longitud: millas a kilómetros
    public static double millasAKilometros(double millas) {
        return millas / 0.621371;
    }

    public static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. esta opción es la conversión de metros a Pies");
        System.out.println("2. esta opción es la conversión de pies a Metros");
        System.out.println("3. esta opción es la conversión de kilómetros a Millas");
        System.out.println("4. esta opción es la conversión de Millas a Kilómetros");
        System.out.println("Seleccione el tipo de conversión de longitud que se requiere:");

        int opcion = scanner.nextInt();
        double valor;
        double resultado;

        switch(opcion) {
            case 1:
                System.out.println("Ingrese los metros:");
                valor = scanner.nextDouble();
                resultado = metrosAPies(valor);
                System.out.println(valor + " metros dan " + resultado + " pies.");
                break;
            case 2:
                System.out.println("Ingrese los pies:");
                valor = scanner.nextDouble();
                resultado = piesAMetros(valor);
                System.out.println(valor + " pies dan " + resultado + " metros.");
                break;
            case 3:
                System.out.println("Ingrese los kilómetros:");
                valor = scanner.nextDouble();
                resultado = kilometrosAMillas(valor);
                System.out.println(valor + " kilómetros dan " + resultado + " millas.");
                break;
            case 4:
                System.out.println("Ingrese las millas:");
                valor = scanner.nextDouble();
                resultado = millasAKilometros(valor);
                System.out.println(valor + " millas dan " + resultado + " kilómetros.");
                break;
            default:
                System.out.println("esta opción no es válida.");
                break;
        }

        scanner.close();
    }
}
