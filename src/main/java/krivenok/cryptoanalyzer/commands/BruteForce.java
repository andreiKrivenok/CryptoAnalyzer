package krivenok.cryptoanalyzer.commands;

import krivenok.cryptoanalyzer.constants.Constants;
import krivenok.cryptoanalyzer.entity.Result;
import krivenok.cryptoanalyzer.entity.ResultCode;


public class BruteForce implements Action {
    Decoder decoder = new Decoder();
    int counter;
    int bestCountOfSpaces = Integer.MIN_VALUE;
    int bestCountOfKey = Integer.MIN_VALUE;

    @Override
    public Result execute(String[] parameters) {

        for (int key = 0; key < Constants.ALPHABET.size(); key++) {
            counter = 0;
            String inputTextDecode = BruteForceMethods.decodeForBruteForce(parameters[0], String.valueOf(key));
            counter = BruteForceMethods.findCountSpaces(inputTextDecode);

            if (counter > bestCountOfSpaces) {
                bestCountOfSpaces = counter;
                bestCountOfKey = key;
            }
        }
        System.out.println("Ключ для дешифрования методом bruteForce = " + bestCountOfKey);
        decoder.execute(new String[]{parameters[0], parameters[1], String.valueOf(bestCountOfKey)});
        return new Result("decode all right", ResultCode.OK);
    }
}