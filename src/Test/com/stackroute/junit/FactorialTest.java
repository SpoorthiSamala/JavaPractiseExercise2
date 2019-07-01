package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {
    Factorial factorial;
    @Before
    public void setUp()
    {
        factorial=new Factorial();
    }
    @Test
    public void returnFactorialOfNumber(){
       String result=factorial.factorialOfNumber(3);
       String expectedResult="the factorial of1is1\n"+"the factorial of2is2\n"+"the factorial of3is6\n";
       assertEquals(expectedResult,result);
    }


    @After
    public void tearDown(){
        factorial=null;
    }

}