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
