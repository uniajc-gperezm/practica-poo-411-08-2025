public class App {
  public static void main(String[] args) throws Exception {
    System.out.println("Hello, World!");

    // Create an instance of Persona
    Persona persona1 = new Persona("Juan", "Perez", 30, "juan@gmail.com");

    Persona persona2 = new Persona("Maria", "Gomez");

    Persona persona3 = new Persona("carlos", "giraldo");

    persona1.mostrarInformacion();
    System.out.println(); // Print a blank line for better readability
    persona2.mostrarInformacion();
    System.out.println(); // Print a blank line for better readability
    persona2.mostrarInformacion();

  }
}
