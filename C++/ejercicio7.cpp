#include <iostream>
#include <vector>
using namespace std;

int main() {

    // ---- ARREGLO NORMAL: tamano FIJO, no puede crecer ----
    int arreglo[5]; // Solo puede guardar exactamente 5 datos
    arreglo[0] = 10;
    arreglo[1] = 20;
    arreglo[2] = 30;
    arreglo[3] = 40;
    arreglo[4] = 50;

    cout << "=== ARREGLO (tamano fijo = 5) ===" << endl;
    for (int i = 0; i < 5; i++) {
        cout << "arreglo[" << i << "] = " << arreglo[i] << endl;
    }
    cout << "Tamano maximo: 5" << endl;

    // ---- VECTOR: tamano DINAMICO, puede crecer ----
    vector<int> lista;
    lista.push_back(10);
    lista.push_back(20);
    lista.push_back(30);
    lista.push_back(40);
    lista.push_back(50);
    lista.push_back(60); // Podemos agregar mas sin problema

    cout << "\n=== VECTOR (tamano dinamico = " << lista.size() << ") ===" << endl;
    for (int i = 0; i < lista.size(); i++) {
        cout << "lista[" << i << "] = " << lista[i] << endl;
    }

    // Conclusion de la comparacion
    cout << "\n--- CONCLUSION ---" << endl;
    cout << "Arreglo: tamano FIJO, no puede crecer despues de crearse." << endl;
    cout << "Vector:  tamano DINAMICO, crece automaticamente." << endl;

    return 0;
}
