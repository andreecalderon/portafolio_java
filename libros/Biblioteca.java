package libros;

public class Biblioteca {

    public static void programa(){
        System.out.println("Bibliteca");

        Libro libro1 = new Libro("Moby Dick","Herman Melville", "1851");
        Libro libro2 = new Libro("La Odisea","Homero", "siglo VIII a.C");
        Libro libro3 = new Libro("El niño con el pijama de rayas", "John Boyne", "2006");
        Libro libro4 = new Libro("Hamlet", "William Shakespeare", "1603");
        Libro libro5 = new Libro("Crepúsculo", " Stephenie Meyer","2005");
        Libro libro6 = new Libro("Alicia en el país de las maravillas", "Lewis Carroll", "1865");
        Libro libro7 = new Libro("El código de Da Vinci","Dan Brown","2003");
        Libro libro8 = new Libro("Orgullo y prejuicio", "Jane Austen","1813");
        Libro libro9 = new Libro("Don quijote de la Mancha","Miguel de  cervantes","1605");
        Libro libro10 =new Libro("En busca del tiempo perdido","Marcel Proust","1914");

        //TITULOS
        System.out.println(libro1.getTitulo());
        System.out.println(libro2.getTitulo());
        System.out.println(libro3.getTitulo());
        System.out.println(libro4.getTitulo());
        System.out.println(libro5.getTitulo());
        System.out.println(libro6.getTitulo());
        System.out.println(libro7.getTitulo());
        System.out.println(libro8.getTitulo());
        System.out.println(libro9.getTitulo());
        System.out.println(libro10.getTitulo());
        //AUTORES
        System.out.println(libro1.getAutor());
        System.out.println(libro2.getAutor());
        System.out.println(libro3.getAutor());
        System.out.println(libro4.getAutor());
        System.out.println(libro5.getAutor());
        System.out.println(libro6.getAutor());
        System.out.println(libro7.getAutor());
        System.out.println(libro8.getAutor());
        System.out.println(libro9.getAutor());
        System.out.println(libro10.getAutor());
        //FECHAS
        System.out.println(libro1.getFecha());
        System.out.println(libro2.getFecha());
        System.out.println(libro3.getFecha());
        System.out.println(libro4.getFecha());
        System.out.println(libro5.getFecha());
        System.out.println(libro6.getFecha());
        System.out.println(libro7.getFecha());
        System.out.println(libro8.getFecha());
        System.out.println(libro9.getFecha());
        System.out.println(libro10.getFecha());



    }
}
