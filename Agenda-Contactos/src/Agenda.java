/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author joseg (servirá para almacenar varios contactos y permitirnos agregar nuevos y mostrar los guardados)
 * Usamos ArrayList para almacenar varios contactos
Creamos un método agregarContacto() para añadir contactos
Creamos un método mostrarAgenda() para ver todos los contactos
 */

import java.util.ArrayList; //importamos la clase arraylist

public class Agenda {
    private ArrayList<Contacto> contactos; //Lista donde guardaremos los contactos, es una lista dinámica donde podemos agregar y quitar elementos sin preocuparnos del tamaño
    
    //Constructor (Se ejecuta al crear una nueva Agenda)
    public Agenda(){
        this.contactos = new ArrayList<>(); //Inicializamos la lista vacía
    }
     // Método para agregar un contacto a la lista (ArrayList contactos)
    public void agregarContacto(Contacto contacto) {
        contactos.add(contacto);//agrego contacto a la lista
        System.out.println("Contacto agregado con éxito:");
        contacto.mostrarContacto();}
    // Método para mostrar todos los contactos guardados
    public void mostrarAgenda() {
        System.out.println("AGENDA DE CONTACTOS:");
        if (contactos.isEmpty()) {
            System.out.println("No hay contactos en la agenda.");
        } else {
            for (Contacto c : contactos) { //recorremos cada contacto y se muestra
                c.mostrarContacto();
            }
        }
    }
    
    // Método para buscar contactos por nombre o teléfono
    public ArrayList<Contacto> buscarContactos(String criterio) {
        ArrayList<Contacto> resultados = new ArrayList<>();
        String criterioBusqueda = criterio.toLowerCase();
        
        for (Contacto contacto : contactos) {
            // Busca en nombre, apellidos o teléfono
            if (contacto.getNombre().toLowerCase().contains(criterioBusqueda) ||
                contacto.getApellidos().toLowerCase().contains(criterioBusqueda) ||
                contacto.getTelefono().contains(criterioBusqueda)) {
                resultados.add(contacto);
            }
        }
        return resultados;
    }
    
    // Método para obtener el número total de contactos
    public int getTotalContactos() {
        return contactos.size();
    }
}
