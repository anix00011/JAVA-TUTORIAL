public class StringExample{  
public static void main(String args[]){  
String s1="java";//creating string by java string literal  
char ch[]={'s','t','r','i','n','g','s'};  
String s2=new String(ch);//converting char array to string  
String s3=new String("example");//creating java string by new keyword  
System.out.println(s1);  
System.out.println(s2);  
System.out.println(s3);  
}}  
Output:
java
strings
example
//***************************************************************************************************************************************
public class CharAtExample{  
public static void main(String args[]){  
String name="javatpoint";  
char ch=name.charAt(4);//returns the char value at the 4th index  
System.out.println(ch);  
}}  
Output:
t
//***************************************************************************************************************************************
public class SubstringExample{  
public static void main(String args[]){  
String s1="javatpoint";  
System.out.println(s1.substring(2,4));//returns va  
System.out.println(s1.substring(2));//returns vatpoint  
}}  
Output:
va
vatpoint
//***************************************************************************************************************************************
class ContainsExample{  
public static void main(String args[]){  
String name="what do you know about me";  
System.out.println(name.contains("do you know"));  
System.out.println(name.contains("about"));  
System.out.println(name.contains("hello"));  
}}  
Output:
true
true
false
//***************************************************************************************************************************************
public class StringJoinExample{  
public static void main(String args[]){  
String joinString1=String.join("-","welcome","to","javatpoint");  
System.out.println(joinString1);  
}}  
Output:
welcome-to-javatpoint

public class StringJoinExample2 {  
    public static void main(String[] args) {          
        String date = String.join("/","25","06","2018");    
        System.out.print(date);    
        String time = String.join(":", "12","10","10");  
        System.out.println(" "+time);  
    }  
}  
Output:
25/06/2018 12:10:10
//***************************************************************************************************************************************
public class EqualsExample{  
public static void main(String args[]){  
String s1="javatpoint";  
String s2="javatpoint";  
String s3="JAVATPOINT";  
String s4="python";  
System.out.println(s1.equals(s2));//true because content and case is same  
System.out.println(s1.equals(s3));//false because case is not same  
System.out.println(s1.equals(s4));//false because content is not same  
}}  
Output:
true
false
false
//***************************************************************************************************************************************
public class IsEmptyExample{  
public static void main(String args[]){  
String s1="";  
String s2="javatpoint";  
  
System.out.println(s1.isEmpty());  
System.out.println(s2.isEmpty());  
}}  
Output:
true
false
//***************************************************************************************************************************************
public class ReplaceExample2{  
public static void main(String args[]){  
String s1="my name is khan my name is java";  
String replaceString=s1.replace("is","was");//replaces all occurrences of "is" to "was"  
System.out.println(replaceString);  
}}  
Output:
my name was khan my name was java
//***************************************************************************************************************************************
public class SplitExample2{  
public static void main(String args[]){  
String s1="welcome to split world";  
System.out.println("returning words:");  
for(String w:s1.split("\\s",0)){  
System.out.println(w);  
}  
System.out.println("returning words:");  
for(String w:s1.split("\\s",1)){  
System.out.println(w);  
}  
System.out.println("returning words:");  
for(String w:s1.split("\\s",2)){  
System.out.println(w);  
}  
  
}}  
Output:
returning words:
welcome 
to 
split 
world
returning words:
welcome to split world
returning words:
welcome 
to split world
//***************************************************************************************************************************************
public class IndexOfExample2 {  
    public static void main(String[] args) {  
        String s1 = "This is indexOf method";         
        // Passing Substring    
        int index = s1.indexOf("method"); //Returns the index of this substring  
        System.out.println("index of substring "+index);          
    }  
  
}  
Output:
index of substring 16
//***************************************************************************************************************************************
public class StringValueOfExample{  
public static void main(String args[]){  
int value=30;  
String s1=String.valueOf(value);  
System.out.println(s1+10);//concatenating string with 10  
}}  
Output:
3010
//***************************************************************************************************************************************
//string with omitted leading and trailing spaces

