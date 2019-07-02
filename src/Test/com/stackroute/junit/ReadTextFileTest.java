package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import static org.junit.Assert.*;

public class ReadTextFileTest {
    ReadTextFile readFile;
    PrintWriter actualResult;
    String expectedResult;
    @Before
    public void setup(){
        readFile=new ReadTextFile();
    }//creation of object
    @Test
    public void givenFileReadFileAndConvertToUpperCase() throws IOException {
        String str=readFile.readFile(new File("f.txt"));
        assertEquals(" HELLOWELCOME",str);
    }
    @Test
    public void givenNonExistantFileReturnsException() throws IOException {
        String str=readFile.readFile(new File("abc.txt"));
        assertEquals("Exception",str);
    }
    @After
    public void tearDown(){
        readFile=null;
    }

}