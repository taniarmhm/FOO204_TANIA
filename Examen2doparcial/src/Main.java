import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Introduce tu nombre:");
        String apellidoPaterno = JOptionPane.showInputDialog("Introduce tu apellido paterno:");
        String apellidoMaterno = JOptionPane.showInputDialog("Introduce tu apellido materno:");
        String anoNacimiento = JOptionPane.showInputDialog("Introduce tu año de nacimiento:");
        String carrera = JOptionPane.showInputDialog("Introduce tu carrera:");

        generadordematricula generator = new generadordematricula(nombre, apellidoPaterno, apellidoMaterno, anoNacimiento, carrera);
        String matricula = generator.generarMatricula();

        JOptionPane.showMessageDialog(null, "Tu matrícula generada es: " + matricula);
    }
}

