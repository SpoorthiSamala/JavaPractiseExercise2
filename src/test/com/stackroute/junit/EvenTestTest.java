package com.stackroute.junit;

import com.stackroute.junit.EvenNum;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenTestTest {
    EvenNum even;
    @Before
    public void setUp()
    {
        even=new EvenNum();
    }//creating object for the class EvenNum
    @Test
    public void checkWhetherTheGivenIntegerDoesNotReturnEven(){
        Boolean b=even.isEven(5);
        assertEquals(false,b);
    }
    @Test
    public void checkWhetherTheGivenIntegerReturnsEven(){
        Boolean b=even.isEven(4);
        assertEquals(true,b);
    }
    @After
    public void tearDown(){
        even=null;
    }

}