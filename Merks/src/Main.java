import javax.swing.*;  // Importamos Swing para los elementos gráficos
import java.awt.*;      // Importamos AWT para diseño de la interfaz

public class Main extends JFrame {  // Clase principal, hereda de JFrame
    private JTextField usuarioField;      // Campo de texto para usuario
    private JPasswordField passwordField; // Campo de texto para contraseña

    public Main() {  // Constructor de la ventana de inicio de sesión
        setTitle("Merks and Spen - Inicio de Sesión");  // Título de la ventana
        setSize(400, 300);  // Tamaño de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cierra la aplicación al salir
        setLocationRelativeTo(null);  // Centrar la ventana en la pantalla

        JPanel panel = new JPanel(); // Panel donde se agregarán los elementos
        panel.setLayout(null);  // Diseño manual (posicionamiento con coordenadas)
        panel.setBackground(Color.BLACK);  // Fondo negro

        // --- Título "Merks and Spen" ---
        JLabel marcaLabel = new JLabel("Merks and Spen"); // Etiqueta con el nombre de la app
        marcaLabel.setBounds(0, 20, 400, 40); // Tamaño y posición
        marcaLabel.setFont(new Font("Arial", Font.BOLD, 24)); // Fuente grande y negrita
        marcaLabel.setForeground(Color.WHITE); // Color blanco
        marcaLabel.setHorizontalAlignment(SwingConstants.CENTER); // Centrar texto
        panel.add(marcaLabel); // Agregar al panel

        // --- Etiqueta y campo de usuario ---
        JLabel usuarioLabel = new JLabel("Usuario:");
        usuarioLabel.setBounds(100, 80, 80, 25);
        usuarioLabel.setForeground(Color.WHITE);
        panel.add(usuarioLabel);

        usuarioField = new JTextField(20);
        usuarioField.setBounds(180, 80, 120, 25);
        usuarioField.setForeground(Color.WHITE);
        usuarioField.setBackground(Color.DARK_GRAY);
        panel.add(usuarioField);

        // --- Etiqueta y campo de contraseña ---
        JLabel passwordLabel = new JLabel("Contraseña:");
        passwordLabel.setBounds(100, 120, 80, 25);
        passwordLabel.setForeground(Color.WHITE);
        panel.add(passwordLabel);

        passwordField = new JPasswordField(20);
        passwordField.setBounds(180, 120, 120, 25);
        passwordField.setForeground(Color.WHITE);
        passwordField.setBackground(Color.DARK_GRAY);
        panel.add(passwordField);

        // --- Botón "Iniciar Sesión" ---
        JButton loginButton = new JButton("Iniciar Sesión");
        loginButton.setBounds(140, 170, 120, 30);
        loginButton.setForeground(Color.WHITE);
        loginButton.setBackground(Color.DARK_GRAY);
        panel.add(loginButton);

        // --- Mensaje "¿Olvidaste tu contraseña?" ---
        JLabel olvidasteLabel = new JLabel("¿Olvidaste tu contraseña?");
        olvidasteLabel.setBounds(100, 220, 200, 25);
        olvidasteLabel.setForeground(Color.WHITE);
        panel.add(olvidasteLabel);

        // --- Simulación de enlace "Click aquí" ---
        JLabel clickAquiLabel = new JLabel("Click aquí");
        clickAquiLabel.setBounds(235, 220, 100, 25);
        clickAquiLabel.setForeground(Color.BLUE);
        clickAquiLabel.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Cambia el cursor al pasar por encima
        panel.add(clickAquiLabel);

        add(panel);  // Agregar el panel a la ventana
    }

    // Método main: Ejecuta la ventana
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {  // Asegura que la GUI se ejecute en el hilo correcto
            @Override
            public void run() {
                new Main().setVisible(true);  // Muestra la ventana
            }
        });
    }
}
