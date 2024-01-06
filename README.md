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

 
        
