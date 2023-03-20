import java.util.Comparator;

public class ComparadorEdad implements Comparator {
    @Override
    public int compare(Object ob1, Object ob2) {
        Futbolista f1 = (Futbolista) ob1;
        Futbolista f2 = (Futbolista) ob2;

        //el que tiene menor edad va primero
        if (f1.getEdad() < f2.getEdad()) {
            return -1;
        } else if (f1.getEdad() > f2.getEdad()) {
            return 1;
        } else {
            return 0;
        }
    }
}