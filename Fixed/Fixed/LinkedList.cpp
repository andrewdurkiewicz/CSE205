#include "LinkedList.h"

T::T()
{
	name;
	address;
	rent;
}

T::T(string addName, string addAddress, double addRent)
{
	this->name = addName;
	this->address = address;
	this->rent = addRent;
}



string T::getName()
{
	return this->name;
}

string T::getAddress()
{
	return this->address;
}

double T::getRent()
{
	return this->rent;
}

void T::setName(string newName)
{
	this->name = newName;
}

void T::setAddress(string newAddress)
{
	this->address = newAddress;
}

void T::setRent(string newRent)
{
	this->rent = rent;
}
