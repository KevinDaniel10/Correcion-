public class VideojuegoAventuraCienciaFiccion extends VideojuegoAventura{
    private String tipoCienciaFiccion;

    // Constructor
    public VideojuegoAventuraCienciaFiccion(String nombre, int anioLanzamiento, String tipoAventura, String tipoCienciaFiccion) {
        super(nombre, anioLanzamiento, tipoAventura);
        this.tipoCienciaFiccion = tipoCienciaFiccion;
    }

    // Método específico para videojuegos de aventura con temática de ciencia ficción
    public void mostrarTipoCienciaFiccion() {
        System.out.println("Tipo de ciencia ficción: " + tipoCienciaFiccion);
    }

    // Método para jugar específico de juegos de aventura con temática de ciencia ficción
    @Override
    public void jugar() {
        System.out.println("¡Explorando el mundo de ciencia ficción de " + getNombre() + "!");
    }
}
