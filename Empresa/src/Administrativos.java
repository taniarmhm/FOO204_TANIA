class Administrativos extends Empleado {
    private String departamento;

    public Administrativos(String nombre, int id, double salario, String departamento) {
        super(nombre, id, salario);
        this.departamento = departamento;
    }

    @Override
    public String obtenerInfo() {
        return "Administrativos: " + nombre + "\nID: " + id + "\nSalario: $" + salario + "\nDepartamento: " + departamento;
    }
}