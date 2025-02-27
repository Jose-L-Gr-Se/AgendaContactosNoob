/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author joseg
 */
public class Main {
    
    public static void main(String[] args) {
                // Asegurar que la GUI se ejecuta en el hilo de eventos de Swing
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new InterfazVentanaPrincipal(); // Abre la interfaz gráfica
        }
    });
}
}
    