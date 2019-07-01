package com.stackroute.junit;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FrequencyOfWords {
    public static String readFrequencyOfWordsInFile(File file) throws IOException {
        int i, j;
        String line = " ";
        String rev = "";
        String str = " ";
        int len;
        try {
            FileReader fr = new FileReader(file);
            BufferedReader bufferReader = new BufferedReader(fr);
            while ((line = bufferReader.readLine()) != null) {
                rev = rev.concat(line) + " ";
            }
            String[] string = rev.split(" ");
            int count[] = new int[string.length];
            for (i = 0; i < string.length; i++) {
                for (j = 0; j < string.length; j++) {
                    if (string[i].equals(string[j])) {
                        count[j] = count[j] + 1;
                    }
                }
            }
            for (i = 0; i < string.length; i++) {
                if (!str.contains(string[i])) {
                    if (i == string.length - 1) {

                        str = str + string[i] + "-" + count[i];
                    }
                    else
                        str = str + string[i] + "-" + count[i] + ",";
                }
            }


            return str;
        }

        catch (IOException e)
        {
            return "e";
        }

    }
}
