import java.util.LinkedList;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LinkedList<String> fila = new LinkedList<>();
        int contador = 0; // Contador que asigna numeros de turno automaticamente
        int opcion = 0;

        while (opcion != 4) {
            System.out.println("\n===== FILA DE ATENCION =====");
            System.out.println("Personas en espera: " + fila.size());
            System.out.println("1. Solicitar turno");
            System.out.println("2. Atender siguiente");
            System.out.println("3. Ver fila completa");
            System.out.println("4. Salir");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            if (opcion == 1) {
                // Asignamos numero de turno automatico y guardamos con el nombre
                System.out.print("Ingrese su nombre: ");
                String nombre = sc.nextLine();
                contador++;
                String turno = "Turno #" + contador + " - " + nombre;
                fila.addLast(turno); // Siempre va al final
                System.out.println("Su turno es el #" + contador + ". Por favor espere.");

            } else if (opcion == 2) {
                // Atendemos al primero de la fila
                if (fila.isEmpty()) {
                    System.out.println("No hay personas en espera.");
                } else {
                    String atendido = fila.removeFirst();
                    System.out.println("\nAtendiendo: " + atendido);
                    System.out.println("Quedan " + fila.size() + " persona(s) en espera.");
                }

            } else if (opcion == 3) {
                // Mostramos toda la fila
                if (fila.isEmpty()) {
                    System.out.println("La fila esta vacia.");
                } else {
                    System.out.println("\nFila de atencion:");
                    int pos = 1;
                    for (String t : fila) {
                        System.out.println(pos + ". " + t);
                        pos++;
                    }
                }
            }
        }
        System.out.println("\nSistema de atencion cerrado.");
    }
}
