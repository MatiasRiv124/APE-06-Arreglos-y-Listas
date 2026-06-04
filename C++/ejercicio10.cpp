#include <iostream>
#include <list>
#include <string>
using namespace std;

int main() {

    list<string> fila;
    int contador = 0; // Contador que asigna numeros de turno automaticamente
    int opcion = 0;

    while (opcion != 4) {
        cout << "\n===== FILA DE ATENCION =====" << endl;
        cout << "Personas en espera: " << fila.size() << endl;
        cout << "1. Solicitar turno" << endl;
        cout << "2. Atender siguiente" << endl;
        cout << "3. Ver fila completa" << endl;
        cout << "4. Salir" << endl;
        cout << "Opcion: ";
        cin >> opcion;
        cin.ignore();

        if (opcion == 1) {
            // Asignamos numero de turno automatico y guardamos con el nombre
            string nombre;
            cout << "Ingrese su nombre: ";
            getline(cin, nombre);
            contador++;
            string turno = "Turno #" + to_string(contador) + " - " + nombre;
            fila.push_back(turno); // Siempre va al final
            cout << "Su turno es el #" << contador << ". Por favor espere." << endl;

        } else if (opcion == 2) {
            // Atendemos al primero de la fila
            if (fila.empty()) {
                cout << "No hay personas en espera." << endl;
            } else {
                cout << "\nAtendiendo: " << fila.front() << endl;
                fila.pop_front(); // Quitamos al primero
                cout << "Quedan " << fila.size() << " persona(s) en espera." << endl;
            }

        } else if (opcion == 3) {
            // Mostramos toda la fila
            if (fila.empty()) {
                cout << "La fila esta vacia." << endl;
            } else {
                cout << "\nFila de atencion:" << endl;
                int pos = 1;
                for (auto& t : fila) {
                    cout << pos << ". " << t << endl;
                    pos++;
                }
            }
        }
    }
    cout << "\nSistema de atencion cerrado." << endl;
    return 0;
}
