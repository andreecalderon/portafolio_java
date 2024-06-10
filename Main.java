import conversor_unidades.convertir_unidades;
import programas.IMC;
import interfaz_grafica.Banner;
import Matematicas.mate;
import opciones.ListaOpciones;
import cambioDeGrados.grados;
import Lista.ListaDeCompras;
import ConversorDeMoneda.conversorMoneda;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // LISTA DE OPCIONES
        String[] listaDeOpciones = {
                "Calculadora", "IMC",
                "Farenheit / Celsius", "Conversor",
                "Grados", "ListaDecompras",
                "conversor de moneda", "Opción_8",
                "Opción_9", "Salir"
        };

        boolean progra = true;
        do {
            Banner.mensaje();
            ListaOpciones.cargaropciones(listaDeOpciones);
            System.out.print("[?]: ");
            Scanner scanner = new Scanner(System.in);
            int opcion = scanner.nextInt();
            System.out.println("-----------------------------------------------");

            switch (opcion) {
                case 1:
                    // Llamar al método Calculadora de la clase Mate
                    mate.op_mate();
                    break;

                case 2:
                    // Llamar al método programaIMC de la clase IMC
                    IMC.programaIMC();
                    break;
                case 3:

                    break;

                case 4:
                    convertir_unidades.main();
                    break;

                case 5:
                    grados.temperatura();
                     break;
                    case 6:
                    ListaDeCompras.programa();
                    break;
                case 7:
                    conversorMoneda.conversor();

                    case 10:
                    progra = false;
                    break;

            }


        }while (progra);

    }
}