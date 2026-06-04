#include <iostream>
#include <vector>
using namespace std;

int main() {

    // Creamos el vector para guardar las notas
    vector<double> notas;

    // Agregamos 6 notas
    notas.push_back(8.5);
    notas.push_back(9.0);
    notas.push_back(7.5);
    notas.push_back(6.0);
    notas.push_back(9.5);
    notas.push_back(8.0);

    // Calculamos la suma de todas las notas
    double suma = 0;
    for (int i = 0; i < notas.size(); i++) {
        suma = suma + notas[i];
    }

    // Calculamos el promedio
    double promedio = suma / notas.size();

    // Mostramos cada nota
    cout << "Notas registradas:" << endl;
    for (int i = 0; i < notas.size(); i++) {
        cout << "Nota " << (i + 1) << ": " << notas[i] << endl;
    }

    // Mostramos el promedio
    cout << "Promedio del grupo: " << promedio << endl;

    return 0;
}
