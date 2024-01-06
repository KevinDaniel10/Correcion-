import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear 4 objetos de diferentes tipos de videojuegos
        VideojuegoAccion juegoAccion = new VideojuegoAccion("Call of Duty", 2020, "Shooter");
        VideojuegoAventura juegoAventura = new VideojuegoAventura("The Legend of Zelda", 1986, "Fantasía");
        VideojuegoAventuraCienciaFiccion juegoAventuraCienciaFiccion = new VideojuegoAventuraCienciaFiccion("Mass Effect", 2007, "RPG", "Space opera");

        // Almacenar los objetos en una lista
        ArrayList<Videojuego> listaVideojuegos = new ArrayList<>();
        listaVideojuegos.add(juegoAccion);
        listaVideojuegos.add(juegoAventura);
        listaVideojuegos.add(juegoAventuraCienciaFiccion);

        // Iterar sobre la lista y mostrar la información de cada videojuego
        for (Videojuego videojuego : listaVideojuegos) {
            videojuego.mostrarInformacion();
            videojuego.jugar();
            System.out.println(); // Separador entre cada videojuego
        }
    }
}
