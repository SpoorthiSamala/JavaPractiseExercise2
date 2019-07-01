package com.stackroute.junit;

import com.stackroute.junit.EvenTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenTestTest {
    EvenTest even;
    @Before
    public void setUp()
    {
        even=new EvenTest();
    }
    @Test
    public void checkWhetherTheIntegerIsNotEven(){
        Boolean b=even.isEven(3);
        assertEquals(false,b);
    }
    @Test
    public void checkWhetherTheIntegerIsEven(){
        Boolean b=even.isEven(4);
        assertEquals(true,b);
    }
    @After
    public void tearDown(){
        even=null;
    }

}