package com.stackroute.junit;

import com.stackroute.junit.Membervariable;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MembervariableTest {
    Membervariable membervariable;
    @Before
    public void setUp(){
        membervariable=new Membervariable();
    }
    @Test
    public void givenThreeArgumentsReturnsMembersDetails(){
        String result=membervariable.printValues("Ravi",20,2000.2f);
        assertEquals("Member's Name:Ravi\n"+"Member's Age:20\n"+"Member's Salary:2000.2",result);
    }
    @After
    public void tearDown(){
        membervariable=null;
    }

}