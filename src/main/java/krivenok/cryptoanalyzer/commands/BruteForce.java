package krivenok.cryptoanalyzer.commands;

import krivenok.cryptoanalyzer.constants.Constants;
import krivenok.cryptoanalyzer.entity.Result;
import krivenok.cryptoanalyzer.entity.ResultCode;
import krivenok.cryptoanalyzer.io.Input;
import krivenok.cryptoanalyzer.io.InputBF;

public class BruteForce implements Action {
    Decoder decoder = new Decoder();
    int counter;
    int bestCountOfSpaces = Integer.MIN_VALUE;
    int bestCountOfKey = Integer.MIN_VALUE;

    @Override
    public Result execute(String[] parameters) {

        for (int key = 0; key < Constants.ALPHABET.size(); key++) {
            counter = 0;
            String inputTextDecode = decodeForBruteForce(new String[]{parameters[0], parameters[1], String.valueOf(Integer.parseInt(parameters[2])
                    + key)});
            System.out.println(inputTextDecode);
            System.out.println("____________________");
            counter = findCountSpaces(inputTextDecode);

            if (counter > bestCountOfSpaces) {
                bestCountOfSpaces = counter;
                bestCountOfKey = key;
            }
        }
        System.out.println("Ключ для дешифрования методом bruteForce = " + bestCountOfKey);

        decoder.execute(new String[]{parameters[0], parameters[1], String.valueOf(bestCountOfKey)});


        return new Result("decode all right", ResultCode.OK);
    }

    public int findCountSpaces(String inputText) {
        int counterFind = 0;
        for (int i = 0; i < inputText.length(); i++) {
            if (inputText.charAt(i) == ' ') {
                counterFind++;
            }
        }
        return counterFind;
    }

    public String decodeForBruteForce(String[] parameters) {
        String inputText = InputBF.inputRead(Constants.TXT_FOLDER + parameters[0]);
        char[] sourceTextArray = inputText.toCharArray();
        for (int i = 0; i < sourceTextArray.length; i++) {
            if (Constants.ALPHABET.contains(sourceTextArray[i])) {
                sourceTextArray[i] = Constants.ALPHABET.get((Constants.ALPHABET.indexOf(sourceTextArray[i]) + (Constants.ALPHABET.size()) -
                        Integer.parseInt(parameters[2])) % Constants.ALPHABET.size());
            }
        }
        String sourceText = new String(sourceTextArray);
        return sourceText;
    }
}