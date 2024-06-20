package colegio;

public class Escuela {
    public static void main() {
        // Crear estudiantes
        Estudiantess[] estudiantes = new Estudiantess[5];
        estudiantes[0] = new Estudiantess("Ana Pérez", "ana.perez@gmail.com", 7, true);
        estudiantes[1] = new Estudiantess("Carlos López", "carlos.lopez@gmail.com", 8, false);
        estudiantes[2] = new Estudiantess("María Gómez", "maria.gomez@gmail.com", 7, true);
        estudiantes[3] = new Estudiantess("Juan Martínez", "juan.martinez@gmail.com", 8, true);
        estudiantes[4] = new Estudiantess("Lucía Fernández", "lucia.fernandez@gmail.com", 7, false);

        // Crear cursos
        Cursos[] cursos = new Cursos[4];
        cursos[0] = new Cursos("Matemáticas", "Ciencia", "Primer periodo");
        cursos[1] = new Cursos("Lengua Española", "Idioma", "Primer periodo");
        cursos[2] = new Cursos("Ciencias Naturales", "Ciencia", "Primer periodo");
        cursos[3] = new Cursos("Educación Física", "Deporte", "Primer periodo");


        System.out.println("Listado de Alumnos:");
        for (Estudiantess estudiante : estudiantes) {
            System.out.println("Nombre: " + estudiante.getNombre() + ", Correo: " + estudiante.getCorreo());
        }

        // Imprimir listado de cursos
        System.out.println("Listado de Cursos:");
        for (Cursos curso : cursos) {
            System.out.println("Nombre: " + curso.getNombre() + ", Categoría: " + curso.getCategoria() + ", Periodo: " + curso.getPeriodo());
            }
        }
}


