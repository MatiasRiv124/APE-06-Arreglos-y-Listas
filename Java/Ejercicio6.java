import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Dos listas paralelas para nombre y precio de cada producto
        ArrayList<String> productos = new ArrayList<>();
        ArrayList<Double> precios = new ArrayList<>();
        int opcion = 0;

        while (opcion != 5) {
            System.out.println("\n===== INVENTARIO =====");
            System.out.println("1. Agregar producto");
            System.out.println("2. Mostrar inventario");
            System.out.println("3. Buscar producto");
            System.out.println("4. Eliminar producto");
            System.out.println("5. Salir");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            if (opcion == 1) {
                // Agregamos producto y su precio a las dos listas
                System.out.print("Nombre del producto: ");
                String prod = sc.nextLine();
                System.out.print("Precio: ");
                double precio = sc.nextDouble();
                sc.nextLine();
                productos.add(prod);
                precios.add(precio);
                System.out.println("Producto agregado.");

            } else if (opcion == 2) {
                // Mostramos todo el inventario y calculamos el total
                if (productos.isEmpty()) {
                    System.out.println("El inventario esta vacio.");
                } else {
                    double total = 0;
                    System.out.println("\nProducto          Precio");
                    System.out.println("-------------------------");
                    for (int i = 0; i < productos.size(); i++) {
                        System.out.printf("%-17s $%.2f%n", productos.get(i), precios.get(i));
                        total = total + precios.get(i);
                    }
                    System.out.printf("Total inventario: $%.2f%n", total);
                }

            } else if (opcion == 3) {
                // Buscamos un producto por nombre
                System.out.print("Nombre a buscar: ");
                String buscar = sc.nextLine();
                int idx = productos.indexOf(buscar);
                if (idx != -1) {
                    System.out.printf("%s -> $%.2f%n", productos.get(idx), precios.get(idx));
                } else {
                    System.out.println("Producto no encontrado.");
                }

            } else if (opcion == 4) {
                // Eliminamos un producto de ambas listas por indice
                System.out.print("Producto a eliminar: ");
                String elim = sc.nextLine();
                int idx = productos.indexOf(elim);
                if (idx != -1) {
                    productos.remove(idx);
                    precios.remove(idx);
                    System.out.println("Producto eliminado.");
                } else {
                    System.out.println("Producto no encontrado.");
                }
            }
        }
        System.out.println("Programa terminado.");
    }
}
