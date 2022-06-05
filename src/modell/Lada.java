package modell;


/**
 *
 * @author Ricsi
 */
public class Lada {

    public Lada() {
    }

    public String getSzoveg(Kincsesladak tipus) {
        switch (tipus) {
            case ARANY:
                return "Nálam van a kincs";
            case EZUST:
                return "Nem nálam van a kincs";
            case BRONZ:
                return "Nem az arany ládában van a kincs";
            default:
                return null;
        }
    }
}
