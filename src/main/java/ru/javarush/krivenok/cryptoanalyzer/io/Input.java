package ru.javarush.krivenok.cryptoanalyzer.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Input {
    static String inputText="";
    public static String inputRead(String path){

        try (
                FileReader in = new FileReader(path);
                BufferedReader reader = new BufferedReader(in)) {
            while (reader.ready()) {
                 inputText  = inputText + reader.readLine();}

        } catch (
                IOException e) {
            e.printStackTrace();
        }
        return inputText;
    }

}
