import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String[] args) {

        // Creamos el ArrayList para guardar los nombres
        ArrayList<String> nombres = new ArrayList<>();

        // Agregamos 5 nombres de estudiantes
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Maria");
        nombres.add("Carlos");
        nombres.add("Sofia");

        // Mostramos todos los nombres con un ciclo for
        System.out.println("Lista de estudiantes:");
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println((i + 1) + ". " + nombres.get(i));
        }
    }
}