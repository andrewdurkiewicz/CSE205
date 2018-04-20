#include <iostream>
#include "LinkedList.h"
#include <stdlib.h>
#include <string>
using namespace std;
struct T
{
	string name;
	int person;

};



int main()
{
	linkedlist<T> list = linkedlist<T>();

	for (int i = 0; i < 40; i++)
	{
		T data = { "player " + to_string(i), i };
		list.addToFront(data);

	}




	for (int i = 0; i < 40; i++)
	{
		cout << list.removeFromEnd().name << endl;


	}



	//cout << list.removeAtIndex(2).name << endl;
	//cout << list.removeFromFront().name << endl;
	//cout << list.removeFromFront().name << endl;
	//cout << list.removeFromFront().name << endl;




	//cout << thisdata.address;

	

	
	system("pause");
	return 0;
}

