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
