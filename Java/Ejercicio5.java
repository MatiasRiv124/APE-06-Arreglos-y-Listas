import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Dos listas paralelas: nombres y notas se corresponden por indice
        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<Double> notas = new ArrayList<>();

        System.out.print("Cuantos estudiantes va a registrar? ");
        int n = sc.nextInt();
        sc.nextLine();

        // Registramos nombre y nota de cada estudiante
        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Estudiante " + (i + 1) + " ---");
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Nota: ");
            double nota = sc.nextDouble();
            sc.nextLine();
            nombres.add(nombre);
            notas.add(nota);
        }

        // Mostramos la tabla de resultados
        System.out.println("\n========== RESULTADOS ==========");
        System.out.println("Nombre          Nota    Estado");
        System.out.println("---------------------------------");
        for (int i = 0; i < nombres.size(); i++) {
            String estado;
            if (notas.get(i) >= 7) {
                estado = "Aprobado";
            } else {
                estado = "Reprobado";
            }
            System.out.printf("%-15s %.1f    %s%n", nombres.get(i), notas.get(i), estado);
        }
    }
}
