package com.stackroute.junit;

import com.stackroute.junit.PowerOfFour;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerOfFourTest {
    PowerOfFour power;
    @Before
    public void setUp(){
        power=new PowerOfFour();
    }//creation of object
    @Test
    public void checkWhetherTheGivenIntegerIsAPowerOf4()
    {
        String result=power.powerFour(64);
        assertEquals("It is a power of 4",result);
    }
    @Test
    public void checkWhetherTheGivenIntegerIsNotAPowerOf4()
    {
        String result=power.powerFour(90);
        assertEquals("Not a power of 4",result);
    }
    @Test
    public void checkWhetherTheGivenIntegerReturnsNull()
    {
        String result=power.powerFour(0);
        assertEquals("null",result);
    }
    @After
    public void tearDown(){
        power=null;
    }

}