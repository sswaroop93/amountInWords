//package com.stringpool.com
 
import java.util.*;
 
public class NumberToWord
 
{
 
   public String pw(int n,String ch)
 
     {
        String converted = "";
 
        String one[]={ " "," one"," two"," three"," four"," five"," six"," seven"," eight"," nine"," ten"," eleven"," twelve"," thirteen"," fourteen","fifteen"," sixteen"," seventeen"," eighteen"," nineteen"};
 
        String ten[]={" "," "," twenty"," thirty"," forty"," fifty"," sixty"," seventy"," eighty"," ninety"};
        
 
        if(n>19)
        {
           converted = ""+ten[n/10]+one[n%10];
        }
        else
        {
            converted = ""+one[n];
        }
        if (n>0)
        {
            converted += ch;
        }
        
        return converted;
 
       }
 
      public static void main(String[] args)
 
      {
 
        int n=0;
 
        n = Integer.parseInt(args[0]);
        String toWordsString = "";
 
       if ( n > 0)
 
          {
 
            NumberToWord  a =new NumberToWord();
 
            toWordsString += a.pw((n/1000000000)," Hundred");
 
            toWordsString += a.pw((n/10000000)%100," crore");
 
            toWordsString += a.pw(((n/100000)%100)," lakh");
 
            toWordsString += a.pw(((n/1000)%100)," thousand");
 
            toWordsString += a.pw(((n/100)%10)," hundred and");
 
            toWordsString += a.pw((n%100)," ");
            System.out.println(toWordsString.trim());
 
            }
 
     }
}
