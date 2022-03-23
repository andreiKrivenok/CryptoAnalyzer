package ru.javarush.krivenok.cryptoanalyzer;

import ru.javarush.krivenok.cryptoanalyzer.controllers.MainController;
import ru.javarush.krivenok.cryptoanalyzer.entity.Result;
import ru.javarush.krivenok.cryptoanalyzer.exceptions.AppException;

import java.util.Arrays;

public class Application {

    private final MainController mainController;

    public Application() {
        mainController = new MainController();
    }

    //encode text.txt encode.txt 3
    //decode afterEncode.txt afterDecode.txt 3
    //bruteForce afterEncode.txt afterDecodeBF.txt 0

    public Result run(String[] args) {
        if (args.length > 0) {
            String action = args[0];
            String[] parameters = Arrays.copyOfRange(args, 1, args.length);

            return mainController.doAction(action, parameters);
        } else {
            throw new AppException("no args");
        }
    }
}

