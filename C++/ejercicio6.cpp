#include <iostream>
#include <vector>
#include <string>
#include <iomanip>
#include <algorithm>
using namespace std;

int main() {

    // Dos vectores paralelos para nombre y precio
    vector<string> productos;
    vector<double> precios;
    int opcion = 0;

    while (opcion != 5) {
        cout << "\n===== INVENTARIO =====" << endl;
        cout << "1. Agregar producto" << endl;
        cout << "2. Mostrar inventario" << endl;
        cout << "3. Buscar producto" << endl;
        cout << "4. Eliminar producto" << endl;
        cout << "5. Salir" << endl;
        cout << "Opcion: ";
        cin >> opcion;
        cin.ignore();

        if (opcion == 1) {
            // Agregamos producto y precio a los dos vectores
            string prod;
            double precio;
            cout << "Nombre del producto: ";
            getline(cin, prod);
            cout << "Precio: ";
            cin >> precio;
            cin.ignore();
            productos.push_back(prod);
            precios.push_back(precio);
            cout << "Producto agregado." << endl;

        } else if (opcion == 2) {
            // Mostramos todo el inventario y calculamos el total
            if (productos.empty()) {
                cout << "El inventario esta vacio." << endl;
            } else {
                double total = 0;
                cout << "\n" << left << setw(18) << "Producto" << "Precio" << endl;
                cout << string(25, '-') << endl;
                for (int i = 0; i < productos.size(); i++) {
                    cout << left << setw(18) << productos[i]
                         << "$" << fixed << setprecision(2) << precios[i] << endl;
                    total = total + precios[i];
                }
                cout << "Total inventario: $" << total << endl;
            }

        } else if (opcion == 3) {
            // Buscamos un producto por nombre
            string buscar;
            cout << "Nombre a buscar: ";
            getline(cin, buscar);
            auto it = find(productos.begin(), productos.end(), buscar);
            if (it != productos.end()) {
                int idx = it - productos.begin();
                cout << productos[idx] << " -> $" << precios[idx] << endl;
            } else {
                cout << "Producto no encontrado." << endl;
            }

        } else if (opcion == 4) {
            // Eliminamos de ambos vectores usando el mismo indice
            string elim;
            cout << "Producto a eliminar: ";
            getline(cin, elim);
            auto it = find(productos.begin(), productos.end(), elim);
            if (it != productos.end()) {
                int idx = it - productos.begin();
                productos.erase(productos.begin() + idx);
                precios.erase(precios.begin() + idx);
                cout << "Producto eliminado." << endl;
            } else {
                cout << "Producto no encontrado." << endl;
            }
        }
    }
    cout << "Programa terminado." << endl;
    return 0;
}
