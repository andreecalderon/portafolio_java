package conversor;
import java.util.Scanner;
public class grados {
    public static void temperatura(){
        Scanner scanner = new Scanner(System.in);

        // Solicitar la temperatura en Fahrenheit
        System.out.print("coloque la temperatura: ");
        double fahrenheit = scanner.nextDouble();

        // Convertir a Celsius
        double celsius = (fahrenheit - 32) * 5 / 9;

        // Mostrar el resultado
        System.out.println("El resultado de la temperatura en celsius es: " + celsius);

        scanner.close();
    }
}