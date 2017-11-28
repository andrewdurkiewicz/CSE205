// Assignment #: Arizona State University CSE205 #10

//         Name: Andrew Durkiewicz
//    StudentID: 
//      Lecture: Your lecture
//  Description: The LinkedList defines a linked list using its node class
//  object and also defines a iterator class to traverse the linked list.
//***********************************************************************

import java.util.NoSuchElementException;


public class LinkedList
{
   //only instance variable that points to the first node
   private Node first;

   //nested class to represent a node
   private class Node
   {
      public Object data;
      public Node next;
   }

   // Constructs an empty linked list.
   public LinkedList()
   {
      first = null;
   }

   //Returns the first element in the linked list.
   public Object getFirst()
   {
      if (first == null)
         throw new NoSuchElementException();
      return first.data;
   }

   //Removes the first element in the linked list.
   public Object removeFirst()
   {
      if (first == null)
         throw new NoSuchElementException();
      Object element = first.data;
      first = first.next;
      return element;
   }

   //Adds an element to the front of the linked list.
   public void addFirst(Object element)
   {
      Node newNode = new Node();
      newNode.data = element;
      newNode.next = first;
      first = newNode;
   }


   //toString() method prints the elements out from front to tail
   public String toString()
   {

      ListIterator iterator = listIterator();
      String result  = "{ ";
      while (iterator.hasNext())
      {
         result += iterator.next() + " ";
      }
      result += "}\n";

      return result;
   }

  //*************** Below is where you should add the new methods ***********

  //*****************************************************************
  //size() method returns the number of nodes inside this LinkedList
  //*****************************************************************
   public int size()
   {
	   LinkedListIterator iterator = new LinkedListIterator();
	   iterator.position = first;
	   
	   if(iterator.position == null) {
		   return 0;
	   }
	   
	   
	   int s = 0;
	   while(iterator.hasNext())
	   {
		   iterator.next();
		   s++;
	   }
	   
	   if(iterator.hasNext()==false && iterator.position != null)
	   {
		   s++;
	   }

	   return s;
	   

   }

    //***********************************************************************************
    //searchElement() method returns the index of the first occurrence of the
    //parameter object in the linked list if it exists. It returns -1 if it does not exit.
    //***********************************************************************************
   public int searchElement(Object element)
   {
	   LinkedListIterator iterator = new LinkedListIterator();
	   iterator.position = first;

	   for (int s = 1; iterator.hasNext(); s++) {
		   if (iterator.position.data.equals(element)) {
			   return s;
		   }
		   else 
		   {
			   iterator.next();
		   }
	   }
	   return -1;
	   
	   
	   
	   

   }

  //*****************************************************************
  // getElement() method returns the element at the parameter index
  // If the index is out of bounds, throw an IndexOutOfBoundException.
  //*****************************************************************
   public Object getElement(int index) {
	   LinkedListIterator iterator = new LinkedListIterator();
	   iterator.position = first;
	   int maxsize = size();//array logic
	   
	   if(maxsize < index)
	   {
		   throw new IndexOutOfBoundsException();
	   }
	   
	   for (int i = 1; i<index; i++)
	   {
		   iterator.next();
	   }
	   
	   return iterator.position.data;//return the object after we exit loop


   }

   //****************************************************************************
   //setElement() method sets the parameter object at the parameter index in the
   //linked list. If the index is out of bounds, throws an IndexOutOfBoundException
   //****************************************************************************
   public void setElement(int index, Object element)
   {
	   LinkedListIterator iterator = new LinkedListIterator();
	   iterator.position = first;
	   int maxsize = size();//array logic
	   
	   if(maxsize < index)
	   {
		   throw new IndexOutOfBoundsException();
	   }
	   
	   for (int i = 1; i < index; i++) {
		   iterator.next();//go to next element
	   }
	   iterator.set(element);

	   

	   
	   
	   
	   


   }
   //***********************************************************************************
   //insertElement() method inserts the parameter object at the parameter index.
   //If the index is out of bounds, throws an IndexOutOfBoundException
   //Note: the element can be inserted at the end, i.e. inserted at size() index/position
   //************************************************************************************
   public void insertElement(int index, Object element)
   {
	   LinkedListIterator iterator = new LinkedListIterator();
	   
	   int maxsize = size(); 
	   
	   if(maxsize < index)
	   {
		   throw new IndexOutOfBoundsException();
	   }
	   
	   iterator.position.data = getElement(index);
	   iterator.add(element);
	   
   }
  //*******************************************************************
  //removeElement()method removes and returns element at parameter index
  //and throw an IndexOutOfBoundException if the index is out of bounds
  //*******************************************************************
   public Object removeElement(int index)
   {
	   LinkedListIterator iterator = new LinkedListIterator();
	   iterator.position = first;
	   
	   int maxsize = size()+1; 
	   System.out.println(index);
	   
	   if(maxsize <= index)
	   {
		   throw new IndexOutOfBoundsException();
	   }
	   
	   iterator.position.data = getElement(index);
	   Object ret = getElement(index);
	   iterator.remove();
	   return ret;

   }

