package modell;

/**
 *
 * @author Ricsi
 */
public class Kerdes {
    
    private String kerdes;

    public Kerdes() {
        this.kerdes = "Három láda közül egyik rejti a kincset. Mindegyiken van egy felirat, de csak az egyik állítás igaz.";
    }

    public Kerdes(String kerdes) {
        this.kerdes = kerdes;
    }

    public String getKerdes() {
        return kerdes;
    }
}
