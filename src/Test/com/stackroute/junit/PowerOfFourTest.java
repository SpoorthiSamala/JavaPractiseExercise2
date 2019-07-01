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
    }
    @Test
    public void checkWhetherItIsAPowerOf4()
    {
        String result=power.PowerFour(64);
        assertEquals("It is a power of 4",result);
    }
    @Test
    public void checkWhetherItIsNotAPowerOf4()
    {
        String result=power.PowerFour(83);
        assertEquals("Not a power of 4",result);
    }
    @After
    public void tearDown(){
        power=null;
    }

}