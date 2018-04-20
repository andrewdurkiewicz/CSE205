#pragma once
#include <stdlib.h>
#include <string>
#include <iostream>

using namespace std;


#ifndef LINKEDLIST_H
#define LINKEDLIST_H
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
	T getData();

};

template<class T>
inline Node<T>::Node()
{
	data = NULL;
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
	next = NULL;
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

template <class T>
class linkedlist
{
private:
	Node<T> *head; //start of linkedlist
	Node<T> *tail; //end of linkedlist
	Node<T> *curr; //current pointer
	
public:
	linkedlist();
	~linkedlist();
	void addToFront(T data);
	void addToEnd(T data);
	bool addAtIndex(T data, int index);
	void nextNode();
	void insertAfterCurrent(T data);
	T removeCurrent();
	T removeAtIndex(int index);
	T removeFromFront();
	T removeFromEnd();
	void removeFirst(T data);
	void removeAll(T data);
	bool ElementExists(T data);
	Node<T>* Find(T data);
	int IndexOf(T data);
	T retrieveFront();
	T retrieve(int index);
	//toarray
	void empty();
	int length();
	bool doesListExist();


};


template<class T>
inline linkedlist<T>::linkedlist()
{
	head = NULL;
	tail = NULL;
	curr = NULL;
}

template<class T>
inline linkedlist<T>::~linkedlist()
{
	this->empty();
	delete this;
}

template<class T>
inline void linkedlist<T>::addToFront(T data)
{
	Node<T> *n = new Node<T>(data);
	if (head == NULL)//is our linkedlist empty?
	{
		head = n; //only one node, so head, tail, and our current are all n
		tail = n;
		curr = n;
		
		
	}
	else
	{
		n->setNext(head);
		head = n;
		curr = head;
	}

}

template<class T>
inline void linkedlist<T>::addToEnd(T data) //works confirmed
{

	if (head = NULL)
	{
		addToFront(data); // we add to the front of an empty list
	}
	else
	{
		Node<T> *n = new Node<T>(data);
		tail->setNext(n);
		tail = n;


	}
}

template<class T>
inline bool linkedlist<T>::addAtIndex(T data, int index) //works-confirmed
{
	curr = head;
	Node<T>* n = new Node<T>(data);

	if (index > length())
	{
		return false;
	}
	for (int i = 0; i <= index; i++)
	{
		nextNode();
	}
	/*Node<T> *temp = curr->getNext();
	curr->setNext(n);
	n->setNext(temp);*/
	insertAfterCurrent(data);
	return true;

}

template<class T>
inline void linkedlist<T>::nextNode()
{
	if (curr == NULL)
	{
		curr = head;
	}
	else
	{
		curr = curr->getNext();
	}
}

template<class T>
inline void linkedlist<T>::insertAfterCurrent(T data)
{
	if (curr->getNext() == NULL) //at the end, just add to end
	{
		addToEnd(data);
	}
	else
	{
		Node<T> *n = new Node<T>(data);//make a temp node to add;
		Node<T>* temp = curr->getNext();
		curr->setNext(n);
		n->setNext(temp);
	}
}
template<class T>
inline T linkedlist<T>::removeCurrent()
{

	T nodeData = curr->getData();
	
	if (curr == head)
	{
		return removeFromFront();
	}
	else if (curr == tail)
	{

		return removeFromEnd();
	}

	else
	{
		Node<T>* remove = curr;
		curr = head;
		Node<T>* previous = head;
		while (previous->getNext() != remove)
		{
			previous->setNext(previous->getNext());
		}
		//isolate the node
		previous->setNext(remove->getNext());
		remove->~Node();

		return nodeData;
	}
	T testing = curr->getData();
	return testing;

	}


template<class T>
inline T linkedlist<T>::removeAtIndex(int index)
{
	//Node<T>* tmp = head;
	curr = head;
	for (int i = 0; i <= index; i++)
	{
		curr = curr->getNext();
	}
	T thisdata =  removeCurrent();
	return thisdata;
}

template<class T>
inline T linkedlist<T>::removeFromFront()
{

	T nodeData = head->getData();
	Node<T>* remove = head;
	head = head->getNext(); //move head over one to isolate the deleted node
	remove->~Node();
	return nodeData;

}

template<class T>
inline T linkedlist<T>::removeFromEnd()
{
	Node<T> *remove = tail;
	curr = head;
	while (curr->getNext() != tail)
	{
		nextNode();
	}
	T thisdata = remove->getData();
	tail = curr;
	remove->~Node();
	return thisdata;
}

template<class T>
inline void linkedlist<T>::removeFirst(T data)
{
	Node<T>* remove = head;
	head = head->getNext(); //move head over one to isolate the deleted node
	remove->~Node();
}
template<class T>
inline void linkedlist<T>::removeAll(T data)
{
	curr = head;
	while(curr->getNext() != NULL)
		if (ElementExists(data))
		{
			removeCurrent();
			nextNode();
		}
}

template<class T>
inline bool linkedlist<T>::ElementExists(T data)
{
	if (data.getName() == curr->getData().getName() &&
			data.getAddress() == curr->getData().getAddress() &&
				data.getRent() == curr->getData().getRent())
			{
				return true;
			}
	else
	{
		return false;
	}
}

template<class T>
inline Node<T>* linkedlist<T>::Find(T data)
{
	curr = head;
	while (curr->getNext() != NULL)
	{
		if (ElementExists(curr))
		{
			return curr;
		}
		nextNode();
	}
}

template<class T>
inline int linkedlist<T>::IndexOf(T data)
{
	curr = head;
	int i = 0;
	while (curr->getNext() != NULL)
	{
		if (ElementExists(curr))
		{
			return i;
		}
		else
		{
			i++;
		}
		nextNode();
	}
	return -1;
}

template<class T>
inline T linkedlist<T>::retrieveFront()
{
	return head->getData();
}

template<class T>
inline T linkedlist<T>::retrieve(int index)
{
	curr = head;
	if (length() < index)
	{
		cout << "not enough elements";
	}
	else
	{
		for (int i = 0; i++; i < index)
		{
			nextNode();
		}
		return curr;
	}
}

template<class T>
inline void linkedlist<T>::empty()
{
	Node<T>* temp = head;
	while (temp != NULL)
	{
		temp->getNext();
		head->~Node();
		head = temp;
	}
}
template<class T>
inline int linkedlist<T>::length()
{
	curr = head;
	int i = 0;
	while (curr->getNext() != NULL)
	{
		nextNode();
		i++;
	}
	return i;
}
template<class T>
inline bool linkedlist<T>::doesListExist()
{
	if (head == tail == curr == NULL) {
		return false;
	}
	else
	{
		return true;
	}
}
#endif
