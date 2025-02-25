import javax.swing.JOptionPane;

class Cuenta {
    private int noCuenta;
    private String titular;
    private int edad;
    private double saldo;

    public Cuenta(int noCuenta, String titular, int edad, double saldo) {
        this.noCuenta = noCuenta;
        this.titular = titular;
        this.edad = edad;
        this.saldo = saldo;
    }

    public void consultarSaldo() {
        JOptionPane.showMessageDialog(null, "Saldo actual: $" + saldo);
    }

    public void ingresarEfectivo(double monto) {
        if (monto > 0) {
            saldo += monto;
            JOptionPane.showMessageDialog(null, "Depósito exitoso. Nuevo saldo: $" + saldo);
        } else {
            JOptionPane.showMessageDialog(null, "Monto inválido");
        }
    }

    public boolean retirarEfectivo(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            JOptionPane.showMessageDialog(null, "Retiro exitoso. Nuevo saldo: $" + saldo);
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Fondos insuficientes o monto inválido");
            return false;
        }
    }

    public boolean depositarOtraCuenta(Cuenta destino, double monto) {
        if (retirarEfectivo(monto)) {
            destino.ingresarEfectivo(monto);
            return true;
        }
        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        int noCuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de cuenta:"));
        String titular = JOptionPane.showInputDialog("Ingrese el nombre del titular:");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del titular:"));
        double saldo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el saldo inicial:"));

        Cuenta cuenta1 = new Cuenta(noCuenta, titular, edad, saldo);
        Cuenta cuenta2 = new Cuenta(1002, "María López", 25, 3000.0);

        while (true) {
            String opcion = JOptionPane.showInputDialog(null, "Seleccione una opción:\n1. Consultar saldo\n2. Ingresar efectivo\n3. Retirar efectivo\n4. Depositar a otra cuenta\n5. Salir");

            if (opcion == null || opcion.equals("5")) {
                break;
            }

            switch (opcion) {
                case "1":
                    cuenta1.consultarSaldo();
                    break;
                case "2":
                    double deposito = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto a depositar:"));
                    cuenta1.ingresarEfectivo(deposito);
                    break;
                case "3":
                    double retiro = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto a retirar:"));
                    cuenta1.retirarEfectivo(retiro);
                    break;
                case "4":
                    double transferencia = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto a transferir:"));
                    if (cuenta1.depositarOtraCuenta(cuenta2, transferencia)) {
                        JOptionPane.showMessageDialog(null, "Transferencia exitosa");
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        }
    }
}
