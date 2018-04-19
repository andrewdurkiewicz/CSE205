#include <iostream>
#include "LinkedList.h"
#include <stdlib.h>
#include <string>
using namespace std;



int main()
{
	T data7 = T("Entry7", "842 N harvy lane", 123.5);
	T data6 = T("Entry6", "842 N harvy lane", 123.5);
	T data5 = T("Entry5", "842 N harvy lane", 123.5);
	T data4 = T("Entry4", "842 N harvy lane", 123.5);
	T data3 = T("Entry3", "842 N harvy lane", 432.24);
	T data2 = T("Entry2", "842 N harvy lane", 123.4);
	T data1 = T("Entry1", "842 N harvy lane", 8454.3);
	T dataTest = T("TEST", "TEST", 000.03);

	linkedlist<T> list = linkedlist<T>();
	list.addToFront(data7);
	list.addToFront(data6);
	list.addToFront(data5);
	list.addToFront(data4);
	list.addToFront(data3);
	list.addToFront(data2);
	list.addToFront(data1);
	list.addAtIndex(dataTest, 3);



	cout << list.removeFromEnd().getName() << endl;
	cout << list.removeFromEnd().getName() << endl;
	cout << list.removeFromEnd().getName() << endl;
	cout << list.removeFromEnd().getName() << endl;
	cout << list.removeFromEnd().getName() << endl;
	cout << list.removeFromEnd().getName() << endl;
	cout << list.removeFromEnd().getName() << endl;

	//cout << list.removeAtIndex(2).name << endl;
	//cout << list.removeFromFront().name << endl;
	//cout << list.removeFromFront().name << endl;
	//cout << list.removeFromFront().name << endl;




	//cout << thisdata.address;

	

	
	system("pause");
	return 0;
}

