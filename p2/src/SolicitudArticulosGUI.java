import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SolicitudArticulosGUI extends JFrame {
    private JTextField campoArticulo;
    private JTextField campoCantidad;

    public SolicitudArticulosGUI() {
        setTitle("Solicitud de Artículos");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3, 2, 10, 10));

        JLabel lblArticulo = new JLabel("Artículo:");
        campoArticulo = new JTextField();

        JLabel lblCantidad = new JLabel("Cantidad:");
        campoCantidad = new JTextField();

        JButton btnSolicitar = new JButton("Solicitar");

        btnSolicitar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String articulo = campoArticulo.getText();
                String cantidad = campoCantidad.getText();
                // Lógica para solicitar el artículo
                JOptionPane.showMessageDialog(null, "Solicitud enviada para: " + articulo + " x " + cantidad);
            }
        });

        add(lblArticulo);
        add(campoArticulo);
        add(lblCantidad);
        add(campoCantidad);
        add(btnSolicitar);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SolicitudArticulosGUI().setVisible(true));
    }
}
