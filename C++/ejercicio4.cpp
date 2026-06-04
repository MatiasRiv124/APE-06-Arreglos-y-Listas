#include <iostream>
#include <vector>
#include <string>
#include <algorithm>
using namespace std;

int main() {

    vector<string> lista;
    int opcion = 0;
    string nombre;

    // Repetimos el menu hasta que el usuario elija salir
    while (opcion != 5) {
        cout << "\n===== MENU CRUD =====" << endl;
        cout << "1. Agregar nombre" << endl;
        cout << "2. Mostrar todos" << endl;
        cout << "3. Eliminar nombre" << endl;
        cout << "4. Buscar nombre" << endl;
        cout << "5. Salir" << endl;
        cout << "Opcion: ";
        cin >> opcion;
        cin.ignore();

        if (opcion == 1) {
            // Agregar un nombre al vector
            cout << "Ingrese nombre: ";
            getline(cin, nombre);
            lista.push_back(nombre);
            cout << "Nombre agregado correctamente." << endl;

        } else if (opcion == 2) {
            // Mostrar todos los nombres guardados
            if (lista.empty()) {
                cout << "La lista esta vacia." << endl;
            } else {
                cout << "Nombres en la lista:" << endl;
                for (int i = 0; i < lista.size(); i++) {
                    cout << (i + 1) << ". " << lista[i] << endl;
                }
            }

        } else if (opcion == 3) {
            // Eliminar un nombre del vector
            cout << "Nombre a eliminar: ";
            getline(cin, nombre);
            auto it = find(lista.begin(), lista.end(), nombre);
            if (it != lista.end()) {
                lista.erase(it);
                cout << "Nombre eliminado." << endl;
            } else {
                cout << "Nombre no encontrado." << endl;
            }

        } else if (opcion == 4) {
            // Buscar si un nombre existe
            cout << "Nombre a buscar: ";
            getline(cin, nombre);
            auto it = find(lista.begin(), lista.end(), nombre);
            if (it != lista.end()) {
                cout << "'" << nombre << "' SI esta en la lista." << endl;
            } else {
                cout << "'" << nombre << "' NO esta en la lista." << endl;
            }

        } else if (opcion != 5) {
            cout << "Opcion invalida. Intente de nuevo." << endl;
        }
    }

    cout << "Programa terminado." << endl;
    return 0;
}
