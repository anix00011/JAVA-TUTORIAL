//Java provides a new feature called method reference in Java 8. Method reference is used to refer method of functional interface. It is compact and easy form of lambda expression. Each time when you are using lambda expression to just referring a method, you can replace your lambda expression with method reference. In this tutorial, we are explaining method reference concept in detail.
//There are following types of method references in java:
//1.Reference to a static method.
//2.Reference to an instance method.
//3.Reference to a constructor.(Not covered here)

//1) Reference to a Static Method
//Syntax:
//ContainingClass::staticMethodName 
//Ex:
//*************************************************************************************************************************************
interface Sayable{  
    void say();  
}  
public class MethodReference {  
    public static void saySomething(){  
        System.out.println("Hello, this is static method.");  
    }  
    public static void main(String[] args) {  
        // Referring static method  
        Sayable sayable = MethodReference::saySomething;  
        // Calling interface method  
        sayable.say();  
    }  
}  
//*************************************************************************************************************************************
import java.util.function.BiFunction;  
class Arithmetic{  
public static int add(int a, int b){  
return a+b;  
}  
}  
public class MethodReference3 {  
public static void main(String[] args) {  
BiFunction<Integer, Integer, Integer>adder = Arithmetic::add;  
int result = adder.apply(10, 20);  
System.out.println(result);  
}  
}  
//*************************************************************************************************************************************
//#BiFunction
//java.util.function.BiFunction is a functional interface. BiFunction accepts two arguments and returns a value. While declaring BiFunction we need to tell what type of argument will be passed and what will be return type. We can apply our business logic with those two values and return the result. BiFunction has function method as apply(T t, U u) which accepts two argument. 

import java.util.function.BiFunction;
public class BiFunctionDemo {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, String> biFunction = (num1, num2) -> "Result:" +(num1 + num2);
        System.out.println(biFunction.apply(20,25));
    }    
} 
//*************************************************************************************************************************************
//2) Reference to an Instance Method
//Syntax:
//containingObject::instanceMethodName  
//Ex:
//*************************************************************************************************************************************
interface Sayable{  
    void say();  
}  
public class InstanceMethodReference {  
    public void saySomething(){  
        System.out.println("Hello, this is non-static method.");  
    }  
    public static void main(String[] args) {  
        InstanceMethodReference methodReference = new InstanceMethodReference(); // Creating object  
        // Referring non-static method using reference  
            Sayable sayable = methodReference::saySomething;  
        // Calling interface method  
            sayable.say();  
            // Referring non-static method using anonymous object  
            Sayable sayable2 = new InstanceMethodReference()::saySomething; // You can use anonymous object also  
            // Calling interface method  
            sayable2.say();  
    }  
}  
//*************************************************************************************************************************************
import java.util.function.BiFunction;  
class Arithmetic{  
public int add(int a, int b){  
return a+b;  
}  
}  
public class InstanceMethodReference3 {  
public static void main(String[] args) {  
BiFunction<Integer, Integer, Integer>adder = new Arithmetic()::add;  
int result = adder.apply(10, 20);  
System.out.println(result);  
}  
}  
