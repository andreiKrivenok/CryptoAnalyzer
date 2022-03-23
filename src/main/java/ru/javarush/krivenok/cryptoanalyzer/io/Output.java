package ru.javarush.krivenok.cryptoanalyzer.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Output {

    public static void outputWrite(String outputText, String outputPath) {

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputPath))) {
            bufferedWriter.write(outputText);
            bufferedWriter.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
