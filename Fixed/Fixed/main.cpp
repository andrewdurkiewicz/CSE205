#include <iostream>
#include "LinkedList.h"
#include <stdlib.h>
#include <string>
using namespace std;
struct T
{
	string name;
	string address;
	double rent;
};



int main()
{
	T data7 = { "Entry7", "842 N harvy lane", 123.5 };
	T data6 = { "Entry6", "842 N harvy lane", 123.5 };
	T data5 = { "Entry5", "842 N harvy lane", 123.5 };
	T data4 = { "Entry4", "842 N harvy lane", 123.5 };
	T data3 = { "Entry3", "842 N harvy lane", 432.24 };
	T data2 = { "Entry2", "842 N harvy lane", 123.4 };
	T data1 = { "Entry1", "842 N harvy lane", 8454.3 };
	T dataTest = { "TEST", "TEST", 000.03 };

	linkedlist<T> list = linkedlist<T>();
	list.addToFront(data7);
	list.addToFront(data6);
	list.addToFront(data5);
	list.addToFront(data4);
	list.addToFront(data3);
	list.addToFront(data2);
	list.addToFront(data1);
	list.addAtIndex(dataTest, 3);



	cout << list.removeFromEnd().name << endl;
	cout << list.removeFromEnd().name << endl;
	cout << list.removeFromEnd().name << endl;
	cout << list.removeFromEnd().name << endl;
	cout << list.removeFromEnd().name << endl;
	cout << list.removeFromEnd().name << endl;
	cout << list.removeFromEnd().name << endl;

	//cout << list.removeAtIndex(2).name << endl;
	//cout << list.removeFromFront().name << endl;
	//cout << list.removeFromFront().name << endl;
	//cout << list.removeFromFront().name << endl;




	//cout << thisdata.address;

	

	
	system("pause");
	return 0;
}

