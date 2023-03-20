public class Futbolista implements Comparable{
    private String dni;
    private String nombre;
    private int edad;
    private int goles;

    public Futbolista (String dni, String nombre, int edad, int goles){
        this.dni=dni;
        this.nombre=nombre;
        this.edad=edad;
        this.goles=goles;
    }

    @Override
    public String toString() {
        return "Futbolista: " + "Dni= " + dni + ", nombre= " + nombre + ", edad= " + edad + ", goles= " + goles +'.';
    }

    @Override
    public int compareTo(Object o) {
        int resultado;

        return 0;
    }
}
