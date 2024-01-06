# Correcion-
Examen Parte2:
g. ¿Que son setters y getters? Explique con un ejemplo en codigo.
Setters y getters son metodos en java que se utiizan para la asignar y obtener valores de atributos de objectos respectivamente.
Los setters asignan y los getters obtienen.

class Persona:
    def __init__(self, nombre, edad):
        self._nombre = nombre
        self._edad = edad

    # Getter para el atributo 'nombre'
    def get_nombre(self):
        return self._nombre

    # Setter para el atributo 'nombre'
    def set_nombre(self, nuevo_nombre):
        self._nombre = nuevo_nombre

    # Getter para el atributo 'edad'
    def get_edad(self):
        return self._edad

    # Setter para el atributo 'edad'
    def set_edad(self, nueva_edad):
        self._edad = nueva_edad
h.- Indique una secuencia de comandos en git que permitan clonar un repositorio, traer Ios
últimos cambios y una vez realizados los cambios, actualizar los cambios.
 Primero, clona el repositorio usando el comando git clone. Para asegurarte de tener los últimos cambios, utiliza git pull y para
 para actualizar un git push.

 g. Para qué se utiliza "try y catch" en java? Explique con un ejemplo en código.

 En Java, las estructuras try y catch se utilizan para manejar excepciones. 
 Las excepciones son eventos que ocurren durante la ejecución de un programa y 
 que pueden interrumpir el flujo de ejecución. 

 public class Ejemplo{
    public static void main(String[] args) {
        try {
            // Intentamos realizar una operación que puede lanzar una excepción
            int resultado = dividir(10, 0);
            System.out.println("El resultado de la división es: " + resultado);
        } catch (ArithmeticException e) {
            // Capturamos la excepción en caso de que ocurra
            System.err.println("Error: División por cero.");
        } finally {
            // Este bloque siempre se ejecutará, independientemente de si se lanzó una excepción o no
            System.out.println("Este bloque se ejecuta siempre.");
        }
    }

    // Método que puede lanzar una excepción
    public static int dividir(int numerador, int denominador) {
        return numerador / denominador;
    }
}

j.- Defina Programación Orientada a Objetos y el concepto de constructores. Muestre un
ejemplo de los tipos de constructores que puede haber.

Los contructores son los que incializan a los objectos en el main sin ellos no podemos definir un objecto.
public class Persona {
    public String nombre;
    public int edad;

    // Constructor por defecto ()
    public Persona() {
        this.nombre = "Sin nombre";
        this.edad = 0;
    }
}

 
        
