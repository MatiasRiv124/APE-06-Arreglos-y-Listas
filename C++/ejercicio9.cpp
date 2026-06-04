#include <iostream>
#include <list>
#include <string>
using namespace std;

int main() {

    // list es el equivalente de LinkedList en C++
    list<string> turnos;
    int opcion = 0;

    while (opcion != 4) {
        cout << "\n===== SISTEMA DE TURNOS =====" << endl;
        cout << "1. Agregar turno" << endl;
        cout << "2. Atender turno (el primero)" << endl;
        cout << "3. Ver lista de turnos" << endl;
        cout << "4. Salir" << endl;
        cout << "Opcion: ";
        cin >> opcion;
        cin.ignore();

        if (opcion == 1) {
            // Nuevo turno siempre va al FINAL de la fila
            string nombre;
            cout << "Nombre del paciente: ";
            getline(cin, nombre);
            turnos.push_back(nombre);
            cout << nombre << " agregado a la fila." << endl;

        } else if (opcion == 2) {
            // Se atiende siempre al PRIMERO de la fila
            if (turnos.empty()) {
                cout << "No hay turnos pendientes." << endl;
            } else {
                cout << "Atendiendo a: " << turnos.front() << endl;
                turnos.pop_front(); // Elimina el primer elemento
                cout << "Quedan " << turnos.size() << " persona(s) en espera." << endl;
            }

        } else if (opcion == 3) {
            // Mostramos todos los turnos en orden
            if (turnos.empty()) {
                cout << "No hay turnos registrados." << endl;
            } else {
                cout << "Turnos en espera:" << endl;
                int pos = 1;
                for (auto& t : turnos) {
                    cout << pos << ". " << t << endl;
                    pos++;
                }
            }
        }
    }
    cout << "Sistema cerrado." << endl;
    return 0;
}
