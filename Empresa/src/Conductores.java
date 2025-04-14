class Conductores  extends Empleado {
    private String licencia;

    public Conductores (String nombre, int id, double salario, String licencia) {
        super(nombre, id, salario);
        this.licencia = licencia;
    }

    @Override
    public String obtenerInfo() {
        return "Conductor: " + nombre + "\nID: " + id + "\nSalario: $" + salario + "\nLicencia: " + licencia;
    }
}