   //*****************************************************************
   //countHowMany(Object) method returns the number of occurences of
   //the parameter object in the LinkedList
   //*****************************************************************
   public int countHowMany(Object searchedObject)
   {
	   LinkedListIterator iterator = new LinkedListIterator();
	   iterator.position = first;
	   int count = 0;
	   
	   if(size() == 0)
	   {
		   throw new NoSuchElementException("List is empty");
	   }
	   
	   while(iterator.hasNext()) {
		   if (iterator.position.data.equals(searchedObject)) {
			   count++;
		   }
		   iterator.next();
		   
		   
	   }
	   if (iterator.position.data.equals(searchedObject)) {
		   count++; //takes care of possible last element
	   }
	   return count;


   }

   //*****************************************************************
   //removeDuplicate() method removes all occurences of the parameter
   //objects from the LinkedList
   //*****************************************************************
   public void removeDuplicate(Object removedObject)
   {	
	   
	  
	   LinkedListIterator iterator = new LinkedListIterator();
	   iterator.position = first;
	   while(iterator.hasNext())
	   {	
		   iterator.next();
		   if(iterator.position.data.equals(removedObject)) {
			  
			   iterator.remove();
		   }
	   }
	   if(getFirst() == removedObject && iterator.hasNext() == false) {
		   removeFirst();
		   
	   }
	   
	   
   }

   //*******************************************************************************
   //appendAtEnd(Object, int) method appends the parameter object number of
   //times at the end of the linked list. For example, a call of appendAtEnd("A", 3)
   //will append string "A" three times at the end of the linked list.
   //*******************************************************************************
   public void appendAtEnd(Object element, int howManyTimes)
   {
	   LinkedListIterator iterator = new LinkedListIterator();
	   iterator.position = first;
	   while(iterator.hasNext())
	   {
		   //this gets us to the end
		   iterator.next();
	   }
	   for(int i = 0; i<howManyTimes; i++) {
		   iterator.add(element);
	   }
	   
   }

   //********************************************************************************
   //appendAfter(Object element1, Object element2) method appends the second parameter
   //object, i.e. element2 right after the first occurence of first parameter object,
   //i.e. element1. If element1 is not inside the linked list, then append element2
   //at the front/head of the linked list.
   //********************************************************************************
   public void appendAfter(Object element1, Object element2)
   {
	   LinkedListIterator iterator = new LinkedListIterator();
	   iterator.position = first;
	   
	   if(iterator.hasNext()) {
		   if(iterator.position.data.equals(element1)) {
			   iterator.add(element2);
		   }
		   iterator.next();
	   }
	   if(iterator.position.data.equals(element1) && iterator.hasNext() == false) {
		   iterator.add(element2);
	   }
	   if(countHowMany(element1)==0) {
		   addFirst(element2);
		   appendAtEnd(element2,1);
	   }
	   


   }

  //**************************************************************************************
  //reverseFistFew(int howMany) reverse the first parameter number of elements inside the
  //linked list. For example, if the original linked list is { A B C D E }, a call of
  //reverseFirstFew(3) will change the linked list to { C B A D E }. Note: (1)you need to
  //consider the boundary value, i.e.cases where howMany <= 0 or howMany > size()
  //(2)list.reverseFirstFew(list.size()) should reverse the whole linked list
  //**************************************************************************************
   public void reverseFirstFew(int howMany)
   {	
	   if(howMany > 0 && howMany <= size()) {
		   int p = 1;
		   for(int i = howMany; i-p>=0; i--)
		   {
			   Object tmp = getElement(i);
			   Object tmp2 = getElement(p);
			   setElement(i,tmp2);
			   setElement(p,tmp);

			   p++;
			   
		   }
	   }
   }

   //***************************************************************
   //Method creates an iterator on the current LinkedList
   //***************************************************************
   public ListIterator listIterator()
   {
      return new LinkedListIterator();
   }

   //***************************************************************
   //nested class to define its iterator
   //***************************************************************
   private class LinkedListIterator implements ListIterator
   {

      private Node position;
      private Node previous;

      // Constructs an iterator that points to the front
      // of the linked list.   of the linked list.
      public LinkedListIterator()
      {
         position = null;
         previous = null;
      }

     // Moves the iterator past the next element, and returns
     // the traversed element's data.
      public Object next()
      {
         if (!hasNext())
            throw new NoSuchElementException();
         previous = position; // Remember for remove

         if (position == null)
            position = first;
         else
            position = position.next;

         return position.data;
      }

      // Tests if there is an element after the iterator position  position
      public boolean hasNext()
      {
         if (position == null)
            return first != null;
         else
            return position.next != null;
      }

      // Adds an element after the iterator position
      // and moves the iterator to the inserted element.
      public void add(Object element)
      {
         if (position == null)
         {
            addFirst(element);
            position = first;
         }
         else
         {
            Node newNode = new Node();
            newNode.data = element;
            newNode.next = position.next;
            position.next = newNode;
            position = newNode;
         }
         previous = position;
      }

    // Removes the last traversed element. This method may
    // only be called after a call to the next() method.
      public void remove()
      {
         if (previous == position)
            throw new IllegalStateException();

         if (position == first)
         {
            removeFirst();
         }
         else
         {
            previous.next = position.next;
         }
         position = previous;
      }

      // Sets the last traversed element to a different value
      public void set(Object element)
      {
         if (position == null)
            throw new NoSuchElementException();
         position.data = element;
      }
   } //end of
}