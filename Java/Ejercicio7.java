import java.util.ArrayList;

public class Ejercicio7 {
    public static void main(String[] args) {

        // ---- ARREGLO NORMAL: tamano FIJO, no puede crecer ----
        int[] arreglo = new int[5]; // Solo puede guardar exactamente 5 datos
        arreglo[0] = 10;
        arreglo[1] = 20;
        arreglo[2] = 30;
        arreglo[3] = 40;
        arreglo[4] = 50;

        System.out.println("=== ARREGLO (tamano fijo = 5) ===");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("arreglo[" + i + "] = " + arreglo[i]);
        }
        System.out.println("Tamano maximo: " + arreglo.length);

        // ---- ARRAYLIST: tamano DINAMICO, puede crecer ----
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(40);
        lista.add(50);
        lista.add(60); // Podemos agregar mas sin problema

        System.out.println("\n=== ARRAYLIST (tamano dinamico = " + lista.size() + ") ===");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("lista.get(" + i + ") = " + lista.get(i));
        }

        // Conclusion de la comparacion
        System.out.println("\n--- CONCLUSION ---");
        System.out.println("Arreglo: tamano FIJO, no puede crecer despues de crearse.");
        System.out.println("ArrayList: tamano DINAMICO, crece automaticamente.");
    }
}
