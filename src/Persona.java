
public class Persona {


  private String nombre;
  private String apellido;
  private int edad;
  private String correo;


  public Persona(String estevan, int par, String cali) {}

  public Persona(String nombre, String apellido) {
    this.nombre = nombre;
    this.apellido = apellido;
  }
  
  
  public Persona(String nombre, String apellido, int edad, String correo) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.edad = edad;
    this.correo = correo;
  }

  
  public void mostrarInformacion() {
    System.out.println("Nombre: " + nombre);
    System.out.println("Apellido: " + apellido);
    System.out.println("Edad: " + edad);
    System.out.println("Correo: " + correo);

  }

}