import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        // Iniciar la interfaz de Control de Acceso
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ControlAccesoGUI login = new ControlAccesoGUI();
                login.setVisible(true);
            }
        });
    }

    // Método para abrir el menú principal una vez que el usuario haya iniciado sesión correctamente
    public static void abrirMenuPrincipal() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Crear la ventana principal
                JFrame menuPrincipal = new JFrame("Menú Principal");
                menuPrincipal.setSize(400, 300);
                menuPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                menuPrincipal.setLocationRelativeTo(null);
                menuPrincipal.setLayout(new GridLayout(4, 1, 10, 10));

                // Botones de navegación
                JButton btnAdministrarUsuarios = new JButton("Administrar Usuarios");
                JButton btnAdministrarArticulos = new JButton("Administrar Artículos");
                JButton btnInventario = new JButton("Inventario");
                JButton btnSolicitarArticulos = new JButton("Solicitar Artículos");

                // Acción para administrar usuarios
                btnAdministrarUsuarios.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Abre la interfaz de administración de usuarios
                        AdministracionUsuariosGUI adminUsuarios = new AdministracionUsuariosGUI();
                        adminUsuarios.setVisible(true);
                    }
                });

                // Acción para administrar artículos
                btnAdministrarArticulos.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Abre la interfaz de administración de artículos
                        AdministracionArticulosGUI adminArticulos = new AdministracionArticulosGUI();
                        adminArticulos.setVisible(true);
                    }
                });

                // Acción para consultar inventario
                btnInventario.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Abre la interfaz de inventario de artículos
                        InventarioArticulosGUI inventario = new InventarioArticulosGUI();
                        inventario.setVisible(true);
                    }
                });

                // Acción para solicitar artículos
                btnSolicitarArticulos.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Abre la interfaz para solicitar artículos
                        SolicitudArticulosGUI solicitud = new SolicitudArticulosGUI();
                        solicitud.setVisible(true);
                    }
                });

                // Agregar botones al menú principal
                menuPrincipal.add(btnAdministrarUsuarios);
                menuPrincipal.add(btnAdministrarArticulos);
                menuPrincipal.add(btnInventario);
                menuPrincipal.add(btnSolicitarArticulos);

                menuPrincipal.setVisible(true);
            }
        });
    }
}
