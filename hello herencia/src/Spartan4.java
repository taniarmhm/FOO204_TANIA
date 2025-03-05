public class Spartan4 extends Spartan{
    public  Spartan4(String nombre, int salud, String arma, int escudo){
        super(nombre, salud,arma, escudo= 100);

    }
    public void UsaPropulsores(){
        System.out.println("el spartan:" + nombre+ "usa propulsores para moverse rapidamente");
    }
}
