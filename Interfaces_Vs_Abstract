Difference between abstract class and interface
Abstract class and interface both are used to achieve abstraction where we can declare the abstract methods. Abstract class and interface both can't be instantiated.

But there are many differences between abstract class and interface that are given below.

Abstract class	Interface
1) Abstract class can have abstract and non-abstract methods.	Interface can have only abstract methods. Since Java 8, it can have default and static methods also.
2) Abstract class doesn't support multiple inheritance.	Interface supports multiple inheritance.
3) Abstract class can have final, non-final, static and non-static variables.	Interface has only static and final variables.
4) Abstract class can provide the implementation of interface.	Interface can't provide the implementation of abstract class.
5) The abstract keyword is used to declare abstract class.	The interface keyword is used to declare interface.
6) An abstract classcan extend another Java class and implement multiple Java interfaces.	An interface can extend another Java interface only.
7) An abstract classcan be extended using keyword ?extends?.	An interface classcan be implemented using keyword ?implements?.
8) A Javaabstract classcan have class members like private, protected, etc.	Members of a Java interface are public by default.
9)Example:
public abstract class Shape{
public abstract void draw();
}	
Example:
public interface Drawable{
void draw();
}

Example of abstract class and interface in Java:
*************************************************************************************************************************************
interface A{  
void a();//bydefault, public and abstract  
void b();  
void c();  
void d();  
}  
   
abstract class B implements A{  
public void c(){System.out.println("I am C");}  
}  
  
class M extends B{  
public void a(){System.out.println("I am a");}  
public void b(){System.out.println("I am b");}  
public void d(){System.out.println("I am d");}  
}  
  
class Test5{  
public static void main(String args[]){  
A a=new M();  
a.a();  
a.b();  
a.c();  
a.d();  
}}  
**************************************************************************************************************************************
