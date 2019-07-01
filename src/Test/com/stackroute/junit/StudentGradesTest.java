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
    public void checkForStudentsMarks(){
        int students=4;
        int[] marks = {10,20,30,40};
        actualResult=studentMarksCaluculator.getAverage(students,marks);
        expectedResult="average of students marks is 25.0";
        assertEquals(expectedResult,actualResult);

        actualResult=studentMarksCaluculator.getMaxMarks(students,marks);
        expectedResult="The maximum grade is 40";
        assertEquals(expectedResult,actualResult);


        actualResult=studentMarksCaluculator.getMinMarks(students,marks);
        expectedResult="The minimum grade is 10";
        assertEquals(expectedResult,actualResult);
    }
    @Test
    public void checkForStudentGrades(){
        int students=6;
        int[] marks = {30,40,58,76,32,74};
        actualResult=studentMarksCaluculator.getAverage(students,marks);
        expectedResult="average of students marks is 51.0";
        assertEquals(expectedResult,actualResult);

        actualResult=studentMarksCaluculator.getMaxMarks(students,marks);
        expectedResult="The maximum grade is 76";
        assertEquals(expectedResult,actualResult);


        actualResult=studentMarksCaluculator.getMinMarks(students,marks);
        expectedResult="The minimum grade is 30";
        assertEquals(expectedResult,actualResult);
    }
    @Test
    public void checkForGradesOfStudents(){
        int students=10;
        int[] marks = {76,90,52,12,76,34,72,20,83,49};
        actualResult=studentMarksCaluculator.getAverage(students,marks);
        expectedResult="average of students marks is 56.0";
        assertEquals(expectedResult,actualResult);

        actualResult=studentMarksCaluculator.getMaxMarks(students,marks);
        expectedResult="The maximum grade is 90";
        assertEquals(expectedResult,actualResult);


        actualResult=studentMarksCaluculator.getMinMarks(students,marks);
        expectedResult="The minimum grade is 12";
        assertEquals(expectedResult,actualResult);
    }


    @After
    public void tearDown(){
        studentMarksCaluculator = null;
    }




}