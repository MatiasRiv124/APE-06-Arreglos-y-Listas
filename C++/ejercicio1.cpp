#include <iostream>
#include <vector>
#include <string>
using namespace std;

int main() {

    // Creamos el vector para guardar los nombres (equivalente a ArrayList)
    vector<string> nombres;

    // Agregamos 5 nombres de estudiantes
    nombres.push_back("Ana");
    nombres.push_back("Luis");
    nombres.push_back("Maria");
    nombres.push_back("Carlos");
    nombres.push_back("Sofia");

    // Mostramos todos los nombres con un ciclo for
    cout << "Lista de estudiantes:" << endl;
    for (int i = 0; i < nombres.size(); i++) {
        cout << (i + 1) << ". " << nombres[i] << endl;
    }

    return 0;
}
