import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdministracionArticulosGUI extends JFrame {
    private JTextField campoIdArticulo;
    private JTextField campoNombreArticulo;
    private JTextArea campoDescripcionArticulo;
    private JTextField campoCantidadArticulo;
    private JButton btnRegistrar, btnEliminar, btnModificar, btnSalir;

    public AdministracionArticulosGUI() {
        setTitle("Administración de Artículos");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(6, 2, 10, 10));

        JLabel lblIdArticulo = new JLabel("ID Artículo:");
        campoIdArticulo = new JTextField();

        JLabel lblNombreArticulo = new JLabel("Nombre Artículo:");
        campoNombreArticulo = new JTextField();

        JLabel lblDescripcionArticulo = new JLabel("Descripción:");
        campoDescripcionArticulo = new JTextArea(3, 20);

        JLabel lblCantidadArticulo = new JLabel("Cantidad:");
        campoCantidadArticulo = new JTextField();

        btnRegistrar = new JButton("Registrar");
        btnEliminar = new JButton("Eliminar");
        btnModificar = new JButton("Modificar");
        btnSalir = new JButton("Salir");

        // Acción de los botones
        btnRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para registrar artículo
            }
        });

        btnEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para eliminar artículo
            }
        });

        btnModificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para modificar artículo
            }
        });

        btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // Cerrar ventana
            }
        });

        // Agregar componentes al frame
        add(lblIdArticulo);
        add(campoIdArticulo);
        add(lblNombreArticulo);
        add(campoNombreArticulo);
        add(lblDescripcionArticulo);
        add(new JScrollPane(campoDescripcionArticulo));
        add(lblCantidadArticulo);
        add(campoCantidadArticulo);
        add(btnRegistrar);
        add(btnEliminar);
        add(btnModificar);
        add(btnSalir);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new AdministracionArticulosGUI().setVisible(true));
    }
}
