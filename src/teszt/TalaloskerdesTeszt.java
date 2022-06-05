
package teszt;
import modell.Kerdes;

public class TalaloskerdesTeszt {

    private Kerdes kerdes;
    
    public TalaloskerdesTeszt(){
        kerdesTeszt();
    }
    public static void main(String[] args) {
        new TalaloskerdesTeszt();
    }
    
    public void kerdesTeszt(){
        System.out.println("kérdés ellenőrzése");
        
        kerdes = new Kerdes();
        String k = kerdes.getKerdes();
        assert k.equals("Három láda közül egyik rejti a kincset. Mindegyiken van egy felirat, de csak az egyik állítás igaz.") : "nem jó a kérdés";
        System.out.println("Kérdés teszt sikeres");
    }

}
