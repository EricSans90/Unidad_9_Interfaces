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
    public boolean equals(Object otro){ // Compara this con otro
        Futbolista otroFut = (Futbolista) otro; // cast
        boolean iguales;
        if (this.dni.equals(otroFut.dni)) {
            iguales = true;
        } else {
            iguales = false;
        }
        return iguales;
    }

    @Override
    public int compareTo(Object otro){
        return dni.compareTo(((Futbolista)otro).dni);
    }

}
