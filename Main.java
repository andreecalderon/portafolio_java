import conversor.convertir_unidades;
import libros.Biblioteca;
import programas.IMC;
import interfaz_grafica.Banner;
import calculadora.mate;
import mis_metodos.ListaOpciones;
import conversor.grados;
import Lista.ListaDeCompras;
import conversor.conversorMoneda;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // LISTA DE OPCIONES
        String[] listaDeOpciones = {
                "Calculadora", "programas",
                "Farenheit / Celsius", "Conversor",
                "Grados", "ListaDecompras",
                "conversor de moneda", "Biblioteca",
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
                    break;
                case 8:
                    Biblioteca.programa();
                    break;
                    case 10:
                    progra = false;
                    break;

            }


        }while (progra);

    }
}