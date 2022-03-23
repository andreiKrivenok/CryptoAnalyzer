package krivenok.cryptoanalyzer.commands;

import krivenok.cryptoanalyzer.constants.Constants;
import krivenok.cryptoanalyzer.entity.Result;
import krivenok.cryptoanalyzer.entity.ResultCode;
import krivenok.cryptoanalyzer.io.Input;
import krivenok.cryptoanalyzer.io.Output;

public class Encoder implements Action {
    static String inputText;

    @Override
    public Result execute(String[] parameters) {

        inputText = Input.inputRead(Constants.TXT_FOLDER + parameters[0]);
        char[] ch = inputText.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (Constants.ALPHABET.contains(ch[i])) {
                ch[i] = Constants.ALPHABET.get((Constants.ALPHABET.indexOf(ch[i]) +
                        Integer.parseInt(parameters[2])) % Constants.ALPHABET.size());
            }
        }
        StringBuilder sb = new StringBuilder(ch.length);
        for (Character c : ch)
            sb.append(c.charValue());
        String outputText = sb.toString();
        Output.outputWrite(outputText, Constants.TXT_FOLDER +parameters[1]);
        return new Result("encode all rights", ResultCode.OK);
    }
}