Java String trim() method example
public class StringTrimExample{  
public static void main(String args[]){  
String s1="  hello string   ";  
System.out.println(s1+"javatpoint");//without trim()  
System.out.println(s1.trim()+"javatpoint");//with trim()  
}}  
Output:
  hello string   javatpoint
hello stringjavatpoint   
//***************************************************************************************************************************************
//Java String startsWith() and endsWith() method
String s="Sachin";  
 System.out.println(s.startsWith("Sa"));//true  
 System.out.println(s.endsWith("n"));//true  
Output:
true
true
//***************************************************************************************************************************************
//***************************************************************************************************************************************
class Teststringcomparison2{  
 public static void main(String args[]){  
   String s1="Sachin";  
   String s2="SACHIN";  
  
   System.out.println(s1.equals(s2));//false  
   System.out.println(s1.equalsIgnoreCase(s2));//true  
 }  
}  
Output:
false
true
//***************************************************************************************************************************************
//The String compareTo() method compares values lexicographically and returns an integer value that describes if first string is less than, equal to or greater than second string.

//Suppose s1 and s2 are two string variables. If:

//s1 == s2 :0
//s1 > s2   :positive value
//s1 < s2   :negative value
    
class Teststringcomparison4{  
 public static void main(String args[]){  
   String s1="Sachin";  
   String s2="Sachin";  
   String s3="Ratan";  
   System.out.println(s1.compareTo(s2));//0  
   System.out.println(s1.compareTo(s3));//1(because s1>s3)  
   System.out.println(s3.compareTo(s1));//-1(because s3 < s1 )  
 }  
}  
Output:0
       1
       -1
    
    
public class CompareToExample{  
public static void main(String args[]){  
String s1="hello";  
String s2="hello";  
String s3="meklo";  
String s4="hemlo";  
String s5="flag";  
System.out.println(s1.compareTo(s2));//0 because both are equal  
System.out.println(s1.compareTo(s3));//-5 because "h" is 5 times lower than "m"  
System.out.println(s1.compareTo(s4));//-1 because "l" is 1 times lower than "m"  
System.out.println(s1.compareTo(s5));//2 because "h" is 2 times greater than "f"  
}}  

Output:
0
-5
-1
2
//***************************************************************************************************************************************
//Java StringBuilder Examples

//1) StringBuilder append() method
//The StringBuilder append() method concatenates the given argument with this string.

class StringBuilderExample{  
public static void main(String args[]){  
StringBuilder sb=new StringBuilder("Hello ");  
sb.append("Java");//now original string is changed  
System.out.println(sb);//prints Hello Java  
}  
}  
//2) StringBuilder insert() method
//The StringBuilder insert() method inserts the given string with this string at the given position.

class StringBuilderExample2{  
public static void main(String args[]){  
StringBuilder sb=new StringBuilder("Hello ");  
sb.insert(1,"Java");//now original string is changed  
System.out.println(sb);//prints HJavaello  
}  
}  
//3) StringBuilder replace() method
//The StringBuilder replace() method replaces the given string from the specified beginIndex and endIndex.

class StringBuilderExample3{  
public static void main(String args[]){  
StringBuilder sb=new StringBuilder("Hello");  
sb.replace(1,3,"Java");  
System.out.println(sb);//prints HJavalo  
}  
}

//4) StringBuilder delete() method
//The delete() method of StringBuilder class deletes the string from the specified beginIndex to endIndex.

class StringBuilderExample4{  
public static void main(String args[]){  
StringBuilder sb=new StringBuilder("Hello");  
sb.delete(1,3);  
System.out.println(sb);//prints Hlo  
}  
} 

//5) StringBuilder reverse() method
//The reverse() method of StringBuilder class reverses the current string.

class StringBuilderExample5{  
public static void main(String args[]){  
StringBuilder sb=new StringBuilder("Hello");  
sb.reverse();  
System.out.println(sb);//prints olleH  
}  
}  
//***************************************************************************************************************************************
