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
        // Creamos y mostramos la ventana principal
        // SwingUtilities.invokeLater asegura que la interfaz se cree en el hilo correcto
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    // Configuramos el aspecto visual
                    javax.swing.UIManager.setLookAndFeel(
                        javax.swing.UIManager.getSystemLookAndFeelClassName()
                    );
                    
                    // Creamos y mostramos nuestra ventana principal
                    InterfazVentanaPrincipal ventana = new InterfazVentanaPrincipal();
                    ventana.setLocationRelativeTo(null); // Centra la ventana
                    ventana.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
