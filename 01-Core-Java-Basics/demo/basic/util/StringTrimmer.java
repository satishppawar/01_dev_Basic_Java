package demo.basic.util;
import java.util.*;
import java.lang.*;

public class StringTrimmer {
    public static void main (String[] args) throws java.lang.Exception {
        String s1 = "ExpirartionDateRule-Vm1_disk1_d4e340863d4c46a782f332d330d69fd5";
        String s2 = "abcdefghiojkabcdefghiojkabcdefghiojkabcdedisk1_e5bb14a616484f20a492178e03407ab5";
       System.out.println("After removing s1==" + removeLastChar(s1) + s1.length());
        System.out.println("After removing s2== " + removeLastChar(s2)+s2.length() );

    }

    private static String removeLastChar(String str) {
       String prefixStr=str.substring(0, str.length() - 32);
       String suffixStr=str.substring(str.length()-4);
       System.out.println("prefixStr is"+prefixStr);
       System.out.println("suffixStr is"+suffixStr);
       String s=prefixStr+"xxxx"+suffixStr;
       System.out.println("-------------");
       return s;
    }
}