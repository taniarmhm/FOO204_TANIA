import javax.swing.JOptionPane;
import java.util.ArrayList;
public class Main {
    private static ArrayList<Empleado> empleados = new ArrayList<>();
    public static void main(String[] args) {
        while (true) {
            String[] opciones = {"Agregar Conductor", "Agregar Administrativo", "Listar Empleados", "Salir"};
            int seleccion = JOptionPane.showOptionDialog(null, "Seleccione una opción:", "Gestión de Empleados",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            if (seleccion == 3 || seleccion == -1) break;

            if (seleccion == 2) { // Listar empleados
                listarEmpleados();
                continue;
            }

            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado:");
            int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del empleado:"));
            double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario del empleado:"));

            Empleado empleado;
            if (seleccion == 0) { // Agregar Conductor
                String licencia = JOptionPane.showInputDialog("Ingrese el tipo de licencia:");
                empleado = new Conductores(nombre, id, salario, licencia);
            } else { // Agregar Administrativo
                String departamento = JOptionPane.showInputDialog("Ingrese el departamento:");
                empleado = new Administrativos (nombre, id, salario, departamento);
            }

            empleados.add(empleado);
            JOptionPane.showMessageDialog(null, "Empleado agregado exitosamente.");
        }
    }

    private static void listarEmpleados() {
        if (empleados.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay empleados registrados.");
            return;
        }
        StringBuilder lista = new StringBuilder("Lista de empleados:\n\n");
        for (Empleado emp : empleados) {
            lista.append(emp.obtenerInfo()).append("\n----------------------\n");
        }
        JOptionPane.showMessageDialog(null, lista.toString());

    }
}