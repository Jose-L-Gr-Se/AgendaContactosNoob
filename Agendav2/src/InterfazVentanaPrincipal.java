/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author joseg
 */
public class InterfazVentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form InterfazVentanaPrincipa
     */
    private Agenda agenda;
    
    public InterfazVentanaPrincipal() {
        initComponents();
        agenda = new Agenda();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFormulario = new javax.swing.JPanel();
        CampoNombre = new javax.swing.JLabel();
        TextoNombre = new javax.swing.JTextField();
        CampoApellidos = new javax.swing.JLabel();
        TextoApellidos = new javax.swing.JTextField();
        CampoTeléfono = new javax.swing.JLabel();
        TextoTeléfono = new javax.swing.JTextField();
        CampoGrupo = new javax.swing.JLabel();
        TextoGrupo = new javax.swing.JTextField();
        CampoCorreo = new javax.swing.JLabel();
        TextoCorreo = new javax.swing.JTextField();
        AgregarContacto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextoAreaContactos = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        BotónLimpiar = new javax.swing.JButton();
        BotónEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelFormulario.setLayout(new java.awt.GridLayout(5, 2, 1, 1));

        CampoNombre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CampoNombre.setText("Nombre");
        CampoNombre.setName(""); // NOI18N
        panelFormulario.add(CampoNombre);

        TextoNombre.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        TextoNombre.setText("Introduce Nombre");
        TextoNombre.setMaximumSize(null);
        TextoNombre.setMinimumSize(null);
        TextoNombre.setName(""); // NOI18N
        TextoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoNombreActionPerformed(evt);
            }
        });
        panelFormulario.add(TextoNombre);

        CampoApellidos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CampoApellidos.setText("Apellidos");
        CampoApellidos.setMaximumSize(new java.awt.Dimension(200, 200));
        CampoApellidos.setMinimumSize(new java.awt.Dimension(200, 200));
        CampoApellidos.setName(""); // NOI18N
        CampoApellidos.setPreferredSize(new java.awt.Dimension(200, 200));
        panelFormulario.add(CampoApellidos);

        TextoApellidos.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        TextoApellidos.setText("Introduce Apellidos");
        TextoApellidos.setMaximumSize(null);
        TextoApellidos.setMinimumSize(null);
        TextoApellidos.setName(""); // NOI18N
        panelFormulario.add(TextoApellidos);

        CampoTeléfono.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CampoTeléfono.setText("Teléfono");
        CampoTeléfono.setName(""); // NOI18N
        panelFormulario.add(CampoTeléfono);

        TextoTeléfono.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        TextoTeléfono.setText("Introduce nº de teléfono");
        TextoTeléfono.setMaximumSize(null);
        TextoTeléfono.setMinimumSize(null);
        TextoTeléfono.setName(""); // NOI18N
        panelFormulario.add(TextoTeléfono);

        CampoGrupo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CampoGrupo.setText("Grupo (opcional)");
        CampoGrupo.setName(""); // NOI18N
        panelFormulario.add(CampoGrupo);

        TextoGrupo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        TextoGrupo.setText("Introduce Grupo");
        TextoGrupo.setMaximumSize(null);
        TextoGrupo.setMinimumSize(null);
        TextoGrupo.setName(""); // NOI18N
        panelFormulario.add(TextoGrupo);

        CampoCorreo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CampoCorreo.setText("Correo (opcional)");
        CampoCorreo.setName(""); // NOI18N
        panelFormulario.add(CampoCorreo);

        TextoCorreo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        TextoCorreo.setText("Introduce correo electrónico");
        TextoCorreo.setMaximumSize(null);
        TextoCorreo.setMinimumSize(null);
        TextoCorreo.setName(""); // NOI18N
        panelFormulario.add(TextoCorreo);

        AgregarContacto.setText("Agregar Contacto");
        AgregarContacto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AgregarContactoMouseClicked(evt);
            }
        });
        AgregarContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarContactoActionPerformed(evt);
            }
        });
        panelFormulario.add(AgregarContacto);

        getContentPane().add(panelFormulario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 160));

        TextoAreaContactos.setColumns(20);
        TextoAreaContactos.setRows(5);
        TextoAreaContactos.setPreferredSize(new java.awt.Dimension(600, 200));
        jScrollPane1.setViewportView(TextoAreaContactos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 166, 600, 200));

        BotónLimpiar.setText("jButton1");

        BotónEliminar.setText("jButton2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BotónLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(BotónEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotónEliminar)
                    .addComponent(BotónLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 600, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarContactoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgregarContactoActionPerformed

    private void TextoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoNombreActionPerformed

    private void AgregarContactoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarContactoMouseClicked
            // Obtener los datos de los campos
            String nombre = TextoNombre.getText();
            String apellido = TextoApellidos.getText();
            String telefono = TextoTeléfono.getText();
            String grupo = TextoGrupo.getText();
            String correo = TextoCorreo.getText();
            //Validar que el campo nombre no esté vacío ni apellido ni teléfono
            if (nombre.isEmpty() || apellido.isEmpty() || telefono.isEmpty()){
                javax.swing.JOptionPane.showMessageDialog(this, "Por favor, rellene nombre, apellidos y teléfono");return;}
            //Crear nuevo contacto y agregarlo
            Contacto nuevoContacto = new Contacto(nombre, apellido, telefono, grupo, correo);
            //Agregar a la agenda
            agenda.agregarContacto(nuevoContacto);
            //mostrar los contactos en el área de texto
            TextoAreaContactos.setText(TextoAreaContactos.getText()+"Nombre: " + nombre + ", Apellido: " + apellido + 
                    ", Teléfono: " + telefono + "\n");
        
            //Limpiar los campos
            TextoNombre.setText("");
            TextoApellidos.setText("");
            TextoTeléfono.setText("");
        
    }//GEN-LAST:event_AgregarContactoMouseClicked
// Método para mostrar los contactos en el área de texto
private void mostrarContactosEnArea() {
    TextoAreaContactos.setText(""); // Limpiamos el área de texto
}
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new InterfazVentanaPrincipal().setVisible(true);
        }
    });
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarContacto;
    private javax.swing.JButton BotónEliminar;
    private javax.swing.JButton BotónLimpiar;
    private javax.swing.JLabel CampoApellidos;
    private javax.swing.JLabel CampoCorreo;
    private javax.swing.JLabel CampoGrupo;
    private javax.swing.JLabel CampoNombre;
    private javax.swing.JLabel CampoTeléfono;
    private javax.swing.JTextField TextoApellidos;
    private javax.swing.JTextArea TextoAreaContactos;
    private javax.swing.JTextField TextoCorreo;
    private javax.swing.JTextField TextoGrupo;
    private javax.swing.JTextField TextoNombre;
    private javax.swing.JTextField TextoTeléfono;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelFormulario;
    // End of variables declaration//GEN-END:variables
}
