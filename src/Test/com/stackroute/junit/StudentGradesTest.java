package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentGradesTest {
    StudentMarksCalculator studentMarksCaluculator;
    String expectedResult;
    String actualResult;
    @Before
    public void setUp(){

        studentMarksCaluculator=new StudentMarksCalculator();
    }
    @Test
    public void givenArrayOfMarksReturnsAverageMinimumMaximumGrade(){
        int students=5;
        int[] marks = {10,20,30,40,50};
        actualResult=studentMarksCaluculator.getAverage(students,marks);
        expectedResult="average of students marks is 30.0";
        assertEquals(expectedResult,actualResult);

        actualResult=studentMarksCaluculator.getMaxMarks(students,marks);
        expectedResult="The maximum grade is 50";
        assertEquals(expectedResult,actualResult);


        actualResult=studentMarksCaluculator.getMinMarks(students,marks);
        expectedResult="The minimum grade is 10";
        assertEquals(expectedResult,actualResult);
    }
    @Test
    public void givenArrayOfMarksWithNegativeIntegerReturnsAverageMinimumMaximumGrade(){
        int students=6;
        int[] marks = {30,40,58,76,32,-74};
        actualResult=studentMarksCaluculator.getAverage(students,marks);
        expectedResult="average of students marks is 27.0";
        assertEquals(expectedResult,actualResult);

        actualResult=studentMarksCaluculator.getMaxMarks(students,marks);
        expectedResult="The maximum grade is 76";
        assertEquals(expectedResult,actualResult);


        actualResult=studentMarksCaluculator.getMinMarks(students,marks);
        expectedResult="The minimum grade is -74";
        assertEquals(expectedResult,actualResult);
    }

    @After
    public void tearDown(){
        studentMarksCaluculator = null;
    }
}