public class VideojuegoAventura extends Videojuego {

    public String tipoAventura;

    // Constructor
    public VideojuegoAventura(String nombre, int anioLanzamiento, String tipoAventura) {
        super(nombre, anioLanzamiento);
        this.tipoAventura = tipoAventura;
    }

    // Método específico para videojuegos de aventura
    public void mostrarTipoAventura() {
        System.out.println("Tipo de aventura: " + tipoAventura);
    }

    // Método para jugar específico de juegos de aventura
    @Override
    public void jugar() {
        System.out.println("¡Explorando el mundo de " + getNombre() + "!");
    }
}
