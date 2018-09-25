//Isela Alejandra Ponce de Leon Carrasco 18550720
#include <iostream>
using namespace std;
int main() {
	
    cout << "Calcular la pendiente" << endl;
    cout << "Ingrese p1" << endl;
    double p1;
    
    cin >> p1;
    cout << "ingrese p2" << endl;
    double p2;
    
    cin >> p2;
    cout << "Ingrese q1" << endl;
    double q1;
    
    cin >> q1;
    cout << "Ingrese q2" << endl;
    double q2;
    
    cin >> q2;
    double m;
    
    m = (p2 - p1) / (q2 - q1);
    cout << "La pendiente es " << endl;
    cout << m << endl;
    return 0;
}
