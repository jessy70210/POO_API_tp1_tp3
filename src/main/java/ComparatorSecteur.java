import java.util.Comparator;

public class ComparatorSecteur implements Comparator<Secteur> {

    @Override
    public int compare(Secteur o1, Secteur o2) {
        return o1.getNombreAnimaux()-o2.getNombreAnimaux();
    }
}
