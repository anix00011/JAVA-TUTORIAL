Methods of Java TreeSet class

boolean addAll(Collection c)---	It is used to add all of the elements in the specified collection to this set.
boolean contains(Object o)---	It is used to return true if this set contains the specified element.
boolean isEmpty()---	It is used to return true if this set contains no elements.
boolean remove(Object o)---	It is used to remove the specified element from this set if it is present.
void add(Object o)---	It is used to add the specified element to this set if it is not already present.
void clear()---	It is used to remove all of the elements from this set.
Object clone()----	It is used to return a shallow copy of this TreeSet instance.
Object first()---	It is used to return the first (lowest) element currently in this sorted set.
Object last()---	It is used to return the last (highest) element currently in this sorted set.
int size()---	It is used to return the number of elements in this set.
//***********************************************************************************************************************************
import java.util.*;
class test{
    public static void main(String args[]){
        //Creating and adding elements
        TreeSet<Integer> al=new TreeSet<Integer>();
        al.add(5);
        al.add(7);
        al.add(8);
        al.add(2);
        //Traversing elements
        Iterator<Integer> itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
//***********************************************************************************************************************************
//***********************************************************************************************************************************
PriorityQueue

A PriorityQueue is used when the objects are supposed to be processed based on the priority. It is known that a queue follows First-In-First-Out algorithm, but sometimes the elements of the queue are needed to be processed according to the priority, that’s when the PriorityQueue comes into play. The PriorityQueue is based on the priority heap. The elements of the priority queue are ordered according to the natural ordering, or by a Comparator provided at queue construction time, depending on which constructor is used. Few important points on Priority Queue are as follows:

PriorityQueue doesn’t permit NULL pointers.
We can’t create PriorityQueue of Objects that are non-comparable
PriorityQueue are unbound queues.
The head of this queue is the least element with respect to the specified ordering. If multiple elements are tied for least value, the head is one of those elements — ties are broken arbitrarily.
The queue retrieval operations poll, remove, peek, and element access the element at the head of the queue.
It inherits methods from AbstractQueue, AbstractCollection, Collection and Object class.
//***********************************************************************************************************************************
import java.util.*;

class test
{
    public static void main(String args[])
    {
        PriorityQueue<Integer> pQueue =
                new PriorityQueue<>();
        pQueue.add(7);
        pQueue.add(9);
        pQueue.add(5);
        pQueue.add(2);
        System.out.println("Head value using peek function:"
                + pQueue.peek());
        System.out.println("The queue elements:");
        Iterator itr = pQueue.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
        pQueue.poll();
        System.out.println("After removing an element" +
                " with poll function:");
        Iterator<Integer> itr2 = pQueue.iterator();
        while (itr2.hasNext())
            System.out.println(itr2.next());

        pQueue.remove(7);
        System.out.println("after removing last with" +
                " remove function:");
        Iterator<Integer> itr3 = pQueue.iterator();
        while (itr3.hasNext())
            System.out.println(itr3.next());
        boolean b = pQueue.contains(10);
        System.out.println ( "Priority queue contains 10 " +
                "or not?: " + b);
        Object[] arr = pQueue.toArray();
        System.out.println ( "Value in array: ");
        for (int i = 0; i<arr.length; i++)
            System.out.println ( "Value: " + arr[i]) ;
    }
}
//***********************************************************************************************************************************
//***********************************************************************************************************************************
Java Hashtable class
Java Hashtable class implements a hashtable, which maps keys to values. It inherits Dictionary class and implements the Map interface.

The important points about Java Hashtable class are:

A Hashtable is an array of list. Each list is known as a bucket. The position of bucket is identified by calling the hashcode() method. A Hashtable contains values based on the key.
It contains only unique elements.
It may have not have any null key or value.
It is synchronized

K: It is the type of keys maintained by this map.
V: It is the type of mapped values.
Methods of Java Hashtable class
void clear()	It is used to reset the hash table.
boolean contains(Object value)	This method return true if some value equal to the value exist within the hash table, else return false.
boolean containsValue(Object value)	This method return true if some value equal to the value exists within the hash table, else return false.
boolean containsKey(Object key)	This method return true if some key equal to the key exists within the hash table, else return false.
boolean isEmpty()	This method return true if the hash table is empty; returns false if it contains at least one key.
void rehash()	It is used to increase the size of the hash table and rehashes all of its keys.
Object get(Object key)	This method return the object that contains the value associated with the key.
Object remove(Object key)	It is used to remove the key and its value. This method return the value associated with the key.
int size()	This method return the number of entries in the hash table.
Java Hashtable Example

import java.util.*;  
class TestCollection16{  
 public static void main(String args[]){  
  Hashtable<Integer,String> hm=new Hashtable<Integer,String>();  
  
  hm.put(100,"Amit");  
  hm.put(102,"Ravi");  
  hm.put(101,"Vijay");  
  hm.put(103,"Rahul");  
  
  for(Map.Entry m:hm.entrySet()){  
   System.out.println(m.getKey()+" "+m.getValue());  
  }  
 }  
}  

Output:

103 Rahul
102 Ravi
101 Vijay
100 Amit
       
