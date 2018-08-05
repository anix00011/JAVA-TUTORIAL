import java.util.*;

class test
{
    public static void main(String args[])
    {
      TreeSet<Integer> ts=new TreeSet<>(Collections.reverseOrder());//Reversing Tree
      ts.add(3);
      ts.add(2);
      ts.add(8);
      ts.add(9);
      ts.add(0);
      ts.add(1);
      ts.add(5);
      ts.add(7);
      System.out.println(ts);
    }
}
//***************************************************************************************************************************
