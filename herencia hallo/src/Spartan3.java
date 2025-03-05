public class Spartan3 extends Spartan {

    public  Spartan3(String nombre, int salud, String arma, int escudo){
        super(nombre, salud,arma, escudo= 80);

    }
    public void camuflajeActivo(){
        System.out.println("el spartan:" + nombre+ "cuenta con camuflaje para invisivilidad");
    }
}
