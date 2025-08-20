public class App {
  public static void main(String[] args) throws Exception {
    System.out.println("Hello, World!");

    // Create an instance of Persona
    Persona persona1 = new Persona("Juan", "Perez", 30, 11932495);

    Persona persona2 = new Persona("Maria", "Gomez", 25,83284324);

    persona1.mostrarInformacion();
    System.out.println(); // Print a blank line for better readability
    persona2.mostrarInformacion();

  }
}
