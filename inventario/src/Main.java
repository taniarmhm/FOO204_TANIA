import javax.swing.*;
import java.awt.*;

public class InventarioArticulo extends JFrame {
    private JTextField idArticuloInventarioField;
    private JButton consultarExistenciaBtn, visualizarGraficaBtn, generarReporteBtn;

    public InventarioArticulo() {
        setTitle("Inventario de Artículo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 1));

        idArticuloInventarioField = new JTextField();
        consultarExistenciaBtn = new JButton("Consultar Existencia");
        visualizarGraficaBtn = new JButton("Visualizar Gráfica");
        generarReporteBtn = new JButton("Generar Reporte");

        add(new JLabel("ID Artículo Inventario:"));
        add(idArticuloInventarioField);
        add(consultarExistenciaBtn);
        add(visualizarGraficaBtn);
        add(generarReporteBtn);

        setVisible(true);
    }