package krivenok.cryptoanalyzer.commands;

import krivenok.cryptoanalyzer.constants.Constants;
import krivenok.cryptoanalyzer.entity.Result;
import krivenok.cryptoanalyzer.entity.ResultCode;
import krivenok.cryptoanalyzer.io.Input;
import krivenok.cryptoanalyzer.io.Output;

public class Decoder implements Action {
    String inputText;

    @Override
    public Result execute(String[] parameters) {

        inputText = Input.inputRead(Constants.TXT_FOLDER + parameters[0]);
        char[] sourceText = inputText.toCharArray();
        for (int i = 0; i < sourceText.length; i++) {
            if (Constants.ALPHABET.contains(sourceText[i])) {
                sourceText[i] = Constants.ALPHABET.get((Constants.ALPHABET.indexOf(sourceText[i]) + (Constants.ALPHABET.size()) -
                        Integer.parseInt(parameters[2])) % Constants.ALPHABET.size());
            }
        }
        StringBuilder sb = new StringBuilder(sourceText.length);
        for (Character c : sourceText)
            sb.append(c.charValue());
        String outputText = sb.toString();
        Output.outputWrite(outputText, Constants.TXT_FOLDER + parameters[1]);

        return new Result("decode all right", ResultCode.OK);
    }
}
