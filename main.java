
public class main {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan", 30);
        persona.mostrarDatos();
        Saludo saludo = new Saludo();
        saludo.mostrarSaludo();
        Saludo despedida = new Saludo();
        despedida.mostrarDespedida();
    }
}


class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}