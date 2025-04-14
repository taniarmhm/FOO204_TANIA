import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;


public class GestionArticulos extends JFrame {
    private JTextField campoArticulo, campoCantidad;
    private JButton btnAgregar, btnEliminar, btnModificar;
    private JComboBox<String> comboArticulos;

    private HashMap<String, Integer> articulos;

    public GestionArticulos() {
        setTitle("Administración de Artículos");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2, 10, 10));
        setLocationRelativeTo(null);

        articulos = new HashMap<>();

        // Componentes
        JLabel lblArticulo = new JLabel("Artículo:");
        campoArticulo = new JTextField();

        JLabel lblCantidad = new JLabel("Cantidad:");
        campoCantidad = new JTextField();

        btnAgregar = new JButton("Agregar Artículo");
        btnEliminar = new JButton("Eliminar Artículo");
        btnModificar = new JButton("Modificar Cantidad");

        comboArticulos = new JComboBox<>();

        // Acción de agregar artículo
        btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String articulo = campoArticulo.getText();
                int cantidad = Integer.parseInt(campoCantidad.getText());

                if (Validacion.validarCampoVacio(articulo) && cantidad > 0) {
                    articulos.put(articulo, cantidad);
                    comboArticulos.addItem(articulo);
                    JOptionPane.showMessageDialog(null, "Artículo agregado.");
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.");
                }
            }
        });

        // Acción de eliminar artículo
        btnEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String articulo = (String) comboArticulos.getSelectedItem();
                articulos.remove(articulo);
                comboArticulos.removeItem(articulo);
                JOptionPane.showMessageDialog(null, "Artículo eliminado.");
            }
        });

        // Acción de modificar cantidad de artículo
        btnModificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String articulo = (String) comboArticulos.getSelectedItem();
                int cantidad = Integer.parseInt(campoCantidad.getText());

                if (cantidad > 0) {
                    articulos.put(articulo, cantidad);
                    JOptionPane.showMessageDialog(null, "Cantidad modificada.");
                } else {
                    JOptionPane.showMessageDialog(null, "Ingrese una cantidad válida.");
                }
            }
        });

        // Agregar componentes al frame
        add(lblArticulo);
        add(campoArticulo);
        add(lblCantidad);
        add(campoCantidad);
        add(btnAgregar);
        add(btnEliminar);
        add(btnModificar);
        add(comboArticulos);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new GestionArticulos().setVisible(true);
        });
    }
}
