interface Drawable{  
    public void draw();  
}  
  
public class LambdaExpressionExample2 {  
    public static void main(String[] args) {  
        int width=10;  
          
        //with lambda  
        Drawable d2=()->{  
            System.out.println("Drawing "+width);  
        };  
        d2.draw();  
    }  
}  
//*****************************************************************************************************************************************
interface SomeFunc<T> {
    T func(T t);
}
public class GenericLambda {
    public static void main(String args[])
    {
     SomeFunc<String> reverse=(str)->{
         String result="";
         int i;
         for(i=str.length()-1;i>=0;i--) result+=str.charAt(i);
         return result;
     };
        System.out.println("Lambda reversed is "+reverse.func("Lambda"));
        System.out.println("Expression reversed is "+reverse.func("Expression"));
        
        SomeFunc<Integer> factorial=(n)->{
            int result=1;
            for(int i=1;i<=n;i++) result=i*result;
            return result;
        };
        System.out.println("The Factorial of 3 is "+factorial.func(3));
        System.out.println("The Factorial of 5 is "+factorial.func(5));
    }
}
