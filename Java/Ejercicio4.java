import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        int opcion = 0;

        // Repetimos el menu hasta que el usuario elija salir
        while (opcion != 5) {
            System.out.println("\n===== MENU CRUD =====");
            System.out.println("1. Agregar nombre");
            System.out.println("2. Mostrar todos");
            System.out.println("3. Eliminar nombre");
            System.out.println("4. Buscar nombre");
            System.out.println("5. Salir");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            if (opcion == 1) {
                // Agregar un nombre a la lista
                System.out.print("Ingrese nombre: ");
                String nombre = sc.nextLine();
                lista.add(nombre);
                System.out.println("Nombre agregado correctamente.");

            } else if (opcion == 2) {
                // Mostrar todos los nombres guardados
                if (lista.isEmpty()) {
                    System.out.println("La lista esta vacia.");
                } else {
                    System.out.println("Nombres en la lista:");
                    for (int i = 0; i < lista.size(); i++) {
                        System.out.println((i + 1) + ". " + lista.get(i));
                    }
                }

            } else if (opcion == 3) {
                // Eliminar un nombre de la lista
                System.out.print("Nombre a eliminar: ");
                String nombre = sc.nextLine();
                if (lista.remove(nombre)) {
                    System.out.println("Nombre eliminado.");
                } else {
                    System.out.println("Nombre no encontrado.");
                }

            } else if (opcion == 4) {
                // Buscar si un nombre existe en la lista
                System.out.print("Nombre a buscar: ");
                String nombre = sc.nextLine();
                if (lista.contains(nombre)) {
                    System.out.println("'" + nombre + "' SI esta en la lista.");
                } else {
                    System.out.println("'" + nombre + "' NO esta en la lista.");
                }

            } else if (opcion != 5) {
                System.out.println("Opcion invalida. Intente de nuevo.");
            }
        }

        System.out.println("Programa terminado.");
    }
}
