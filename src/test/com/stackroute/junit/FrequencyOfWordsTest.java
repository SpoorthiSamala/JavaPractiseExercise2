package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.*;

public class FrequencyOfWordsTest {
    FrequencyOfWords frequencyOfWords;

    @Before
    public void setup(){
        frequencyOfWords=new FrequencyOfWords();
    }
    @Test
    public void readFileAndConveretToUpperCase() throws IOException {
        String str=frequencyOfWords.readFrequencyOfWordsInFile(new File("file1.txt"));
        assertEquals(" i-2,am-2,man-1,good-1",str);
    }
    @After
    public void tearDown(){
        frequencyOfWords=null;
    }

}