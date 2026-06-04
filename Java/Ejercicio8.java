import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arreglo = new int[5]; // Maximo 5 datos, no puede cambiar
        ArrayList<Integer> lista = new ArrayList<>();

        // Llenamos ambas estructuras con los mismos datos
        System.out.println("Ingrese 5 notas:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            int nota = sc.nextInt();
            arreglo[i] = nota;  // Insercion en arreglo (posicion fija)
            lista.add(nota);     // Insercion en ArrayList (flexible)
        }

        // Mostramos el arreglo
        System.out.println("\n--- ARREGLO (max 5 elementos) ---");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("[" + i + "] = " + arreglo[i]);
        }
        System.out.println("El arreglo ya esta lleno, no puede recibir mas datos.");

        // Agregamos un elemento extra a la lista (el arreglo no puede)
        lista.add(99);
        System.out.println("\n--- ARRAYLIST (ahora tiene " + lista.size() + " elementos) ---");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("[" + i + "] = " + lista.get(i));
        }
        System.out.println("El ArrayList agrego el elemento extra sin problema.");
    }
}
