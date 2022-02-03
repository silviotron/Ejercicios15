package ejercicios15;

public class Persona {
    final private String dni;
    final private String nombre;
    final private int edad;
    final private int nota;

    public Persona(String dni, String nombre, int edad, int nota) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.nota = nota;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " edad: " + edad + " Dni: " + dni + " nota: " + nota;
    }    
    
}

