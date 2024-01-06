public class VideojuegoAccion extends Videojuego {
    public String tipoAccion;

    // Constructor
    public VideojuegoAccion(String nombre, int anioLanzamiento, String tipoAccion) {
        super(nombre, anioLanzamiento);
        this.tipoAccion = tipoAccion;
    }

    // Método específico para videojuegos de acción
    public void mostrarTipoAccion() {
        System.out.println("Tipo de acción: " + tipoAccion);
    }

    // Método para jugar específico de juegos de acción
    @Override
    public void jugar() {
        System.out.println("¡Disfrutando la acción de " + getNombre() + "!");
    }
}
