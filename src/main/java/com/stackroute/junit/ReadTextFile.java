package com.stackroute.junit;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile //to covert the content in a file to uppercase
{
    public static String readFile(File file) throws IOException
    {
        String line=" ";
        String rev=" ";
        int len=0;
        try{
            FileReader fr=new FileReader(file);
            BufferedReader bufferReader=new BufferedReader(fr);
            while((line=bufferReader.readLine())!=null)
            {
                rev=rev.concat(line);
            }
            len=rev.length();
            bufferReader.close();;
        }
        catch (IOException e) {
            return "Exception";
        }
        return rev.toUpperCase();
    }
}
