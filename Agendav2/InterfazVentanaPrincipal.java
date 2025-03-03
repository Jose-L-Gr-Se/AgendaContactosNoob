public InterfazVentanaPrincipal() {
    initComponents();
    agenda = new Agenda();
    personalizarEstilo();
}

private void personalizarEstilo() {
    // Estilo general de la ventana
    this.setBackground(new java.awt.Color(255, 255, 255));
    
    // Estilo del panel principal
    panelFormulario.setBackground(new java.awt.Color(255, 255, 255));
    panelFormulario.setBorder(javax.swing.BorderFactory.createEmptyBorder(30, 30, 30, 30));
    
    // Estilo de los campos de texto
    javax.swing.JTextField[] campos = {TextoNombre, TextoApellidos, TextoTeléfono, TextoGrupo, TextoCorreo};
    for (javax.swing.JTextField campo : campos) {
        campo.setBorder(javax.swing.BorderFactory.createCompoundBorder(
            new javax.swing.border.LineBorder(new java.awt.Color(220, 220, 220), 1, true),
            javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10)));
        campo.setFont(new java.awt.Font("Segoe UI", 0, 14));
    }
    
    // Estilo del área de texto
    TextoAreaContactos.setBorder(javax.swing.BorderFactory.createCompoundBorder(
        new javax.swing.border.LineBorder(new java.awt.Color(220, 220, 220), 1, true),
        javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10)));
    TextoAreaContactos.setFont(new java.awt.Font("Segoe UI", 0, 13));
    
    // Estilo de los botones
    AgregarContacto.setBackground(new java.awt.Color(0, 122, 255));
    AgregarContacto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 122, 255), 1, true));
    AgregarContacto.setFocusPainted(false);
    
    BotónLimpiar.setBackground(new java.awt.Color(64, 156, 255));
    BotónLimpiar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 156, 255), 1, true));
    BotónLimpiar.setFocusPainted(false);
    
    BotónEliminar.setBackground(new java.awt.Color(255, 59, 48));
    BotónEliminar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 59, 48), 1, true));
    BotónEliminar.setFocusPainted(false);
}

private void AgregarContactoMouseClicked(java.awt.event.MouseEvent evt) {                                             
    // Obtener los datos de los campos
    String nombre = TextoNombre.getText().trim();
    String apellido = TextoApellidos.getText().trim();
    String telefono = TextoTeléfono.getText().trim();
    String grupo = TextoGrupo.getText().trim();
    String correo = TextoCorreo.getText().trim();
    
    // Validaciones
    if (nombre.isEmpty() || apellido.isEmpty() || telefono.isEmpty()) {
        mostrarError("Por favor, rellene nombre, apellidos y teléfono");
        return;
    }
    
    // Validar formato de teléfono
    if (!telefono.matches("\\d{9}")) {
        mostrarError("El teléfono debe tener 9 dígitos");
        return;
    }
    
    // Validar formato de correo si no está vacío
    if (!correo.isEmpty() && !correo.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
        mostrarError("Formato de correo electrónico inválido");
        return;
    }
    
    // Crear nuevo contacto y agregarlo
    Contacto nuevoContacto = new Contacto(nombre, apellido, telefono, grupo, correo);
    agenda.agregarContacto(nuevoContacto);
    
    // Imprimir por consola
    System.out.println("\n=== NUEVO CONTACTO AGREGADO ===");
    System.out.println("Nombre: " + nombre);
    System.out.println("Apellidos: " + apellido);
    System.out.println("Teléfono: " + telefono);
    if (!grupo.isEmpty()) System.out.println("Grupo: " + grupo);
    if (!correo.isEmpty()) System.out.println("Correo: " + correo);
    System.out.println("==============================\n");
    
    // Actualizar vista
    actualizarVistaContactos();
    limpiarCampos();
    mostrarExito("Contacto agregado exitosamente");
}

private void mostrarError(String mensaje) {
    javax.swing.JOptionPane.showMessageDialog(this, 
        mensaje, 
        "Error", 
        javax.swing.JOptionPane.ERROR_MESSAGE);
}

private void mostrarExito(String mensaje) {
    javax.swing.JOptionPane.showMessageDialog(this, 
        mensaje, 
        "Éxito", 
        javax.swing.JOptionPane.INFORMATION_MESSAGE);
}

private void limpiarCampos() {
    TextoNombre.setText("");
    TextoApellidos.setText("");
    TextoTeléfono.setText("");
    TextoGrupo.setText("");
    TextoCorreo.setText("");
    TextoNombre.requestFocus();
}

private void actualizarVistaContactos() {
    StringBuilder sb = new StringBuilder();
    for (Contacto contacto : agenda.getContactos()) {
        sb.append(contacto.getNombre())
          .append(" ")
          .append(contacto.getApellido())
          .append(" - Tel: ")
          .append(contacto.getTelefono())
          .append("\n");
    }
    TextoAreaContactos.setText(sb.toString());
}

private void BotónEliminarActionPerformed(java.awt.event.ActionEvent evt) {                                              
    String telefono = javax.swing.JOptionPane.showInputDialog(
        this,
        "Introduce el número de teléfono del contacto a eliminar:",
        "Eliminar Contacto",
        javax.swing.JOptionPane.QUESTION_MESSAGE
    );
    
    if (telefono != null && !telefono.trim().isEmpty()) {
        boolean eliminado = agenda.eliminarContactoPorTelefono(telefono.trim());
        if (eliminado) {
            actualizarVistaContactos();
            mostrarExito("Contacto eliminado exitosamente");
        } else {
            mostrarError("No se encontró ningún contacto con ese número de teléfono");
        }
    }
} 