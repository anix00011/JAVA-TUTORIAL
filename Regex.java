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
        Pattern ptn = Pattern.compile("\\d{2}$");
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

\\******************************************************************************************************************************

\\******************************************************************************************************************************

\\******************************************************************************************************************************

\\******************************************************************************************************************************

\\******************************************************************************************************************************

\\******************************************************************************************************************************

\\******************************************************************************************************************************
