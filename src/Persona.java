//Class Persona
public class Persona {

  // Attributes
  private String nombre;
  private String apellido;
  private int edad;
  private String correo;
  private String eCivil;

  // Constructor
  public Persona() {}

  public Persona(String nombre, String apellido, String eCivil) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.eCivil = eCivil;
  }
  
  
  public Persona(String nombre, String apellido, int edad, String correo, String eCivil) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.edad = edad;
    this.correo = correo;
    this.eCivil = eCivil;
  }

  // Method o Funciones
  public void mostrarInformacion() {
    System.out.println("Nombre: " + nombre);
    System.out.println("Apellido: " + apellido);
    System.out.println("Edad: " + edad);
    System.out.println("Correo: " + correo);
    System.out.println("Estado Civil: " + eCivil);
  }

}
