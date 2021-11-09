package com.java_exscise.iotextfile.copyFileText;

import java.io.*;

public class CopyFileText {
    public static void copyFile(String sourceFile, String destFile) throws IOException {
        File srcFile = new File(sourceFile);
        File desFile = new File(destFile);
        FileReader fileReader = new FileReader(srcFile);
        FileWriter fileWriter = new FileWriter(desFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = null;
        while ((line = bufferedReader.readLine())!=null){
            fileWriter.write(line);
        }
        bufferedReader.close();
        fileWriter.close();
    }

    public static void masin(String[] args) throws IOException {
        CopyFileText.copyFile("sourceText.txt", "decText.txt");
    }

    public static void main(String[] args) {
        String obj  = "abcdefgh";
        int length = obj.length();
        char c[] = new char[length];
        obj.getChars(0, length, c, 0);
        CharArrayReader input1 = new CharArrayReader(c);
        CharArrayReader input2 = new CharArrayReader(c, 1, 4);
        int i;
        int j;
        try
        {
            while((i = input1.read()) == (j = input2.read()))
            {
                System.out.print((char)i);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    }
