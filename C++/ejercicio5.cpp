#include <iostream>
#include <vector>
#include <string>
#include <iomanip>
using namespace std;

int main() {

    // Dos vectores paralelos: nombres y notas se corresponden por indice
    vector<string> nombres;
    vector<double> notas;
    int n;

    cout << "Cuantos estudiantes va a registrar? ";
    cin >> n;
    cin.ignore();

    // Registramos nombre y nota de cada estudiante
    for (int i = 0; i < n; i++) {
        cout << "\n--- Estudiante " << (i + 1) << " ---" << endl;
        string nombre;
        double nota;
        cout << "Nombre: ";
        getline(cin, nombre);
        cout << "Nota: ";
        cin >> nota;
        cin.ignore();
        nombres.push_back(nombre);
        notas.push_back(nota);
    }

    // Mostramos la tabla de resultados
    cout << "\n========== RESULTADOS ==========" << endl;
    cout << left << setw(15) << "Nombre" << setw(8) << "Nota" << "Estado" << endl;
    cout << string(33, '-') << endl;
    for (int i = 0; i < nombres.size(); i++) {
        string estado;
        if (notas[i] >= 7) {
            estado = "Aprobado";
        } else {
            estado = "Reprobado";
        }
        cout << left << setw(15) << nombres[i]
            << setw(8) << fixed << setprecision(1) << notas[i]
            << estado << endl;
    }

    return 0;
}
