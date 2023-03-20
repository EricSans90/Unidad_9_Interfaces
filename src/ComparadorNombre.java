import java.util.Comparator;

public class ComparadorNombre implements Comparator{
    @Override
    public int compare(Object ob1, Object ob2) {
        Futbolista f1 = (Futbolista) ob1;
        Futbolista f2 = (Futbolista) ob2;
        return f1.getNombre().compareTo(f2.getNombre());
    }
}
