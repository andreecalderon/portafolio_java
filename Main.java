import colegio.Escuela;
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
import java.awt.*;
import java.util.Scanner;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        // LISTA DE OPCIONES
        String[] listaDeOpciones = {
                "Calculadora", "programas",
                "Farenheit / Celsius", "Conversor",
                "Grados", "ListaDecompras",
                "conversor de moneda", "Biblioteca",
                "Colegio", "Salir"
        };
           //sección grafica
        JFrame miVentana = new JFrame();
        miVentana.setBounds(0, 0, 500, 600  );
        miVentana.setLayout(null);


            // PANEL DEL BANNER
            JPanel banner = new JPanel();
            banner.setBackground(Color.BLUE);

            miVentana.add(banner);
            banner.setBounds(0, 0, 500, 300 );

            miVentana.setVisible(true);

        JFrame frame = new JFrame("Rockema");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new BorderLayout());


        JPanel mainPanel = new JPanel(new BorderLayout());
        frame.add(mainPanel);


        JPanel textPanel = new JPanel(new GridLayout(3, 2, 5, 5)); // 3 filas, 2 columnas, con espacio entre componentes
        textPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Márgenes


        for (int i = 1; i <= 6; i++) {
            JLabel label = new JLabel("G3", SwingConstants.CENTER);
            label.setFont(new Font("Arial", Font.PLAIN, 14));
            textPanel.add(label);
        }
        mainPanel.add(textPanel, BorderLayout.CENTER);


        JButton button = new JButton("save");
        button.setFont(new Font("Arial", Font.BOLD, 14));
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(10, 200, 10, 10)); // Márgenes
        buttonPanel.add(button);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);


        frame.setVisible(true);

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
                case 9:
                    Escuela.main();
                    break;
                    case 10:
                    progra = false;
                    break;

            }


        }while (progra);

    }
}
