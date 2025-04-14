import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlAccesoGUI extends JFrame {
    private JTextField campoUsuario;
    private JPasswordField campoPassword;
    private JButton btnLogin;

    public ControlAccesoGUI() {
        setTitle("Control de Acceso");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3, 2, 10, 10));

        JLabel lblUsuario = new JLabel("Usuario:");
        campoUsuario = new JTextField();

        JLabel lblPassword = new JLabel("Contraseña:");
        campoPassword = new JPasswordField();

        btnLogin = new JButton("Iniciar sesión");

        // Acción del botón Login
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = campoUsuario.getText();
                String password = new String(campoPassword.getPassword());
                if (Validacion.validarCampoVacio(usuario) && Validacion.validarCampoVacio(password)) {
                    ControlAcceso control = new ControlAcceso();
                    if (control.verificarCredenciales(usuario, password)) {
                        JOptionPane.showMessageDialog(null, "Login exitoso.");
                        // Aquí se podría redirigir a la interfaz principal
                    } else {
                        JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.");
                }
            }
        });

        // Agregar componentes al frame
        add(lblUsuario);
        add(campoUsuario);
        add(lblPassword);
        add(campoPassword);
        add(btnLogin);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ControlAccesoGUI().setVisible(true));
    }
}
