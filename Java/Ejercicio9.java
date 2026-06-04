import java.util.LinkedList;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // LinkedList permite agregar al final y quitar del inicio eficientemente
        LinkedList<String> turnos = new LinkedList<>();
        int opcion = 0;

        while (opcion != 4) {
            System.out.println("\n===== SISTEMA DE TURNOS =====");
            System.out.println("1. Agregar turno");
            System.out.println("2. Atender turno (el primero)");
            System.out.println("3. Ver lista de turnos");
            System.out.println("4. Salir");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            if (opcion == 1) {
                // Nuevo turno siempre va al FINAL de la fila
                System.out.print("Nombre del paciente: ");
                String nombre = sc.nextLine();
                turnos.addLast(nombre);
                System.out.println(nombre + " agregado a la fila.");

            } else if (opcion == 2) {
                // Se atiende siempre al PRIMERO de la fila
                if (turnos.isEmpty()) {
                    System.out.println("No hay turnos pendientes.");
                } else {
                    String atendido = turnos.removeFirst();
                    System.out.println("Atendiendo a: " + atendido);
                    System.out.println("Quedan " + turnos.size() + " persona(s) en espera.");
                }

            } else if (opcion == 3) {
                // Mostramos todos los turnos en orden
                if (turnos.isEmpty()) {
                    System.out.println("No hay turnos registrados.");
                } else {
                    System.out.println("Turnos en espera:");
                    int pos = 1;
                    for (String t : turnos) {
                        System.out.println(pos + ". " + t);
                        pos++;
                    }
                }
            }
        }
        System.out.println("Sistema cerrado.");
    }
}
