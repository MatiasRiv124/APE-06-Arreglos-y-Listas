#include <iostream>
#include <vector>
using namespace std;

int main() {

    int arreglo[5]; // Maximo 5 datos, no puede cambiar
    vector<int> lista;

    // Llenamos ambas estructuras con los mismos datos
    cout << "Ingrese 5 notas:" << endl;
    for (int i = 0; i < 5; i++) {
        int nota;
        cout << "Nota " << (i + 1) << ": ";
        cin >> nota;
        arreglo[i] = nota;       // Insercion en arreglo (posicion fija)
        lista.push_back(nota);   // Insercion en vector (flexible)
    }

    // Mostramos el arreglo
    cout << "\n--- ARREGLO (max 5 elementos) ---" << endl;
    for (int i = 0; i < 5; i++) {
        cout << "[" << i << "] = " << arreglo[i] << endl;
    }
    cout << "El arreglo ya esta lleno, no puede recibir mas datos." << endl;

    // Agregamos un elemento extra al vector (el arreglo no puede)
    lista.push_back(99);
    cout << "\n--- VECTOR (ahora tiene " << lista.size() << " elementos) ---" << endl;
    for (int i = 0; i < lista.size(); i++) {
        cout << "[" << i << "] = " << lista[i] << endl;
    }
    cout << "El vector agrego el elemento extra sin problema." << endl;

    return 0;
}
