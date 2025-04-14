import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdministracionUsuariosGUI extends JFrame {
    private JTextField campoIdUsuario;
    private JTextField campoNombreUsuario;
    private JButton btnRegistrar, btnEliminar, btnModificar;

    public AdministracionUsuariosGUI() {
        setTitle("Administración de Usuarios");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(5, 2, 10, 10));

        JLabel lblIdUsuario = new JLabel("ID Usuario:");
        campoIdUsuario = new JTextField();

        JLabel lblNombreUsuario = new JLabel("Nombre Usuario:");
        campoNombreUsuario = new JTextField();

        btnRegistrar = new JButton("Registrar");
        btnEliminar = new JButton("Eliminar");
        btnModificar = new JButton("Modificar");

        // Acción de los botones
        btnRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para registrar usuario
            }
        });

        btnEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para eliminar usuario
            }
        });

        btnModificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para modificar usuario
            }
        });

        // Agregar componentes al frame
        add(lblIdUsuario);
        add(campoIdUsuario);
        add(lblNombreUsuario);
        add(campoNombreUsuario);
        add(btnRegistrar);
        add(btnEliminar);
        add(btnModificar);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new AdministracionUsuariosGUI().setVisible(true));
    }
}
