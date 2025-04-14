class generadordematricula {
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String anoNacimiento;
    private String carrera;

    public generadordematricula  (String nombre, String apellidoPaterno, String apellidoMaterno, String anoNacimiento, String carrera) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.anoNacimiento = anoNacimiento;
        this.carrera = carrera;
    }

    public String generarMatricula() {
        int anoActual = java.time.Year.now().getValue();
        String ultimosAnoActual = String.valueOf(anoActual).substring(2);
        String ultimosAnoNacimiento = anoNacimiento.substring(2);

        char inicialNombre = nombre.charAt(0);
        char inicialApellidoPaterno = apellidoPaterno.charAt(0);
        char inicialApellidoMaterno = apellidoMaterno.charAt(0);
        String primerasLetrasCarrera = carrera.length() >= 3 ? carrera.substring(0, 3) : carrera;

        int numerosAleatorios = (int) (Math.random() * 900) + 100;

        return ultimosAnoActual + ultimosAnoNacimiento + inicialNombre + inicialApellidoPaterno +
                inicialApellidoMaterno + numerosAleatorios + primerasLetrasCarrera.toUpperCase();
    }
}