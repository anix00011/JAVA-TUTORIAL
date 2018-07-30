Character Classes
Construct	Matches
[abc]	Matches a, or b or c. This is called a simple class, and it matches any of the characters in the class.
[^abc]	Matches any character except a, b, and c. This is a negation.
[a-zA-Z]	Matches any character from a to z, or A to Z, including a, A, z and Z. This called a range.
[a-d[m-p]]	Matches any character from a to d, or from m to p. This is called a union.
[a-z&&[def]]	Matches d, e, or f. This is called an intersection (here between the range a-z and the characters def).
[a-z&&[^bc]]	Matches all characters from a to z except b and c. This is called a subtraction.
[a-z&&[^m-p]]	Matches all characters from a to z except the characters from m to p. This is also called a subtraction.
    
    
Predefined Character Classes
Construct	Matches
.	Matches any single character. May or may not match line terminators, depending on what flags were used to compile the Pattern.
\d	Matches any digit [0-9]
\D	Matches any non-digit character [^0-9]
\s	Matches any white space character (space, tab, line break, carriage return)
\S	Matches any non-white space character.
\w	Matches any word character.
\W	Matches any non-word character.
    
    
Boundary Matchers
Construct	Matches
^	Matches the beginning of a line.
$	Matches then end of a line.
\b	Matches a word boundary.
\B	Matches a non-word boundary.
\A	Matches the beginning of the input text.
\G	Matches the end of the previous match
\Z	Matches the end of the input text except the final terminator if any.
\z	Matches the end of the input text.
    
    
Quantifiers
Greedy	Reluctant	Possessive	Matches
X?	X??	X?+	Matches X once, or not at all (0 or 1 time).
X*	X*?	X*+	Matches X zero or more times.
X+	X+?	X++	Matches X one or more times.
X{n}	X{n}?	X{n}+	Matches X exactly n times.
X{n,}	X{n,}?	X{n,}+	Matches X at least n times.
X{n, m)	X{n, m)?	X{n, m)+	Matches X at least n time, but at most m times.
    
    
Logical Operators
Construct	Matches
XY	Matches X and Y (X followed by Y).
X|Y	Matches X or Y.

\\******************************************************************************************************************************
public class test {
    public static void main(String[] args) throws Exception {
        String s="5 1.5 2.21 5.8 sgsg sgg";
        String p="\\d\\.\\d+";
        System.out.println(s.replaceAll(p,"x"));
    }
}
Output:
5 x x x sgsg sgg
\\******************************************************************************************************************************
public class test {
    public static void main(String[] args) throws Exception {
        String s="5 1.5 2.21 5.8 sfghgstg rty";
        String p="s.+s.+g";
        System.out.println(s.replaceAll(p,"x"));
    }
}
Output:
5 1.5 2.21 5.8 x rty
\\******************************************************************************************************************************
public class test {
    public static void main(String[] args) throws Exception {
        String s="ddd d. ,d sfghgstg ,rty";
        String p="[\\.,]";\\[] is used to match single character inside it
        System.out.println(s.replaceAll(p,"x"));
    }
}
Output:
ddd dx xd sfghgstg xrty
\\******************************************************************************************************************************
public class MyStringMatches {
    public void isStringNumber(String no){
        System.out.println(no.matches("(\\d+)"));
    }
    public static void main(String a[]){
        MyStringMatches msm = new MyStringMatches();
        msm.isStringNumber("345");
        msm.isStringNumber("34we");
        msm.isStringNumber("345w12");
        msm.isStringNumber("956");
    }
}

Output:
true
false
false
true
\\******************************************************************************************************************************
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class MySimplePatternMatch {
    public boolean isPatternMatching(String line){
        Pattern ptn = Pattern.compile("\\d{2}$");//checks if there is number 0-9(\\d) having length({2}) and is at last($)
        Matcher mtch = ptn.matcher(line);
        if(mtch.find()){
            return true;
        }
        return false;
    }
     
    public static void main(String a[]){
        MySimplePatternMatch msp = new MySimplePatternMatch();
        System.out.println("Is 'ddfsa12' ends with min 2 digits? "
                    +msp.isPatternMatching("ddfsa12"));
        System.out.println("Is 'ddfsa12adf1' ends with min 2 digits? "
                    +msp.isPatternMatching("ddfsa12adf1"));
    }
}
Output:
Is 'ddfsa12' ends with min 2 digits? true
Is 'ddfsa12adf1' ends with min 2 digits? false
\\******************************************************************************************************************************
public class test {
    public static void main(String[] args) throws Exception {
        String s="John went for a walk, and John fell down, and John hurt his knee.";
        String p="John.*hurt";
        System.out.println(s.replaceAll(p,"x"));
    }
}
Output:
x his knee.
\\******************************************************************************************************************************
public class test {
    public static void main(String[] args) throws Exception {
        String s="John went for a walk, and John fell down, and John hurt his knee.";
        String p="John.*?";
        System.out.println(s.replaceAll(p,"x"));
    }
}
Output:
x went for a walk, and x fell down, and x hurt his knee.
\\******************************************************************************************************************************
    public class GFG {

    public static void main(String[] args) {
       String x= "45fgf84fgxdg8848dfhd4";
        System.out.println(x.replaceAll("\\D","").length());//replaces non numeric value with given
    }
}
Output:
9                      
\\******************************************************************************************************************************
\\******************************************************************************************************************************
We can group multiple characters as a unit by parentheses. For example, (ab).

