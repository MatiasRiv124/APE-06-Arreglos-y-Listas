import java.util.ArrayList;

public class Ejercicio2 {
    public static void main(String[] args) {

        // Creamos el ArrayList para guardar las notas
        ArrayList<Double> notas = new ArrayList<>();

        // Agregamos 6 notas
        notas.add(8.5);
        notas.add(9.0);
        notas.add(7.5);
        notas.add(6.0);
        notas.add(9.5);
        notas.add(8.0);

        // Calculamos la suma de todas las notas
        double suma = 0;
        for (int i = 0; i < notas.size(); i++) {
            suma = suma + notas.get(i);
        }

        // Calculamos el promedio
        double promedio = suma / notas.size();

        // Mostramos cada nota
        System.out.println("Notas registradas:");
        for (int i = 0; i < notas.size(); i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas.get(i));
        }

        // Mostramos el promedio
        System.out.println("Promedio del grupo: " + promedio);
    }
}
