package ru.javarush.krivenok.cryptoanalyzer.commands;

import ru.javarush.krivenok.cryptoanalyzer.constants.Constants;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BruteForceMethods {

    public static int findCountSpaces(String inputText) {
        int counterFind = 0;
        for (int i = 0; i < inputText.length(); i++) {
            if (inputText.charAt(i) == ' ') {
                counterFind++;
            }
        }
        return counterFind;
    }

    public static String decodeForBruteForce(String path, String key) {
        String inputText = InputBF.inputRead(Constants.TXT_FOLDER + path);
        char[] sourceText = inputText.toCharArray();
        for (int i = 0; i < sourceText.length; i++) {
            if (Constants.ALPHABET.contains(sourceText[i])) {
                sourceText[i] = Constants.ALPHABET.get((Constants.ALPHABET.indexOf(sourceText[i]) +
                        (Constants.ALPHABET.size()) - Integer.parseInt(key)) % Constants.ALPHABET.size());
            }
        }
        return new String(sourceText);
    }

    public static class InputBF {
        static String inputText = "";

        public static String inputRead(String path) {
            try (
                    FileReader in = new FileReader(path);
                    BufferedReader reader = new BufferedReader(in)) {
                while (reader.ready()) {
                    inputText = reader.readLine();
                }
            } catch (
                    IOException e) {
                e.printStackTrace();
            }
            return inputText;
        }
    }
}
