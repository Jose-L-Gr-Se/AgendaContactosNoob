/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author joseg
 */
//una clase es como un molde
//El objeto sería Mi Agenda
//public = accesible desde cualquier parte
//private = solo accesible dentro de lla misma clase
public class Agenda {
//Se crea una lista que puede aumentar o disminuir
//Solo puede guardar objetos de tipo contacto
// Creamos una lista simple paListra guardar contactos
    private List<Contacto> miAgenda;//Ahora es un atributo de Agenda
// Constructor básico
//Se ejecutará cuando creemos una nueva agenda
//Crea una lista vacía dónde guardaremos los contacto
    public Agenda() { 
        this.miAgenda = new ArrayList <>();    
    }
    
/*Métodos = acciones que puede realizar nuestra clase
    tiene un tipo de retorno (void,booolean, list<Contacto> etc...
y pueden recibir parámetros entre paréntesis*/
    // Método simple para agregar un contacto
    //Void significa que no devuelve nada y add es un método de Arraylist que añade un elemento al final
    public void agregarContacto(Contacto contacto) {
        miAgenda.add(contacto);
        System.out.println("=== Contacto agregado con éxito ===");
        System.out.println("Nombre: " + contacto.getNombre());
        System.out.println("Apellidos: " + contacto.getApellidos());
        System.out.println("Teléfono: " + contacto.getTelefono());
        if(!contacto.getGrupo().isEmpty());System.out.println("Grupo: " + contacto.getGrupo());
        if(!contacto.getCorreo().isEmpty());System.out.println("Correo: " + contacto.getCorreo());
        System.out.println("===============================");
        
        
    }
    //recorrer por índice
    public void recorrerAgendaPorIndice(){
    for(int i=0; i<miAgenda.size();i++){
        System.out.println("prueba: " + miAgenda.get(i).getNombre());
    }
    }
    //recorrido foreach
    public void recorrerAgendaConForEach(){
    for (Contacto contacto:miAgenda){
        System.out.println("prueba: " + contacto.getNombre());         
    }
    }
}
