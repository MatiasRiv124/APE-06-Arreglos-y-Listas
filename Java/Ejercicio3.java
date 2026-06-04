import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> productos = new ArrayList<>();

        // Pedimos cuantos productos va a registrar
        System.out.print("Cuantos productos desea registrar? ");
        int n = sc.nextInt();
        sc.nextLine(); // limpiamos el buffer

        // Llenamos la lista con los productos
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese producto " + (i + 1) + ": ");
            String prod = sc.nextLine();
            productos.add(prod);
        }

        // Pedimos el producto a buscar
        System.out.print("\nIngrese el producto a buscar: ");
        String buscar = sc.nextLine();

        // Recorremos la lista buscando el producto
        boolean encontrado = false;
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).equalsIgnoreCase(buscar)) {
                encontrado = true;
                break;
            }
        }

        // Mostramos el resultado de la busqueda
        if (encontrado) {
            System.out.println("Producto '" + buscar + "' ENCONTRADO en la lista.");
        } else {
            System.out.println("Producto '" + buscar + "' NO encontrado.");
        }
    }
}
