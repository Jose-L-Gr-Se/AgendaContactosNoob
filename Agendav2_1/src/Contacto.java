/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author joseg
 */
public class Contacto {
    // Atributos (variables) privados - solo se pueden modificar dentro de esta clase
    // private significa que nadie fuera de esta clase puede acceder directamente a estos datos
    public String nombre; //almacena el nombre...
    public String apellidos;
    public String telefono;
    public String grupo;
    public String correo;
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
    public Contacto(){}
    // Métodos "getter" - permiten obtener los valores de los atributos privados
        

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    // Métodos "setter" - permiten modificar los valores de los atributos privados
    // con validación incluida
    }
