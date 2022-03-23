package ru.javarush.krivenok.cryptoanalyzer.commands;

import ru.javarush.krivenok.cryptoanalyzer.constants.Constants;
import ru.javarush.krivenok.cryptoanalyzer.entity.Result;
import ru.javarush.krivenok.cryptoanalyzer.entity.ResultCode;
import ru.javarush.krivenok.cryptoanalyzer.io.Input;
import ru.javarush.krivenok.cryptoanalyzer.io.Output;

public class Encoder implements Action {
    static String inputText;

    @Override
    public Result execute(String[] parameters) {

        inputText = Input.inputRead(Constants.TXT_FOLDER + parameters[0]);
        char[] sourceText = inputText.toCharArray();

        for (int i = 0; i < sourceText.length; i++) {
            if (Constants.ALPHABET.contains(sourceText[i])) {
                sourceText[i] = Constants.ALPHABET.get((Constants.ALPHABET.indexOf(sourceText[i]) +
                        Integer.parseInt(parameters[2])) % Constants.ALPHABET.size());
            }
        }
        StringBuilder sb = new StringBuilder(sourceText.length);
        for (Character c : sourceText)
            sb.append(c.charValue());
        String outputText = sb.toString();
        Output.outputWrite(outputText, Constants.TXT_FOLDER +parameters[1]);
        return new Result("encode all rights", ResultCode.OK);
    }
}