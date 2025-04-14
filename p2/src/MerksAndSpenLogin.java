import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MerksAndSpenLogin extends JFrame {
    private JTextField campoUsuario;
    private JPasswordField campoPassword;
    private JButton btnLogin, btnRecuperar;

    public MerksAndSpenLogin() {
        setTitle("Login - Merks & Spen");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 10, 10));
        setLocationRelativeTo(null);

        // Componentes
        JLabel lblUsuario = new JLabel("Usuario:");
        campoUsuario = new JTextField();

        JLabel lblPassword = new JLabel("Contraseña:");
        campoPassword = new JPasswordField();

        btnLogin = new JButton("Iniciar sesión");
        btnRecuperar = new JButton("Recuperar contraseña");

        // Acción del botón Login
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = campoUsuario.getText();
                String password = new String(campoPassword.getPassword());

                if (validarCampoVacio(usuario) && validarCampoVacio(password)) {
                    ControlAcceso control = new ControlAcceso();
                    if (control.verificarCredenciales(usuario, password)) {
                        JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso.");
                        abrirMenuPrincipal(usuario); // Método para abrir la siguiente ventana
                    } else {
                        JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.");
                }
            }
        });

        // Acción del botón Recuperar contraseña
        btnRecuperar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String correo = JOptionPane.showInputDialog("Ingrese su correo:");
                if (validarCampoVacio(correo)) {
                    ControlAcceso control = new ControlAcceso();
                    control.recuperarContra(correo);
                } else {
                    JOptionPane.showMessageDialog(null, "Ingrese un correo válido.");
                }
            }
        });

        // Agregar componentes al frame
        add(lblUsuario);
        add(campoUsuario);
        add(lblPassword);
        add(campoPassword);
        add(btnLogin);
        add(btnRecuperar);
    }

    private void abrirMenuPrincipal(String usuario) {
        JOptionPane.showMessageDialog(null, "Bienvenido, " + usuario);
        // Aquí se podría abrir una nueva ventana con el menú de opciones.
    }

    // Método para validar que los campos no estén vacíos
    private boolean validarCampoVacio(String campo) {
        return campo != null && !campo.trim().isEmpty();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MerksAndSpenLogin().setVisible(true);
        });
    }
}
