#pragma once
#include <stdlib.h>
#include <iostream>




template<class T>

class Node
{
private: 
	T data; //our node data
	Node<T> *next; //nodePtr

public:
	Node(); //declare instance
	Node(T inData);
	~Node();
	
	//setters
	void setNext(Node<T> *node);
	void setData(Node<T> *node);
	//getters
	Node<T> *getNext();
	T *getData();

};

template<class T>
inline Node<T>::Node()
{
	T data;
	next = NULL;
}

template<class T>
inline Node<T>::Node(T inData)
{
	data = inData;
	next = NULL;
}

template<class T>
inline Node<T>::~Node()
{
	delete next;
}

template<class T>
inline void Node<T>::setNext(Node<T>* node)
{
	this->next = node;
}

template<class T>
inline void Node<T>::setData(Node<T>* node)
{
	this->data = node->data;
}

template<class T>
inline Node<T>* Node<T>::getNext()
{
	return this->next;
}

template<class T>
inline T Node<T>::getData()
{
	return this->data;
}
