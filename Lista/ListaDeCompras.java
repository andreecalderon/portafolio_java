package Lista;

import opciones.ListaOpciones;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaDeCompras {

    public static String opciones6[] = {"Lista de compras", "Salir"};

    public static void programa() {
        ListaOpciones.cargaropciones(opciones6);

        Scanner opcion = new Scanner(System.in);
        System.out.print("[?]: ");
        int r = opcion.nextInt();

        switch (r) {
            case 1:
                crear();
                break;
            case 2:
                System.out.println("Salir");
                break;
        }
    }

    // Método para crear lista de compras
    public static void crear() {
        List<String> listaNombre = new ArrayList<>();
        List<Double> listaPrecio = new ArrayList<>();


        //Pedir un producto y su precio
        String rP;
        double rPc;

        for (int i = 1; i<=3;i++){
            Scanner item = new Scanner(System.in);
        System.out.print("producto: ");
        rP = item.nextLine();
        System.out.print("precio: ");
        rPc = item.nextDouble();

        //AGREGAR A LA LISTA VACIA
        listaNombre.add(rP);
        listaPrecio.add(rPc);
        }

        //Mostrar lista
        System.out.println(listaNombre + "-->" + listaPrecio);
        }
    }
