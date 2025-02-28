import javax.swing.JOptionPane;

public class Envio {
    private String codigoEnvio;
    private String destino;
    private double peso;

    public Envio(String codigoEnvio, String destino) {
        this.codigoEnvio = codigoEnvio;
        this.destino = destino;
        this.peso = 0.0;
    }

    public Envio(String codigoEnvio, String destino, double peso) {
        this.codigoEnvio = codigoEnvio;
        this.destino = destino;
        this.peso = peso;
    }

    public String getCodigoEnvio() {
        return codigoEnvio;
    }

    public String getDestino() {
        return destino;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public static Envio crearEnvio() {
        String codigo = JOptionPane.showInputDialog("Ingrese el código del envío:");
        String destino = JOptionPane.showInputDialog("Ingrese el destino del envío:");
        String pesoStr = JOptionPane.showInputDialog("Ingrese el peso del envío (opcional, deje vacío si no aplica):");

        if (pesoStr.isEmpty()) {
            return new Envio(codigo, destino);
        } else {
            double peso = Double.parseDouble(pesoStr);
            return new Envio(codigo, destino, peso);
        }
    }
}