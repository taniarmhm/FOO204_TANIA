
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InventarioArticulosGUI extends JFrame {

    private JTextField campoId, campoNombre, campoDescripcion, campoCantidad;
    private JButton btnRegistrar, btnEliminar, btnModificar, btnSalir;

    public InventarioArticulosGUI() {
        setTitle("Inventario de Artículos");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2, 10, 10));
        setLocationRelativeTo(null);

        // Componentes
        JLabel lblId = new JLabel("ID Artículo:");
        campoId = new JTextField();

        JLabel lblNombre = new JLabel("Nombre:");
        campoNombre = new JTextField();

        JLabel lblDescripcion = new JLabel("Descripción:");
        campoDescripcion = new JTextField();

        JLabel lblCantidad = new JLabel("Cantidad:");
        campoCantidad = new JTextField();

        btnRegistrar = new JButton("Registrar");
        btnEliminar = new JButton("Eliminar");
        btnModificar = new JButton("Modificar");
        btnSalir = new JButton("Salir");

        // Acción del botón Registrar
        btnRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para registrar artículo
                String id = campoId.getText();
                String nombre = campoNombre.getText();
                String descripcion = campoDescripcion.getText();
                String cantidad = campoCantidad.getText();

                JOptionPane.showMessageDialog(null, "Artículo registrado: " + nombre);
            }
        });

        // Acción del botón Eliminar
        btnEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para eliminar artículo
                String id = campoId.getText();
                JOptionPane.showMessageDialog(null, "Artículo con ID " + id + " eliminado.");
            }
        });

        // Acción del botón Modificar
        btnModificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para modificar artículo
                String id = campoId.getText();
                String nombre = campoNombre.getText();
                String descripcion = campoDescripcion.getText();
                String cantidad = campoCantidad.getText();

                JOptionPane.showMessageDialog(null, "Artículo con ID " + id + " modificado.");
            }
        });

        // Acción del botón Salir
        btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();  // Cierra la ventana
            }
        });

        // Agregar componentes al frame
        add(lblId);
        add(campoId);
        add(lblNombre);
        add(campoNombre);
        add(lblDescripcion);
        add(campoDescripcion);
        add(lblCantidad);
        add(campoCantidad);
        add(btnRegistrar);
        add(btnEliminar);
        add(btnModificar);
        add(btnSalir);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new InventarioArticulosGUI().setVisible(true); // Hacer la ventana visible
        });
    }
}

