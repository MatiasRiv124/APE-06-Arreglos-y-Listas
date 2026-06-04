#include <iostream>
#include <vector>
#include <string>
using namespace std;

int main() {

    vector<string> productos;
    int n;

    // Pedimos cuantos productos va a registrar
    cout << "Cuantos productos desea registrar? ";
    cin >> n;
    cin.ignore(); // limpiamos el buffer

    // Llenamos el vector con los productos
    for (int i = 0; i < n; i++) {
        string prod;
        cout << "Ingrese producto " << (i + 1) << ": ";
        getline(cin, prod);
        productos.push_back(prod);
    }

    // Pedimos el producto a buscar
    string buscar;
    cout << "\nIngrese el producto a buscar: ";
    getline(cin, buscar);

    // Recorremos el vector buscando el producto
    bool encontrado = false;
    for (int i = 0; i < productos.size(); i++) {
        if (productos[i] == buscar) {
            encontrado = true;
            break;
        }
    }

    // Mostramos el resultado
    if (encontrado) {
        cout << "Producto '" << buscar << "' ENCONTRADO en la lista." << endl;
    } else {
        cout << "Producto '" << buscar << "' NO encontrado." << endl;
    }

    return 0;
}
