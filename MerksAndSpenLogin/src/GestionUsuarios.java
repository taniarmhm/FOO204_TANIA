import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GestionUsuarios extends JFrame {
    private JTextField campoUsuario, campoPassword;
    private JButton btnAgregar, btnEliminar, btnModificar;
    private JComboBox<String> comboUsuarios;

    private ControlAcceso controlAcceso;

    public GestionUsuarios() {
        setTitle("Administración de Usuarios");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2, 10, 10));
        setLocationRelativeTo(null);

        controlAcceso = new ControlAcceso();

        // Componentes
        JLabel lblUsuario = new JLabel("Usuario:");
        campoUsuario = new JTextField();

        JLabel lblPassword = new JLabel("Contraseña:");
        campoPassword = new JTextField();

        btnAgregar = new JButton("Agregar Usuario");
        btnEliminar = new JButton("Eliminar Usuario");
        btnModificar = new JButton("Modificar Usuario");

        comboUsuarios = new JComboBox<>(new String[] { "admin", "usuario1" });

        // Acción de agregar usuario
        btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = campoUsuario.getText();
                String password = campoPassword.getText();

                if (Validacion.validarCampoVacio(usuario) && Validacion.validarCampoVacio(password)) {
                    controlAcceso.agregarUsuario(usuario, password);
                    JOptionPane.showMessageDialog(null, "Usuario agregado exitosamente.");
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.");
                }
            }
        });

        // Acción de eliminar usuario
        btnEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = (String) comboUsuarios.getSelectedItem();
                controlAcceso.eliminarUsuario(usuario);
                JOptionPane.showMessageDialog(null, "Usuario eliminado.");
            }
        });

        // Acción de modificar usuario
        btnModificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = (String) comboUsuarios.getSelectedItem();
                String newPassword = campoPassword.getText();

                if (Validacion.validarCampoVacio(newPassword)) {
                    controlAcceso.modificarPassword(usuario, newPassword);
                    JOptionPane.showMessageDialog(null, "Contraseña modificada.");
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese una nueva contraseña.");
                }
            }
        });

        // Agregar componentes al frame
        add(lblUsuario);
        add(campoUsuario);
        add(lblPassword);
        add(campoPassword);
        add(btnAgregar);
        add(btnEliminar);
        add(btnModificar);
        add(comboUsuarios);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new GestionUsuarios().setVisible(true);
        });
    }
}
