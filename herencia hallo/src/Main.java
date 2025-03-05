public class Main {
    public static void main(String[] args) {

        // Creación del objeto Spartan2 con la sintaxis correcta
        Spartan2 jefeMaestro = new Spartan2 ("Jhon", 100, "Rifle de asalto");
        jefeMaestro.mostrarInfo();
        jefeMaestro.usarManejoAvanzado();
        jefeMaestro.atacar("Covenant");
        jefeMaestro.recargarEscudo();
        jefeMaestro.recibirDano(50);

        System.out.println("------------------------");

        // Creación del objeto Spartan3 con la sintaxis correcta
        Spartan3 NobleSix = new Spartan3("Jhon", 100, "Rifle de asalto");
        NobleSix.mostrarInfo();
    }
}
