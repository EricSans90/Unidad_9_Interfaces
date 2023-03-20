import java.util.Arrays;

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
        return "Futbolista: " + "Dni= " + dni + ", nombre= " + nombre + ", edad= " + edad + ", goles= " + goles +'.'+"\n";
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

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getGoles() {
        return goles;
    }

    public static void main(String[] args) {
        Futbolista[] futbolistas = new Futbolista[]{
                //estadísticas de hace unos años
                new Futbolista("12345678A", "Lionel Messi", 34, 785),
                new Futbolista("23456789B", "Cristiano Ronaldo", 37, 700),
                new Futbolista("34567890C", "Neymar Jr", 29, 170),
                new Futbolista("45678901D", "Mohamed Salah", 29, 148),
                new Futbolista("56789012E", "Kylian Mbappe", 23, 114),
        };

        //ordena por dni con el comparable
        Arrays.sort(futbolistas);
        System.out.println("Futbolistas ordenados por dni:");
        System.out.println(Arrays.deepToString(futbolistas));
        System.out.println();

        //ordena por nombre con el comparator
        Arrays.sort(futbolistas, new ComparadorNombre());
        System.out.println("Futbolistas ordenados por nombre:");
        System.out.println(Arrays.deepToString(futbolistas));
        System.out.println();

        //ordena por edad con el comparator
        Arrays.sort(futbolistas, new ComparadorEdad());
        System.out.println("Futbolistas ordenados por edad:");
        System.out.println(Arrays.deepToString(futbolistas));
        System.out.println();

        //ordena por edad con el comparator
        Arrays.sort(futbolistas, new ComparadorEdadNombre());
        System.out.println("Futbolistas ordenados por edad y en caso de empate por nombre:");
        System.out.println(Arrays.deepToString(futbolistas));
        System.out.println();

        // el ComparadorEdad ya parece ordenarlos por edad > nombre, voy a probar por edad y luego goles:
        //ordena por edad con el comparator
        Arrays.sort(futbolistas, new ComparadorEdadGoles());
        System.out.println("Futbolistas ordenados por edad y en caso de empate por goles:");
        System.out.println(Arrays.deepToString(futbolistas));
        System.out.println();
    }
}

