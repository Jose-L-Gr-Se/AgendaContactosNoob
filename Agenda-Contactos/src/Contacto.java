/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author joseg
 */
public class Contacto {
     // Atributos (datos que tendrá cada contacto)
    private String nombre;
    private String apellidos;
    private String telefono;
    private String grupo;
    private String correo;
    
    // Constructor (método especial que nos permite crear contactos con datos)
    public Contacto(String nombre, String apellidos, String telefono, String grupo, String correo){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.grupo = (grupo==null || grupo.isEmpty()) ? "Sin grupo" : grupo;
        this.correo = (correo == null || correo.isEmpty()) ? "Sin correo" : correo;
    }
    // Métodos "getters" (para obtener los datos del contacto)
    public String getNombre() { return nombre; }
    public String getApellidos() { return apellidos; }
    public String getTelefono() { return telefono; }
    public String getGrupo() { return grupo; }
    public String getCorreo() { return correo; }
    
    // Método para mostrar información del contacto en la consola
    public void mostrarContacto() {
        System.out.println("- Nombre Completo: " + nombre + " " + apellidos);
        System.out.println("- Teléfono: " + telefono);
        System.out.println("- Grupo: " + grupo);
        System.out.println("- Correo: " + correo);
        System.out.println("-------------------------");
    }
}