Each group in a regular expression has a group number, which starts at 1.

Method groupCount() from Matcher class returns the number of groups in the pattern associated with the Matcher instance.

The group 0 refers to the entire regular expression and is not reported by the groupCount() method.

Each left parenthesis inside a regular expression marks the start of a new group.

We can back reference group numbers in a regular expression.

Suppose we want to match text that starts with "abc" followed by "xyz", which is followed by "abc".

We can write a regular expression as "abcxyzabc".

We can use the back reference to rewrite the regular expression as "(abc)xyz\1". \1 refers to group 1, which is (abc).

\2 to refer to group 2, \3 to refer to group 3, and so on.

The following code shows how to display formatted phone numbers. In the regular expression \b(\d{3})(\d{3})(\d{4})\b,
\b denotes that we are interested in matching ten digits only at word boundaries.

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {
  public static void main(String[] args) {
    String regex = "\\b(\\d{3})(\\d{3})(\\d{4})\\b";

    Pattern p = Pattern.compile(regex);
    String source = "1234567890, 12345,  and  9876543210";

    Matcher m = p.matcher(source);

    while (m.find()) {
      System.out.println("Phone: " + m.group() + ", Formatted Phone:  ("
          + m.group(1) + ") " + m.group(2) + "-" + m.group(3));
    }
  }
}
The code above generates the following result:
Phone: 1234567890,Formatted Phone: (123)456-7890
Phone: 9876543210,Formatted Phone: (987)654-3210

Example
The following code shows how to reference groups in a replacement text.

$n, where n is a group number, inside a replacement text refers to the matched text for group n.

For example, $1 refers to the first matched group. To reformat phone numbers, we would use ($1) $2-$3.

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*ww  w .j a  v  a 2  s  . co m*/
public class Main {
  public static void main(String[] args) {
    String regex = "\\b(\\d{3})(\\d{3})(\\d{4})\\b";
    String replacementText = "($1) $2-$3";
    String source = "1234567890, 12345, and 9876543210";

    Pattern p = Pattern.compile(regex);
    Matcher m = p.matcher(source);

    String formattedSource = m.replaceAll(replacementText);

    System.out.println("Text: " + source);
    System.out.println("Formatted Text: " + formattedSource);
  }
}
The code above generates the following result:
Text:1234567890, 12345, and 9876543210
Formatted Text:(123)456-7890,12345, and (987)654-3210

\\******************************************************************************************************************************   
Word Boundaries
    
\b is a zero with assertion. That means it does not match a character, it matches a position with one thing on the left side and another thing on the right side.

The word boundary \b matches on a change from a \w (a word character) to a \W a non word character, or from \W to \w

Which characters are included in \w depends on your language. At least there are all ASCII letters, all ASCII numbers and the underscore. If your regex engine supports unicode, it could be that there are all letters and numbers in \w that have the unicode property letter or number.

\W are all characters, that are NOT in \w.

\bbrown\s
will match here

The quick brown fox
         ^^
but not here

The quick bbbbrown fox
because between b and brown is no word boundary, i.e. no change from a non word character to a word character, both characters are included in \w.
\\******************************************************************************************************************************
public class test {
    public static void main(String[] args) throws Exception {
        String s=" 45 5 5 4 4 3 2 6666 3333 6 5 656565";
        String p="\\b[1-9][0-9]{3}\\b";// \b[1-9][0-9]{3}\b to match a number between 1000 and 9999. \b[1-9][0-9]{2,4}\b matches a number between 100 and 99999.
        System.out.println(s.replaceAll(p,"x"));
    }
}
Output:
45 5 5 4 4 3 2 x x 6 5 656565
\\******************************************************************************************************************************

\\******************************************************************************************************************************
