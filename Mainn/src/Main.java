import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo = null;
        Conductor conductor = null;
        Envio envio = null;
        Entrega entrega = null;

        while (true) {
            String opcion = JOptionPane.showInputDialog(
                    "Menú Principal:\n" +
                            "1. Crear Vehículo\n" +
                            "2. Registrar Conductor\n" +
                            "3. Asignar Conductor al Vehículo\n" +
                            "4. Crear Envío\n" +
                            "5. Registrar Entrega\n" +
                            "6. Actualizar Estado de Entrega\n" +
                            "7. Salir");

            if (opcion == null || opcion.equals("7")) {
                break;
            }

            switch (opcion) {
                case "1":
                    String placa = JOptionPane.showInputDialog("Ingrese la placa del vehículo:");
                    String modelo = JOptionPane.showInputDialog("Ingrese el modelo del vehículo:");
                    double capacidad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la capacidad de carga:"));
                    vehiculo = new Vehiculo(placa, modelo, capacidad);
                    JOptionPane.showMessageDialog(null, "Vehículo creado con éxito.");
                    break;

                case "2":
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del conductor:");
                    String identificacion = JOptionPane.showInputDialog("Ingrese la identificación:");
                    String licencia = JOptionPane.showInputDialog("Ingrese la licencia:");
                    conductor = new Conductor(nombre, identificacion, licencia);
                    JOptionPane.showMessageDialog(null, "Conductor registrado con éxito.");
                    break;

                case "3":
                    if (vehiculo != null && conductor != null) {
                        vehiculo.asignarConductor(conductor);
                        JOptionPane.showMessageDialog(null, "Conductor asignado al vehículo.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Debe registrar un vehículo y un conductor primero.");
                    }
                    break;

                case "4":
                    envio = Envio.crearEnvio();
                    JOptionPane.showMessageDialog(null, "Envío creado con éxito.");
                    break;

                case "5":
                    if (envio != null) {
                        String numeroGuia = JOptionPane.showInputDialog("Ingrese el número de guía:");
                        entrega = new Entrega(numeroGuia);
                        JOptionPane.showMessageDialog(null, "Entrega registrada con estado: Pendiente.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Debe crear un envío primero.");
                    }
                    break;

                case "6":
                    if (entrega != null) {
                        entrega.actualizarEstado();
                        JOptionPane.showMessageDialog(null, "Estado actualizado a: " + entrega.getEstado());
                    } else {
                        JOptionPane.showMessageDialog(null, "Debe registrar una entrega primero.");
                    }
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        }
    }
}