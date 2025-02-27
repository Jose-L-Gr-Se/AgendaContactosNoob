/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author joseg
 */
public class Contacto {
    // Atributos (variables) privados - solo se pueden modificar dentro de esta clase
    // private significa que nadie fuera de esta clase puede acceder directamente a estos datos
    private String nombre; //almacena el nombre...
    private String apellidos;
    private String telefono;
    private String grupo;
    private String correo;
     // Constructor - es como una "receta" para crear nuevos contactos
    // Se llama automáticamente cuando escribimos "new Contacto(...)"
    public Contacto(String nombre, String apellidos, String telefono, String grupo, String correo){
        // this. se refiere a los atributos de la clase
        // Los parámetros del constructor se asignan a los atributos
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.grupo = grupo;
        this.correo = correo;
    }
    // Métodos "getter" - permiten obtener los valores de los atributos privados
    public String getNombre(){return nombre;}
    // Métodos "setter" - permiten modificar los valores de los atributos privados
    // con validación incluida
    public void setNombre(String nombre) {
        
        // Verificamos que el nombre no sea null ni esté vacío
        if (nombre == null || nombre.trim().isEmpty()) {
            // Si el nombre no es válido, lanzamos un error
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        // trim() elimina espacios en blanco al inicio y final
        this.nombre = nombre.trim();
    }
    
    // Método para mostrar el contacto como texto
    @Override // Esta anotación indica que estamos sobrescribiendo un método de la clase padre
    public String toString() {
        return String.format("%s %s - %s", nombre, apellidos, telefono);
    }
}
