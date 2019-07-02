package com.stackroute.junit;

public class ReverseOfInput {
    public static String revString(String str) //reversing the given string
    {
        String string="";
        int len=str.length();
        for(int i=len-1;i>=0;i--)
        {
            string=string+str.charAt(i);
        }
        return string;
    }
}
