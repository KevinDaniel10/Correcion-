public class Videojuego {
    public String nombre;
    public int anioLanzamiento;

    // Constructor
    public Videojuego(String nombre, int anioLanzamiento) {
        this.nombre = nombre;
        this.anioLanzamiento = anioLanzamiento;
    }

    // Métodos getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnioLanzamiento() {
        return anioLanzamiento;
    }

    public void setAnioLanzamiento(int anioLanzamiento) {
        this.anioLanzamiento = anioLanzamiento;
    }

    // Método para mostrar información del videojuego
    public void mostrarInformacion() {
        System.out.println("Videojuego: " + nombre + ", Año de lanzamiento: " + anioLanzamiento);
    }

    // Método genérico para jugar
    public void jugar() {
        System.out.println("¡Jugando " + nombre + "!");
    }
}
