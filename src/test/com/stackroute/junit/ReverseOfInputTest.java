package com.stackroute.junit;

import com.stackroute.junit.ReverseOfInput;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseOfInputTest {
    ReverseOfInput rev;
    @Before
    public void setUp(){
        rev=new ReverseOfInput();
    }//creation of object
    @Test
    public void givenStringReturnsReverseOfAString()
    {
        String result=rev.revString("Spoorthi");
        assertEquals("ihtroopS",result);
    }
    @Test
    public void givenNumberReturnsReverseOfANumber()
    {
        String result=rev.revString("1234");
        assertEquals("4321",result);
    }
    @After
    public void tearDown(){
        rev=null;
    }

}