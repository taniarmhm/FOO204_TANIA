public class Spartan2 extends Spartan {
  public  Spartan2(String nombre, int salud, String arma, int escudo){
   super(nombre, salud,arma, escudo= 150);

  }
  public void usarManejoAvanzado(){
      System.out.println("el spartan:" + nombre+ " tiene  escudo extra y tacticas de combate avanzado");
  }
}
