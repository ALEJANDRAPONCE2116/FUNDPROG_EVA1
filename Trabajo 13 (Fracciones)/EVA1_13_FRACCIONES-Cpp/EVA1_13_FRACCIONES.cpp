//Isela Alejandra Ponce de leon Carrasco
#include<iostream>
using namespace std;
int main (){
	//variables
	int numerador1, numerador2, denominador1, denominador2;
	int suma, resta multiplicacion, division;
	int suma1, resta1, multiplicacion1, division1;
	
	//Solicitar
	cout<<"Ingrese el primer numerador";
	cin>>numerador1;
	
	cout<<"Ingrese el primer denominador";
	cin>>denominador1;
	
	cout<<"Ingrese el segundo numerador";
	cin>>numerador2;
	
	cout<<"Ingrese el segundo denominador";
	cin>>denominador2;
	
	//Operaciones
	suma=(numerador1*denominador2 + denominador1*numerador2); 
	suma1=(denominador1*denominador2);
	
	resta=(numerador1*denominador2 - denominador1*numerador2);
	resta1=(denominador1*denominador2);
	
	multiplicacion=(numerador1 * numerador2); 
	multiplicacion1=(denominador1 * denominador2);
	
	division=(numerador1 * denominador2);
	division1=(denominador1*numerador2);
	
	//Imprimir
	cout<<"La suma de las fracciones es "<<suma<<"/"<<suma1<<"\n";
	cout<<"La resta de las fracciones es "<<resta<<"/"<<suma1<<"\n";
	cout<<"La multiplicacion de las fracciones es "<<multiplicacion<<"/"<<multiplicacion1<<"\n";
	cout<<"La division de las fracciones es "<<division<<"/"<<division1<<"\n";
}
