package colegio;

public class Estudiantess{
private String nombre;
private String correo;
private int edad;
private boolean solvencia;

// Constructor
public Estudiantess(String nombre, String correo, int edad, boolean solvencia) {
    this.nombre = nombre;
    this.correo = correo;
    this.edad = edad;
    this.solvencia = solvencia;
}

// Getters
public String getNombre() {
    return nombre;
}

public String getCorreo() {
    return correo;
}

public int getEdad() {
    return edad;
}

public boolean isSolvente() {
    return solvencia;

    }
}

